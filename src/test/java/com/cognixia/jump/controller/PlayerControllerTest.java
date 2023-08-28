package com.cognixia.jump.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.cognixia.jump.controller.PlayerController;
import com.cognixia.jump.model.Player;
import com.cognixia.jump.model.Player.Position;
import com.cognixia.jump.repository.PlayerRepository;

public class PlayerControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private PlayerController playerController;

    @Mock
    private PlayerRepository playerRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(playerController).build();
    }

    @Test
    public void testGetPlayers() throws Exception {
        // Prepare some sample data for the repository
        Player player1 = new Player("Trace", "McSorley", Position.QB);
        Player player2 = new Player("John", "Doe", Position.RB);
        List<Player> playerList = Arrays.asList(player1, player2);

        // Mock the behavior of the playerRepository to return the sample data
        when(playerRepository.findAll()).thenReturn(playerList);

        // Perform the GET request to /api/players
        mockMvc.perform(get("/api/players"))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json"))
            .andExpect(jsonPath("$").isArray())
            .andExpect(jsonPath("$[0].playerFirstName").value("Trace"))
            .andExpect(jsonPath("$[0].playerLastName").value("McSorley"))
            .andExpect(jsonPath("$[0].position").value("QB"))
            .andExpect(jsonPath("$[1].playerFirstName").value("John"))
            .andExpect(jsonPath("$[1].playerLastName").value("Doe"))
            .andExpect(jsonPath("$[1].position").value("RB"));
    }
}
