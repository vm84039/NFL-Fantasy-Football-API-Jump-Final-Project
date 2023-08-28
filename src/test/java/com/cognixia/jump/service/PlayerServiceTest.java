package com.cognixia.jump.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.cognixia.jump.model.Player;
import com.cognixia.jump.model.Player.Position;
import com.cognixia.jump.model.Statistics;
import com.cognixia.jump.repository.PlayerRepository;
import com.cognixia.jump.repository.StatisticsRepository;
import com.cognixia.jump.service.PlayerService;

public class PlayerServiceTest {
	@Mock
	private StatisticsRepository statisticsRepository;
	
	@InjectMocks
	private StatisticsService statisticsService;

	@Mock
	private PlayerRepository playerRepository;

	@InjectMocks
	private PlayerService playerService;

	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetPlayerIdbyName() {
		// Create a sample player object and expected result
		Player samplePlayer = new Player();
		samplePlayer.setPlayerFirstName("John");
		samplePlayer.setPlayerLastName("Doe");
		samplePlayer.setPosition(Position.QB);

		Optional<Player> expectedResult = Optional.of(samplePlayer);

		// Mock the behavior of the playerRepository
		when(playerRepository.getPlayerIdbyName("John", "Doe")).thenReturn(expectedResult);

		// Call the method being tested
		Optional<Player> result = playerService.getPlayerIdbyName("John", "Doe");

		// Verify that the result matches the expected result
		assertEquals(expectedResult, result);
	}

	@Test
	public void testGetTopScoresByPositionByWeek() {
		// Create sample data
		int year = 2023;
		int weekNum = 5;
		Position position = Position.QB; // Replace with the desired position
		int num = 3; // Replace with the desired number of top scores

		// Create a list of sample Statistics objects
		List<Statistics> sampleStatsList = new ArrayList<>();
		// Add sample Statistics objects to the list (replace with your own test data)

		// Mock the behavior of the statisticsRepository
		when(statisticsRepository.getTopScoresByPositionByWeek(year, weekNum, position)).thenReturn(sampleStatsList);

		// Call the method being tested
		List<Statistics> result = statisticsService.getTopScoresByPositionByWeek(year, weekNum, position, num);

		// Verify that the result is not null
		assertNotNull(result);

		// Add more assertions as needed to verify the correctness of the result based
		// on your sample data
	}
}
