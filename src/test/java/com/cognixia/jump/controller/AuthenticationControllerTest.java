package com.cognixia.jump.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cognixia.jump.model.AuthenticationRequest;
import com.cognixia.jump.model.User;
import com.cognixia.jump.repository.UserRepository;
import com.cognixia.jump.util.JwtUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class AuthenticationControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserRepository userRepository; // Mocking UserRepository

	@MockBean(name = "userDetailsService")
	private UserDetailsService userDetailsService; // Mocking MyUserDetailsService

	@MockBean
	private JwtUtil jwtUtil;

	@BeforeEach
	public void setUp() {
		// Mock any necessary behavior for userRepository, userDetailsService, and
		// jwtUtil
	}

//	@Test
//	public void testCreateJwtTokenSuccess() throws Exception {
//		// Arrange
//		AuthenticationRequest request = new AuthenticationRequest();
//		request.setPassword("password");
//		request.setUsername("username");
//		UserDetails userDetails = mock(UserDetails.class);
//		User user = new User();
//		user.setUsername("username");
//		user.setPassword("$2a$10$SOMEHASH"); // A valid hashed password
//
//		when(userRepository.findByUsername("username")).thenReturn(Optional.of(user));
//		when(userDetailsService.loadUserByUsername("username")).thenReturn(userDetails);
//		when(jwtUtil.generateTokens(userDetails)).thenReturn("fakeJWT");
//
//		// Act
//		MvcResult mvcResult = mockMvc
//				.perform(MockMvcRequestBuilders.post("/authenticate")
//						.content(asJsonString(request))
//						.contentType(MediaType.APPLICATION_JSON)
//						.accept(MediaType.APPLICATION_JSON))
//				.andExpect(MockMvcResultMatchers.status().isCreated()).andReturn();
//
//		// Assert
//		String content = mvcResult.getResponse().getContentAsString();
//		assertEquals("fakeJWT", content); // You might need to adjust this based on your response structure
//	}

	// Other test methods similar to the one above

	// Utility method to convert objects to JSON string
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
