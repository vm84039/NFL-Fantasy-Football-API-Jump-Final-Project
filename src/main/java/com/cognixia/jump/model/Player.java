package com.cognixia.jump.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name = "player")
@Entity
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "player_first_name", nullable = false)
    private String playerFirstName;

    @Column(name = "player_last_name", nullable = false)
    private String playerLastName;

    @Column(name = "position", nullable = false, length = 50)
    private String position;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Statistics> statistics = new ArrayList<>();

    public Player() {
    	
    }
    
	public Player(String playerFirstName, String playerLastName, String team, String position) {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
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


}
