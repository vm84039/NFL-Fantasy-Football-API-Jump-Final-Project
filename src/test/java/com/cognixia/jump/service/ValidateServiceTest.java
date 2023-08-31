package com.cognixia.jump.service;

import com.cognixia.jump.exception.StatisticsException;
import com.cognixia.jump.model.Player;
import com.cognixia.jump.model.Player.Position;
import com.cognixia.jump.repository.PlayerRepository;
import com.cognixia.jump.service.ValidateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.when;

public class ValidateServiceTest {

    @Mock
    private PlayerRepository playerRepository;

    private ValidateService validateService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        validateService = new ValidateService();
        validateService.playerRepository = playerRepository;
    }

    @Test
    public void testValidatePlayerValidPlayer() throws StatisticsException {
        // Create a sample player
        Player samplePlayer = new Player();
        samplePlayer.setPlayerId(1L);
        samplePlayer.setPlayerFirstName("John");
        samplePlayer.setPlayerLastName("Doe");
        samplePlayer.setPosition(Position.QB);

        // Mock the behavior of playerRepository.findById
        when(playerRepository.findById(1L)).thenReturn(Optional.of(samplePlayer));

        // Call the method being tested and assert that no exception is thrown
        assertDoesNotThrow(() -> validateService.validatePlayer(samplePlayer));
    }


    @Test
    public void testValidatePlayerInvalidPlayer() {
        // Create a sample player
        Player samplePlayer = new Player();
        samplePlayer.setPlayerId(1L);
        samplePlayer.setPlayerFirstName("John");
        samplePlayer.setPlayerLastName("Doe");
        samplePlayer.setPosition(Position.QB);

        // Mock the behavior of playerRepository.findById to return an empty Optional
        when(playerRepository.findById(1L)).thenReturn(Optional.empty());

        // Call the method being tested and expect a StatisticsException to be thrown
        assertThrows(StatisticsException.class, () -> validateService.validatePlayer(samplePlayer));
    }

    // Add more test cases to cover other scenarios for validate

}