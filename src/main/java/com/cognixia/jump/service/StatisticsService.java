package com.cognixia.jump.service;

import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Statistics;

@Service
public class StatisticsService {
	
	//accepts parameters to calculate a fantasy score 
	public long calculateScore(int passingAttempts, int passingCompletions, int passingYards, int passingTouchdowns, int passingInterceptions,
									int rushingAttempts, int rushingYards, int rushingTouchdowns, 
									int receivingReceptions, int receivingYards, int receivingTouchdowns) {
		
		long score = 0;
		int passingIncompletions = passingAttempts - passingCompletions;
		
		// Calculate passing Scores
		score += (passingCompletions * 5);
		score -= passingIncompletions;
		score += (passingYards * 2);
		score += (passingTouchdowns * 100);
		score -= (passingInterceptions * 50);
		
		// Calculate rushing Scores
		score += (rushingAttempts * 5);
		score += (rushingYards * 5);
		score += (rushingTouchdowns * 100);
		
		// Calculate receiving Scores
		score += (receivingReceptions * 40);
		score += (receivingYards * 8);
		score += (receivingTouchdowns * 200);	
		
		return score;
	}


}
