package com.cognixia.jump.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Player;
import com.cognixia.jump.repository.PlayerRepository;

@RestController
@RequestMapping("/api")
public class PlayerController {

	@Autowired
	PlayerRepository repo;
	
	//Shows all NFL players in Database
	//api/players
	@GetMapping("/players")
	public List<Player> getPlayers(){
		return repo.findAll();
	}
	

	
}