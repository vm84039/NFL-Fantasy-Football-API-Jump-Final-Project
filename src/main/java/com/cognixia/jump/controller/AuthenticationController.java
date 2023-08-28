package com.cognixia.jump.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.AuthenticationRequest;
import com.cognixia.jump.model.AuthenticationResponse;
import com.cognixia.jump.model.User;
import com.cognixia.jump.repository.UserRepository;
import com.cognixia.jump.service.PasswordEncoderService;
import com.cognixia.jump.service.UserService;
import com.cognixia.jump.util.JwtUtil;

@RestController
public class AuthenticationController {

	// authentication manager -> validates/authenticates user credentials
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserDetailsService userDetailsService;

	@Autowired
	JwtUtil jwtUtil;
	
    @Autowired
    private PasswordEncoderService passwordEncoderService;	
    
    @Autowired
    UserRepository repo;
    
    @Autowired
    UserService service;
	
	
	// create the token at http://localhost:8080/authenticate 
	// send the username & password and try to generate a token as a response
	@PostMapping("/authenticate")
	public ResponseEntity<?> createJwtToken(@RequestBody AuthenticationRequest request) throws Exception {
		
		// try to catch the exception for bad credentials, just so we can set our own
		// message when this doesn't work
		service.resetEnabledFlags();
		User user = repo.findByUsername(request.getUsername()).orElse(null);

		if (user != null) {
		    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		    if (passwordEncoder.matches(request.getPassword(), user.getPassword())) {
				// load in the user details for that user
				final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
				
				user.setEnabled(true);
				repo.save(user);

				// generate the token for that user
				final String jwt = jwtUtil.generateTokens(userDetails);

				// return the token
				return ResponseEntity.status(201).body( new AuthenticationResponse(jwt) );

		    } else {
		    	throw new Exception("Incorrect username or password");
		    }
		} else {
		    // User not found, handle accordingly
			throw new Exception("User Not Found");
		}
	}
	
}
