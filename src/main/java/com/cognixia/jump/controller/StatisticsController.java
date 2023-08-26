package com.cognixia.jump.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.exception.ResourceNotFoundException;
import com.cognixia.jump.model.Statistics;
import com.cognixia.jump.repository.StatisticsRepository;
import com.cognixia.jump.service.PlayerService;

@RestController
@RequestMapping("/api")
public class StatisticsController {

	@Autowired
	StatisticsRepository repo;
	
	@Autowired
	PlayerService service;
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
	

	
}