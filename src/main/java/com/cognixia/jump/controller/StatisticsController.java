package com.cognixia.jump.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.exception.ResourceNotFoundException;
import com.cognixia.jump.exception.StatisticsException;
import com.cognixia.jump.model.Player;
import com.cognixia.jump.model.Statistics;
import com.cognixia.jump.repository.StatisticsRepository;
import com.cognixia.jump.service.PlayerService;
import com.cognixia.jump.service.StatisticsService;

@RestController
@RequestMapping("/api")
public class StatisticsController {

	@Autowired
	StatisticsRepository repo;
	
	@Autowired
	PlayerService playerService;
	@Autowired
	StatisticsService statisticsService;
	
	//Shows all NFL stats for 
	//api/season/weekNumber
	@GetMapping("/statistics/{season}/{weekNumber}")
	public ResponseEntity<?> getSeasonWeek(
			@Valid @PathVariable Integer season,
			@Valid @PathVariable Integer  weekNumber) throws ResourceNotFoundException {
		
		List<Statistics> found = playerService.getStatsBySeasonAndWeekNumber(season, weekNumber);
		
		if(found.isEmpty()) {
			throw new ResourceNotFoundException("Week", weekNumber);
		}
		return ResponseEntity.status(200).body(found);
	}
	
	@PostMapping("/statistics/")
	public ResponseEntity<?> insertStatistics(@Valid @RequestBody Statistics stats) 
	    throws StatisticsException {
	    System.out.println("Year: " + stats.getYear());
	    System.out.println("Week Number: " + stats.getWeekNumber());

	    // Access player information
	    Player player = stats.getPlayer();
	    if (player != null) {
	        System.out.println("Player First Name: " + player.getPlayerFirstName());
	        System.out.println("Player Last Name: " + player.getPlayerLastName());
	        System.out.println("Position: " + player.getPosition());
	    } else {
	        System.out.println("Player information is null.");
	    }

	    Statistics created = statisticsService.insertStatistics(stats);

	    return ResponseEntity.status(201).body(created);
	}
	

	
}