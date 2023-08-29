package com.cognixia.jump.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cognixia.jump.exception.StatisticsException;
import com.cognixia.jump.model.Player;
import com.cognixia.jump.model.Player.Position;
import com.cognixia.jump.model.Statistics;
import com.cognixia.jump.repository.PlayerRepository;
import com.cognixia.jump.repository.StatisticsRepository;
import com.cognixia.jump.service.PlayerService;
import com.cognixia.jump.service.ValidateService;

public class StatisticsServiceTest {
	@Mock
	private StatisticsRepository statisticsRepository;
	
    @Mock
    private ValidateService validateService;

    @Mock
    private PlayerRepository playerRepository;

    @Mock
    private PlayerService playerService;

    @InjectMocks
    private StatisticsService statisticsService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testGetTopScoresForPlayerByName() {
        // Create sample data
        int year = 2023;
        String playerFirstName = "John";
        String playerLastName = "Doe";

        // Create a list of sample Statistics objects
        List<Statistics> sampleStatsList = new ArrayList<>();
        // Add sample Statistics objects to the list (replace with your own test data)

        // Mock the behavior of the statisticsRepository
        when(statisticsRepository.getTopScoresForPlayerByName(year, playerFirstName, playerLastName)).thenReturn(sampleStatsList);

        // Call the method being tested
        List<Statistics> result = statisticsService.getTopScoresForPlayerByName(year, playerFirstName, playerLastName);

        // Verify that the result is not null
        assertNotNull(result);

        // Add more assertions as needed to verify the correctness of the result based on your sample data
    }

    @Test
    public void testGetTopScoresOfSeason() {
        // Create sample data
        int year = 2023;
        int num = 3; // Replace with the desired number of top scores

        // Create a list of sample Statistics objects
        List<Statistics> sampleStatsList = new ArrayList<>();
        // Add sample Statistics objects to the list (replace with your own test data)

        // Mock the behavior of the statisticsRepository
        when(statisticsRepository.getTopScoresOfSeason(year)).thenReturn(sampleStatsList);

        // Call the method being tested
        List<Statistics> result = statisticsService.getTopScoresOfSeason(year, num);

        // Verify that the result is not null
        assertNotNull(result);

        // Add more assertions as needed to verify the correctness of the result based on your sample data
    }

//    @Test
//    public void testInsertStatistics() throws StatisticsException {
//        // Create a sample Statistics object
//    	   Statistics stats = new Statistics();
//           stats.setYear(2023);
//           stats.setWeekNumber(10);
//           stats.setTeam("CIN");
//           stats.setPassingAttempts(0);
//           stats.setPassingYards(0);
//           stats.setPassingTouchdowns(0);
//           stats.setPassingInterceptions(0);
//           stats.setRushingAttempts(0);
//           stats.setRushingYards(0);
//           stats.setRushingTouchdowns(0);
//           stats.setReceivingTargets(0);
//           stats.setReceivingReceptions(0);
//           stats.setReceivingYards(0);
//           stats.setReceivingTouchdowns(0);
//           stats.setScore(0);
//
//           Player player = new Player();
//           player.setPlayerFirstName("John");
//           player.setPlayerLastName("Doe");
//           player.setPosition(Position.valueOf("QB"));
//           stats.setPlayer(player);
//
//        // Mock the behavior of the validateService, playerRepository, and playerService
//        when(playerRepository.findById(anyLong())).thenReturn(Optional.of(new Player("John", "Doe", Position.QB)));
//
//        // Mock any other necessary behavior for validateService and playerService if needed
//
//        // Call the method being tested
//        Statistics result = statisticsService.insertStatistics(stats);
//
//        // Verify that the result is not null
//        assertNotNull(result);
//
//        // Add more assertions as needed to verify the correctness of the result
//    }
}
