package com.cognixia.jump.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.jump.exception.StatisticsException;
import com.cognixia.jump.model.Player;
import com.cognixia.jump.model.Player.Position;
import com.cognixia.jump.model.Statistics;
import com.cognixia.jump.repository.PlayerRepository;
import com.cognixia.jump.repository.StatisticsRepository;

@Service
public class StatisticsService {
	
	@Autowired
	StatisticsRepository statisticsRepository;
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Autowired
	PlayerService playerService;
	
	@Autowired
	ValidateService validateService;
	
	//accepts parameters to calculate a fantasy score 
	public long calculateScore(int passingAttempts, int passingCompletions, int passingYards, int passingTouchdowns, int passingInterceptions,
									int rushingAttempts, int rushingYards, int rushingTouchdowns, 
									int receivingReceptions, int receivingYards, int receivingTouchdowns) {
		
		long score = 0;
		int passingIncompletions = passingAttempts - passingCompletions;
		
		// Calculate passing Scores
		score += (passingCompletions * 5);
		score -= passingIncompletions;
		score += (passingYards * 2); 
		score += (passingTouchdowns * 200);
		score -= (passingInterceptions * 50);
		
		// Calculate rushing Scores
		score += (rushingAttempts * 5); 
		score += (rushingYards * 5);
		score += (rushingTouchdowns * 200);
		
		// Calculate receiving Scores
		score += (receivingReceptions * 40);
		score += (receivingYards * 8);
		score += (receivingTouchdowns * 200);	
		
		return score;
	}
	public List<Statistics>getTopScoresAllPlayersByWeek(Integer year, Integer weekNum, Integer num) {
		return statisticsRepository.getTopScoresAllPlayersByWeek(year, weekNum, num);
	}
	public List<Statistics>getTopScoresByPositionByWeek(Integer year, Integer weekNum, Position position, Integer num) {
		List<Statistics> topScores = statisticsRepository.getTopScoresByPositionByWeek(year, weekNum, position);
        if (topScores.size() > num) {
            topScores = topScores.subList(0, num);
        }
		return topScores;
	}
	public List<Statistics> getTopScoresForPlayerByName(Integer year, String playerFirstName, String playerLastName){
		
		return statisticsRepository.getTopScoresForPlayerByName(year, playerFirstName, playerLastName);
	}
	public List<Statistics> getTopScoresOfSeason(Integer year, Integer num ){
		List<Statistics> topScores = statisticsRepository.getTopScoresOfSeason(year);
        if (topScores.size() > num) {
            topScores = topScores.subList(0, num);
        }
		return topScores;
		
	}
	public Statistics insertStatistics(Statistics stats) throws StatisticsException{	
	    validateService.validatePostRequest(stats.getPlayer(), stats.getTeam(), stats.getYear(), stats.getWeekNumber(),
	            stats.getPassingCompletions(), stats.getPassingAttempts(), stats.getPassingYards(),
	            stats.getPassingTouchdowns(), stats.getPassingInterceptions(), stats.getRushingAttempts(), stats.getRushingYards(),
	            stats.getRushingTouchdowns(), stats.getReceivingTargets(), stats.getReceivingReceptions(),
	            stats.getReceivingYards(), stats.getReceivingTouchdowns());
	    
	    String firstName;
	    String lastName;
	    Position position;

	    // Check if playerId is not null
	    if (stats.getPlayer().getPlayerId() != null) {
	        Optional<Player> player = playerRepository.findById(stats.getPlayer().getPlayerId());

	        if (!player.isPresent()) {
	            throw new StatisticsException("Player with ID " + stats.getPlayer().getPlayerId() + " not found in the database");
	        }

	        firstName = player.get().getPlayerFirstName();
	        lastName = player.get().getPlayerLastName();
	        position = player.get().getPosition();
	    } else {
	        firstName = stats.getPlayer().getPlayerFirstName();
	        lastName = stats.getPlayer().getPlayerLastName();
	        position = stats.getPlayer().getPosition();
	    }
	    return playerService.insertPlayerWithStatistics(firstName, lastName, stats.getTeam(), position, stats.getYear(),
	            stats.getWeekNumber(), stats.getPassingCompletions(), stats.getPassingAttempts(), stats.getPassingYards(),
	            stats.getPassingTouchdowns(), stats.getPassingInterceptions(), stats.getRushingAttempts(), stats.getRushingYards(),
	            stats.getRushingTouchdowns(), stats.getReceivingTargets(), stats.getReceivingReceptions(),
	            stats.getReceivingYards(), stats.getReceivingTouchdowns());
	}

}
