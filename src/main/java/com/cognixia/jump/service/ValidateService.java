package com.cognixia.jump.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.jump.exception.StatisticsException;
import com.cognixia.jump.model.Player;
import com.cognixia.jump.repository.PlayerRepository;

@Service
public class ValidateService {
	
	@Autowired
	PlayerRepository playerRepository;
	
    //validates all information in a post request
	public void validatePostRequest(Player player, String team, int year, int weekNumber, int passingCompletions, int passingAttempts,
 			int passingYards, int passingTouchdowns, int passingInterceptions, int rushingAttempts, int rushingYards,
			int rushingTouchdowns, int receivingTargets, int receivingReceptions, int receivingYards,
			int receivingTouchdowns) throws StatisticsException {
    		
		validatePlayer(player);
		validateSeason(year);
		validateWeek(weekNumber);
		
		validateNotNegative(passingCompletions,  passingAttempts, passingYards,  passingTouchdowns,  passingInterceptions,  
				rushingAttempts,  rushingYards, rushingTouchdowns,  
				receivingTargets,  receivingReceptions,  receivingYards, receivingTouchdowns);
    	validateTeam(team);
    	
	}
	public void validatePlayer(Player player) throws StatisticsException {
	    if (player == null) {
	        throw new StatisticsException("Player is null");
	    }
	    
	    if (player.getPlayerId() != null) {
	        Optional<Player> savedPlayer = playerRepository.findById(player.getPlayerId());
	        
	        if (!savedPlayer.isPresent()) {
	            throw new StatisticsException("Player with ID " + player.getPlayerId() + " not found in the database");
	        }
	        
	        // Check if PlayerID, first name, last name, and position do not match the database
	        if (!savedPlayer.get().getPlayerFirstName().equals(player.getPlayerFirstName()) ||
	            !savedPlayer.get().getPlayerLastName().equals(player.getPlayerLastName()) ||
	            !savedPlayer.get().getPosition().equals(player.getPosition())) {
	            throw new StatisticsException(player.getPlayerId() + " is not the playerId of " +
	                    player.getPlayerFirstName() + " " + player.getPlayerLastName() +
	                    " with the position of " + player.getPosition() + ". To insert new week for the current player, enter a matching playerID. To insert a new player, do not enter a playerId.");
	        }
	    } else {
	        // No playerId provided, this is a new player insertion
	        if (player.getPlayerFirstName() == null ||
	            player.getPlayerLastName() == null ||
	            player.getPosition() == null) {
	            throw new StatisticsException("When playerId is null, playerFirstName, playerLastName, and position cannot be null");
	        }
	    }
	}
    public void validateSeason(int year) throws StatisticsException {
    	if (year < 2022 || year > 2023) {
    		throw new StatisticsException("You entered: " + year +".  Can only insert statistics for year 2023");
    	}
    }
    public void validateWeek(int weekNumber) throws StatisticsException {
    	if (weekNumber < 1 || weekNumber > 18) {
    		throw new StatisticsException("You entered: " + weekNumber +".  Please enter week value between 1 and 18");
    		}
    }
    public void validateNotNegative(int passingCompletions, int passingAttempts,
 			int passingYards, int passingTouchdowns, int passingInterceptions, int rushingAttempts, int rushingYards,
			int rushingTouchdowns, int receivingTargets, int receivingReceptions, int receivingYards,
			int receivingTouchdowns) throws StatisticsException {
    	
    	if (passingCompletions < 0 || passingAttempts < 0 || passingTouchdowns < 0 || passingInterceptions < 0
                || rushingAttempts < 0 || rushingTouchdowns < 0 || receivingTargets < 0 || receivingReceptions < 0
                || receivingTouchdowns < 0) {
    		throw new StatisticsException("Completion, Attempt, Touchdown, Interception, and Targets"
    				+ " statistics cannot be negative");
    	}
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
 

}
