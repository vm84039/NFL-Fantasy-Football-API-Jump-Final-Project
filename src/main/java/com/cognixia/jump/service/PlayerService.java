package com.cognixia.jump.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Player;
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

    public void insertPlayerWithStatistics(String playerFirstName, String playerLastName, String team, String position,
                                          int year, int weekNumber, int passingCompletions, int passingAttempts,
                               			int passingYards, int passingTouchdowns, int passingInterceptions, int rushingAttempts, int rushingYards,
                            			int rushingTouchdowns, int receivingTargets, int receivingReceptions, int receivingYards,
                            			int receivingTouchdowns) {

        
    	Player player;
    	Optional<Player> found = playerRepository.getPlayerIdbyName(playerFirstName,playerLastName);
    	if (found.isEmpty()) {
	    	// Create a new player
	         player= new Player(playerFirstName, playerLastName, team, position);
	
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
        statisticsRepository.save(statistics);
    }
    public List<Statistics> getStatsBySeasonAndWeekNumber(int season,int weekNumber){
    	return statisticsRepository.findBySeasonWeekNumber(season, weekNumber);
    }
    
}
