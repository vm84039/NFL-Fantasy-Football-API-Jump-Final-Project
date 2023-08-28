package com.cognixia.jump.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.cognixia.jump.model.User;
import com.cognixia.jump.repository.UserRepository;

@SpringBootTest
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setUp() {
        // Reset any Mockito interactions before each test
        reset(userRepository);
    }

    @Test
    public void testGetUserById() {
        // Create a sample user
        User mockUser = new User();
        mockUser.setId(1);
        mockUser.setUsername("testuser");

        // Mock the UserRepository to return the sample user when findById is called
        when(userRepository.findById(1)).thenReturn(Optional.of(mockUser));

        // Call the getUserById method
        User resultUser = userService.getUserById(1);

        // Assert that the returned user matches the sample user
        assertEquals(mockUser, resultUser);
    }

 

}
