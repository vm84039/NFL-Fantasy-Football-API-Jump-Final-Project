package com.cognixia.jump.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.jump.exception.StatisticsException;
import com.cognixia.jump.model.Player;
import com.cognixia.jump.model.Player.Position;
import com.cognixia.jump.model.Statistics;
import com.cognixia.jump.repository.PlayerRepository;
import com.cognixia.jump.repository.StatisticsRepository;

@Service
@Transactional
public class PlayerService {

	
    private final PlayerRepository playerRepository;
	private final StatisticsRepository statisticsRepository;
    
	@Autowired
    public PlayerService(PlayerRepository playerRepository, StatisticsRepository statisticsRepository) {
        this.playerRepository = playerRepository;
        this.statisticsRepository = statisticsRepository;
    }

	public Optional<Player> getPlayerIdbyName(String first, String last) {
		return playerRepository.getPlayerIdbyName(first, last);
	}
	
	public Statistics insertPlayerWithStatistics(String playerFirstName, String playerLastName, String team, Position position,
                                          int year, int weekNumber, int passingCompletions, int passingAttempts,
                               			int passingYards, int passingTouchdowns, int passingInterceptions, int rushingAttempts, int rushingYards,
                            			int rushingTouchdowns, int receivingTargets, int receivingReceptions, int receivingYards,
                            			int receivingTouchdowns) throws StatisticsException {

        
    	validateStats(team, year, weekNumber, passingCompletions, passingAttempts, 
			passingYards, passingTouchdowns, passingInterceptions, rushingAttempts, rushingYards, 
			rushingTouchdowns, receivingTargets, receivingReceptions, receivingYards, receivingTouchdowns);
    	Player player;
    	Optional<Player> found = playerRepository.getPlayerIdbyName(playerFirstName,playerLastName);
    	if (found.isEmpty()) {
	    	// Create a new player
	         player= new Player(playerFirstName, playerLastName, position);
	
	        // Save the player to the database
	        playerRepository.save(player);
    	}
    	else
    	{	
    		player = found.get();
    	}
        // Create statistics for the week using the constructor
        Statistics statistics = new Statistics(player, year, weekNumber, team, passingCompletions, passingAttempts,
    			passingYards, passingTouchdowns, passingInterceptions, rushingAttempts, rushingYards,
    			rushingTouchdowns, receivingTargets, receivingReceptions, receivingYards,
    			receivingTouchdowns);
        System.out.println("Score = " + statistics.getScore());
        statistics.calculateScore();

        // Save the statistics to the database
        Statistics created = statisticsRepository.save(statistics);
        return created;
    }
    public void validateStats(String team, int year, int weekNumber, int passingCompletions, int passingAttempts,
 			int passingYards, int passingTouchdowns, int passingInterceptions, int rushingAttempts, int rushingYards,
			int rushingTouchdowns, int receivingTargets, int receivingReceptions, int receivingYards,
			int receivingTouchdowns) throws StatisticsException {
    		
    	if (year < 2022 || year > 2023) {
    		throw new StatisticsException("Can only insert statistics for year 2023");
    	}
    	
    	if (weekNumber < 1 || weekNumber > 18) {
    		throw new StatisticsException("Please enter week value between 1 and 18");
    	}
    	if (passingCompletions < 0 || passingAttempts < 0 || passingTouchdowns < 0 || passingInterceptions < 0
                || rushingAttempts < 0 || rushingTouchdowns < 0 || receivingTargets < 0 || receivingReceptions < 0
                || receivingTouchdowns < 0) {
    		throw new StatisticsException("Completion, Attempt, Touchdown, Interception, and Targets"
    				+ " statistics cannot be negative");
    	}
    	validateTeam(team);
    	
	}
    public void validateTeam(String team) throws StatisticsException {
    	switch (team.toUpperCase()) {
	        case "ARI":
	        case "ATL":
	        case "BAL":
	        case "BUF":
	        case "CAR":
	        case "CHI":
	        case "CIN":
	        case "CLE":
	        case "DAL":
	        case "DEN":
	        case "DET":
	        case "GB":
	        case "HOU":
	        case "IND":
	        case "JAC":
	        case "KC":
	        case "LAC":
	        case "LAR":
	        case "LV":
	        case "MIA":
	        case "MIN":
	        case "NE":
	        case "NO":
	        case "NYG":
	        case "NYJ":
	        case "PHI":
	        case "PIT":
	        case "SEA":
	        case "SF":
	        case "TB":
	        case "TEN":
	        case "WAS":
            // Valid NFL team abbreviation
            break;
        default:
            throw new StatisticsException(team + "Is not a valid NFL abbreviation.  Must "
            		+ "enter a valid NFL three letter NFL Team abbreviation\"\r\n"
            		+ "				+ \"for example NYJ for New York Jets ");
    	}
    }
 
	public List<Statistics> getStatsBySeasonAndWeekNumber(int season,int weekNumber){
    	return statisticsRepository.findBySeasonWeekNumber(season, weekNumber);
    }
    
}
