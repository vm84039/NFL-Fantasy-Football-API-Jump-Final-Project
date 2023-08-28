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
    
    @Column(name = "message")
    private String message;

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
		score += (getPassingYards() * 4);
		score += (getPassingTouchdowns() * 100);
		score -= (getPassingInterceptions() * 50);
		
		// Calculate Rushing Scores
		score += (getRushingAttempts() * 5);
		score += (getRushingYards() * 10);
		score += (getRushingTouchdowns() * 100);
		
		// Calculate Receiving Scores
		score += (getReceivingReceptions() * 30);
		score += (getReceivingYards() * 10);
		score += (getReceivingTouchdowns() * 100);		
		
		setScore(score);
		setMessage(message);
	}
	
	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = scoreMessage();
	}
	
	public String scoreMessage() {
		String message;
		if (score > 2000) {
			message = "Hope you started this player.  One of the best scores of the season.";
		}
		else if (score > 1000) {
			message = "Very good game from this player.  Would be a good choice to start on your team.";
		}
		else {
			message ="This was not a very good pick for this week.";
		}
			
		return message;
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

	
	public String toJson() {
	    return "{"
	            + "\"statId\" : " + statId
	            + ", \"player\" : " + player.toJson()
	            + ", \"year\" : " + year
	            + ", \"weekNumber\" : " + weekNumber
	            + ", \"team\" : \"" + team + "\""
	            + ", \"passingCompletions\" : " + passingCompletions
	            + ", \"passingAttempts\" : " + passingAttempts
	            + ", \"passingYards\" : " + passingYards
	            + ", \"passingTouchdowns\" : " + passingTouchdowns
	            + ", \"passingInterceptions\" : " + passingInterceptions
	            + ", \"rushingAttempts\" : " + rushingAttempts
	            + ", \"rushingYards\" : " + rushingYards
	            + ", \"rushingTouchdowns\" : " + rushingTouchdowns
	            + ", \"receivingTargets\" : " + receivingTargets
	            + ", \"receivingReceptions\" : " + receivingReceptions
	            + ", \"receivingYards\" : " + receivingYards
	            + ", \"receivingTouchdowns\" : " + receivingTouchdowns
	            + ", \"score\" : " + score
	            + "}";
	}





	public String toJsonString() {
	    StringBuilder sb = new StringBuilder();

	    sb.append("\n");
	    sb.append(this.scoreMessage()).append(",\n");
	    sb.append("\"passingCompletions\": ").append(this.passingCompletions).append(",\n");
	    sb.append("\"passingAttempts\": ").append(this.passingAttempts).append(",\n");
	    sb.append("\"passingYards\": ").append(this.passingYards).append(",\n");
	    sb.append("\"passingTouchdowns\": ").append(this.passingTouchdowns).append(",\n");
	    sb.append("\"passingInterceptions\": ").append(this.passingInterceptions).append(",\n");
	    sb.append("\"rushingAttempts\": ").append(this.rushingAttempts).append(",\n");
	    sb.append("\"rushingYards\": ").append(this.rushingYards).append(",\n");
	    sb.append("\"rushingTouchdowns\": ").append(this.rushingTouchdowns).append(",\n");
	    sb.append("\"receivingTargets\": ").append(this.receivingTargets).append(",\n");
	    sb.append("\"receivingReceptions\": ").append(this.receivingReceptions).append(",\n");
	    sb.append("\"receivingYards\": ").append(this.receivingYards).append(",\n");
	    sb.append("\"receivingTouchdowns\": ").append(this.receivingTouchdowns).append("\n");

	    return sb.toString();
	}
	

    
    


}
