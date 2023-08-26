package com.cognixia.jump.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.Player;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

	@Query("Select p From Player p Where p.playerFirstName = :playerFirstName AND p.playerLastName  = :playerLastName")
	public Optional<Player> getPlayerIdbyName(@Param("playerFirstName") String playerFirstName,
							 				 @Param("playerLastName")String playerLastName);

}
