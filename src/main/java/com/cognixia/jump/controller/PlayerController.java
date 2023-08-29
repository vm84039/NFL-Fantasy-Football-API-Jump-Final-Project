package com.cognixia.jump.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Player;
import com.cognixia.jump.repository.PlayerRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "book", description = "the API for managing players")

public class PlayerController {

	@Autowired
	PlayerRepository repo;
	
		@Operation(summary = "Get all the players in the players table", 
				   description = "Get all the players in the football_db database.  Only a get function is included"
				   		+ "Players can only be inserted in the Statistics table."
				)	
	
	
		@ApiResponses(value = {
				@ApiResponse(responseCode = "200", description = "Player has been found", 
							content = @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class) ) ),
				@ApiResponse(responseCode = "404", description = "Player was not found", 
							content = @Content ) 
				}
			)	
		
		
	//api/players
	@GetMapping("/players")
	public List<Player> getPlayers(){
		return repo.findAll();
	}
	
	

	
}