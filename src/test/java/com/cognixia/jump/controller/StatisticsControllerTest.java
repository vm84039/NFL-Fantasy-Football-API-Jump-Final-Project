package com.cognixia.jump.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.cognixia.jump.controller.StatisticsController;
import com.cognixia.jump.exception.ResourceNotFoundException;
import com.cognixia.jump.model.Player;
import com.cognixia.jump.model.Player.Position;
import com.cognixia.jump.model.Statistics;
import com.cognixia.jump.service.PlayerService;
import com.cognixia.jump.service.StatisticsService;

public class StatisticsControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private StatisticsController statisticsController;


    @Mock
    private StatisticsService statisticsService;
    
    @Mock
    private PlayerService playerService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(statisticsController).build();
    }

    @Test
    public void testGetSeasonWeek() throws Exception {
        // Prepare mock data
        int season = 2022;
        int weekNumber = 1;

        // Create mock Statistics objects
        Statistics mockStats1 = new Statistics();
        mockStats1.setYear(2022);
        mockStats1.setWeekNumber(1);
        mockStats1.setTeam("TeamA");
        // Set other properties as needed for your test
        
        Statistics mockStats2 = new Statistics();
        mockStats2.setYear(2022);
        mockStats2.setWeekNumber(1);
        mockStats2.setTeam("TeamB");
        // Set other properties as needed for your test

        // Add mock Statistics objects to the list
        List<Statistics> mockStatsList = new ArrayList<>();
        mockStatsList.add(mockStats1);
        mockStatsList.add(mockStats2);

        // Mock the behavior of playerService.getStatsBySeasonAndWeekNumber
        when(playerService.getStatsBySeasonAndWeekNumber(season, weekNumber)).thenReturn(mockStatsList);

        // Perform the GET request to /api/statistics/{season}/{weekNumber}
        mockMvc.perform(get("/api/statistics/{season}/{weekNumber}", season, weekNumber))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$").isArray());
            // Add more assertions based on the expected JSON structure and content
            
    }

//    @Test
//    public void testGetSeasonWeekNotFound() throws Exception {
//        // Prepare mock data
//        int season = 2022;
//        int weekNumber = 2;
//
//        // Mock the behavior of playerService.getStatsBySeasonAndWeekNumber to throw ResourceNotFoundException
//        when(playerService.getStatsBySeasonAndWeekNumber(eq(season), eq(weekNumber)))
//            .thenThrow(new ResourceNotFoundException("Week", weekNumber));
//
//        // Perform the GET request to /api/statistics/{season}/{weekNumber}
//        mockMvc.perform(get("/api/statistics/{season}/{weekNumber}", season, weekNumber))
//            .andExpect(status().isNotFound())
//            .andExpect(content().contentType(MediaType.APPLICATION_JSON));
//            
//    }
    
    @Test
    public void testInsertStatistics() throws Exception {
        // Create a sample Statistics object
        Statistics stats = new Statistics();
        stats.setYear(2023);
        stats.setWeekNumber(10);
        stats.setTeam("CIN");
        stats.setPassingAttempts(0);
        stats.setPassingYards(0);
        stats.setPassingTouchdowns(0);
        stats.setPassingInterceptions(0);
        stats.setRushingAttempts(0);
        stats.setRushingYards(0);
        stats.setRushingTouchdowns(0);
        stats.setReceivingTargets(0);
        stats.setReceivingReceptions(0);
        stats.setReceivingYards(0);
        stats.setReceivingTouchdowns(0);
        stats.setScore(0);

        Player player = new Player();
        player.setPlayerFirstName("John");
        player.setPlayerLastName("Doe");
        player.setPosition(Position.valueOf("QB"));
        stats.setPlayer(player);

        // Mock the behavior of statisticsService.insertStatistics
        when(statisticsService.insertStatistics(any(Statistics.class))).thenReturn(stats);

        // Convert the Statistics object to JSON
//        String statsJson = objectMapper.writeValueAsString(stats);
//        String statsJson = stats.toString();

        // Perform the POST request to /api/statistics/
        mockMvc.perform(post("/api/statistics/")
                .content(stats.toJson())
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print()) // This should be here
                .andExpect(status().isCreated());

    }

}


