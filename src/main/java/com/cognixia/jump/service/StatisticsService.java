package com.cognixia.jump.service;

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
	StatisticsRepository statisticeRepository;
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Autowired
	PlayerService playerService;
	
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
	
	public Statistics insertStatistics(Statistics stats) throws StatisticsException{
//		//Checks to see if PlayerID is null.  If null create new player with statistics
		if (stats.getPlayer() != null && stats.getPlayer().getPlayerId() == null){
		return playerService.insertPlayerWithStatistics(stats.getPlayer().getPlayerFirstName(), 
					stats.getPlayer().getPlayerLastName(), stats.getTeam(), stats.getPlayer().getPosition(), stats.getYear(), 
					stats.getWeekNumber(), stats.getPassingCompletions(), stats.getPassingAttempts(), stats.getPassingYards(), 
					stats.getPassingTouchdowns(), stats.getPassingInterceptions(), stats.getRushingAttempts(), stats.getRushingYards(), 
					stats.getRushingTouchdowns(), stats.getReceivingTargets(), stats.getReceivingReceptions(), 
					stats.getReceivingYards(), stats.getReceivingTouchdowns());
		}
		
	else if ((stats.getPlayer().getPlayerId() != null) && 
	        (stats.getPlayer().getPlayerFirstName() == null) &&
			(stats.getPlayer().getPlayerLastName()== null) && 
			(stats.getPlayer().getPosition()== null)){
			
			Optional<Player> found = playerRepository.findById(stats.getPlayer().getPlayerId());
		return playerService.insertPlayerWithStatistics(found.get().getPlayerFirstName(), 
				found.get().getPlayerLastName(), stats.getTeam(), found.get().getPosition(), stats.getYear(), 
				stats.getWeekNumber(), stats.getPassingCompletions(), stats.getPassingAttempts(), stats.getPassingYards(), 
				stats.getPassingTouchdowns(), stats.getPassingInterceptions(), stats.getRushingAttempts(), stats.getRushingYards(), 
				stats.getRushingTouchdowns(), stats.getReceivingTargets(), stats.getReceivingReceptions(), 
				stats.getReceivingYards(), stats.getReceivingTouchdowns());
	}

				Player postPlayer = playerRepository.getById(stats.getPlayer().getPlayerId());

			    // Check if PlayerID, first name, last name, and position match the database
		if (stats.getPlayer().getPlayerFirstName().equals(postPlayer.getPlayerFirstName()) && 
			     stats.getPlayer().getPlayerLastName().equals(postPlayer.getPlayerLastName()) &&
			     stats.getPlayer().getPosition() == postPlayer.getPosition()) { 
			return playerService.insertPlayerWithStatistics(stats.getPlayer().getPlayerFirstName(), 
				stats.getPlayer().getPlayerLastName(), stats.getTeam(), stats.getPlayer().getPosition(), stats.getYear(), 
				stats.getWeekNumber(), stats.getPassingCompletions(), stats.getPassingAttempts(), stats.getPassingYards(), 
				stats.getPassingTouchdowns(), stats.getPassingInterceptions(), stats.getRushingAttempts(), stats.getRushingYards(), 
				stats.getRushingTouchdowns(), stats.getReceivingTargets(), stats.getReceivingReceptions(), 
				stats.getReceivingYards(), stats.getReceivingTouchdowns());
		}
		else {
			throw new StatisticsException(stats.getPlayer().getPlayerId() + " is not the playerId of" + stats.getPlayer().getPlayerFirstName() + " "+ 
					stats.getPlayer().getPlayerLastName() + " or the position is incorect.  Either Leave playerID blank,"
					+ "for we can insert a new player, or enter only playerId and " 
					+ "leave playerFirstName, playerLastName, and positon blank");
		}
	}


}
