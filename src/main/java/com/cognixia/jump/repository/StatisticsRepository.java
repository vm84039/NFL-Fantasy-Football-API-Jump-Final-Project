package com.cognixia.jump.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.Player.Position;
import com.cognixia.jump.model.Statistics;

@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
    // You can add custom query methods here if needed.
	
	@Query("SELECT s FROM Statistics s " +
	           "WHERE s.year = :year AND s.weekNumber = :weekNumber")
	List<Statistics> findBySeasonWeekNumber(@Param("year") int year, @Param("weekNumber") int weekNumber);	
	
    @Query(value = "SELECT * FROM statistics s WHERE s.week_number = :weekNumber AND s.year = :year "
    		+ "ORDER BY s.score DESC LIMIT :num", nativeQuery = true)
	List<Statistics>getTopScoresAllPlayersByWeek(@Param("year") int year, @Param("weekNumber") int weekNumber, @Param("num") int num);
    
    @Query("SELECT s FROM Statistics s JOIN s.player p WHERE s.year = :year AND s.weekNumber = :weekNumber AND p.position = :position "
            + "ORDER BY s.score DESC")
    List<Statistics> getTopScoresByPositionByWeek(@Param("year") int year, @Param("weekNumber") int weekNumber, 
                                               @Param("position") Position position);
    
    @Query("SELECT s FROM Statistics s WHERE s.year = :year AND s.player.playerFirstName = :firstName AND s.player.playerLastName = :lastName ORDER BY s.score DESC")
    List<Statistics> getTopScoresForPlayerByName(@Param("year") int year, @Param("firstName") String firstName, 
    												@Param("lastName") String lastName);
    
    @Query("SELECT s FROM Statistics s WHERE s.year = :year "
            + "ORDER BY s.score DESC")
    List<Statistics> getTopScoresOfSeason(@Param("year") int year);
}