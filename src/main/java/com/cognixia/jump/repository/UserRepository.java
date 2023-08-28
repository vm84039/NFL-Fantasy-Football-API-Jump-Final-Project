package com.cognixia.jump.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.cognixia.jump.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public Optional<User> findByUsername(String username);
	
	@Query("SELECT u FROM User u Where u.enabled = 1")
	public List<User> findEnabled();
	
	 @Modifying
	 @Query("UPDATE User u SET u.enabled = false WHERE u.id = :userId")
	 void disableUserById(Integer userId);

}
