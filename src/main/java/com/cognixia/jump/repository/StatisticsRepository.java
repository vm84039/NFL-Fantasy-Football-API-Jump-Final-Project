package com.cognixia.jump.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.Statistics;

@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
    // You can add custom query methods here if needed.
	
	@Query("SELECT s FROM Statistics s " +
	           "WHERE s.year = :year AND s.weekNumber = :weekNumber")
	List<Statistics> findBySeasonWeekNumber(@Param("year") int year, @Param("weekNumber") int weekNumber);	
}



