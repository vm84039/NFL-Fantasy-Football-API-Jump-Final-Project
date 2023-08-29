package com.cognixia.jump.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.v3.oas.annotations.media.Schema;


@Table(name = "player")
@Entity
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public enum Position {
	    QB, // Quarterback
	    RB, // Running Back
	    WR, // Wide Receiver
	    TE  // Tight End
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long playerId;

	@Schema(description = "Player First Name", example = "Josh", required = true)
	@Column(name = "player_first_name", nullable = false)
    private String playerFirstName;

    @Column(name = "player_last_name", nullable = false)
    private String playerLastName;

    @Column(name = "position")
    @Enumerated(EnumType.STRING)
    private Position position;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Statistics> statistics = new ArrayList<>();

    public Player() {
    	
    }
    
	public Player(String playerFirstName, String playerLastName, Position position) {
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.position = position;
	}

	public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

//	public List<Statistics> getStatistics() {
//		return statistics;
//	}

	public void setStatistics(List<Statistics> statistics) {
		this.statistics = statistics;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerFirstName=" + playerFirstName + ", playerLastName="
				+ playerLastName + ", position=" + position + "]";
	}
	
	public String toJson() {
	    return "{"
	            + "\"playerId\" : " + playerId
	            + ", \"playerFirstName\" : \"" + playerFirstName + "\""
	            + ", \"playerLastName\" : \"" + playerLastName + "\""
	            + ", \"position\" : \"" + position + "\""
	            + "}";
	}

	
	


}
