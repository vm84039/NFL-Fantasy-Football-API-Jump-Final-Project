package com.cognixia.jump.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< Updated upstream
=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> Stashed changes
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.exception.ResourceNotFoundException;
import com.cognixia.jump.model.Statistics;
import com.cognixia.jump.repository.StatisticsRepository;
import com.cognixia.jump.service.PlayerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "statistics", description = "the API for managing NFL statistics")

public class StatisticsController {

	@Autowired
	StatisticsRepository repo;
	
	@Autowired
<<<<<<< Updated upstream
	PlayerService service;
=======
	PlayerService playerService;
	@Autowired
	StatisticsService statisticsService;
	
	@Operation(summary = "Get all the statistics in the statistics table", 
			   description = "Gets all the statistics from the book table in the football_db database. "
			   		+ "Each statistic has a statistic id. A Players entity, year, weekNumber, team,"
			   		+ "score message, passing stats, rushing stants, receiving stats, and an overall"
			   		+ "fantasy score"
			)
	
>>>>>>> Stashed changes
	//Shows all NFL stats for 
	//api/season/weekNumber
	@GetMapping("/statistics/{season}/{weekNumber}")
	public ResponseEntity<?> getSeasonWeek(
			@Valid @PathVariable Integer season,
			@Valid @PathVariable Integer  weekNumber) throws ResourceNotFoundException {
		
		List<Statistics> found = service.getStatsBySeasonAndWeekNumber(season, weekNumber);
		
		if(found.isEmpty()) {
			throw new ResourceNotFoundException("Week", weekNumber);
		}
		
		return ResponseEntity.status(200).body(found);
	}
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistic has been found", 
						 content = @Content(mediaType = "application/json", schema = @Schema(implementation = Statistics.class) ) ),
			@ApiResponse(responseCode = "404", description = "Statistic was not found/Invalid post", 
			 			 content = @Content ) 
		}
	)
	

	
}