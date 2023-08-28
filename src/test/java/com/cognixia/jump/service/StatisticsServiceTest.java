package com.cognixia.jump.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
import com.cognixia.jump.service.PlayerService;
import com.cognixia.jump.service.ValidateService;

public class StatisticsServiceTest {

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
