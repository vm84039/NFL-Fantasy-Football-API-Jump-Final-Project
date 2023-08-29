package com.cognixia.jump.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.User;
import com.cognixia.jump.repository.UserRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "user", description = "the API for managing users")

public class UserController {

	@Autowired
	UserRepository repo;
	
	// default encoder
	@Autowired
	PasswordEncoder encoder;
	
	@Operation(summary = "Get all the Users in the user table", 
			   description = "Gets all the Users from the user table in the football_db database. Each user grabbed has id, username, hashed password, and role, and enabled."
			)
	
	@GetMapping("/user")
	public List<User> getUsers() {
		return repo.findAll();
	}
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User has been found", 
						 content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class) ) ),
			@ApiResponse(responseCode = "404", description = "User was not found", 
			 			 content = @Content ) 
		}
	)
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUserById(@PathVariable int id) {
		
		Optional<User> user = repo.findById(id);
		
		if(user.isEmpty()) {
			return ResponseEntity.status(404).body("User not found");
		}
		else {
			return ResponseEntity.status(200).body(user.get());
		}
	}

	@PostMapping("/user")
	public ResponseEntity<?> createUser( @RequestBody User user ) {
		
		user.setId(null);
		
		user.setPassword( encoder.encode( user.getPassword() ) );
				
		User created = repo.save(user);
		
		return ResponseEntity.status(201).body(created);
	}
}
