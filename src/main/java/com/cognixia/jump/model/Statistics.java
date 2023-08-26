package com.cognixia.jump.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import net.bytebuddy.implementation.bind.annotation.Default;

@Table(name = "statistics")
@Entity
public class Statistics implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stat_id")
    private Long statId;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
    
    @Min(2022) @Max(2023)
    @Column(name = "year") // Add year field
    private int year;

    @Min(1) @Max(18)
    @Column(name = "week_number")
    private int weekNumber;
    
    @Column(name = "team", nullable = false, length = 3)
    private String team;

    @Column(name = "passing_comp")
    private int passingCompletions;

    @Column(name = "passing_att")
    private int passingAttempts;

    @Column(name = "passing_yards")
    private int passingYards;

    @Column(name = "passing_td")
    private int passingTouchdowns;

    @Column(name = "passing_int")
    private int passingInterceptions;

    @Column(name = "rushing_att")
    private int rushingAttempts;

    @Column(name = "rushing_yard")
    private int rushingYards;

    @Column(name = "rushing_td")
    private int rushingTouchdowns;

    @Column(name = "receiving_target")
    private int receivingTargets;

    @Column(name = "receiving_rec")
    private int receivingReceptions;

    @Column(name = "receiving_yards")
    private int receivingYards;

    @Column(name = "receiving_td")
    private int receivingTouchdowns;
    
    @Column(name = "score") 
    private long score = 0;
    
        
    public Statistics() {
    	
    }



	public Statistics(Player player, int year, int weekNumber, String team, int passingCompletions,
			int passingAttempts, int passingYards, int passingTouchdowns, int passingInterceptions, int rushingAttempts,
			int rushingYards, int rushingTouchdowns, int receivingTargets, int receivingReceptions, int receivingYards,
			int receivingTouchdowns) {
		super();
		this.player = player;
		this.year = year;
		this.weekNumber = weekNumber;
		this.team = team;
		this.passingCompletions = passingCompletions;
		this.passingAttempts = passingAttempts;
		this.passingYards = passingYards;
		this.passingTouchdowns = passingTouchdowns;
		this.passingInterceptions = passingInterceptions;
		this.rushingAttempts = rushingAttempts;
		this.rushingYards = rushingYards;
		this.rushingTouchdowns = rushingTouchdowns;
		this.receivingTargets = receivingTargets;
		this.receivingReceptions = receivingReceptions;
		this.receivingYards = receivingYards;
		this.receivingTouchdowns = receivingTouchdowns;
	}
	public Long getStatId() {
		return statId;
	}

	public void setStatId(Long statId) {
		this.statId = statId;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getPassingCompletions() {
		return passingCompletions;
	}

	public void setPassingCompletions(int passingCompletions) {
		this.passingCompletions = passingCompletions;
	}

	public int getPassingAttempts() {
		return passingAttempts;
	}

	public void setPassingAttempts(int passingAttempts) {
		this.passingAttempts = passingAttempts;
	}

	public int getPassingYards() {
		return passingYards;
	}

	public void setPassingYards(int passingYards) {
		this.passingYards = passingYards;
	}

	public int getPassingTouchdowns() {
		return passingTouchdowns;
	}

	public void setPassingTouchdowns(int passingTouchdowns) {
		this.passingTouchdowns = passingTouchdowns;
	}

	public int getPassingInterceptions() {
		return passingInterceptions;
	}

	public void setPassingInterceptions(int passingInterceptions) {
		this.passingInterceptions = passingInterceptions;
	}

	public int getRushingAttempts() {
		return rushingAttempts;
	}

	public void setRushingAttempts(int rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
	}

	public int getRushingYards() {
		return rushingYards;
	}

	public void setRushingYards(int rushingYards) {
		this.rushingYards = rushingYards;
	}

	public int getRushingTouchdowns() {
		return rushingTouchdowns;
	}

	public void setRushingTouchdowns(int rushingTouchdowns) {
		this.rushingTouchdowns = rushingTouchdowns;
	}

	public int getReceivingTargets() {
		return receivingTargets;
	}

	public void setReceivingTargets(int receivingTargets) {
		this.receivingTargets = receivingTargets;
	}

	public int getReceivingReceptions() {
		return receivingReceptions;
	}

	public void setReceivingReceptions(int receivingReceptions) {
		this.receivingReceptions = receivingReceptions;
	}

	public int getReceivingYards() {
		return receivingYards;
	}

	public void setReceivingYards(int receivingYards) {
		this.receivingYards = receivingYards;
	}

	public int getReceivingTouchdowns() {
		return receivingTouchdowns;
	}

	public void setReceivingTouchdowns(int receivingTouchdowns) {
		this.receivingTouchdowns = receivingTouchdowns;
	}
	
	

	public int getWeekNumber() {
		return weekNumber;
	}



	public void setWeekNumber(int weekNumber) {
		this.weekNumber = weekNumber;
	}


	public void calculateScore() {
		long score = 0;
		int passingIncompletions = getPassingAttempts() - getPassingCompletions();
		
		// Calculate Passing Scores
		score += (getPassingCompletions() * 5);
		score -= passingIncompletions;
		score += (getPassingYards() * 2);
		score += (getPassingTouchdowns() * 100);
		score -= (getPassingInterceptions() * 50);
		
		// Calculate Rushing Scores
		score += (getRushingAttempts() * 5);
		score += (getRushingYards() * 5);
		score += (getRushingTouchdowns() * 100);
		
		// Calculate Receiving Scores
		score += (getReceivingReceptions() * 40);
		score += (getReceivingYards() * 8);
		score += (getReceivingTouchdowns() * 200);		
		
		setScore(score);
	}
	
	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Statistics [statId=" + statId + ", player=" + player +  ", passingCompletions="
				+ passingCompletions + ", passingAttempts=" + passingAttempts + ", passingYards=" + passingYards
				+ ", passingTouchdowns=" + passingTouchdowns + ", passingInterceptions=" + passingInterceptions
				+ ", rushingAttempts=" + rushingAttempts + ", rushingYards=" + rushingYards + ", rushingTouchdowns="
				+ rushingTouchdowns + ", receivingTargets=" + receivingTargets + ", receivingReceptions="
				+ receivingReceptions + ", receivingYards=" + receivingYards + ", receivingTouchdowns="
				+ receivingTouchdowns + "]";
	}
    
    


}
