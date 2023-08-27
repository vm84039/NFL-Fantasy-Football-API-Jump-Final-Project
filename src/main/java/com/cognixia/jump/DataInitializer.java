package com.cognixia.jump;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognixia.jump.exception.StatisticsException;
import com.cognixia.jump.model.Player.Position;
import com.cognixia.jump.service.PlayerService;
import com.cognixia.jump.service.StatisticsService;

@Component
public class DataInitializer implements CommandLineRunner {

	private final PlayerService playerService;
	private final StatisticsService statisticsService;

	@Autowired
	public DataInitializer(PlayerService playerService, StatisticsService statisticsService) {
		this.playerService = playerService;
		this.statisticsService = statisticsService;
	}

	@Override
	public void run(String... args) throws StatisticsException {
		insertStatisticsWeek1();
		insertStatisticsWeek2();
		insertStatisticsWeek3();
		insertStatisticsWeek4();
		insertStatisticsWeek5();
		insertStatisticsWeek6();
		insertStatisticsWeek7();
		insertStatisticsWeek8();
		insertStatisticsWeek9();
		insertStatisticsWeek10();
		insertStatisticsWeek11();
		insertStatisticsWeek12();
		insertStatisticsWeek13();
		insertStatisticsWeek14();
		insertStatisticsWeek15();
		insertStatisticsWeek16();
		insertStatisticsWeek17();
		insertStatisticsWeek18();
	}

	private void insertStatisticsWeek1() throws StatisticsException {
		// NFL Statistics 2022 Week1
		playerService.insertPlayerWithStatistics("Trace", "McSorley", "ARI", Position.valueOf("QB"), 2022, 1, 2, 4, 12,
				0, 0, 3, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyler", "Murray", "ARI", Position.valueOf("QB"), 2022, 1, 22, 34, 193,
				2, 0, 5, 29, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Eno", "Benjamin", "ARI", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 4, 28, 0, 4, 3, 33, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 10, 26, 1, 6, 5, 29, 0);
		playerService.insertPlayerWithStatistics("Zach", "Ertz", "ARI", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 2, 14, 1);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 43, 1);
		playerService.insertPlayerWithStatistics("Greg", "Dortch", "ARI", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 7, 63, 0);
		playerService.insertPlayerWithStatistics("AJ", "Green", "ARI", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 1, 20, 33,
				215, 0, 0, 12, 72, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 1, 0,
				0, 0, 0, 0, 22, 120, 1, 5, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Avery", "Williams", "ATL", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 2, 7, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Damien", "Williams", "ATL", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 2, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Anthony", "Firkser", "ATL", Position.valueOf("TE"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Parker", "Hesse", "ATL", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Pitts", "ATL", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 2, 19, 0);
		playerService.insertPlayerWithStatistics("KhaDarel", "Hodge", "ATL", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 38, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 74, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 1, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 4, 49, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 1, 17, 30,
				213, 3, 1, 6, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "Davis", "BAL", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				2, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenyan", "Drake", "BAL", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 11, 31, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Justice", "Hill", "BAL", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 2, 4, 0, 2, 2, 7, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Ricard", "BAL", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 52, 0);
		playerService.insertPlayerWithStatistics("Rashod", "Bateman", "BAL", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 2, 59, 1);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 54, 2);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 1, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 1, 26, 31, 297,
				3, 2, 10, 56, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zack", "Moss", "BUF", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				6, 15, 0, 6, 6, 21, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 8, 48, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Jamison", "Crowder", "BUF", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 88, 1);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 8, 122, 1);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 19, 1);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "CAR", Position.valueOf("QB"), 2022, 1, 16, 27,
				235, 1, 1, 5, 6, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 2, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 1, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "CAR", Position.valueOf("RB"), 2022, 1, 0, 0,
				0, 0, 0, 10, 33, 1, 5, 4, 24, 0);
		playerService.insertPlayerWithStatistics("Ian", "Thomas", "CAR", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 53, 0);
		playerService.insertPlayerWithStatistics("Chosen", "Anderson", "CAR", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 102, 1);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				1, 7, 0, 6, 3, 43, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 1, 8, 17, 121,
				2, 1, 11, 28, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 9, 45, 1, 1, 1, -2, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 17, 26, 0, 4, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 51, 1);
		playerService.insertPlayerWithStatistics("Byron", "Pringle", "CHI", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 22, 0);
		playerService.insertPlayerWithStatistics("Equanimeous", "St", "CHI", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 18, 1);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 1, 33, 53, 338,
				2, 4, 6, 47, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				27, 82, 0, 9, 7, 63, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 1, 4, 0, 5, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 46, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 4, 33, 1);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 16, 10, 129, 1);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 1, 18, 34,
				147, 1, 0, 4, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				22, 141, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Demetric", "Felton", "CLE", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 11, 46, 1, 4, 4, 24, 1);
		playerService.insertPlayerWithStatistics("Harrison", "Bryant", "CLE", Position.valueOf("TE"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 18, 0);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 17, 0);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 1, 0,
				0, 0, 0, 0, 0, 0, 0, 11, 6, 60, 0);
		playerService.insertPlayerWithStatistics("Anthony", "Schwartz", "CLE", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 2, 20, 0, 2, 1, 19, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 1, 14, 29, 134,
				0, 1, 2, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cooper", "Rush", "DAL", Position.valueOf("QB"), 2022, 1, 7, 13, 64, 0,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 10, 52, 0, 2, 1, -3, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 6, 8, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 7, 62, 0);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 5, 68, 0);
		playerService.insertPlayerWithStatistics("Dennis", "Houston", "DAL", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 2, 16, 0);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 2, 29, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 1, 29, 42,
				340, 1, 0, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "Boone", "DEN", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Melvin", "Gordon", "DEN", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 12, 58, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Javonte", "Williams", "DEN", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 7, 43, 0, 12, 11, 65, 0);
		playerService.insertPlayerWithStatistics("Andrew", "Beck", "DEN", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 52, 0);
		playerService.insertPlayerWithStatistics("Albert", "Okwuegbunam", "DEN", Position.valueOf("TE"), 2022, 1, 0, 0,
				0, 0, 0, 0, 0, 0, 6, 5, 33, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 102, 1);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 72, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 1, 21, 37, 215,
				2, 1, 2, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 15, 144, 1, 3, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 11, 28, 2, 2, 1, 2, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "DET", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 38, 0);
		playerService.insertPlayerWithStatistics("DJ", "Chark", "DET", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 4, 52, 1);
		playerService.insertPlayerWithStatistics("Josh", "Reynolds", "DET", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 28, 0);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 8, 64, 1);
		playerService.insertPlayerWithStatistics("Jordan", "Love", "GB", Position.valueOf("QB"), 2022, 1, 4, 5, 65, 0,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 1, 22, 34, 195,
				0, 1, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				10, 45, 1, 6, 5, 46, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				5, 49, 0, 5, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Josiah", "Deguara", "GB", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 36, 0);
		playerService.insertPlayerWithStatistics("Randall", "Cobb", "GB", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				1, 11, 0, 5, 4, 37, 0);
		playerService.insertPlayerWithStatistics("Sammy", "Watkins", "GB", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 18, 0);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 1, 7, 0, 4, 2, 34, 0);
		playerService.insertPlayerWithStatistics("Juwann", "Winfree", "GB", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 1, 23, 37, 240,
				2, 0, 2, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rex", "Burkhead", "HOU", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 14, 40, 0, 8, 5, 30, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Driskel", "HOU", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 1, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Troy", "Hairston", "HOU", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 11, 33, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Pharaoh", "Brown", "HOU", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("OJ", "Howard", "HOU", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 38, 2);
		playerService.insertPlayerWithStatistics("Brevin", "Jordan", "HOU", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Nico", "Collins", "HOU", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 26, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 7, 82, 0);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 1, 32, 50, 352, 1,
				1, 4, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nyheim", "Hines", "IND", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 3, 4, 0, 6, 6, 50, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 31, 161, 1, 7, 4, 14, 0);
		playerService.insertPlayerWithStatistics("Mo", "Alie-Cox", "IND", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 26, 0);
		playerService.insertPlayerWithStatistics("Kylen", "Granson", "IND", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 22, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 37, 0);
		playerService.insertPlayerWithStatistics("Ashton", "Dulin", "IND", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 46, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman", "IND", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 13, 9, 121, 1);
		playerService.insertPlayerWithStatistics("Mike", "Strachan", "IND", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 36, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 1, 24, 42,
				275, 1, 1, 2, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 4, 47, 0, 4, 2, 18, 0);
		playerService.insertPlayerWithStatistics("James", "Robinson", "JAC", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 11, 66, 1, 2, 1, 3, 1);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 28, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 38, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 6, 65, 0);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 6, 117, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 1, 30, 39,
				360, 5, 0, 3, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Clyde", "Edwards-Helaire", "KC", Position.valueOf("RB"), 2022, 1, 0,
				0, 0, 0, 0, 7, 42, 0, 3, 3, 32, 2);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 4, 22, 0, 4, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 12, 62, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jody", "Fortson", "KC", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 1, 1);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 8, 121, 1);
		playerService.insertPlayerWithStatistics("Mecole", "Hardman", "KC", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 16, 1);
		playerService.insertPlayerWithStatistics("Skyy", "Moore", "KC", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 30, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 1, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 6, 79, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 1,
				0, 0, 0, 0, 0, 1, -3, 0, 4, 4, 44, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 1, 26, 34,
				279, 3, 0, 4, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 14, 36, 0, 4, 4, 36, 0);
		playerService.insertPlayerWithStatistics("Zander", "Horvath", "LAC", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 1, 2, 0, 2, 2, 6, 1);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 4, 21, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Sony", "Michel", "LAC", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 7, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 54, 1);
		playerService.insertPlayerWithStatistics("Tre'", "McKitty", "LAC", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Keenan", "Allen", "LAC", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 66, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 64, 1);
		playerService.insertPlayerWithStatistics("Matthew", "Stafford", "LAR", Position.valueOf("QB"), 2022, 1, 29, 41,
				240, 1, 3, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				3, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Darrell", "Henderson", "LAR", Position.valueOf("RB"), 2022, 1, 0, 0,
				0, 0, 0, 13, 47, 0, 5, 5, 26, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 5, 39, 0);
		playerService.insertPlayerWithStatistics("Cooper", "Kupp", "LAR", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 15, 13, 128, 1);
		playerService.insertPlayerWithStatistics("Brandon", "Powell", "LAR", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 1, 3, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Ben", "Skowronek", "LAR", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 25, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 1, 22, 37, 295, 2,
				3, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ameer", "Abdullah", "LV", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Bolden", "LV", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 3, 7, 0, 2, 2, 21, 1);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				10, 57, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Jakob", "Johnson", "LV", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Darren", "Waller", "LV", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 79, 0);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 17, 10, 141, 1);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Renfrow", "LV", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 21, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 1, 23, 33,
				270, 1, 0, 2, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chase", "Edmonds", "MIA", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 12, 25, 0, 4, 4, 40, 0);
		playerService.insertPlayerWithStatistics("Alec", "Ingold", "MIA", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 1, 2, 0, 2, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 5, 16, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Durham", "Smythe", "MIA", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 1, 6, 0, 12, 8, 94, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 1, 8, 0, 5, 4, 69, 1);
		playerService.insertPlayerWithStatistics("Cedrick", "Wilson", "MIA", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 1, 8, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 1, 23, 32, 277,
				2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 20, 90, 0, 5, 3, 18, 0);
		playerService.insertPlayerWithStatistics("CJ", "Ham", "MIN", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0, 0,
				0, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 1, 0, 0,
				0, 0, 0, 8, 36, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Johnny", "Mundt", "MIN", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 17, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 9, 184, 2);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 36, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 1, 21, 30, 213, 1,
				1, 2, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 9, 48, 0, 3, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Ty", "Montgomery", "NE", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 2, -2, 0, 4, 3, 15, 1);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 1, 0, 0,
				0, 0, 0, 8, 25, 0, 2, 2, 2, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Jonnu", "Smith", "NE", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Nelson", "Agholor", "NE", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 41, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 1, 7, 0, 6, 4, 55, 0);
		playerService.insertPlayerWithStatistics("Jameis", "Winston", "NO", Position.valueOf("QB"), 2022, 1, 23, 34,
				269, 2, 0, 2, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mark", "Ingram", "NO", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				4, 22, 0, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 9, 39, 0, 4, 3, 7, 0);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 43, 0);
		playerService.insertPlayerWithStatistics("Jarvis", "Landry", "NO", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 7, 114, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 41, 0);
		playerService.insertPlayerWithStatistics("Michael", "Thomas", "NO", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 57, 2);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 1, 17, 21, 188,
				2, 1, 6, 25, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 18, 164, 1, 7, 6, 30, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 5, 24, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chris", "Myarick", "NYG", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 1, 1);
		playerService.insertPlayerWithStatistics("Kenny", "Golladay", "NYG", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 1, 2, 0, 6, 5, 59, 0);
		playerService.insertPlayerWithStatistics("Sterling", "Shepard", "NYG", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 71, 1);
		playerService.insertPlayerWithStatistics("Kadarius", "Toney", "NYG", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 2, 23, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Flacco", "NYJ", Position.valueOf("QB"), 2022, 1, 37, 59, 309,
				1, 1, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 10, 60, 0, 9, 7, 40, 0);
		playerService.insertPlayerWithStatistics("Breece", "Hall", "NYJ", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 6, 23, 0, 9, 6, 38, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 16, 1);
		playerService.insertPlayerWithStatistics("Braxton", "Berrios", "NYJ", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 37, 0);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 77, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 49, 0);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 4, 52, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 1, 18, 32, 243,
				0, 0, 17, 90, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 5, 20, 1, 4, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 13, 96, 1, 2, 2, 9, 0);
		playerService.insertPlayerWithStatistics("Boston", "Scott", "PHI", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 4, 10, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 60, 0);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 13, 10, 155, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Trubisky", "PIT", Position.valueOf("QB"), 2022, 1, 21, 38,
				194, 1, 0, 3, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 10, 23, 0, 2, 2, 3, 1);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 3, 7, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 5, 75, 0);
		playerService.insertPlayerWithStatistics("Zach", "Gentry", "PIT", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 40, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "PIT", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 6, 36, 0, 6, 4, 18, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 7, 55, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 1, 23, 28, 195,
				2, 0, 6, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Travis", "Homer", "SEA", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rashaad", "Penny", "SEA", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 12, 60, 0, 3, 2, 7, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 43, 1);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Colby", "Parkinson", "SEA", Position.valueOf("TE"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 43, 1);
		playerService.insertPlayerWithStatistics("Marquise", "Goodwin", "SEA", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 28, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 7, 36, 0);
		playerService.insertPlayerWithStatistics("Trey", "Lance", "SF", Position.valueOf("QB"), 2022, 1, 13, 28, 164, 0,
				1, 13, 54, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Juszczyk", "SF", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Mitchell", "SF", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 6, 41, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "SF", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0, 0,
				9, 22, 0, 2, 2, 8, 0);
		playerService.insertPlayerWithStatistics("Ross", "Dwelley", "SF", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Kroft", "SF", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 1, 7, 0, 3, 2, 40, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 62, 0);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 8, 52, 1, 7, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 1, 18, 27, 212, 1,
				1, 2, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 21, 127, 0, 2, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 6, 14, 0, 2, 2, 7, 0);
		playerService.insertPlayerWithStatistics("Cameron", "Brate", "TB", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 5, 71, 1);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 35, 0);
		playerService.insertPlayerWithStatistics("Julio", "Jones", "TB", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0, 0,
				2, 17, 0, 5, 3, 69, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 1, 20, 33,
				266, 2, 0, 2, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 21, 82, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dontrell", "Hilliard", "TEN", Position.valueOf("RB"), 2022, 1, 0, 0,
				0, 0, 0, 2, 8, 0, 4, 3, 61, 2);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 1, 0, 0,
				0, 0, 0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Geoff", "Swaim", "TEN", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 55, 0);
		playerService.insertPlayerWithStatistics("Cody", "Hollister", "TEN", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 22, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Philips", "TEN", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 66, 0);
		playerService.insertPlayerWithStatistics("Nick", "Westbrook-Ikhine", "TEN", Position.valueOf("WR"), 2022, 1, 0,
				0, 0, 0, 0, 0, 0, 0, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Carson", "Wentz", "WAS", Position.valueOf("QB"), 2022, 1, 27, 41, 313,
				4, 2, 6, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 1, 0, 0, 0,
				0, 0, 14, 58, 0, 8, 7, 72, 0);
		playerService.insertPlayerWithStatistics("JD", "McKissic", "WAS", Position.valueOf("RB"), 2022, 1, 0, 0, 0, 0,
				0, 3, 8, 0, 3, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Armani", "Rogers", "WAS", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 23, 0);
		playerService.insertPlayerWithStatistics("Logan", "Thomas", "WAS", Position.valueOf("TE"), 2022, 1, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 45, 0);
		playerService.insertPlayerWithStatistics("Jahan", "Dotson", "WAS", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 1, -10, 0, 5, 3, 40, 2);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 58, 1);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 1, 0, 0, 0, 0,
				0, 4, 17, 0, 11, 8, 55, 1);

	}

	private void insertStatisticsWeek2() throws StatisticsException {
		// NFL Statistics 2022 Week2
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 2, 36, 50,
				469, 6, 2, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 2, 21, 29,
				318, 3, 0, 9, 119, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 2, 26, 31, 333,
				1, 1, 11, 57, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 2, 26, 38, 317,
				4, 0, 1, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Flacco", "NYJ", Position.valueOf("QB"), 2022, 2, 26, 44, 307,
				4, 0, 2, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Carson", "Wentz", "WAS", Position.valueOf("QB"), 2022, 2, 30, 46, 337,
				3, 1, 2, 23, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 2, 33, 48,
				334, 3, 1, 2, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 2, 20, 34, 256,
				4, 0, 2, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyler", "Murray", "ARI", Position.valueOf("QB"), 2022, 2, 31, 49, 277,
				1, 1, 5, 28, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matthew", "Stafford", "LAR", Position.valueOf("QB"), 2022, 2, 27, 36,
				272, 3, 2, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 2, 25, 39, 252, 2,
				0, 1, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 2, 25, 30,
				235, 2, 0, 3, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 2, 19, 25, 234,
				2, 0, 5, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 2, 22, 27,
				229, 1, 1, 6, 43, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 2, 24, 35,
				235, 2, 0, 2, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 2, 17, 26,
				196, 2, 2, 6, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 2, 13, 21,
				154, 1, 0, 4, 5, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 2, 21, 35, 252, 1,
				1, 7, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 2, 27, 46, 221,
				1, 3, 2, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 2, 24, 36, 199,
				1, 0, 4, 26, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jameis", "Winston", "NO", Position.valueOf("QB"), 2022, 2, 25, 40,
				236, 1, 3, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cooper", "Rush", "DAL", Position.valueOf("QB"), 2022, 2, 19, 31, 235,
				1, 0, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 2, 14, 31,
				219, 1, 1, 2, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 2, 22, 34, 176,
				1, 0, 10, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "CAR", Position.valueOf("QB"), 2022, 2, 14, 29,
				145, 1, 0, 6, 35, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 2, 18, 34, 190, 1,
				0, 3, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Trubisky", "PIT", Position.valueOf("QB"), 2022, 2, 21, 33,
				168, 1, 1, 1, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 2, 7, 11, 70,
				0, 1, 8, 20, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 2, 24, 30, 197,
				0, 1, 2, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 2, 16, 30, 195, 0,
				3, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 2, 19, 38, 177,
				0, 0, 2, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 2, 11, 20,
				117, 0, 2, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trey", "Lance", "SF", Position.valueOf("QB"), 2022, 2, 2, 3, 30, 0, 0,
				3, 13, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Malik", "Willis", "TEN", Position.valueOf("QB"), 2022, 2, 1, 4, 6, 0,
				0, 4, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Driskel", "HOU", Position.valueOf("QB"), 2022, 2, 0, 0, 0, 0,
				0, 1, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Case", "Keenum", "BUF", Position.valueOf("QB"), 2022, 2, 0, 2, 0, 0,
				0, 3, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				17, 87, 3, 3, 3, 26, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				15, 132, 1, 3, 3, 38, 1);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 9, 43, 1, 7, 4, 55, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 15, 71, 1, 2, 2, 16, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 5, 56, 0, 5, 2, 31, 1);
		playerService.insertPlayerWithStatistics("James", "Robinson", "JAC", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 23, 64, 1, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 15, 122, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "CAR", Position.valueOf("RB"), 2022, 2, 0, 0,
				0, 0, 0, 15, 102, 0, 5, 4, 26, 0);
		playerService.insertPlayerWithStatistics("Darrel", "Williams", "ARI", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 8, 59, 1, 3, 2, 3, 0);
		playerService.insertPlayerWithStatistics("Breece", "Hall", "NYJ", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 7, 50, 0, 1, 1, 10, 1);
		playerService.insertPlayerWithStatistics("Clyde", "Edwards-Helaire", "KC", Position.valueOf("RB"), 2022, 2, 0,
				0, 0, 0, 0, 8, 74, 0, 4, 4, 44, 0);
		playerService.insertPlayerWithStatistics("Darrell", "Henderson", "LAR", Position.valueOf("RB"), 2022, 2, 0, 0,
				0, 0, 0, 10, 47, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "SF", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				18, 84, 0, 2, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 14, 28, 1, 4, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 14, 39, 0, 10, 9, 55, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 15, 49, 0, 6, 5, 40, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 21, 72, 0, 4, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 17, 80, 0, 3, 3, 6, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 13, 25, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Javonte", "Williams", "DEN", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 15, 75, 0, 4, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				19, 57, 0, 4, 3, 26, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				19, 69, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 11, 51, 0, 3, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 15, 69, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 4, 12, 0, 2, 2, 4, 1);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 24, 65, 0, 4, 2, 9, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 13, 58, 0, 2, 2, 16, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				18, 61, 0, 3, 1, 6, 0);
		playerService.insertPlayerWithStatistics("JD", "D", "WAS", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0, 3, 9,
				0, 7, 7, 54, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 9, 54, 0, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				15, 44, 0, 3, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Zander", "Horvath", "LAC", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 1, 1);
		playerService.insertPlayerWithStatistics("Mark", "Ingram", "NO", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				10, 58, 0, 2, 2, 3, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Juszczyk", "SF", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 2, 1, 1, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 12, 53, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				11, 53, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 9, 20, 0, 3, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Melvin", "Gordon", "DEN", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 10, 47, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Eno", "Benjamin", "ARI", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 8, 31, 0, 4, 3, 20, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 7, 25, 0, 4, 2, 26, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 2, 0, 0,
				0, 0, 0, 9, 47, 0, 2, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 7, 23, 0, 5, 5, 27, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 15, 53, 0, 2, 1, -4, 0);
		playerService.insertPlayerWithStatistics("Travis", "Homer", "SEA", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 2, 9, 0, 4, 4, 33, 0);
		playerService.insertPlayerWithStatistics("Chase", "Edmonds", "MIA", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 5, 33, 0, 3, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 4, 38, 0, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 2, 0,
				0, 0, 0, 0, 10, 41, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Hassan", "Haskins", "TEN", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 9, 37, 0, 1, 1, 0, 0);
		playerService.insertPlayerWithStatistics("Nyheim", "Hines", "IND", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 1, 0, 0, 5, 4, 37, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 6, 17, 0, 6, 4, 19, 0);
		playerService.insertPlayerWithStatistics("Tyrion", "Davis-Price", "SF", Position.valueOf("RB"), 2022, 2, 0, 0,
				0, 0, 0, 14, 33, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 10, 30, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Craig", "Reynolds", "DET", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 3, 16, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 4, 22, 0, 2, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Ameer", "Abdullah", "LV", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 23, 0);
		playerService.insertPlayerWithStatistics("Boston", "Scott", "PHI", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 4, 19, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 6, 19, 0, 3, 2, 2, 0);
		playerService.insertPlayerWithStatistics("Tony", "Jones", "NO", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				2, 8, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Sony", "Michel", "LAC", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 4, 13, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 2, 7, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Dwayne", "Washington", "NO", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 4, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zack", "Moss", "BUF", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				3, 17, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justice", "Hill", "BAL", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 3, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Alec", "Ingold", "MIA", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 1, 1, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Rashaad", "Penny", "SEA", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 6, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 4, 10, 0, 3, 2, 5, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 4, 15, 0, 1, 1, 0, 0);
		playerService.insertPlayerWithStatistics("Gary", "Brightwell", "NYG", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 1, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 2, 0, 0,
				0, 0, 0, 2, 8, 0, 5, 3, 6, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 1, 2, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Rex", "Burkhead", "HOU", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 9, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 2, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Michael", "Burton", "KC", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 1, 6, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Kenyan", "Drake", "BAL", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 6, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 2, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Avery", "Williams", "ATL", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Ricard", "BAL", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 1, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "Davis", "BAL", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				5, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ty", "Johnson", "NYJ", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Caleb", "Huntley", "ATL", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 1, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Adam", "Prentice", "NO", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Derek", "Watt", "PIT", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zamir", "White", "LV", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0, 0,
				1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 2, 1, 0, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DeeJay", "Dallas", "SEA", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Demetric", "Felton", "CLE", Position.valueOf("RB"), 2022, 2, 0, 0, 0,
				0, 0, 1, -4, 0, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Deon", "Jackson", "IND", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 2, -3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 2, 0, 0, 0, 0,
				0, 1, -4, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 15, 12, 148, 3);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 11, 190, 2);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 2, 68, 0, 12, 9, 116, 2);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 19, 11, 171, 2);
		playerService.insertPlayerWithStatistics("Cooper", "Kupp", "LAR", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 14, 11, 108, 2);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 1, -2, 0, 14, 8, 102, 2);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 6, 78, 2);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 8, 113, 1);
		playerService.insertPlayerWithStatistics("Nelson", "Agholor", "NE", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 6, 110, 1);
		playerService.insertPlayerWithStatistics("Rashod", "Bateman", "BAL", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 108, 1);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 9, 101, 1);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 1, 21, 0, 9, 7, 78, 1);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 5, 91, 1);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 8, 86, 1);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 83, 1);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 6, 71, 1);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 69, 1);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 1, 5, 0, 11, 7, 122, 0);
		playerService.insertPlayerWithStatistics("Michael", "Thomas", "NO", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 65, 1);
		playerService.insertPlayerWithStatistics("Jahan", "Dotson", "WAS", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 59, 1);
		playerService.insertPlayerWithStatistics("Greg", "Dortch", "ARI", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 55, 1);
		playerService.insertPlayerWithStatistics("Allen", "Robinson", "LAR", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 53, 1);
		playerService.insertPlayerWithStatistics("Justin", "Watson", "KC", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 50, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 9, 107, 0);
		playerService.insertPlayerWithStatistics("Breshad", "Perriman", "TB", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 45, 1);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 3, 43, 1);
		playerService.insertPlayerWithStatistics("Josh", "Reynolds", "DET", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 38, 1);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 4, 53, 0, 6, 5, 44, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 9, 95, 0);
		playerService.insertPlayerWithStatistics("Sammy", "Watkins", "GB", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 93, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 30, 1);
		playerService.insertPlayerWithStatistics("Ashton", "Dulin", "IND", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 1, 3, 0, 7, 5, 79, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 1, 7, 0, 8, 4, 75, 0);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 1, 6, 0, 11, 7, 75, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 2, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 21, 1);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 13, 5, 80, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 7, 80, 0);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 13, 1);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 2, 12, 1);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 2, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 1, 12, 1);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 5, 69, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 6, 68, 0);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 66, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 63, 0);
		playerService.insertPlayerWithStatistics("River", "Cracraft", "MIA", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 2, 1);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 61, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Renfrow", "LV", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 7, 59, 0);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 1, 4, 0, 9, 5, 54, 0);
		playerService.insertPlayerWithStatistics("Nico", "Collins", "HOU", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 4, 58, 0);
		playerService.insertPlayerWithStatistics("KhaDarel", "Hodge", "ATL", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 57, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 6, 57, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 55, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 4, 54, 0);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 52, 0);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 51, 0);
		playerService.insertPlayerWithStatistics("Jake", "Kumerow", "BUF", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 50, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 6, 48, 0);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 47, 0);
		playerService.insertPlayerWithStatistics("Mecole", "Hardman", "KC", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 1, -4, 0, 4, 3, 49, 0);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 42, 0);
		playerService.insertPlayerWithStatistics("Scotty", "Miller", "TB", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 1, 8, 0, 8, 3, 34, 0);
		playerService.insertPlayerWithStatistics("Equanimeous", "St Brown", "CHI", Position.valueOf("WR"), 2022, 2, 0,
				0, 0, 0, 0, 0, 0, 0, 4, 2, 39, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 39, 0);
		playerService.insertPlayerWithStatistics("Randall", "Cobb", "GB", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 37, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 37, 0);
		playerService.insertPlayerWithStatistics("David", "Sills", "NYG", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 37, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 4, 35, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 1, -6, 0, 5, 3, 41, 0);
		playerService.insertPlayerWithStatistics("Sterling", "Shepard", "NYG", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 6, 34, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Chosen", "Anderson", "CAR", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 32, 0);
		playerService.insertPlayerWithStatistics("Tyrie", "Cleveland", "DEN", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 28, 0);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "PIT", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 26, 0);
		playerService.insertPlayerWithStatistics("Jarvis", "Landry", "NO", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 25, 0);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 25, 0);
		playerService.insertPlayerWithStatistics("Dezmon", "Patmon", "IND", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Reagor", "MIN", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 1, 17, 0, 2, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 23, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 23, 0);
		playerService.insertPlayerWithStatistics("Mike", "Strachan", "IND", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 23, 0);
		playerService.insertPlayerWithStatistics("Braxton", "Berrios", "NYJ", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 2, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kendall", "Hinton", "DEN", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Montrell", "Washington", "DEN", Position.valueOf("WR"), 2022, 2, 0, 0,
				0, 0, 0, 1, 19, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Gunner", "Olszewski", "PIT", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 1, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Smith", "NYJ", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Jamison", "Crowder", "BUF", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 16, 0);
		playerService.insertPlayerWithStatistics("AJ", "Green", "ARI", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Ben", "Skowronek", "LAR", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Zach", "Pascal", "PHI", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 2,
				0, 0, 0, 0, 0, 0, 0, 0, 7, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Nick", "Westbrook-Ikhine", "TEN", Position.valueOf("WR"), 2022, 2, 0,
				0, 0, 0, 0, 0, 0, 0, 4, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Andre", "Baccellia", "ARI", Position.valueOf("WR"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 2, 0, 0, 0, 0,
				0, 1, 1, 0, 3, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Lil'Jordan", "Humphrey", "NE", Position.valueOf("WR"), 2022, 2, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 9, 104, 1);
		playerService.insertPlayerWithStatistics("Darren", "Waller", "LV", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 50, 1);
		playerService.insertPlayerWithStatistics("Mike", "Gesicki", "MIA", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 41, 1);
		playerService.insertPlayerWithStatistics("Ross", "Dwelley", "SF", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 38, 1);
		playerService.insertPlayerWithStatistics("Logan", "Thomas", "WAS", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 37, 1);
		playerService.insertPlayerWithStatistics("Irv", "Smith", "MIN", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 5, 36, 1);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 22, 1);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 82, 0);
		playerService.insertPlayerWithStatistics("Eric", "Saubert", "DEN", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 22, 1);
		playerService.insertPlayerWithStatistics("Reggie", "Gilliam", "BUF", Position.valueOf("TE"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 17, 1);
		playerService.insertPlayerWithStatistics("Daniel", "Bellinger", "NYG", Position.valueOf("TE"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 16, 1);
		playerService.insertPlayerWithStatistics("Zach", "Ertz", "ARI", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 11, 8, 75, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 6, 71, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 7, 71, 0);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 51, 0);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 46, 0);
		playerService.insertPlayerWithStatistics("Harrison", "Bryant", "CLE", Position.valueOf("TE"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 45, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Likely", "BAL", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 43, 0);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 41, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 40, 0);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 40, 0);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 32, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 30, 0);
		playerService.insertPlayerWithStatistics("Johnny", "Mundt", "MIN", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 28, 0);
		playerService.insertPlayerWithStatistics("TJ", "J", "DET", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0, 0, 0,
				0, 7, 3, 26, 0);
		playerService.insertPlayerWithStatistics("Brock", "Wright", "DET", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 25, 0);
		playerService.insertPlayerWithStatistics("Pharaoh", "Brown", "HOU", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 24, 0);
		playerService.insertPlayerWithStatistics("Tanner", "Hudson", "NYG", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 19, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Pitts", "ATL", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Griffin", "CHI", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Giovanni", "Ricci", "CAR", Position.valueOf("TE"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("John", "Bates", "WAS", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Kylen", "Granson", "IND", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Stephen", "Sullivan", "CAR", Position.valueOf("TE"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Ian", "Thomas", "CAR", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Mo", "Alie-Cox", "IND", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Cameron", "Brate", "TB", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Dan", "Arnold", "JAC", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("OJ", "Howard", "HOU", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Quintin", "Morris", "BUF", Position.valueOf("TE"), 2022, 2, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Parker", "Hesse", "ATL", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Durham", "Smythe", "MIA", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 2, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 4, 0);

	}

	private void insertStatisticsWeek3() throws StatisticsException {
		// NFL Statistics 2022 Week3
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 3, 18, 29,
				218, 4, 1, 11, 107, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 3, 42, 63, 400,
				2, 0, 8, 47, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 3, 21, 34, 330,
				3, 0, 7, 23, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 3, 28, 39,
				262, 3, 0, 3, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 3, 23, 36, 275,
				3, 0, 5, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 3, 22, 32, 321, 0,
				3, 5, 31, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 3, 26, 44, 303, 2,
				1, 2, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 3, 32, 44, 325,
				2, 1, 2, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 3, 19, 27,
				264, 1, 1, 4, 2, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jameis", "Winston", "NO", Position.valueOf("QB"), 2022, 3, 25, 41,
				353, 1, 2, 2, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 3, 13, 20,
				229, 1, 1, 7, 4, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 3, 24, 41, 260,
				2, 0, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 3, 27, 35, 255,
				2, 0, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 3, 21, 31,
				220, 2, 0, 3, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 3, 20, 35,
				262, 1, 1, 4, 26, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 3, 25, 45,
				297, 1, 1, 1, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 3, 27, 37, 222, 2,
				0, 3, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 3, 25, 41, 277,
				1, 0, 2, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 3, 20, 37, 196,
				0, 1, 9, 79, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 3, 31, 42, 271, 1,
				0, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Trubisky", "PIT", Position.valueOf("QB"), 2022, 3, 20, 32,
				207, 0, 0, 2, 7, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyler", "Murray", "ARI", Position.valueOf("QB"), 2022, 3, 37, 58, 314,
				0, 0, 2, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 3, 20, 32, 245,
				1, 2, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 3, 18, 29,
				211, 1, 1, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cooper", "Rush", "DAL", Position.valueOf("QB"), 2022, 3, 21, 31, 215,
				1, 0, 2, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Flacco", "NYJ", Position.valueOf("QB"), 2022, 3, 28, 52, 285,
				0, 2, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 3, 13, 18,
				186, 1, 0, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Carson", "Wentz", "WAS", Position.valueOf("QB"), 2022, 3, 25, 43, 211,
				0, 0, 3, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matthew", "Stafford", "LAR", Position.valueOf("QB"), 2022, 3, 18, 25,
				249, 0, 0, 3, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "CAR", Position.valueOf("QB"), 2022, 3, 12, 25,
				170, 1, 0, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 3, 20, 33,
				184, 0, 0, 6, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 3, 8, 17, 106,
				0, 0, 8, 47, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 20, 157, 2, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 20, 87, 2, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 3, 0,
				0, 0, 0, 0, 17, 141, 1, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 20, 85, 1, 6, 5, 58, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 14, 81, 1, 4, 4, 45, 0);
		playerService.insertPlayerWithStatistics("James", "Robinson", "JAC", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 17, 100, 1, 3, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0,
				23, 113, 1, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 20, 80, 1, 2, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 3, 0, 0,
				0, 0, 0, 12, 73, 1, 5, 4, 28, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 17, 96, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 9, 13, 0, 11, 9, 78, 1);
		playerService.insertPlayerWithStatistics("Chase", "Edmonds", "MIA", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 6, 21, 2, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 15, 73, 1, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0,
				12, 61, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 15, 56, 1, 3, 3, 5, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 9, 47, 0, 2, 2, 14, 1);
		playerService.insertPlayerWithStatistics("Melvin", "Gordon", "DEN", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 12, 26, 1, 6, 5, 29, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "CAR", Position.valueOf("RB"), 2022, 3, 0, 0,
				0, 0, 0, 25, 108, 0, 4, 2, 7, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 11, 41, 1, 3, 2, 5, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "SF", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0,
				12, 75, 0, 3, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 13, 105, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 3, 0, 0,
				0, 0, 0, 7, 28, 1, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 12, 38, 1, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Clyde", "Edwards-Helaire", "KC", Position.valueOf("RB"), 2022, 3, 0,
				0, 0, 0, 0, 7, 0, 1, 5, 5, 39, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0,
				13, 66, 0, 5, 5, 31, 0);
		playerService.insertPlayerWithStatistics("Breece", "Hall", "NYJ", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 8, 39, 0, 11, 6, 53, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 21, 71, 0, 5, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Mark", "Ingram", "NO", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0,
				5, 18, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 13, 45, 0, 3, 3, 30, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 15, 61, 0, 7, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 12, 35, 0, 6, 5, 35, 0);
		playerService.insertPlayerWithStatistics("Rashaad", "Penny", "SEA", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 14, 66, 0, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 12, 47, 0, 4, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Justice", "Hill", "BAL", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 6, 60, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Javonte", "Williams", "DEN", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 15, 58, 0, 5, 3, 2, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 13, 39, 0, 5, 3, 18, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 4, 5, 0, 8, 8, 48, 0);
		playerService.insertPlayerWithStatistics("Zack", "Moss", "BUF", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0,
				4, 46, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0,
				12, 36, 0, 4, 3, 11, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 11, 39, 0, 2, 1, 7, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 7, 31, 0, 4, 3, 15, 0);
		playerService.insertPlayerWithStatistics("Dontrell", "Hilliard", "TEN", Position.valueOf("RB"), 2022, 3, 0, 0,
				0, 0, 0, 2, 14, 0, 1, 1, 30, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 15, 46, 0, 1, 1, -2, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0,
				1, 3, 0, 5, 4, 37, 0);
		playerService.insertPlayerWithStatistics("JK", "K", "BAL", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0, 7,
				23, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("JD", "D", "WAS", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0, 3, 8,
				0, 9, 6, 32, 0);
		playerService.insertPlayerWithStatistics("DeeJay", "Dallas", "SEA", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 3, 21, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0,
				12, 32, 0, 3, 2, 6, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0,
				12, 24, 0, 7, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 3, 19, 0, 3, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 4, 30, 0, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Sony", "Michel", "LAC", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 5, 22, 0, 2, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 6, 25, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Rex", "Burkhead", "HOU", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 3, 9, 0, 5, 4, 21, 0);
		playerService.insertPlayerWithStatistics("Nyheim", "Hines", "IND", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 3, 7, 0, 6, 5, 23, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 3, 25, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Juszczyk", "SF", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 24, 0);
		playerService.insertPlayerWithStatistics("Eno", "Benjamin", "ARI", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 5, 16, 0, 4, 2, 7, 0);
		playerService.insertPlayerWithStatistics("Trestan", "Ebner", "CHI", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 7, 23, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Bolden", "LV", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0,
				0, 3, 17, 0, 2, 2, 4, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 7, 20, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Craig", "Reynolds", "DET", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 6, 13, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Darrell", "Henderson", "LAR", Position.valueOf("RB"), 2022, 3, 0, 0,
				0, 0, 0, 4, 17, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("CJ", "J", "MIN", Position.valueOf("RB"), 2022, 3, 0, 0, 0, 0, 0, 0, 0,
				0, 3, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Ricard", "BAL", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 3, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 3, 0, 0, 0,
				0, 0, 8, 11, 0, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 8, 169, 1);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 8, 158, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 105, 1);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 101, 1);
		playerService.insertPlayerWithStatistics("DeVante", "Parker", "NE", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 5, 156, 0);
		playerService.insertPlayerWithStatistics("Laviska", "Shenault", "CAR", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 90, 1);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 12, 87, 1);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 8, 87, 1);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 13, 9, 147, 0);
		playerService.insertPlayerWithStatistics("AJ", "J", "PHI", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0, 0, 0,
				0, 10, 5, 85, 1);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				1, 0, 0, 11, 10, 85, 1);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 1, 6, 0, 9, 7, 76, 1);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 17, 14, 140, 0);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 8, 73, 1);
		playerService.insertPlayerWithStatistics("KJ", "J", "MIN", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0, 0, 0,
				0, 8, 5, 73, 1);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 6, 72, 1);
		playerService.insertPlayerWithStatistics("Cooper", "Kupp", "LAR", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 1, 20, 1, 6, 4, 44, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 12, 5, 64, 1);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 61, 1);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 54, 1);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 1, 9, 0, 6, 4, 102, 0);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 45, 1);
		playerService.insertPlayerWithStatistics("Tre'Quan", "Smith", "NO", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 105, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 6, 102, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 3, 39, 1);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 99, 0);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 8, 97, 0);
		playerService.insertPlayerWithStatistics("Josh", "Reynolds", "DET", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 6, 96, 0);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 93, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 33, 1);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 1, -4, 0, 10, 5, 36, 1);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 3, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 5, 89, 0);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 2, -2, 0, 10, 6, 29, 1);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 4, 85, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 8, 84, 0);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 2, -2, 0, 2, 2, 25, 1);
		playerService.insertPlayerWithStatistics("Greg", "Dortch", "ARI", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 9, 80, 0);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 5, 6, 0, 8, 5, 73, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 9, 76, 0);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 1, 15, 1);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 74, 0);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 6, 73, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 3, 0, 0,
				0, 0, 0, 0, 0, 0, 9, 8, 72, 0);
		playerService.insertPlayerWithStatistics("River", "Cracraft", "MIA", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 11, 1);
		playerService.insertPlayerWithStatistics("Ben", "Skowronek", "LAR", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 66, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Callaway", "NO", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 4, 1);
		playerService.insertPlayerWithStatistics("Jalen", "Guyton", "LAC", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 64, 0);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 63, 0);
		playerService.insertPlayerWithStatistics("Equanimeous", "St Brown", "CHI", Position.valueOf("WR"), 2022, 3, 0,
				0, 0, 0, 0, 2, 43, 0, 2, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 61, 0);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 3, 13, 0, 10, 7, 48, 0);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 6, 60, 0);
		playerService.insertPlayerWithStatistics("Rashod", "Bateman", "BAL", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 59, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 58, 0);
		playerService.insertPlayerWithStatistics("Randall", "Cobb", "GB", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 57, 0);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 5, 54, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 4, 49, 0);
		playerService.insertPlayerWithStatistics("Sterling", "Shepard", "NYG", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 5, 49, 0);
		playerService.insertPlayerWithStatistics("Michael", "Thomas", "NO", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 49, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 3, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 49, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 3,
				0, 0, 0, 0, 0, 0, 0, 0, 7, 4, 48, 0);
		playerService.insertPlayerWithStatistics("DJ", "Chark", "DET", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 3, 46, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "PIT", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 1, 11, 0, 6, 3, 35, 0);
		playerService.insertPlayerWithStatistics("Breshad", "Perriman", "TB", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 1, 0, 0, 4, 3, 44, 0);
		playerService.insertPlayerWithStatistics("Nelson", "Agholor", "NE", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 41, 0);
		playerService.insertPlayerWithStatistics("Nico", "Collins", "HOU", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 41, 0);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 1, 4, 0, 5, 4, 36, 0);
		playerService.insertPlayerWithStatistics("Nick", "Westbrook-Ikhine", "TEN", Position.valueOf("WR"), 2022, 3, 0,
				0, 0, 0, 0, 0, 0, 0, 3, 3, 40, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 3, 39, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 37, 0);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 33, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Goodwin", "SEA", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 2, 31, 0);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Kendall", "Hinton", "DEN", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 27, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Powell", "LAR", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 27, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 1, -5, 0, 4, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Jaelon", "Darden", "TB", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 25, 0);
		playerService.insertPlayerWithStatistics("Darnell", "Mooney", "CHI", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Allen", "Robinson", "LAR", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Jarvis", "Landry", "NO", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Shi", "Smith", "CAR", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 1, 8, 0, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("David", "Sills", "NYG", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Zach", "Pascal", "PHI", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 1, 0, 0, 3, 3, 18, 0);
		playerService.insertPlayerWithStatistics("Jamal", "Agnew", "JAC", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Phillip", "Dorsett", "HOU", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Penny", "Hart", "SEA", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				2, 13, 0, 6, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Chosen", "Anderson", "CAR", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Jake", "Kumerow", "BUF", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Andre", "Baccellia", "ARI", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Cole", "Beasley", "TB", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 12, 0);
		playerService.insertPlayerWithStatistics("Keelan", "Cole", "LV", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Simi", "Fehoko", "DAL", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Dax", "Milne", "WAS", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Andy", "Isabella", "ARI", Position.valueOf("WR"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 8, 89, 2);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 9, 89, 1);
		playerService.insertPlayerWithStatistics("Jelani", "Woods", "IND", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 13, 2);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 58, 1);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 34, 1);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 31, 1);
		playerService.insertPlayerWithStatistics("Kyle", "Pitts", "ATL", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 5, 87, 0);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 26, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 8, 84, 0);
		playerService.insertPlayerWithStatistics("Geoff", "Swaim", "TEN", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 19, 1);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "DET", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 18, 1);
		playerService.insertPlayerWithStatistics("Josh", "Oliver", "BAL", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 8, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 61, 0);
		playerService.insertPlayerWithStatistics("Cameron", "Brate", "TB", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 52, 0);
		playerService.insertPlayerWithStatistics("Zach", "Ertz", "ARI", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 6, 45, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 44, 0);
		playerService.insertPlayerWithStatistics("Colby", "Parkinson", "SEA", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 44, 0);
		playerService.insertPlayerWithStatistics("Peyton", "Hendershot", "DAL", Position.valueOf("TE"), 2022, 3, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 3, 43, 0);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 41, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Bellinger", "NYG", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 40, 0);
		playerService.insertPlayerWithStatistics("Grant", "Calcaterra", "PHI", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 40, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 40, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 37, 0);
		playerService.insertPlayerWithStatistics("Irv", "Smith", "MIN", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 2, 32, 0);
		playerService.insertPlayerWithStatistics("Pharaoh", "Brown", "HOU", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Kendall", "Blanton", "LAR", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 28, 0);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 28, 0);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 4, 27, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Davis", "GB", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 26, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 26, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 2, 25, 0);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 25, 0);
		playerService.insertPlayerWithStatistics("Jonnu", "Smith", "NE", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 4, 25, 0);
		playerService.insertPlayerWithStatistics("Ben", "Ellefson", "MIN", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Johnny", "Mundt", "MIN", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Durham", "Smythe", "MIA", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Anthony", "Firkser", "ATL", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 22, 0);
		playerService.insertPlayerWithStatistics("Reggie", "Gilliam", "BUF", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Quintin", "Morris", "BUF", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Darren", "Waller", "LV", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 22, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Giovanni", "Ricci", "CAR", Position.valueOf("TE"), 2022, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Jake", "Ferguson", "DAL", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Ian", "Thomas", "CAR", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Albert", "Okwuegbunam", "DEN", Position.valueOf("TE"), 2022, 3, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Rudolph", "TB", Position.valueOf("TE"), 2022, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 12, 0);

	}

	private void insertStatisticsWeek4() throws StatisticsException {
		// NFL Statistics 2022 Week4
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 4, 26, 39, 378,
				4, 1, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 4, 23, 30, 320,
				2, 0, 7, 49, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 4, 39, 52, 385, 3,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 4, 17, 25,
				237, 2, 0, 4, 29, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 4, 23, 37,
				249, 3, 1, 4, 34, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 4, 19, 36, 213,
				1, 1, 11, 70, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyler", "Murray", "ARI", Position.valueOf("QB"), 2022, 4, 23, 32, 207,
				2, 1, 12, 26, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 4, 27, 37, 356, 2,
				1, 2, -4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 4, 27, 39,
				340, 2, 0, 4, -5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 4, 20, 31, 287,
				2, 0, 5, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 4, 8, 13, 71,
				0, 0, 6, 68, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 4, 21, 35, 251,
				2, 1, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 4, 26, 35, 246,
				2, 2, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 4, 16, 25, 204,
				0, 1, 16, 38, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cooper", "Rush", "DAL", Position.valueOf("QB"), 2022, 4, 15, 27, 223,
				2, 0, 2, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 4, 10, 13,
				120, 0, 3, 6, 15, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 4, 21, 35,
				234, 0, 1, 5, 16, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 4, 20, 29,
				144, 1, 2, 11, 73, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zach", "Wilson", "NYJ", Position.valueOf("QB"), 2022, 4, 18, 36, 252,
				1, 2, 2, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 4, 25, 38, 273,
				1, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 4, 11, 23,
				174, 2, 1, 2, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 4, 16, 27,
				239, 1, 0, 1, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 4, 20, 28, 236,
				1, 0, 1, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 4, 17, 21,
				137, 2, 0, 5, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Teddy", "Bridgewater", "MIA", Position.valueOf("QB"), 2022, 4, 14, 23,
				193, 1, 1, 1, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 4, 11, 22,
				174, 0, 0, 7, 52, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "CAR", Position.valueOf("QB"), 2022, 4, 22, 36,
				197, 1, 2, 2, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 4, 21, 34, 188, 0,
				0, 7, 40, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matthew", "Stafford", "LAR", Position.valueOf("QB"), 2022, 4, 32, 48,
				254, 0, 1, 2, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Carson", "Wentz", "WAS", Position.valueOf("QB"), 2022, 4, 25, 42, 170,
				1, 2, 1, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Bailey", "Zappe", "NE", Position.valueOf("QB"), 2022, 4, 10, 15, 99,
				1, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 4, 7, 19,
				139, 0, 1, 5, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 4, 8, 14,
				110, 0, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Trubisky", "PIT", Position.valueOf("QB"), 2022, 4, 7, 13,
				84, 0, 1, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyrod", "Taylor", "NYG", Position.valueOf("QB"), 2022, 4, 1, 3, 11, 0,
				1, 3, 30, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brian", "Hoyer", "NE", Position.valueOf("QB"), 2022, 4, 5, 6, 37, 0,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				28, 144, 2, 6, 5, 31, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 13, 60, 2, 7, 6, 49, 1);
		playerService.insertPlayerWithStatistics("Rashaad", "Penny", "SEA", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 17, 151, 2, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 27, 134, 2, 3, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 19, 108, 2, 3, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Clyde", "Edwards-Helaire", "KC", Position.valueOf("RB"), 2022, 4, 0,
				0, 0, 0, 0, 19, 92, 1, 2, 1, 2, 1);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 22, 114, 1, 5, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 14, 131, 1, 6, 6, 8, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				19, 118, 1, 3, 2, 9, 0);
		playerService.insertPlayerWithStatistics("JK", "Dobbins", "BAL", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				13, 41, 1, 4, 4, 22, 1);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "CAR", Position.valueOf("RB"), 2022, 4, 0, 0,
				0, 0, 0, 8, 27, 0, 9, 9, 81, 1);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 31, 146, 0, 2, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 18, 86, 1, 1, 1, -2, 0);
		playerService.insertPlayerWithStatistics("Breece", "Hall", "NYJ", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 17, 66, 1, 6, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				24, 61, 1, 4, 4, 13, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "SF", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				18, 74, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "NO", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 11, 57, 1, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Caleb", "Huntley", "ATL", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 10, 56, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 3, 6, 1, 5, 5, 50, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				16, 110, 0, 4, 3, 5, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 3, -3, 0, 7, 7, 57, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 10, 84, 0, 1, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 19, 77, 0, 1, 1, 24, 0);
		playerService.insertPlayerWithStatistics("Rex", "Burkhead", "HOU", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 39, 1);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 4, 0,
				0, 0, 0, 0, 9, 38, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 11, 49, 0, 5, 4, 47, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 4, 0, 0,
				0, 0, 0, 14, 66, 0, 5, 4, 23, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 20, 76, 0, 2, 2, 10, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				17, 73, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 19, 49, 0, 2, 2, 32, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 15, 69, 0, 3, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Chase", "Edmonds", "MIA", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 5, 6, 0, 3, 2, 14, 1);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 4, 0, 0,
				0, 0, 0, 3, 3, 0, 1, 1, 15, 1);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 15, 55, 0, 3, 3, 22, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 5, 19, 1, 2, 1, -2, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 18, 74, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 10, 49, 0, 3, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jackson", "DET", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 2, 3, 0, 2, 2, 4, 1);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 13, 49, 0, 3, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 11, 63, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justice", "Hill", "BAL", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 8, 45, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("JD", "McKissic", "WAS", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 8, 40, 0, 4, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Williams", "WAS", Position.valueOf("RB"), 2022, 4, 0, 0,
				0, 0, 0, 5, 48, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Eno", "Benjamin", "ARI", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 5, 36, 0, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Juszczyk", "SF", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 1, 9, 0, 1, 1, 35, 0);
		playerService.insertPlayerWithStatistics("Mark", "Ingram", "NO", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				10, 30, 0, 3, 3, 13, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 20, 42, 0, 3, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Craig", "Reynolds", "DET", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 2, 30, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Darrell", "Henderson", "LAR", Position.valueOf("RB"), 2022, 4, 0, 0,
				0, 0, 0, 7, 27, 0, 4, 3, 12, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 8, 32, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "Boone", "DEN", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				3, 20, 0, 3, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 9, 15, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("James", "Robinson", "JAC", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 8, 29, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trestan", "Ebner", "CHI", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 6, 20, 0, 3, 2, 8, 0);
		playerService.insertPlayerWithStatistics("Sony", "Michel", "LAC", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 6, 11, 0, 3, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Javonte", "Williams", "DEN", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 10, 28, 0, 1, 1, -1, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 8, 29, 0, 1, 1, -5, 0);
		playerService.insertPlayerWithStatistics("Zamir", "White", "LV", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				2, 24, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("JaMycal", "Hasty", "JAC", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 3, 18, 0, 1, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Avery", "Williams", "ATL", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 1, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Ricard", "BAL", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 1, 3, 0, 3, 3, 17, 0);
		playerService.insertPlayerWithStatistics("Trey", "Sermon", "PHI", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 2, 19, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Darrel", "Williams", "ARI", Position.valueOf("RB"), 2022, 4, 0, 0, 0,
				0, 0, 4, 19, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 3, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dontrell", "Hilliard", "TEN", Position.valueOf("RB"), 2022, 4, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 4, 18, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0,
				0, 4, 15, 0, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 4, 0, 0, 0, 0, 0,
				8, 13, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 8, 103, 2);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 1, 3, 1, 13, 10, 147, 0);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 7, 124, 1);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 2, 2, 0, 7, 6, 115, 1);
		playerService.insertPlayerWithStatistics("Jamal", "Agnew", "JAC", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 50, 2);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 1, -1, 0, 14, 10, 160, 0);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 97, 1);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 7, 149, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 6, 88, 1);
		playerService.insertPlayerWithStatistics("Josh", "Reynolds", "DET", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 81, 1);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 74, 1);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 4, 67, 1);
		playerService.insertPlayerWithStatistics("Cooper", "Kupp", "LAR", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 19, 14, 122, 0);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 120, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 7, 57, 1);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 116, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 53, 1);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 5, 52, 1);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 5, 47, 1);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 1, 4, 0, 13, 9, 101, 0);
		playerService.insertPlayerWithStatistics("Jahan", "Dotson", "WAS", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 43, 1);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 102, 0);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 5, 95, 0);
		playerService.insertPlayerWithStatistics("Darnell", "Mooney", "CHI", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 94, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 91, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 30, 1);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 24, 1);
		playerService.insertPlayerWithStatistics("DeVante", "Parker", "NE", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 24, 1);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 1, 15, 1, 3, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Nico", "Collins", "HOU", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 82, 0);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 81, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 21, 1);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 80, 0);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 8, 72, 0);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 4, 0,
				0, 0, 0, 0, 0, 0, 0, 9, 5, 71, 0);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 1, 3, 0, 9, 2, 60, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 4,
				0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 63, 0);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 62, 0);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 3, 61, 0);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				1, 11, 0, 11, 6, 50, 0);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 7, 59, 0);
		playerService.insertPlayerWithStatistics("KJ", "Hamler", "DEN", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 55, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 1, 2, 0, 4, 3, 53, 0);
		playerService.insertPlayerWithStatistics("Trent", "Sherfield", "MIA", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 55, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 4, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 55, 0);
		playerService.insertPlayerWithStatistics("Tom", "Kennedy", "DET", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 54, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Callaway", "NO", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 53, 0);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 51, 0);
		playerService.insertPlayerWithStatistics("Michael", "Bandy", "LAC", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 49, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 2, 47, 0);
		playerService.insertPlayerWithStatistics("Nelson", "Agholor", "NE", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 46, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 4, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 5, 46, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 43, 0);
		playerService.insertPlayerWithStatistics("Randall", "Cobb", "GB", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 42, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 1, 3, 0, 5, 3, 38, 0);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 2, 41, 0);
		playerService.insertPlayerWithStatistics("Kendall", "Hinton", "DEN", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 39, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 39, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 1, 15, 0, 3, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 38, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 37, 0);
		playerService.insertPlayerWithStatistics("David", "Bell", "CLE", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 35, 0);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Ben", "Skowronek", "LAR", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 33, 0);
		playerService.insertPlayerWithStatistics("Skyy", "Moore", "KC", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 2, 31, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 4, 0, 0,
				0, 0, 0, 0, 0, 0, 6, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Chosen", "Anderson", "CAR", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 26, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 25, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Shakir", "BUF", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 2, 11, 0, 4, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 1, 4, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Ashton", "Dulin", "IND", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Tre'Quan", "Smith", "NO", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Rashod", "Bateman", "BAL", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 17, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 2, 17, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 17, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Dee", "Eskridge", "SEA", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 1, 6, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Quintez", "Cephus", "DET", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Nailor", "MIN", Position.valueOf("WR"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Powell", "LAR", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 1, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 4, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 2, 10, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "DET", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 8, 179, 2);
		playerService.insertPlayerWithStatistics("Mo", "Alie-Cox", "IND", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 6, 85, 2);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 9, 92, 1);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 61, 1);
		playerService.insertPlayerWithStatistics("Zach", "Ertz", "ARI", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 6, 47, 1);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 39, 1);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 4, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 3, 38, 1);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 27, 1);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 7, 85, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 22, 1);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 14, 10, 73, 0);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 72, 0);
		playerService.insertPlayerWithStatistics("Jody", "Fortson", "KC", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 10, 1);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 73, 0);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 2, 1);
		playerService.insertPlayerWithStatistics("Kylen", "Granson", "IND", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 62, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 52, 0);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 40, 0);
		playerService.insertPlayerWithStatistics("Adam", "Trautman", "NO", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 37, 0);
		playerService.insertPlayerWithStatistics("Tommy", "Tremble", "CAR", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 34, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 33, 0);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Jelani", "Woods", "IND", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 33, 0);
		playerService.insertPlayerWithStatistics("Cameron", "Brate", "TB", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 32, 0);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 29, 0);
		playerService.insertPlayerWithStatistics("Colby", "Parkinson", "SEA", Position.valueOf("TE"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 28, 0);
		playerService.insertPlayerWithStatistics("OJ", "Howard", "HOU", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Dan", "Arnold", "JAC", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 26, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Pitts", "ATL", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 1, 25, 0);
		playerService.insertPlayerWithStatistics("Eric", "Saubert", "DEN", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 25, 0);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Trey", "McBride", "ARI", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Darren", "Waller", "LV", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Bellinger", "NYG", Position.valueOf("TE"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Mike", "Gesicki", "MIA", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Irv", "Smith", "MIN", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Trevon", "Wesco", "CHI", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 23, 0);
		playerService.insertPlayerWithStatistics("Parker", "Hesse", "ATL", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 22, 0);
		playerService.insertPlayerWithStatistics("John", "Bates", "WAS", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 4, 19, 0);
		playerService.insertPlayerWithStatistics("Ko", "Kieft", "TB", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0, 0,
				0, 0, 1, 1, 19, 0);
		playerService.insertPlayerWithStatistics("Logan", "Thomas", "WAS", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 19, 0);
		playerService.insertPlayerWithStatistics("Harrison", "Bryant", "CLE", Position.valueOf("TE"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 18, 0);
		playerService.insertPlayerWithStatistics("Tanner", "Hudson", "NYG", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Wilcox", "CIN", Position.valueOf("TE"), 2022, 4, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 4, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 13, 0);

	}

	private void insertStatisticsWeek5() throws StatisticsException {
		// NFL Statistics 2022 Week5
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 5, 20, 31, 424,
				4, 1, 5, 42, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 5, 29, 43,
				292, 4, 0, 4, 28, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 5, 26, 36, 239,
				0, 0, 15, 61, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Carson", "Wentz", "WAS", Position.valueOf("QB"), 2022, 5, 25, 38, 359,
				2, 1, 5, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 5, 16, 25, 268,
				3, 0, 3, 13, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 5, 32, 41, 296,
				1, 1, 4, 4, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 5, 24, 35, 217,
				1, 1, 3, 6, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 5, 35, 52, 351, 1,
				0, 3, -3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyler", "Murray", "ARI", Position.valueOf("QB"), 2022, 5, 28, 42, 250,
				1, 1, 4, 42, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 5, 18, 30,
				253, 2, 0, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 5, 19, 30, 241, 2,
				0, 1, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matthew", "Stafford", "LAR", Position.valueOf("QB"), 2022, 5, 28, 42,
				308, 1, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 5, 15, 21,
				208, 1, 0, 8, 47, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 5, 25, 39, 222,
				2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 5, 21, 34,
				230, 1, 1, 3, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 5, 19, 32,
				174, 1, 1, 12, 58, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 5, 14, 25,
				147, 1, 0, 7, 61, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 5, 34, 52,
				327, 0, 1, 1, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 5, 25, 47,
				286, 0, 2, 4, 29, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 5, 22, 34,
				228, 1, 0, 5, 13, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zach", "Wilson", "NYJ", Position.valueOf("QB"), 2022, 5, 14, 21, 210,
				0, 0, 4, 2, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 5, 21, 39,
				274, 0, 2, 4, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 5, 21, 27, 217,
				0, 0, 10, 37, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Bailey", "Zappe", "NE", Position.valueOf("QB"), 2022, 5, 17, 21, 188,
				1, 1, 5, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 5, 16, 24, 187,
				1, 1, 7, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 5, 15, 25,
				181, 1, 0, 3, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 5, 26, 41, 251, 0,
				2, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 5, 19, 35, 229,
				0, 1, 3, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "CAR", Position.valueOf("QB"), 2022, 5, 20, 36,
				215, 0, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Skylar", "Thompson", "MIA", Position.valueOf("QB"), 2022, 5, 19, 33,
				166, 0, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 5, 16, 24, 140,
				0, 0, 2, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cooper", "Rush", "DAL", Position.valueOf("QB"), 2022, 5, 10, 16, 102,
				0, 0, 4, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("PJ", "J", "CAR", Position.valueOf("QB"), 2022, 5, 5, 6, 60, 0, 0, 0,
				0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 16, 173, 1, 4, 4, 26, 1);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 14, 56, 1, 11, 10, 83, 1);
		playerService.insertPlayerWithStatistics("Breece", "Hall", "NYJ", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 18, 97, 1, 2, 2, 100, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0,
				17, 134, 2, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0,
				21, 154, 1, 5, 5, 39, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 28, 102, 2, 2, 2, 30, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 18, 94, 2, 2, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 23, 103, 0, 6, 6, 91, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "SF", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0,
				17, 120, 1, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Tevin", "Coleman", "SF", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 8, 23, 1, 3, 3, 44, 1);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 18, 113, 1, 3, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 5, 0, 0,
				0, 0, 0, 25, 161, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 26, 99, 1, 5, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 13, 70, 1, 6, 3, 36, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "CAR", Position.valueOf("RB"), 2022, 5, 0, 0,
				0, 0, 0, 14, 54, 1, 12, 7, 50, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 10, 21, 2, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 8, 88, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 8, 86, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 10, 49, 1, 2, 2, 33, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 12, 20, 1, 4, 4, 62, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 11, 47, 1, 3, 3, 10, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 10, 71, 0, 5, 3, 43, 0);
		playerService.insertPlayerWithStatistics("Eno", "Benjamin", "ARI", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 8, 25, 1, 4, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Melvin", "Gordon", "DEN", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 15, 54, 0, 3, 3, 49, 0);
		playerService.insertPlayerWithStatistics("Craig", "Reynolds", "DET", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 6, 24, 0, 3, 3, 68, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0,
				4, 31, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Deon", "Jackson", "IND", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 13, 62, 0, 4, 4, 29, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0,
				14, 78, 0, 3, 3, 10, 0);
		playerService.insertPlayerWithStatistics("Mike", "Boone", "DEN", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0,
				7, 38, 0, 3, 3, 47, 0);
		playerService.insertPlayerWithStatistics("Dontrell", "Hilliard", "TEN", Position.valueOf("RB"), 2022, 5, 0, 0,
				0, 0, 0, 1, 0, 0, 5, 4, 23, 1);
		playerService.insertPlayerWithStatistics("Avery", "Williams", "ATL", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 3, 11, 1, 2, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0,
				13, 63, 0, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 22, 78, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 8, 53, 0, 3, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Gary", "Brightwell", "NYG", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 2, 5, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 15, 58, 0, 3, 2, 6, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 9, 55, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 5, 24, 0, 5, 4, 39, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 3, 17, 0, 4, 4, 39, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 15, 56, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Phillip", "Lindsay", "IND", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 11, 40, 0, 4, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Rashaad", "Penny", "SEA", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 8, 54, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 6, 42, 0, 2, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 13, 45, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("JK", "K", "BAL", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0, 8,
				44, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 5, 14, 0, 4, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 5, 0, 0,
				0, 0, 0, 9, 19, 0, 4, 3, 21, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 3, 6, 0, 4, 3, 33, 0);
		playerService.insertPlayerWithStatistics("James", "Robinson", "JAC", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 10, 27, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("JD", "D", "WAS", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0, 0, 0,
				0, 7, 5, 37, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 11, 20, 0, 4, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Clyde", "Edwards-Helaire", "KC", Position.valueOf("RB"), 2022, 5, 0,
				0, 0, 0, 0, 9, 15, 0, 4, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Bolden", "LV", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 1, 5, 0, 3, 3, 29, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0,
				6, 34, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Caleb", "Huntley", "ATL", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 8, 34, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0,
				13, 33, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Myles", "Gaskin", "MIA", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 4, 9, 0, 5, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Darrell", "Henderson", "LAR", Position.valueOf("RB"), 2022, 5, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 4, 30, 0);
		playerService.insertPlayerWithStatistics("Rex", "Burkhead", "HOU", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 3, 15, 0, 3, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 4, 14, 0, 2, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Kenyan", "Drake", "BAL", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 4, 26, 0, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Juszczyk", "SF", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 5, 0, 0,
				0, 0, 0, 9, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 3, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mark", "Ingram", "NO", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0, 0,
				9, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jackson", "DET", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 3, 14, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 4, 11, 0, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 5, 0, 0, 0,
				0, 0, 4, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DeeJay", "Dallas", "SEA", Position.valueOf("RB"), 2022, 5, 0, 0, 0, 0,
				0, 1, 4, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 171, 2);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 124, 2);
		playerService.insertPlayerWithStatistics("Dyami", "Brown", "WAS", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 105, 2);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 104, 2);
		playerService.insertPlayerWithStatistics("Cooper", "Kupp", "LAR", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 1, 4, 0, 10, 7, 125, 1);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 111, 1);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 8, 102, 1);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 13, 12, 154, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 5, 88, 1);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 8, 78, 1);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 7, 76, 1);
		playerService.insertPlayerWithStatistics("Khalil", "Shakir", "BUF", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 75, 1);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 10, 134, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 4, 54, 1);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 104, 0);
		playerService.insertPlayerWithStatistics("Randall", "Cobb", "GB", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 7, 99, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 5, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 2, 39, 1);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 35, 1);
		playerService.insertPlayerWithStatistics("Josh", "Reynolds", "DET", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 6, 92, 0);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 2, 12, 0, 9, 2, 20, 1);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 5,
				0, 0, 0, 0, 0, 0, 0, 0, 8, 6, 90, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 10, 87, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 83, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 4, 81, 0);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 8, 81, 0);
		playerService.insertPlayerWithStatistics("Mecole", "Hardman", "KC", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 1, 7, 0, 5, 4, 73, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 6, 79, 0);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 3, 24, 0, 7, 5, 54, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 76, 0);
		playerService.insertPlayerWithStatistics("Braxton", "Berrios", "NYJ", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 1, 15, 1, 1, 1, -1, 0);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 5, 74, 0);
		playerService.insertPlayerWithStatistics("Nick", "Westbrook-Ikhine", "TEN", Position.valueOf("WR"), 2022, 5, 0,
				0, 0, 0, 0, 0, 0, 0, 3, 2, 72, 0);
		playerService.insertPlayerWithStatistics("Velus", "Jones Jr", "CHI", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 9, 1);
		playerService.insertPlayerWithStatistics("Shi", "Smith", "CAR", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 69, 0);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				1, 8, 0, 8, 4, 59, 0);
		playerService.insertPlayerWithStatistics("Nico", "Collins", "HOU", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 65, 0);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 1, 2, 0, 6, 6, 61, 0);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 62, 0);
		playerService.insertPlayerWithStatistics("Rondale", "Moore", "ARI", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 2, -7, 0, 8, 7, 68, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Reagor", "MIN", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 1, 1);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 2, 13, 0, 7, 7, 47, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 13, 5, 60, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 5, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 5, 59, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 58, 0);
		playerService.insertPlayerWithStatistics("Tutu", "Atwell", "LAR", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 54, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 3, 53, 0);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 53, 0);
		playerService.insertPlayerWithStatistics("Darnell", "Mooney", "CHI", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 2, 52, 0);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 1, 0, 0, 12, 7, 50, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "PIT", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 5, 50, 0);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 5, 0,
				0, 0, 0, 0, 0, 0, 0, 7, 4, 50, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 45, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 45, 0);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 44, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Hodgins", "BUF", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 41, 0);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 5, 41, 0);
		playerService.insertPlayerWithStatistics("Ben", "Skowronek", "LAR", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 41, 0);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 38, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 37, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Johnson", "NYG", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 35, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 35, 0);
		playerService.insertPlayerWithStatistics("Scotty", "Miller", "TB", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 35, 0);
		playerService.insertPlayerWithStatistics("KhaDarel", "Hodge", "ATL", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 33, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 5, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Mike", "Thomas", "CIN", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 33, 0);
		playerService.insertPlayerWithStatistics("Chosen", "Anderson", "CAR", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 1, 32, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 32, 0);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 3, 32, 0);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 5, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 4, 30, 0);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 3, 29, 0);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 27, 0);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Renfrow", "LV", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 25, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Equanimeous", "St Brown", "CHI", Position.valueOf("WR"), 2022, 5, 0,
				0, 0, 0, 0, 0, 0, 0, 2, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 20, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 20, 0);
		playerService.insertPlayerWithStatistics("AJ", "Green", "ARI", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Cedrick", "Wilson", "MIA", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Ashton", "Dulin", "IND", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 18, 0);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Skyy", "Moore", "KC", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Ihmir", "Smith-Marsette", "CHI", Position.valueOf("WR"), 2022, 5, 0,
				0, 0, 0, 0, 0, 0, 0, 2, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 3, 12, 0);
		playerService.insertPlayerWithStatistics("Allen", "Robinson", "LAR", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 12, 0);
		playerService.insertPlayerWithStatistics("David", "Sills", "NYG", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Miles", "Boykin", "PIT", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Smith", "NYJ", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Bryan", "Edwards", "ATL", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("KJ", "Hamler", "DEN", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Tre'Quan", "Smith", "NO", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Justin", "Watson", "KC", Position.valueOf("WR"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 25, 4);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 8, 89, 1);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 53, 1);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 8, 95, 0);
		playerService.insertPlayerWithStatistics("Adam", "Trautman", "NO", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 32, 1);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 6, 88, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Bellinger", "NYG", Position.valueOf("TE"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 6, 69, 0);
		playerService.insertPlayerWithStatistics("Durham", "Smythe", "MIA", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Marcedes", "Lewis", "GB", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 2, 1);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 54, 0);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 3, 49, 0);
		playerService.insertPlayerWithStatistics("Zach", "Ertz", "ARI", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 6, 48, 0);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 47, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 7, 46, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 4, 45, 0);
		playerService.insertPlayerWithStatistics("Zach", "Gentry", "PIT", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 43, 0);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 6, 43, 0);
		playerService.insertPlayerWithStatistics("Irv", "Smith", "MIN", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 42, 0);
		playerService.insertPlayerWithStatistics("John", "Bates", "WAS", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 39, 0);
		playerService.insertPlayerWithStatistics("Quintin", "Morris", "BUF", Position.valueOf("TE"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 39, 0);
		playerService.insertPlayerWithStatistics("Eric", "Saubert", "DEN", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 36, 0);
		playerService.insertPlayerWithStatistics("Mike", "Gesicki", "MIA", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 30, 0);
		playerService.insertPlayerWithStatistics("Giovanni", "Ricci", "CAR", Position.valueOf("TE"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 23, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Dan", "Arnold", "JAC", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Josiah", "Deguara", "GB", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Jesper", "Horsted", "LV", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Kylen", "Granson", "IND", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Chris", "Manhertz", "JAC", Position.valueOf("TE"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Connor", "Heyward", "PIT", Position.valueOf("TE"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("CJ", "J", "NYJ", Position.valueOf("TE"), 2022, 5, 0, 0, 0, 0, 0, 0, 0,
				0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Anthony", "Firkser", "ATL", Position.valueOf("TE"), 2022, 5, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 11, 0);
	}

	private void insertStatisticsWeek6() throws StatisticsException {
		// NFL Statistics 2022 Week6
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 6, 28, 37, 300,
				3, 0, 4, 25, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 6, 27, 40, 329,
				3, 0, 12, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 6, 42, 58, 389, 3,
				0, 1, -4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 6, 25, 40,
				338, 2, 2, 4, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 6, 20, 22,
				165, 1, 0, 6, 23, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Teddy", "Bridgewater", "MIA", Position.valueOf("QB"), 2022, 6, 23, 34,
				329, 2, 2, 1, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 6, 13, 14,
				129, 2, 0, 6, 50, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 6, 29, 41,
				296, 2, 2, 3, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Bailey", "Zappe", "NE", Position.valueOf("QB"), 2022, 6, 24, 34, 309,
				2, 0, 3, -4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 6, 14, 27,
				190, 1, 1, 12, 88, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 6, 17, 32,
				210, 1, 1, 7, 77, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyler", "Murray", "ARI", Position.valueOf("QB"), 2022, 6, 23, 37, 222,
				0, 1, 10, 100, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 6, 15, 25, 155,
				2, 0, 9, 27, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 6, 21, 45,
				266, 1, 2, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 6, 19, 27, 173,
				2, 0, 6, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matthew", "Stafford", "LAR", Position.valueOf("QB"), 2022, 6, 26, 33,
				253, 1, 1, 2, -3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 6, 26, 41, 246,
				1, 0, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 6, 20, 30, 175,
				2, 0, 2, -5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 6, 25, 40, 243, 1,
				0, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 6, 15, 28,
				188, 1, 0, 4, 23, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 6, 20, 31, 197,
				0, 0, 6, 48, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cooper", "Rush", "DAL", Position.valueOf("QB"), 2022, 6, 18, 38, 181,
				1, 3, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 6, 37, 57,
				238, 0, 1, 2, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 6, 17, 32, 162,
				1, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Trubisky", "PIT", Position.valueOf("QB"), 2022, 6, 9, 12,
				144, 1, 0, 6, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 6, 11, 18, 67,
				1, 0, 2, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zach", "Wilson", "NYJ", Position.valueOf("QB"), 2022, 6, 10, 18, 110,
				0, 0, 5, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Skylar", "Thompson", "MIA", Position.valueOf("QB"), 2022, 6, 7, 13,
				89, 0, 0, 1, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Carson", "Wentz", "WAS", Position.valueOf("QB"), 2022, 6, 12, 22, 99,
				0, 0, 2, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacob", "Eason", "CAR", Position.valueOf("QB"), 2022, 6, 3, 5, 59, 0,
				1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("PJ", "Walker", "CAR", Position.valueOf("QB"), 2022, 6, 10, 16, 60, 0,
				0, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 6, 0, 0,
				0, 0, 0, 19, 76, 2, 5, 4, 15, 0);
		playerService.insertPlayerWithStatistics("Kenyan", "Drake", "BAL", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 10, 119, 1, 2, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Breece", "Hall", "NYJ", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 20, 116, 1, 2, 2, 5, 0);
		playerService.insertPlayerWithStatistics("Deon", "Jackson", "IND", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 12, 42, 1, 10, 10, 79, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 21, 97, 1, 3, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 21, 63, 0, 6, 6, 38, 1);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "CAR", Position.valueOf("RB"), 2022, 6, 0, 0,
				0, 0, 0, 13, 69, 0, 8, 7, 89, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 22, 83, 1, 3, 3, 12, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 13, 81, 1, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 13, 77, 1, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 14, 36, 1, 16, 10, 47, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 18, 71, 1, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0, 0,
				8, 45, 0, 6, 4, 23, 1);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 19, 99, 0, 9, 6, 25, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 6, 0, 0,
				0, 0, 0, 17, 60, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("JaMycal", "Hasty", "JAC", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 3, 57, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Darrell", "Henderson", "LAR", Position.valueOf("RB"), 2022, 6, 0, 0,
				0, 0, 0, 12, 43, 1, 3, 2, 9, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 14, 42, 0, 3, 2, 7, 1);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 10, 86, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 17, 85, 0, 5, 4, 22, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 15, 67, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 7, 74, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0, 0,
				12, 56, 0, 2, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Eno", "Benjamin", "ARI", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 15, 37, 0, 3, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 15, 66, 0, 1, 1, -2, 0);
		playerService.insertPlayerWithStatistics("Caleb", "Huntley", "ATL", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 16, 59, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mark", "Ingram", "NO", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0, 0,
				9, 46, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("James", "Robinson", "JAC", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 12, 54, 0, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 5, 35, 0, 4, 3, 18, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0, 0,
				10, 41, 0, 6, 4, 11, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 11, 44, 0, 3, 2, 8, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 15, 51, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 14, 49, 0, 2, 1, -1, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 6, 41, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0, 0,
				9, 19, 0, 4, 3, 25, 0);
		playerService.insertPlayerWithStatistics("Sony", "Michel", "LAC", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 8, 28, 0, 3, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Clyde", "Edwards-Helaire", "KC", Position.valueOf("RB"), 2022, 6, 0,
				0, 0, 0, 0, 9, 33, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Juszczyk", "SF", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 33, 0);
		playerService.insertPlayerWithStatistics("Chase", "Edmonds", "MIA", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 2, 3, 0, 2, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 2, 1, 0, 3, 3, 29, 0);
		playerService.insertPlayerWithStatistics("Malcolm", "Brown", "LAR", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 7, 15, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 5, 25, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "SF", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0, 0,
				7, 25, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 4, 12, 0, 4, 3, 11, 0);
		playerService.insertPlayerWithStatistics("JD", "McKissic", "WAS", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 2, 20, 0, 3, 0, 0, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 5, 19, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 2, 9, 0, 2, 2, 9, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 2, 5, 0, 2, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Boston", "Scott", "PHI", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 6, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("JK", "Dobbins", "BAL", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0, 0,
				7, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ronnie", "Rivers", "LAR", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 1, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 4, 12, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Alec", "Ingold", "MIA", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 1, 2, 0, 2, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Phillip", "Lindsay", "IND", Position.valueOf("RB"), 2022, 6, 0, 0, 0,
				0, 0, 3, 7, 0, 3, 3, 5, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 3, -6, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Keith", "Smith", "ATL", Position.valueOf("RB"), 2022, 6, 0, 0, 0, 0,
				0, 1, 2, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 7, 132, 2);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 10, 148, 1);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 8, 83, 2);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 15, 12, 177, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 6, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 5, 113, 1);
		playerService.insertPlayerWithStatistics("Tyquan", "Thornton", "NE", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 3, 16, 1, 5, 4, 37, 1);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "PIT", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 1, 8, 0, 7, 7, 96, 1);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 84, 1);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 4, 76, 1);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 74, 1);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 6, 0, 0,
				0, 0, 0, 0, 0, 0, 16, 13, 134, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 6, 129, 0);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 5, 67, 1);
		playerService.insertPlayerWithStatistics("Allen", "Robinson", "LAR", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 63, 1);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 7, 57, 1);
		playerService.insertPlayerWithStatistics("Ben", "Skowronek", "LAR", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 1, 17, 1, 5, 5, 40, 0);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 49, 1);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 107, 0);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 4, 44, 1);
		playerService.insertPlayerWithStatistics("Rashid", "Shaheed", "NO", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 1, 44, 1, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 44, 1);
		playerService.insertPlayerWithStatistics("Tre'Quan", "Smith", "NO", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 43, 1);
		playerService.insertPlayerWithStatistics("Mecole", "Hardman", "KC", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 42, 1);
		playerService.insertPlayerWithStatistics("Cooper", "Kupp", "LAR", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 2, 17, 0, 8, 7, 80, 0);
		playerService.insertPlayerWithStatistics("Wan'Dale", "Robinson", "NYG", Position.valueOf("WR"), 2022, 6, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 3, 37, 1);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 36, 1);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 6, 95, 0);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 2, 11, 0, 10, 7, 79, 0);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 1, 4, 0, 5, 4, 24, 1);
		playerService.insertPlayerWithStatistics("Braxton", "Berrios", "NYJ", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 1, 20, 1, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 2, 9, 0, 10, 5, 68, 0);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 6, 0,
				0, 0, 0, 0, 1, 2, 0, 5, 4, 74, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 5, 68, 0);
		playerService.insertPlayerWithStatistics("Darnell", "Mooney", "CHI", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 7, 68, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 6, 66, 0);
		playerService.insertPlayerWithStatistics("DeVante", "Parker", "NE", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 64, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 60, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 6, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 4, 58, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 9, 57, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 54, 0);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 52, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 2, 11, 0, 4, 3, 41, 0);
		playerService.insertPlayerWithStatistics("Rondale", "Moore", "ARI", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 6, 49, 0);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 47, 0);
		playerService.insertPlayerWithStatistics("KJ", "Hamler", "DEN", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 44, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 4, 42, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 5, 42, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 40, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Powell", "LAR", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 3, 13, 0, 5, 4, 27, 0);
		playerService.insertPlayerWithStatistics("Dee", "Eskridge", "SEA", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 39, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Callaway", "NO", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 3, 36, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 2, 8, 0, 7, 5, 28, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 2, 34, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 1, 1, 0, 6, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 6, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Goodwin", "SEA", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 26, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Johnson", "NYG", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 25, 0);
		playerService.insertPlayerWithStatistics("Jamal", "Agnew", "JAC", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 1, 19, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Skyy", "Moore", "KC", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 1, 24, 0);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 4, 21, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Tim", "Jones", "JAC", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Velus", "Jones Jr", "CHI", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 1, 8, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 3, 18, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 17, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Michael", "Woods", "CLE", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Keith", "Kirkwood", "NO", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Amari", "Rodgers", "GB", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Shakir", "BUF", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("David", "Bell", "CLE", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Mike", "Gesicki", "MIA", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 69, 2);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 106, 1);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 61, 1);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 8, 108, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dulcich", "DEN", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 44, 1);
		playerService.insertPlayerWithStatistics("Jake", "Ferguson", "DAL", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 40, 1);
		playerService.insertPlayerWithStatistics("Daniel", "Bellinger", "NYG", Position.valueOf("TE"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 5, 38, 1);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 37, 1);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 10, 90, 0);
		playerService.insertPlayerWithStatistics("Jelani", "Woods", "IND", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 27, 1);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 8, 83, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Pitts", "ATL", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 19, 1);
		playerService.insertPlayerWithStatistics("Zach", "Ertz", "ARI", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 7, 70, 0);
		playerService.insertPlayerWithStatistics("Irv", "Smith", "MIN", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 4, 7, 1);
		playerService.insertPlayerWithStatistics("MyCole", "Pruitt", "ATL", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 2, 1);
		playerService.insertPlayerWithStatistics("Jonnu", "Smith", "NE", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 61, 0);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 58, 0);
		playerService.insertPlayerWithStatistics("Donald", "Parham", "LAC", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 53, 0);
		playerService.insertPlayerWithStatistics("Connor", "Heyward", "PIT", Position.valueOf("TE"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 49, 0);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 6, 45, 0);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 41, 0);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 40, 0);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kylen", "Granson", "IND", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 38, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Likely", "BAL", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 30, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 5, 29, 0);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Cole", "Turner", "WAS", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Peyton", "Hendershot", "DAL", Position.valueOf("TE"), 2022, 6, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Ian", "Thomas", "CAR", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Pharaoh", "Brown", "CLE", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 21, 0);
		playerService.insertPlayerWithStatistics("Josh", "Oliver", "BAL", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Jack", "Stoll", "PHI", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Harrison", "Bryant", "CLE", Position.valueOf("TE"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 18, 0);
		playerService.insertPlayerWithStatistics("Reggie", "Gilliam", "BUF", Position.valueOf("TE"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 18, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 16, 0);
		playerService.insertPlayerWithStatistics("CJ", "Uzomah", "NYJ", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Eric", "Tomlinson", "DEN", Position.valueOf("TE"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Cameron", "Brate", "TB", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 13, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Luke", "Farrell", "JAC", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Colby", "Parkinson", "SEA", Position.valueOf("TE"), 2022, 6, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Sean", "McKeon", "DAL", Position.valueOf("TE"), 2022, 6, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 10, 0);
	}

	private void insertStatisticsWeek7() throws StatisticsException {
		// NFL Statistics 2022 Week7
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 7, 34, 42, 481,
				3, 0, 3, 20, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 7, 30, 47, 361,
				4, 3, 4, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 7, 25, 34,
				423, 3, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 7, 19, 30, 202,
				1, 0, 11, 107, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 7, 13, 21,
				179, 1, 1, 14, 82, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 7, 33, 51,
				293, 2, 1, 3, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 7, 25, 37,
				303, 2, 1, 2, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 7, 28, 41, 302,
				2, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 7, 22, 43,
				310, 0, 0, 4, 3, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 7, 20, 27, 210,
				2, 1, 4, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 7, 32, 44,
				257, 1, 3, 3, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 7, 21, 35,
				261, 1, 0, 4, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Taylor", "Heinicke", "WAS", Position.valueOf("QB"), 2022, 7, 20, 33,
				201, 2, 1, 2, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 7, 23, 35, 194,
				2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyler", "Murray", "ARI", Position.valueOf("QB"), 2022, 7, 20, 29, 204,
				1, 0, 7, 30, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("PJ", "Walker", "CAR", Position.valueOf("QB"), 2022, 7, 16, 22, 177, 2,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 7, 33, 44, 243, 1,
				2, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 7, 21, 27, 241, 1,
				0, 3, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 7, 22, 27,
				258, 0, 0, 3, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 7, 32, 49, 290, 0,
				0, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 7, 19, 25, 207,
				1, 0, 3, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 7, 8, 13,
				124, 1, 0, 6, 31, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Bailey", "Zappe", "NE", Position.valueOf("QB"), 2022, 7, 14, 22, 185,
				1, 2, 2, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brett", "Rypien", "DEN", Position.valueOf("QB"), 2022, 7, 24, 46, 225,
				0, 1, 3, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 7, 9, 16, 120,
				0, 0, 10, 59, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 7, 21, 26, 228,
				0, 2, 1, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zach", "Wilson", "NYJ", Position.valueOf("QB"), 2022, 7, 16, 26, 121,
				0, 0, 4, 24, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 7, 13, 20,
				132, 0, 0, 4, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brock", "Purdy", "SF", Position.valueOf("QB"), 2022, 7, 4, 9, 66, 0,
				1, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 7, 3, 6, 13, 0, 1,
				3, 24, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0, 0,
				20, 143, 3, 4, 3, 12, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 23, 167, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 9, 31, 1, 12, 12, 96, 1);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0, 0,
				8, 23, 0, 10, 9, 53, 2);
		playerService.insertPlayerWithStatistics("Gus", "Edwards", "BAL", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 16, 66, 2, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 14, 114, 1, 5, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 15, 57, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Eno", "Benjamin", "ARI", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 12, 92, 1, 5, 4, 21, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 16, 79, 0, 5, 4, 30, 1);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0, 0,
				16, 91, 1, 3, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 7, 0, 0,
				0, 0, 0, 11, 39, 1, 8, 8, 59, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0, 0,
				17, 58, 1, 3, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 12, 62, 0, 2, 1, 25, 1);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 15, 118, 0, 2, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 30, 128, 0, 3, 3, 10, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 10, 59, 0, 4, 3, 18, 1);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 24, 110, 0, 4, 4, 25, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 9, 63, 1, 3, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Breece", "Hall", "NYJ", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 4, 72, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 15, 62, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 20, 92, 0, 4, 4, 25, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 16, 50, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 12, 83, 0, 2, 2, 26, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 11, 49, 0, 9, 7, 56, 0);
		playerService.insertPlayerWithStatistics("Keaontay", "Ingram", "ARI", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 9, 14, 1, 2, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Clyde", "Edwards-Helaire", "KC", Position.valueOf("RB"), 2022, 7, 0,
				0, 0, 0, 0, 6, 32, 1, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 7, 0, 0,
				0, 0, 0, 20, 73, 0, 2, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 10, 58, 0, 8, 7, 27, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 8, 24, 1, 3, 2, -1, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 15, 79, 0, 1, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 17, 65, 0, 4, 3, 15, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 13, 29, 0, 2, 2, 45, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 5, 4, 1, 2, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 7, 0, 0,
				0, 0, 0, 8, 38, 0, 2, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Dare", "Ogunbowale", "HOU", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 1, 8, 0, 7, 5, 54, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "SF", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0, 0,
				7, 54, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Melvin", "Gordon", "DEN", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 11, 33, 0, 4, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 2, 12, 0, 3, 2, 36, 0);
		playerService.insertPlayerWithStatistics("Nyheim", "Hines", "IND", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 4, 2, 0, 5, 5, 41, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 8, 43, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DeeJay", "Dallas", "SEA", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 6, 35, 0, 2, 2, 6, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Juszczyk", "SF", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 34, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 4, 19, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 6, 24, 0, 2, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Craig", "Reynolds", "DET", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 4, 12, 0, 3, 3, 18, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 8, 19, 0, 3, 2, 7, 0);
		playerService.insertPlayerWithStatistics("Justice", "Hill", "BAL", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 5, 26, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 2, 7, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Mike", "Boone", "DEN", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0, 0,
				4, 23, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Caleb", "Huntley", "ATL", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 6, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mark", "Ingram", "NO", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0, 0,
				4, 6, 0, 3, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Ricard", "BAL", Position.valueOf("RB"), 2022, 7, 0, 0, 0,
				0, 0, 1, 0, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Rex", "Burkhead", "HOU", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 2, 8, 0, 6, 5, 11, 0);
		playerService.insertPlayerWithStatistics("Chase", "Edmonds", "MIA", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 7, 17, 0, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0, 0,
				4, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sony", "Michel", "LAC", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 2, 5, 0, 3, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 7, 0, 0, 0, 0,
				0, 3, 8, 0, 2, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 8, 130, 2);
		playerService.insertPlayerWithStatistics("Mecole", "Hardman", "KC", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 2, 28, 2, 4, 4, 32, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 8, 155, 1);
		playerService.insertPlayerWithStatistics("Marquise", "Goodwin", "SEA", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 67, 2);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 7, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 7, 124, 1);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 7, 86, 1);
		playerService.insertPlayerWithStatistics("Damiere", "Byrd", "ATL", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 75, 1);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 73, 1);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 10, 70, 1);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				1, -3, 0, 10, 7, 69, 1);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 65, 1);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 6, 61, 1);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 58, 1);
		playerService.insertPlayerWithStatistics("Rashid", "Shaheed", "NO", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 53, 1);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 7,
				0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 111, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 14, 7, 106, 0);
		playerService.insertPlayerWithStatistics("Phillip", "Dorsett", "HOU", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 45, 1);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 44, 1);
		playerService.insertPlayerWithStatistics("DeAndre", "Hopkins", "ARI", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 14, 10, 103, 0);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 1, 5, 0, 10, 7, 96, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 15, 9, 96, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 96, 0);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 8, 95, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 2, 20, 0, 6, 5, 75, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 34, 1);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 93, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 88, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 82, 0);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 20, 1);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 5, 26, 0, 8, 5, 53, 0);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 74, 0);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 7, 72, 0);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 7, 0,
				0, 0, 0, 0, 0, 0, 0, 6, 6, 71, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				1, 14, 0, 10, 4, 54, 0);
		playerService.insertPlayerWithStatistics("DeVante", "Parker", "NE", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 68, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dortch", "ARI", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 1, 1, 0, 1, 1, 5, 1);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 1, -4, 0, 6, 4, 70, 0);
		playerService.insertPlayerWithStatistics("Justin", "Watson", "KC", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 4, 1);
		playerService.insertPlayerWithStatistics("Kevin", "White", "NO", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 64, 0);
		playerService.insertPlayerWithStatistics("Tre'Quan", "Smith", "NO", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 59, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 7, 0, 0,
				0, 0, 0, 0, 0, 0, 9, 6, 58, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 57, 0);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 55, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Renfrow", "LV", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 55, 0);
		playerService.insertPlayerWithStatistics("Darnell", "Mooney", "CHI", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 53, 0);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 5, 50, 0);
		playerService.insertPlayerWithStatistics("Wan'Dale", "Robinson", "NYG", Position.valueOf("WR"), 2022, 7, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 6, 50, 0);
		playerService.insertPlayerWithStatistics("Equanimeous", "St Brown", "CHI", Position.valueOf("WR"), 2022, 7, 0,
				0, 0, 0, 0, 0, 0, 0, 7, 4, 48, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 46, 0);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 1, 2, 0, 13, 7, 43, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 1, 3, 0, 10, 5, 42, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 45, 0);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 1, 2, 0, 7, 5, 42, 0);
		playerService.insertPlayerWithStatistics("Trent", "Sherfield", "MIA", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 44, 0);
		playerService.insertPlayerWithStatistics("Rashod", "Bateman", "BAL", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 42, 0);
		playerService.insertPlayerWithStatistics("Braxton", "Berrios", "NYJ", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 2, 27, 0, 4, 3, 15, 0);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 42, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "PIT", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 41, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 39, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 3, 37, 0);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 37, 0);
		playerService.insertPlayerWithStatistics("Sammy", "Watkins", "GB", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 36, 0);
		playerService.insertPlayerWithStatistics("Nico", "Collins", "HOU", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Cody", "Hollister", "TEN", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 32, 0);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 7, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 2, 31, 0);
		playerService.insertPlayerWithStatistics("Rondale", "Moore", "ARI", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 31, 0);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 1, 29, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 7, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 26, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 24, 0);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Callaway", "NO", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 2, 20, 0);
		playerService.insertPlayerWithStatistics("DJ", "Turner", "LV", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				3, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("David", "Sills", "NYG", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 19, 0);
		playerService.insertPlayerWithStatistics("Tyquan", "Thornton", "NE", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 1, 19, 0);
		playerService.insertPlayerWithStatistics("KJ", "Hamler", "DEN", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				1, 14, 0, 4, 1, 4, 0);
		playerService.insertPlayerWithStatistics("N'Keal", "Harry", "CHI", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Kendall", "Hinton", "DEN", Position.valueOf("WR"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Tom", "Kennedy", "DET", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Amari", "Rodgers", "GB", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Cam", "Sims", "WAS", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Keenan", "Allen", "LAC", Position.valueOf("WR"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 11, 0);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 98, 1);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 32, 2);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 98, 0);
		playerService.insertPlayerWithStatistics("Tommy", "Tremble", "CAR", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 29, 1);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 8, 75, 0);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 3, 1);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 7, 71, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 68, 0);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 67, 0);
		playerService.insertPlayerWithStatistics("Peyton", "Hendershot", "DAL", Position.valueOf("TE"), 2022, 7, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 5, 1);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 64, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 5, 63, 0);
		playerService.insertPlayerWithStatistics("Brock", "Wright", "DET", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 57, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 56, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dulcich", "DEN", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 51, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 5, 49, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "DET", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 48, 0);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 48, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 45, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 32, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 32, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Colby", "Parkinson", "SEA", Position.valueOf("TE"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 28, 0);
		playerService.insertPlayerWithStatistics("Armani", "Rogers", "WAS", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Mike", "Gesicki", "MIA", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Dan", "Arnold", "JAC", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 24, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 22, 0);
		playerService.insertPlayerWithStatistics("Zach", "Ertz", "ARI", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Chris", "Myarick", "NYG", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Eric", "Tomlinson", "DEN", Position.valueOf("TE"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Ko", "Kieft", "TB", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0, 0, 0,
				0, 0, 1, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Likely", "BAL", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Harrison", "Bryant", "CLE", Position.valueOf("TE"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Wilcox", "CIN", Position.valueOf("TE"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Bellinger", "NYG", Position.valueOf("TE"), 2022, 7, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 7, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 10, 0);
	}

	private void insertStatisticsWeek8() throws StatisticsException {
		// NFL Statistics 2022 Week8
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 8, 29, 36,
				382, 3, 0, 5, 19, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyler", "Murray", "ARI", Position.valueOf("QB"), 2022, 8, 31, 44, 326,
				3, 2, 6, 36, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 8, 19, 28, 285,
				4, 0, 2, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 8, 21, 27, 250,
				2, 1, 5, 34, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 8, 20, 28,
				253, 3, 2, 6, 43, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 8, 24, 36, 232,
				2, 0, 4, 22, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 8, 17, 23,
				151, 2, 0, 8, 60, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Taylor", "Heinicke", "WAS", Position.valueOf("QB"), 2022, 8, 23, 31,
				279, 1, 1, 6, 29, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zach", "Wilson", "NYJ", Position.valueOf("QB"), 2022, 8, 20, 41, 355,
				2, 3, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 8, 17, 22,
				278, 1, 0, 6, 12, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 8, 27, 38,
				238, 2, 0, 9, 43, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 8, 13, 25, 218,
				2, 2, 6, 49, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("P", "J", "CAR", Position.valueOf("QB"), 2022, 8, 19, 36, 317, 1, 1, 1,
				20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 8, 23, 34, 212,
				2, 0, 5, 26, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 8, 26, 44, 325, 1,
				0, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 8, 27, 37, 321,
				1, 0, 1, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 8, 21, 25,
				235, 2, 0, 1, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 8, 25, 35, 232,
				2, 1, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 8, 22, 30, 229,
				2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 8, 19, 30, 203,
				2, 1, 1, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matthew", "Stafford", "LAR", Position.valueOf("QB"), 2022, 8, 22, 33,
				187, 1, 0, 2, -1, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 8, 18, 30,
				252, 1, 1, 4, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 8, 24, 35, 194, 1,
				1, 7, 19, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 8, 25, 38,
				191, 0, 1, 7, 37, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 8, 17, 29, 152,
				1, 1, 3, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 8, 18, 31,
				133, 1, 2, 3, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Ehlinger", "IND", Position.valueOf("QB"), 2022, 8, 17, 23, 201,
				0, 0, 6, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 8, 17, 31, 176,
				0, 0, 6, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 8, 15, 26, 101, 0,
				1, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Malik", "Willis", "TEN", Position.valueOf("QB"), 2022, 8, 6, 10, 55,
				0, 1, 5, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jarrett", "Stidham", "LV", Position.valueOf("QB"), 2022, 8, 8, 13, 72,
				0, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Gardner", "Minshew", "PHI", Position.valueOf("QB"), 2022, 8, 1, 2, 23,
				0, 0, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 32, 219, 2, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 18, 62, 1, 10, 9, 96, 2);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 14, 131, 3, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 26, 118, 3, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 8, 0, 0,
				0, 0, 0, 18, 94, 1, 9, 8, 55, 1);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0, 0,
				23, 101, 2, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 24, 156, 1, 3, 3, 6, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 20, 111, 1, 6, 5, 30, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 10, 53, 2, 3, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 16, 99, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0, 0,
				20, 143, 0, 5, 4, 14, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 14, 39, 0, 3, 3, 46, 1);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 8, 0, 0,
				0, 0, 0, 16, 71, 0, 7, 7, 72, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 9, 78, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 7, 19, 0, 7, 7, 58, 1);
		playerService.insertPlayerWithStatistics("Kenyan", "Drake", "BAL", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 7, 62, 0, 4, 4, 5, 1);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 20, 53, 1, 5, 3, 9, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 14, 46, 1, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 9, 24, 1, 3, 3, 34, 0);
		playerService.insertPlayerWithStatistics("Melvin", "Gordon", "DEN", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 9, 29, 1, 4, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 18, 51, 1, 2, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 15, 35, 0, 5, 3, 16, 1);
		playerService.insertPlayerWithStatistics("Nyheim", "Hines", "IND", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 5, 20, 1, 2, 2, 29, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 8, 0, 0,
				0, 0, 0, 5, 40, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dontrell", "Hilliard", "TEN", Position.valueOf("RB"), 2022, 8, 0, 0,
				0, 0, 0, 8, 83, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 5, 6, 0, 5, 5, 27, 1);
		playerService.insertPlayerWithStatistics("Caleb", "Huntley", "ATL", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 16, 91, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 14, 67, 0, 2, 1, 16, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0, 0,
				5, 35, 0, 1, 1, 41, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 16, 76, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 15, 53, 0, 3, 3, 22, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 6, 50, 0, 3, 3, 25, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 11, 42, 0, 4, 4, 30, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 14, 64, 0, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Alec", "Ingold", "MIA", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 1, 1, 1, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Derek", "Watt", "PIT", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 6, 1);
		playerService.insertPlayerWithStatistics("Gus", "Edwards", "BAL", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 11, 65, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0, 0,
				10, 54, 0, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 7, 26, 0, 7, 4, 35, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0, 0,
				8, 27, 0, 9, 7, 32, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 8, 32, 0, 6, 6, 26, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0, 0,
				10, 43, 0, 4, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 11, 37, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Eno", "Benjamin", "ARI", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 9, 22, 0, 7, 4, 23, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 4, 19, 0, 3, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Malik", "Davis", "DAL", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 8, 23, 0, 2, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Ronnie", "Rivers", "LAR", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 8, 21, 0, 4, 4, 15, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "SF", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0, 0,
				4, 14, 0, 2, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Travis", "Homer", "SEA", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 2, 10, 0, 1, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Darrell", "Henderson", "LAR", Position.valueOf("RB"), 2022, 8, 0, 0,
				0, 0, 0, 4, 16, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Ameer", "Abdullah", "LV", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 28, 0);
		playerService.insertPlayerWithStatistics("Justice", "Hill", "BAL", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 4, 28, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Spencer", "Brown", "CAR", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 6, 27, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chris", "Evans", "CIN", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 26, 0);
		playerService.insertPlayerWithStatistics("Boston", "Scott", "PHI", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 7, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("JD", "McKissic", "WAS", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 2, 6, 0, 5, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 8, 0, 0,
				0, 0, 0, 8, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("D'Ernest", "Johnson", "CLE", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 4, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 1, 7, 0, 3, 3, 10, 0);
		playerService.insertPlayerWithStatistics("James", "Robinson", "NYJ", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 5, 17, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 2, 5, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Chase", "Edmonds", "MIA", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 4, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Darrel", "Williams", "ARI", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 5, 8, 0, 3, 2, 6, 0);
		playerService.insertPlayerWithStatistics("Dwayne", "Washington", "NO", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 4, 13, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 8, 0, 0, 0,
				0, 0, 1, 3, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Malcolm", "Brown", "LAR", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 5, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("JaMycal", "Hasty", "JAC", Position.valueOf("RB"), 2022, 8, 0, 0, 0, 0,
				0, 4, 13, 0, 4, 3, -3, 0);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 6, 156, 3);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 8, 106, 2);
		playerService.insertPlayerWithStatistics("DeAndre", "Hopkins", "ARI", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 13, 12, 159, 1);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				1, 3, 0, 11, 6, 152, 1);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 1, 7, 0, 14, 12, 188, 0);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 131, 1);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 108, 1);
		playerService.insertPlayerWithStatistics("Rondale", "Moore", "ARI", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 2, 12, 0, 8, 7, 92, 1);
		playerService.insertPlayerWithStatistics("Cooper", "Kupp", "LAR", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 2, 10, 0, 12, 8, 79, 1);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 6, 81, 1);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 1, 1, 0, 7, 5, 77, 1);
		playerService.insertPlayerWithStatistics("Damiere", "Byrd", "ATL", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 67, 1);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 2, 33, 1, 4, 4, 31, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 11, 6, 123, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 63, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 63, 1);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 4, 62, 1);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 9, 60, 1);
		playerService.insertPlayerWithStatistics("Zach", "Pascal", "PHI", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 57, 1);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 6, 55, 1);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 6, 115, 0);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 49, 1);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 1, -7, 0, 8, 6, 113, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 3, 38, 1);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 98, 0);
		playerService.insertPlayerWithStatistics("Samori", "Toure", "GB", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 37, 1);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 8, 0, 0,
				0, 0, 0, 0, 0, 0, 9, 4, 87, 0);
		playerService.insertPlayerWithStatistics("N'Keal", "Harry", "CHI", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 24, 1);
		playerService.insertPlayerWithStatistics("Julio", "Jones", "TB", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				1, 0, 0, 4, 2, 21, 1);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 8, 0,
				0, 0, 0, 0, 0, 0, 0, 4, 4, 81, 0);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 4, 29, 0, 4, 3, 50, 0);
		playerService.insertPlayerWithStatistics("Denzel", "Mims", "NYJ", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 76, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 76, 0);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 6, 75, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 73, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 1, 28, 0, 2, 2, 43, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 2, 2, 1, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Darnell", "Mooney", "CHI", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 5, 70, 0);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 7, 69, 0);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 2, 8, 1);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 67, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 66, 0);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 65, 0);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 64, 0);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 8, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 6, 64, 0);
		playerService.insertPlayerWithStatistics("KJ", "Hamler", "DEN", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				1, 9, 0, 3, 2, 52, 0);
		playerService.insertPlayerWithStatistics("Allen", "Robinson", "LAR", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 5, 54, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 8, 0, 0,
				0, 0, 0, 0, 0, 0, 9, 7, 53, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 5, 52, 0);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 49, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "PIT", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 45, 0);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 3, 40, 0);
		playerService.insertPlayerWithStatistics("Velus", "Jones Jr", "CHI", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 2, 33, 0, 3, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Rashid", "Shaheed", "NO", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 38, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 2, 35, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 5, 35, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				1, 7, 0, 3, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Goodwin", "SEA", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 33, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 31, 0);
		playerService.insertPlayerWithStatistics("Keelan", "Cole", "LV", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 2, 30, 0);
		playerService.insertPlayerWithStatistics("David", "Bell", "CLE", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Trenton", "Irwin", "CIN", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Laviska", "Shenault", "CAR", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 26, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 26, 0);
		playerService.insertPlayerWithStatistics("Trent", "Sherfield", "MIA", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 25, 0);
		playerService.insertPlayerWithStatistics("James", "Proche", "BAL", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 24, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 23, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Smith", "NYJ", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 23, 0);
		playerService.insertPlayerWithStatistics("Amari", "Rodgers", "GB", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 22, 0);
		playerService.insertPlayerWithStatistics("Cam", "Sims", "WAS", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Steven", "Sims", "PIT", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 2, 21, 0, 3, 2, -1, 0);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 18, 0);
		playerService.insertPlayerWithStatistics("Braylon", "Sanders", "MIA", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Wan'Dale", "Robinson", "NYG", Position.valueOf("WR"), 2022, 8, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Josh", "Reynolds", "DET", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Scotty", "Miller", "TB", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Tyquan", "Thornton", "NE", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dortch", "ARI", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Breshad", "Perriman", "TB", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("KaVontae", "Turpin", "DAL", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 1, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Callaway", "NO", Position.valueOf("WR"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Ben", "Skowronek", "LAR", Position.valueOf("WR"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 6, 79, 2);
		playerService.insertPlayerWithStatistics("Kyle", "Pitts", "ATL", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 5, 80, 1);
		playerService.insertPlayerWithStatistics("Isaiah", "Likely", "BAL", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 77, 1);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 55, 1);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 39, 1);
		playerService.insertPlayerWithStatistics("Mike", "Gesicki", "MIA", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 38, 1);
		playerService.insertPlayerWithStatistics("Zach", "Ertz", "ARI", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 34, 1);
		playerService.insertPlayerWithStatistics("Greg", "Dulcich", "DEN", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 87, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "DET", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 80, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 6, 74, 0);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 11, 1);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 10, 1);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 6, 64, 0);
		playerService.insertPlayerWithStatistics("Jake", "Ferguson", "DAL", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 1, 1);
		playerService.insertPlayerWithStatistics("Johnny", "Mundt", "MIN", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 1, 1);
		playerService.insertPlayerWithStatistics("Tanner", "Hudson", "NYG", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 58, 0);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 57, 0);
		playerService.insertPlayerWithStatistics("Ross", "Dwelley", "SF", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 56, 0);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 42, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 35, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Stephen", "Sullivan", "CAR", Position.valueOf("TE"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 33, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 31, 0);
		playerService.insertPlayerWithStatistics("Irv", "Smith", "MIN", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 4, 28, 0);
		playerService.insertPlayerWithStatistics("CJ", "Uzomah", "NYJ", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 27, 0);
		playerService.insertPlayerWithStatistics("OJ", "Howard", "HOU", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 22, 0);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Brevin", "Jordan", "HOU", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Tommy", "Tremble", "CAR", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Peyton", "Hendershot", "DAL", Position.valueOf("TE"), 2022, 8, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 14, 0);
		playerService.insertPlayerWithStatistics("James", "Mitchell", "DET", Position.valueOf("TE"), 2022, 8, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Armani", "Rogers", "WAS", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Kylen", "Granson", "IND", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 11, 0);
		playerService.insertPlayerWithStatistics("Chris", "Myarick", "NYG", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Jonnu", "Smith", "NE", Position.valueOf("TE"), 2022, 8, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 10, 0);
	}

	private void insertStatisticsWeek9() throws StatisticsException {
		// NFL Statistics 2022 Week9
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 9, 17, 28,
				123, 3, 0, 15, 178, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 9, 43, 68,
				446, 1, 1, 6, 63, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 9, 18, 34, 205,
				0, 2, 9, 86, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 9, 21, 30,
				302, 3, 0, 5, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 9, 26, 34, 275,
				2, 1, 6, 38, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyler", "Murray", "ARI", Position.valueOf("QB"), 2022, 9, 25, 35, 175,
				2, 0, 8, 60, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 9, 23, 43, 291,
				1, 3, 4, 40, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 9, 21, 27, 243,
				2, 0, 9, 23, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 9, 22, 28, 206,
				1, 0, 4, 9, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 9, 22, 40, 265,
				2, 1, 2, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 9, 25, 31,
				235, 1, 0, 6, 53, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 9, 21, 36, 259, 2,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 9, 12, 22,
				133, 1, 0, 11, 82, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 9, 36, 58, 280, 1,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 9, 13, 22, 154,
				2, 2, 3, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Taylor", "Heinicke", "WAS", Position.valueOf("QB"), 2022, 9, 15, 28,
				149, 2, 1, 4, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 9, 30, 43,
				245, 1, 1, 1, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "CAR", Position.valueOf("QB"), 2022, 9, 14, 20,
				155, 2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 9, 19, 29, 210,
				1, 1, 2, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 9, 14, 26, 137,
				2, 1, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zach", "Wilson", "NYJ", Position.valueOf("QB"), 2022, 9, 18, 25, 154,
				1, 0, 5, 24, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matthew", "Stafford", "LAR", Position.valueOf("QB"), 2022, 9, 13, 27,
				165, 1, 0, 2, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 9, 20, 30, 147, 1,
				0, 1, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Ehlinger", "IND", Position.valueOf("QB"), 2022, 9, 15, 29, 103,
				0, 1, 5, 39, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 9, 12, 23,
				129, 0, 0, 5, 24, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Malik", "Willis", "TEN", Position.valueOf("QB"), 2022, 9, 5, 16, 80,
				0, 0, 8, 40, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("PJ", "Walker", "CAR", Position.valueOf("QB"), 2022, 9, 3, 10, 9, 0, 2,
				1, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Allen", "CIN", Position.valueOf("QB"), 2022, 9, 3, 3, 22,
				0, 0, 3, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0, 0,
				22, 153, 4, 5, 4, 58, 1);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 26, 109, 2, 4, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 28, 109, 2, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 17, 115, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenyan", "Drake", "BAL", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 24, 93, 2, 2, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 14, 47, 1, 8, 7, 24, 1);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 9, 0,
				0, 0, 0, 0, 13, 44, 2, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 17, 93, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 12, 76, 1, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 27, 139, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "MIA", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 9, 51, 0, 3, 3, 21, 1);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 9, 0, 0,
				0, 0, 0, 15, 60, 0, 7, 3, 10, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 10, 99, 0, 1, 1, 24, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 17, 47, 0, 6, 2, 9, 1);
		playerService.insertPlayerWithStatistics("Raheem", "Blackshear", "CAR", Position.valueOf("RB"), 2022, 9, 0, 0,
				0, 0, 0, 5, 13, 1, 4, 4, 40, 0);
		playerService.insertPlayerWithStatistics("James", "Robinson", "NYJ", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 13, 48, 0, 2, 2, 5, 1);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 4, 22, 1, 3, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0, 0,
				17, 67, 0, 3, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 9, 26, 1, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 24, 81, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 7, 45, 0, 5, 5, 19, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 9, 30, 0, 4, 3, 32, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 9, 19, 0, 7, 5, 41, 0);
		playerService.insertPlayerWithStatistics("Darrell", "Henderson", "LAR", Position.valueOf("RB"), 2022, 9, 0, 0,
				0, 0, 0, 12, 56, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 6, 51, 0, 2, 1, 3, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 2, 10, 0, 4, 3, 40, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 8, 24, 0, 5, 4, 24, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 11, 36, 0, 3, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0, 0,
				9, 25, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0, 0,
				11, 34, 0, 4, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 3, 4, 0, 8, 6, 40, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 14, 36, 0, 2, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 9, 0, 0,
				0, 0, 0, 13, 44, 0, 2, 2, -6, 0);
		playerService.insertPlayerWithStatistics("Deon", "Jackson", "IND", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 11, 23, 0, 3, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Caleb", "Huntley", "ATL", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 7, 34, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 8, 27, 0, 3, 3, 7, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0, 0,
				4, 15, 0, 4, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Travis", "Homer", "SEA", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 1, 7, 0, 3, 3, 25, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Spiller", "LAC", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 7, 29, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Wilkins", "IND", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 3, 13, 0, 5, 4, 15, 0);
		playerService.insertPlayerWithStatistics("Eno", "Benjamin", "ARI", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 4, 12, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jackson", "DET", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 4, 27, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Spencer", "Brown", "CAR", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 3, 16, 0, 3, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 7, 23, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 7, 23, 0, 3, 2, -2, 0);
		playerService.insertPlayerWithStatistics("Malcolm", "Brown", "LAR", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 2, 9, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Clyde", "Edwards-Helaire", "KC", Position.valueOf("RB"), 2022, 9, 0,
				0, 0, 0, 0, 4, 5, 0, 2, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Justice", "Hill", "BAL", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 4, 11, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Ty", "Johnson", "NYJ", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0, 0,
				2, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("JJ", "Taylor", "NE", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0, 0,
				10, 9, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Rex", "Burkhead", "HOU", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 1, 9, 0, 2, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Dwayne", "Washington", "NO", Position.valueOf("RB"), 2022, 9, 0, 0, 0,
				0, 0, 3, 7, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Sony", "Michel", "LAC", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 1, 12, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("JaMycal", "Hasty", "JAC", Position.valueOf("RB"), 2022, 9, 0, 0, 0, 0,
				0, 3, 6, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 17, 10, 146, 2);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 143, 1);
		playerService.insertPlayerWithStatistics("Cooper", "Kupp", "LAR", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 3, 1, 0, 9, 8, 127, 1);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 1, 10, 0, 13, 7, 115, 1);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 4, 87, 1);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 85, 1);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 1, 16, 0, 4, 3, 65, 1);
		playerService.insertPlayerWithStatistics("Mecole", "Hardman", "KC", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 79, 1);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 8, 76, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 67, 1);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 4, 59, 1);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 9, 0, 0,
				0, 0, 0, 0, 0, 0, 6, 3, 53, 1);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 8, 106, 0);
		playerService.insertPlayerWithStatistics("Darnell", "Mooney", "CHI", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 1, 2, 0, 8, 7, 43, 1);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 1, 2, 0, 5, 4, 43, 1);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 1, 7, 0, 9, 8, 92, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 37, 1);
		playerService.insertPlayerWithStatistics("DeAndre", "Hopkins", "ARI", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 36, 1);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 5, 93, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 9, 0, 0,
				0, 0, 0, 0, 0, 0, 12, 10, 88, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 6, 71, 0);
		playerService.insertPlayerWithStatistics("Phillip", "Dorsett", "HOU", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 69, 0);
		playerService.insertPlayerWithStatistics("Rondale", "Moore", "ARI", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 8, 69, 0);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 67, 0);
		playerService.insertPlayerWithStatistics("Dax", "Milne", "WAS", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 6, 1);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 60, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 5, 56, 0);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 4, 55, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 53, 0);
		playerService.insertPlayerWithStatistics("Scotty", "Miller", "TB", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 53, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 48, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 44, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 1, 2, 0, 6, 5, 42, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 11, 5, 40, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 5, 40, 0);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 1, 1, 0, 10, 7, 36, 0);
		playerService.insertPlayerWithStatistics("Justin", "Watson", "KC", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 37, 0);
		playerService.insertPlayerWithStatistics("Samori", "Toure", "GB", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 34, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 33, 0);
		playerService.insertPlayerWithStatistics("Trent", "Taylor", "CIN", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 3, 18, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Tre'Quan", "Smith", "NO", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 29, 0);
		playerService.insertPlayerWithStatistics("Julio", "Jones", "TB", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Trent", "Sherfield", "MIA", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Michael", "Bandy", "LAC", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 26, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Renfrow", "LV", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 26, 0);
		playerService.insertPlayerWithStatistics("Trenton", "Irwin", "CIN", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 1, 11, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 25, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Callaway", "NO", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 24, 0);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Allen", "Robinson", "LAR", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 23, 0);
		playerService.insertPlayerWithStatistics("Cedrick", "Wilson", "MIA", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 9, 0, 0,
				0, 0, 0, 0, 0, 0, 6, 3, 22, 0);
		playerService.insertPlayerWithStatistics("James", "Proche", "BAL", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 1, 9, 0, 3, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Shi", "Smith", "CAR", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 20, 0);
		playerService.insertPlayerWithStatistics("KhaDarel", "Hodge", "ATL", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 19, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 9, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "CHI", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 1, 4, 0, 6, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 17, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 1, 1, 0, 5, 2, 15, 0);
		playerService.insertPlayerWithStatistics("DeSean", "Jackson", "BAL", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Tom", "Kennedy", "DET", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 9, 0, 0, 0,
				0, 0, 1, 1, 0, 4, 3, 11, 0);
		playerService.insertPlayerWithStatistics("Denzel", "Mims", "NYJ", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 9, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Cam", "Sims", "WAS", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Kadarius", "Toney", "KC", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 9,
				0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Kevin", "White", "NO", Position.valueOf("WR"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 41, 2);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 8, 100, 1);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 68, 1);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 17, 10, 106, 0);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 42, 1);
		playerService.insertPlayerWithStatistics("Zach", "Ertz", "ARI", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 5, 40, 1);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 96, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Likely", "BAL", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 1, 24, 1);
		playerService.insertPlayerWithStatistics("Tommy", "Tremble", "CAR", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 11, 1);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "MIN", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 9, 70, 0);
		playerService.insertPlayerWithStatistics("James", "Mitchell", "DET", Position.valueOf("TE"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 8, 1);
		playerService.insertPlayerWithStatistics("Teagan", "Quitoriano", "HOU", Position.valueOf("TE"), 2022, 9, 0, 0,
				0, 0, 0, 0, 0, 0, 1, 1, 2, 1);
		playerService.insertPlayerWithStatistics("Shane", "Zylstra", "DET", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 1, 1);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 50, 0);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 9, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 1, 48, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 45, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 42, 0);
		playerService.insertPlayerWithStatistics("Josiah", "Deguara", "GB", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 41, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 9, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 36, 0);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 35, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 34, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 29, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Pitts", "ATL", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 25, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Armani", "Rogers", "WAS", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jonnu", "Smith", "NE", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 21, 0);
		playerService.insertPlayerWithStatistics("Dan", "Arnold", "JAC", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 19, 0);
		playerService.insertPlayerWithStatistics("Marcedes", "Lewis", "GB", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 19, 0);
		playerService.insertPlayerWithStatistics("Josh", "Oliver", "BAL", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 19, 0);
		playerService.insertPlayerWithStatistics("CJ", "Uzomah", "NYJ", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 16, 0);
		playerService.insertPlayerWithStatistics("Luke", "Farrell", "JAC", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("OJ", "Howard", "HOU", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Mo", "Alie-Cox", "IND", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Jack", "Stoll", "PHI", Position.valueOf("TE"), 2022, 9, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 13, 0);
	}

	private void insertStatisticsWeek10() throws StatisticsException {
		// NFL Statistics 2022 Week10
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 10, 12, 20,
				167, 2, 1, 13, 147, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 10, 26, 35,
				331, 4, 1, 7, 39, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 10, 29, 43, 330,
				1, 2, 6, 84, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 10, 25, 32,
				285, 3, 0, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 10, 27, 46,
				265, 3, 2, 4, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 10, 17, 26, 175,
				2, 1, 6, 28, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 10, 21, 28, 222,
				1, 0, 4, 38, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 10, 23, 33, 275,
				2, 0, 4, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 10, 14, 20,
				224, 3, 0, 2, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 10, 29, 40,
				259, 2, 0, 4, 26, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 10, 30, 50,
				357, 1, 2, 6, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 10, 19, 36,
				255, 2, 0, 2, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 10, 19, 30,
				186, 2, 1, 3, 43, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 10, 18, 30,
				199, 0, 0, 8, 51, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 10, 22, 29, 258, 2,
				1, 6, -3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 10, 24, 38, 248,
				2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 10, 13, 17,
				197, 2, 0, 5, 24, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 10, 22, 37, 319,
				1, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 10, 21, 42,
				286, 1, 1, 7, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 10, 22, 35,
				212, 1, 0, 7, 40, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 10, 19, 28,
				240, 0, 0, 5, 3, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 10, 19, 26, 236,
				1, 0, 4, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Colt", "McCoy", "ARI", Position.valueOf("QB"), 2022, 10, 26, 37, 238,
				1, 0, 4, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 10, 21, 35,
				196, 1, 1, 5, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("John", "Wolford", "LAR", Position.valueOf("QB"), 2022, 10, 24, 36,
				212, 1, 1, 3, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 10, 17, 27, 174,
				1, 2, 3, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Taylor", "Heinicke", "WAS", Position.valueOf("QB"), 2022, 10, 17, 29,
				211, 0, 1, 5, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("PJ", "Walker", "CAR", Position.valueOf("QB"), 2022, 10, 10, 16, 108,
				0, 0, 3, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 22, 147, 1, 2, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 35, 152, 1, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 24, 138, 1, 2, 2, 18, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 21, 69, 2, 3, 3, 17, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 14, 119, 1, 5, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "MIA", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 17, 119, 1, 5, 2, 24, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 31, 130, 1, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 22, 115, 1, 6, 3, 13, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 10, 0, 0,
				0, 0, 0, 13, 47, 2, 2, 1, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 21, 78, 1, 8, 6, 28, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 8, 65, 1, 4, 4, 22, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson", "WAS", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 26, 86, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 11, 63, 1, 4, 3, 18, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 10, 0, 0,
				0, 0, 0, 14, 38, 1, 6, 4, 39, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 17, 94, 0, 3, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 16, 59, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 10, 0, 0,
				0, 0, 0, 14, 57, 1, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 14, 44, 1, 3, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Alec", "Ingold", "MIA", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 45, 1);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 22, 105, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 20, 99, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Darrell", "Henderson", "LAR", Position.valueOf("RB"), 2022, 10, 0, 0,
				0, 0, 0, 6, 21, 1, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Mitchell", "SF", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 18, 89, 0, 2, 1, -1, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 16, 82, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 9, 37, 0, 3, 3, 40, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 11, 45, 0, 3, 3, 28, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 6, 6, 1, 3, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 10, 17, 0, 8, 6, 55, 0);
		playerService.insertPlayerWithStatistics("Melvin", "Gordon", "DEN", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 7, 24, 0, 6, 4, 46, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 19, 53, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0, 0,
				13, 65, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 6, 24, 0, 12, 7, 39, 0);
		playerService.insertPlayerWithStatistics("CJ", "Ham", "MIN", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0, 0, 1,
				3, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 1, 2, 0, 8, 6, 56, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 10, 57, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 12, 54, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 9, 24, 0, 3, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 8, 26, 0, 4, 3, 19, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 10, 0, 0,
				0, 0, 0, 9, 37, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Kyren", "Williams", "LAR", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 1, 9, 0, 3, 3, 30, 0);
		playerService.insertPlayerWithStatistics("Malik", "Davis", "DAL", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 5, 38, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ameer", "Abdullah", "LV", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 33, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Blackshear", "CAR", Position.valueOf("RB"), 2022, 10, 0, 0,
				0, 0, 0, 6, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Caleb", "Huntley", "ATL", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 5, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rex", "Burkhead", "HOU", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 1, 2, 0, 2, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jackson", "DET", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 4, 14, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Avery", "Williams", "ATL", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 4, 25, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0, 0,
				6, 22, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 5, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 6, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 10, 0,
				0, 0, 0, 0, 5, 18, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 6, 9, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 10, 0, 0,
				0, 0, 0, 3, 11, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Wilkins", "IND", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 3, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 5, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dare", "Ogunbowale", "HOU", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Ke'Shawn", "Vaughn", "TB", Position.valueOf("RB"), 2022, 10, 0, 0, 0,
				0, 0, 2, 2, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 10, 0, 0,
				0, 0, 0, 1, 7, 0, 2, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Salvon", "Ahmed", "MIA", Position.valueOf("RB"), 2022, 10, 0, 0, 0, 0,
				0, 3, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 4, 107, 3);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 15, 11, 150, 2);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 10, 0, 0,
				0, 0, 0, 0, 0, 0, 16, 10, 193, 1);
		playerService.insertPlayerWithStatistics("Nick", "Westbrook-Ikhine", "TEN", Position.valueOf("WR"), 2022, 10, 0,
				0, 0, 0, 0, 0, 0, 0, 8, 5, 119, 2);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 9, 105, 2);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 14, 9, 126, 1);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 95, 1);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 6, 93, 1);
		playerService.insertPlayerWithStatistics("Kadarius", "Toney", "KC", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 2, 33, 0, 5, 4, 57, 1);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 7, 76, 1);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 71, 1);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 16, 12, 128, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 8, 128, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Virgil", "DEN", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 66, 1);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 64, 1);
		playerService.insertPlayerWithStatistics("Trent", "Sherfield", "MIA", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 63, 1);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 10, 0, 0,
				0, 0, 0, 1, 2, 0, 11, 10, 119, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 10,
				0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 60, 1);
		playerService.insertPlayerWithStatistics("Laviska", "Shenault", "CAR", Position.valueOf("WR"), 2022, 10, 0, 0,
				0, 0, 0, 2, 42, 1, 4, 3, 17, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 2, 23, 1, 4, 3, 32, 0);
		playerService.insertPlayerWithStatistics("Julio", "Jones", "TB", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 53, 1);
		playerService.insertPlayerWithStatistics("Nico", "Collins", "HOU", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 5, 49, 1);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 44, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 42, 1);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 10, 0,
				0, 0, 0, 0, 0, 0, 0, 9, 5, 99, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 39, 1);
		playerService.insertPlayerWithStatistics("Marquise", "Goodwin", "SEA", Position.valueOf("WR"), 2022, 10, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 38, 1);
		playerService.insertPlayerWithStatistics("DeAndre", "Hopkins", "ARI", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 14, 10, 98, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 38, 1);
		playerService.insertPlayerWithStatistics("KhaDarel", "Hodge", "ATL", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 37, 1);
		playerService.insertPlayerWithStatistics("Rondale", "Moore", "ARI", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 13, 9, 94, 0);
		playerService.insertPlayerWithStatistics("Van", "Jefferson", "LAR", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 27, 1);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 84, 0);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 80, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 71, 0);
		playerService.insertPlayerWithStatistics("AJ", "Green", "ARI", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 10, 1);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 70, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 8, 68, 0);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 10, 0, 0,
				0, 0, 0, 0, 0, 0, 11, 6, 66, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 66, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 63, 0);
		playerService.insertPlayerWithStatistics("Kendall", "Hinton", "DEN", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 62, 0);
		playerService.insertPlayerWithStatistics("Damiere", "Byrd", "ATL", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 58, 0);
		playerService.insertPlayerWithStatistics("Darnell", "Mooney", "CHI", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 57, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 1, 18, 0, 4, 4, 37, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 54, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 10, 0, 0,
				0, 0, 0, 0, 0, 0, 9, 7, 53, 0);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 4, 27, 0, 6, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 49, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 47, 0);
		playerService.insertPlayerWithStatistics("Sammy", "Watkins", "GB", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 47, 0);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 45, 0);
		playerService.insertPlayerWithStatistics("Tom", "Kennedy", "DET", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 44, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 3, 44, 0);
		playerService.insertPlayerWithStatistics("Allen", "Robinson", "LAR", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 44, 0);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 10, 0,
				0, 0, 0, 0, 0, 0, 0, 2, 1, 43, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 1, 5, 0, 7, 4, 37, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Hodgins", "NYG", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 41, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 40, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 40, 0);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 4, 12, 0, 4, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Jarvis", "Landry", "NO", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 37, 0);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0, 0,
				1, 2, 0, 11, 4, 35, 0);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 35, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 10, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 2, 34, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 33, 0);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 33, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 10, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 2, 33, 0);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 32, 0);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 4, 29, 0);
		playerService.insertPlayerWithStatistics("Scotty", "Miller", "TB", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 25, 0);
		playerService.insertPlayerWithStatistics("David", "Bell", "CLE", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Phillip", "Dorsett", "HOU", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Keke", "Coutee", "IND", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 1, 0, 0, 6, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 1, 8, 0, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Steven", "Sims", "PIT", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 2, 2, 0, 2, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Shi", "Smith", "CAR", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Dyami", "Brown", "WAS", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Wan'Dale", "Robinson", "NYG", Position.valueOf("WR"), 2022, 10, 0, 0,
				0, 0, 0, 1, -5, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Jahan", "Dotson", "WAS", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Ben", "Skowronek", "LAR", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Byron", "Pringle", "CHI", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Rashid", "Shaheed", "NO", Position.valueOf("WR"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Justin", "Watson", "KC", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Zach", "Pascal", "PHI", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 4, 74, 2);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 81, 1);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 54, 1);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 44, 1);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 43, 1);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 23, 1);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 20, 1);
		playerService.insertPlayerWithStatistics("Harrison", "Bryant", "CLE", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 15, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 8, 73, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 72, 0);
		playerService.insertPlayerWithStatistics("Lawrence", "Cager", "NYG", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 9, 1);
		playerService.insertPlayerWithStatistics("Brock", "Wright", "DET", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 2, 1);
		playerService.insertPlayerWithStatistics("Kylen", "Granson", "IND", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 57, 0);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 57, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "MIN", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 7, 45, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 5, 41, 0);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 10, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 1, 41, 0);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 36, 0);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 35, 0);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 34, 0);
		playerService.insertPlayerWithStatistics("Mike", "Gesicki", "MIA", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 31, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Pitts", "ATL", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Tanner", "Hudson", "NYG", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Adam", "Trautman", "NO", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 22, 0);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Tre'", "McKitty", "LAC", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 21, 0);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Pharaoh", "Brown", "CLE", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Zach", "Ertz", "ARI", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Eric", "Saubert", "DEN", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Logan", "Thomas", "WAS", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dulcich", "DEN", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Brycen", "Hopkins", "LAR", Position.valueOf("TE"), 2022, 10, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Jack", "Stoll", "PHI", Position.valueOf("TE"), 2022, 10, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 11, 0);
	}

	private void insertStatisticsWeek11() throws StatisticsException {
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 11, 24, 39, 355,
				4, 2, 4, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 11, 27, 44,
				341, 1, 2, 7, 50, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 11, 28, 41,
				324, 3, 0, 7, 29, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 11, 20, 34,
				329, 3, 0, 4, 23, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 11, 18, 25, 190,
				1, 0, 16, 86, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 11, 20, 29,
				228, 4, 0, 1, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 11, 14, 21,
				153, 1, 1, 18, 85, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 11, 21, 25, 260,
				3, 0, 2, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 11, 22, 27,
				333, 2, 1, 3, -3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 11, 23, 30,
				280, 2, 1, 5, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 11, 22, 25,
				276, 2, 0, 3, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 11, 23, 37, 307,
				2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 11, 24, 33,
				209, 0, 1, 11, 31, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 11, 24, 39,
				227, 2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 11, 13, 20,
				131, 1, 0, 13, 25, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 11, 25, 42,
				265, 1, 0, 2, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matthew", "Stafford", "LAR", Position.valueOf("QB"), 2022, 11, 11, 18,
				159, 2, 0, 1, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 11, 19, 33, 169,
				0, 2, 5, 10, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 11, 18, 27, 197,
				1, 0, 3, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 11, 24, 31,
				247, 0, 0, 1, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 11, 23, 27, 246, 0,
				0, 2, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Colt", "McCoy", "ARI", Position.valueOf("QB"), 2022, 11, 24, 34, 218,
				0, 1, 3, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "CAR", Position.valueOf("QB"), 2022, 11, 21, 33,
				196, 0, 2, 2, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 11, 23, 32, 213,
				0, 0, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Taylor", "Heinicke", "WAS", Position.valueOf("QB"), 2022, 11, 15, 27,
				191, 0, 0, 3, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 11, 17, 26, 165,
				0, 0, 4, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Bryce", "Perkins", "LAR", Position.valueOf("QB"), 2022, 11, 5, 10, 64,
				0, 0, 5, 39, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zach", "Wilson", "NYJ", Position.valueOf("QB"), 2022, 11, 9, 22, 77,
				0, 0, 3, 26, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 11, 12, 23,
				105, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trace", "McSorley", "ARI", Position.valueOf("QB"), 2022, 11, 6, 10,
				59, 0, 1, 1, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Mullens", "MIN", Position.valueOf("QB"), 2022, 11, 5, 7, 54,
				0, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cooper", "Rush", "DAL", Position.valueOf("QB"), 2022, 11, 4, 5, 31, 0,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 15, 80, 0, 6, 6, 109, 2);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 11, 30, 0, 4, 4, 52, 3);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 17, 64, 3, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 20, 90, 2, 6, 4, 26, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 28, 87, 1, 2, 2, 45, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 11, 0, 0,
				0, 0, 0, 17, 67, 1, 4, 3, 54, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 15, 42, 2, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 19, 83, 1, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 24, 109, 0, 4, 3, 51, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 11, 0, 0,
				0, 0, 0, 18, 86, 1, 2, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 22, 84, 1, 4, 3, 10, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 17, 49, 1, 4, 4, 23, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 14, 42, 1, 5, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 15, 107, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 11, 0, 0,
				0, 0, 0, 7, 39, 0, 7, 7, 67, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 18, 72, 0, 3, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 8, 65, 0, 2, 2, 28, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 5, 20, 1, 3, 3, 12, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 3, 13, 1, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 12, 42, 0, 5, 4, 47, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 11, 86, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 11, 0, 0,
				0, 0, 0, 15, 26, 0, 6, 6, 56, 0);
		playerService.insertPlayerWithStatistics("Dontrell", "Hilliard", "TEN", Position.valueOf("RB"), 2022, 11, 0, 0,
				0, 0, 0, 1, 4, 0, 1, 1, 14, 1);
		playerService.insertPlayerWithStatistics("Justin", "Jackson", "DET", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 9, 66, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 11, 72, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Melvin", "Gordon", "DEN", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 8, 31, 0, 5, 5, 39, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 14, 19, 0, 3, 3, 48, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 8, 55, 0, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0, 0,
				7, 20, 0, 3, 3, 42, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0, 0,
				14, 61, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 12, 40, 0, 7, 6, 20, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Mitchell", "SF", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 9, 59, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 11, 0,
				0, 0, 0, 0, 10, 52, 0, 2, 2, 7, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 11, 0, 0,
				0, 0, 0, 15, 57, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 5, 32, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Kenyan", "Drake", "BAL", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 10, 46, 0, 4, 2, 7, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 13, 47, 0, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Kyren", "Williams", "LAR", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 7, 36, 0, 2, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Justice", "Hill", "BAL", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 7, 30, 0, 3, 3, 8, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 15, 22, 0, 5, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Malik", "Davis", "DAL", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 7, 13, 0, 3, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 4, 0, 0, 3, 2, 25, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 11, 24, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 6, 24, 0, 1, 1, 0, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0, 0,
				6, 13, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Spiller", "LAC", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 4, 11, 0, 2, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Keaontay", "Ingram", "ARI", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 5, 19, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 8, 19, 0, 2, 1, -2, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 10, 8, 0, 3, 2, 9, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Blackshear", "CAR", Position.valueOf("RB"), 2022, 11, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Mason", "SF", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 4, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Boston", "Scott", "PHI", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 3, 8, 0, 2, 2, 4, 0);
		playerService.insertPlayerWithStatistics("Deon", "Jackson", "IND", Position.valueOf("RB"), 2022, 11, 0, 0, 0, 0,
				0, 1, 7, 0, 4, 4, 3, 0);
		playerService.insertPlayerWithStatistics("James", "Robinson", "NYJ", Position.valueOf("RB"), 2022, 11, 0, 0, 0,
				0, 0, 7, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 7, 141, 2);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 8, 113, 2);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 8, 106, 2);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 1, 3, 0, 6, 4, 48, 2);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 102, 1);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 3, 37, 1, 9, 7, 57, 0);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 9, 148, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 83, 1);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 20, 2);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 11, 0, 0,
				0, 0, 0, 0, 0, 0, 9, 9, 128, 0);
		playerService.insertPlayerWithStatistics("Tutu", "Atwell", "LAR", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 62, 1);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 11, 0,
				0, 0, 0, 0, 0, 0, 0, 6, 5, 61, 1);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 7, 111, 0);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 48, 1);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 48, 1);
		playerService.insertPlayerWithStatistics("Allen", "Robinson", "LAR", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 47, 1);
		playerService.insertPlayerWithStatistics("Wan'Dale", "Robinson", "NYG", Position.valueOf("WR"), 2022, 11, 0, 0,
				0, 0, 0, 1, 4, 0, 13, 9, 100, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dortch", "ARI", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 9, 103, 0);
		playerService.insertPlayerWithStatistics("Trenton", "Irwin", "CIN", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 42, 1);
		playerService.insertPlayerWithStatistics("Keenan", "Allen", "LAC", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 94, 0);
		playerService.insertPlayerWithStatistics("Jarvis", "Landry", "NO", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 33, 1);
		playerService.insertPlayerWithStatistics("DeAndre", "Hopkins", "ARI", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 9, 91, 0);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 31, 1);
		playerService.insertPlayerWithStatistics("Darnell", "Mooney", "CHI", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 29, 1);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 2, 18, 1, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 5, 86, 0);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 11, 0, 0,
				0, 0, 0, 1, 4, 0, 8, 7, 76, 0);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 11, 0, 0,
				0, 0, 0, 0, 0, 0, 7, 5, 80, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 6, 78, 0);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 11, 0,
				0, 0, 0, 0, 0, 0, 0, 6, 3, 76, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 11, 0, 0,
				0, 0, 0, 0, 0, 0, 7, 6, 75, 0);
		playerService.insertPlayerWithStatistics("Randall", "Cobb", "GB", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 6, 73, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 70, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 69, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 5, 68, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 67, 0);
		playerService.insertPlayerWithStatistics("Justin", "Watson", "KC", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 67, 0);
		playerService.insertPlayerWithStatistics("Skyy", "Moore", "KC", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 63, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 2, 1);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 5, 60, 0);
		playerService.insertPlayerWithStatistics("Kendall", "Hinton", "DEN", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 57, 0);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 5, 57, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 1, 1, 0, 7, 4, 55, 0);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 52, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 52, 0);
		playerService.insertPlayerWithStatistics("AJ", "Green", "ARI", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 5, 50, 0);
		playerService.insertPlayerWithStatistics("Nico", "Collins", "HOU", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 48, 0);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 45, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 2, 42, 0);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 42, 0);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 41, 0);
		playerService.insertPlayerWithStatistics("Van", "Jefferson", "LAR", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 41, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 1, 7, 0, 7, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Gunner", "Olszewski", "PIT", Position.valueOf("WR"), 2022, 11, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 2, 39, 0);
		playerService.insertPlayerWithStatistics("Denzel", "Mims", "NYJ", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 35, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 11, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Damiere", "Byrd", "ATL", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 29, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Golladay", "NYG", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 29, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Hodgins", "NYG", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 29, 0);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Nick", "Westbrook-Ikhine", "TEN", Position.valueOf("WR"), 2022, 11, 0,
				0, 0, 0, 0, 0, 0, 0, 2, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Shi", "Smith", "CAR", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 26, 0);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 25, 0);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Equanimeous", "St Brown", "CHI", Position.valueOf("WR"), 2022, 11, 0,
				0, 0, 0, 0, 0, 0, 0, 2, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 1, 3, 0, 7, 5, 20, 0);
		playerService.insertPlayerWithStatistics("David", "Bell", "CLE", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 22, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 1, 1, 0, 5, 4, 21, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 11, 0, 0,
				0, 0, 0, 1, 13, 0, 2, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Keelan", "Cole", "LV", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 21, 0);
		playerService.insertPlayerWithStatistics("DeVante", "Parker", "NE", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Nelson", "Agholor", "NE", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 11,
				0, 0, 0, 0, 0, 0, 0, 0, 4, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 17, 0);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Cam", "Sims", "WAS", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Jahan", "Dotson", "WAS", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 1, 3, 0, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Nailor", "MIN", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Powell", "LAR", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 1, -1, 0, 2, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Reagor", "MIN", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("KhaDarel", "Hodge", "ATL", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Tom", "Kennedy", "DET", Position.valueOf("WR"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 1, 0, 0, 3, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "CHI", Position.valueOf("WR"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 6, 115, 3);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 84, 2);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 36, 2);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 47, 1);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 8, 79, 0);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 7, 70, 0);
		playerService.insertPlayerWithStatistics("Logan", "Thomas", "WAS", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 65, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 63, 0);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Jody", "Fortson", "KC", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 51, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 45, 0);
		playerService.insertPlayerWithStatistics("Jonnu", "Smith", "NE", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 40, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Pitts", "ATL", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 43, 0);
		playerService.insertPlayerWithStatistics("Harrison", "Bryant", "CLE", Position.valueOf("TE"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 41, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 35, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "MIN", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 5, 34, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 33, 0);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 11, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 1, 31, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dulcich", "DEN", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 30, 0);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Ian", "Thomas", "CAR", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 22, 0);
		playerService.insertPlayerWithStatistics("Lawrence", "Cager", "NYG", Position.valueOf("TE"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Brock", "Wright", "DET", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 19, 0);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("MyCole", "Pruitt", "ATL", Position.valueOf("TE"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Kylen", "Granson", "IND", Position.valueOf("TE"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Eric", "Saubert", "DEN", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Jake", "Ferguson", "DAL", Position.valueOf("TE"), 2022, 11, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Mo", "Alie-Cox", "IND", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Trey", "McBride", "ARI", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 14, 0);
		playerService.insertPlayerWithStatistics("Adam", "Trautman", "NO", Position.valueOf("TE"), 2022, 11, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 12, 0);

	}

	private void insertStatisticsWeek12() throws StatisticsException {
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 12, 24, 42, 253,
				2, 1, 10, 78, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 12, 16, 28, 153,
				2, 0, 17, 157, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 12, 35, 47,
				274, 3, 0, 4, 38, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyler", "Murray", "ARI", Position.valueOf("QB"), 2022, 12, 18, 29,
				191, 2, 1, 7, 56, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 12, 29, 37,
				321, 3, 0, 2, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "White", "NYJ", Position.valueOf("QB"), 2022, 12, 22, 28, 315,
				3, 0, 3, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 12, 25, 36, 295,
				3, 2, 2, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 12, 28, 39, 382, 2,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 12, 30, 37,
				299, 3, 1, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 12, 27, 37, 328,
				2, 1, 5, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 12, 16, 32,
				254, 1, 0, 14, 89, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 12, 27, 42,
				320, 1, 1, 4, 36, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 12, 21, 30,
				261, 2, 2, 2, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 12, 22, 37, 270,
				1, 0, 9, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 12, 29, 43, 246, 2,
				0, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 12, 23, 37, 240,
				2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 12, 22, 36,
				299, 1, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Darnold", "CAR", Position.valueOf("QB"), 2022, 12, 11, 19, 164,
				1, 0, 3, 3, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 12, 15, 25,
				174, 1, 1, 6, 49, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jacoby", "Brissett", "CLE", Position.valueOf("QB"), 2022, 12, 23, 37,
				210, 1, 1, 2, 27, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 12, 21, 35,
				228, 1, 0, 3, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 12, 22, 34, 199,
				1, 1, 4, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Allen", "HOU", Position.valueOf("QB"), 2022, 12, 26, 39, 215,
				1, 2, 4, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 12, 26, 37,
				222, 1, 0, 4, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 12, 22, 34,
				291, 0, 0, 2, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 12, 11, 16,
				140, 2, 2, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Taylor", "Heinicke", "WAS", Position.valueOf("QB"), 2022, 12, 14, 23,
				138, 2, 1, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Siemian", "CHI", Position.valueOf("QB"), 2022, 12, 14, 25,
				179, 1, 1, 4, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Bryce", "Perkins", "LAR", Position.valueOf("QB"), 2022, 12, 13, 23,
				100, 1, 2, 9, 44, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 12, 18, 29, 204,
				0, 0, 4, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 12, 20, 28,
				174, 0, 0, 6, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 12, 19, 35,
				142, 1, 0, 2, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Love", "GB", Position.valueOf("QB"), 2022, 12, 6, 9, 113, 1,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 33, 229, 2, 7, 6, 74, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 21, 143, 2, 3, 3, 17, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 25, 120, 0, 3, 3, 20, 1);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 26, 116, 1, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 18, 105, 0, 3, 2, 20, 1);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 12, 43, 0, 4, 3, 56, 1);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 14, 26, 2, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 20, 86, 1, 4, 3, 12, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 16, 92, 1, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("JaMycal", "Hasty", "JAC", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 12, 28, 0, 5, 5, 67, 1);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 17, 58, 1, 7, 4, 35, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0, 0,
				8, 64, 1, 4, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 22, 69, 1, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 5, 20, 0, 15, 11, 60, 1);
		playerService.insertPlayerWithStatistics("Ty", "Johnson", "NYJ", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 5, 62, 1, 2, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Benny", "Snell", "PIT", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 12, 62, 1, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 18, 66, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 17, 38, 0, 3, 3, 79, 0);
		playerService.insertPlayerWithStatistics("Ameer", "Abdullah", "LV", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 3, 16, 0, 3, 3, 39, 1);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 24, 113, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Travis", "Homer", "SEA", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 2, 8, 0, 3, 2, 45, 1);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 14, 79, 0, 4, 3, 34, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 11, 39, 1, 6, 4, 13, 0);
		playerService.insertPlayerWithStatistics("Gus", "Edwards", "BAL", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 16, 52, 1, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 7, 36, 0, 10, 9, 76, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "MIA", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 13, 39, 1, 3, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 14, 64, 0, 9, 9, 45, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 8, 39, 1, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Zonovan", "Knight", "NYJ", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 14, 69, 0, 3, 3, 34, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 10, 35, 1, 1, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 13, 92, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Dare", "Ogunbowale", "HOU", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 4, 14, 1, 2, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 14, 72, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 12, 0,
				0, 0, 0, 0, 11, 52, 0, 5, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Darrynton", "Evans", "CHI", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 9, 34, 0, 1, 1, 33, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 17, 65, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 18, 60, 0, 2, 2, 1, 0);
		playerService.insertPlayerWithStatistics("Kyren", "Williams", "LAR", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 11, 35, 0, 3, 3, 25, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 22, 42, 0, 5, 4, 14, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 11, 54, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 9, 32, 0, 3, 3, 22, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 7, 13, 0, 7, 6, 37, 0);
		playerService.insertPlayerWithStatistics("Gary", "Brightwell", "NYG", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 5, 31, 0, 2, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 11, 32, 0, 6, 4, 17, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Mitchell", "SF", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 7, 35, 0, 2, 2, 8, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 5, 19, 0, 8, 4, 24, 0);
		playerService.insertPlayerWithStatistics("Trayveon", "Williams", "CIN", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 2, 18, 0, 1, 1, 24, 0);
		playerService.insertPlayerWithStatistics("Anthony", "McFarland Jr", "PIT", Position.valueOf("RB"), 2022, 12, 0,
				0, 0, 0, 0, 6, 30, 0, 2, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0, 0,
				8, 37, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 6, 21, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Ronald", "Jones", "KC", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 4, 12, 0, 1, 1, 22, 0);
		playerService.insertPlayerWithStatistics("Zamir", "White", "LV", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 2, 28, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 26, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Mason", "SF", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 5, 25, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Boston", "Scott", "PHI", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 3, 24, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Williams", "WAS", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 4, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Myles", "Gaskin", "MIA", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 6, 17, 0, 1, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 5, 15, 0, 2, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 2, 4, 0, 3, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Dontrell", "Hilliard", "TEN", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 2, 16, 0, 3, 3, 3, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jackson", "DET", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 4, 4, 0, 2, 1, 15, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 2, 4, 0, 5, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 5, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 5, 8, 0, 6, 3, 8, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 2, 6, 0, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("DeeJay", "Dallas", "SEA", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 1, 2, 0, 2, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Ke'Shawn", "Vaughn", "TB", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 4, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Ricard", "BAL", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Caleb", "Huntley", "ATL", Position.valueOf("RB"), 2022, 12, 0, 0, 0,
				0, 0, 1, 12, 0, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Marlon", "Mack", "DEN", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 2, 7, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Blackshear", "CAR", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Snoop", "Conner", "JAC", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 3, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 12, 0, 0,
				0, 0, 0, 3, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mark", "Ingram", "NO", Position.valueOf("RB"), 2022, 12, 0, 0, 0, 0,
				0, 4, 10, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 1, -1, 0, 8, 5, 95, 2);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 12, 0, 0,
				0, 0, 0, 0, 0, 0, 11, 9, 139, 1);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 12, 0, 0,
				0, 0, 0, 1, 7, 0, 10, 9, 122, 1);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 7, 114, 1);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 12, 110, 1);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 110, 1);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 2, 7, 0, 10, 6, 96, 1);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 4, 103, 1);
		playerService.insertPlayerWithStatistics("DeAndre", "Hopkins", "ARI", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 87, 1);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 14, 11, 145, 0);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 15, 8, 77, 1);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 7, 73, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 3, 68, 1);
		playerService.insertPlayerWithStatistics("Nelson", "Agholor", "NE", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 65, 1);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 63, 1);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 12, 0, 0,
				0, 0, 0, 0, 0, 0, 11, 7, 61, 1);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 9, 61, 1);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 1, -4, 0, 2, 2, 64, 1);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 2, 11, 0, 11, 6, 106, 0);
		playerService.insertPlayerWithStatistics("Keenan", "Allen", "LAC", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 49, 1);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 6, 49, 1);
		playerService.insertPlayerWithStatistics("Anthony", "Schwartz", "CLE", Position.valueOf("WR"), 2022, 12, 0, 0,
				0, 0, 0, 1, 31, 1, 2, 1, 17, 0);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 4, 46, 1);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 41, 1);
		playerService.insertPlayerWithStatistics("Jamal", "Agnew", "JAC", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 37, 1);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 35, 1);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 7, 94, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 12, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 5, 91, 0);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 1, 5, 0, 9, 6, 85, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 15, 11, 90, 0);
		playerService.insertPlayerWithStatistics("Van", "Jefferson", "LAR", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 29, 1);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 5, 85, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 22, 1);
		playerService.insertPlayerWithStatistics("DeVante", "Parker", "NE", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 80, 0);
		playerService.insertPlayerWithStatistics("Randall", "Cobb", "GB", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 19, 1);
		playerService.insertPlayerWithStatistics("DJ", "Chark", "DET", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 2, 16, 1);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 12, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 6, 75, 0);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 74, 0);
		playerService.insertPlayerWithStatistics("DeSean", "Jackson", "BAL", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 74, 0);
		playerService.insertPlayerWithStatistics("Byron", "Pringle", "CHI", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 12, 1);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 70, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Johnson", "DEN", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 10, 1);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 65, 0);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 63, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 63, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 62, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 5, 62, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 1, 2, 0, 5, 5, 59, 0);
		playerService.insertPlayerWithStatistics("Rashid", "Shaheed", "NO", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 1, 6, 0, 3, 2, 53, 0);
		playerService.insertPlayerWithStatistics("Nick", "Westbrook-Ikhine", "TEN", Position.valueOf("WR"), 2022, 12, 0,
				0, 0, 0, 0, 0, 0, 0, 6, 4, 58, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 57, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 56, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 12,
				0, 0, 0, 0, 0, 0, 0, 0, 5, 4, 56, 0);
		playerService.insertPlayerWithStatistics("River", "Cracraft", "MIA", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 55, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Goodwin", "SEA", Position.valueOf("WR"), 2022, 12, 0, 0,
				0, 0, 0, 1, 7, 0, 3, 3, 48, 0);
		playerService.insertPlayerWithStatistics("Julio", "Jones", "TB", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 1, 15, 0, 4, 3, 40, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 1, 5, 0, 6, 4, 48, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "CHI", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 2, 51, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 4, 50, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 49, 0);
		playerService.insertPlayerWithStatistics("Kendall", "Hinton", "DEN", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 1, 13, 0, 9, 5, 35, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 46, 0);
		playerService.insertPlayerWithStatistics("Nico", "Collins", "HOU", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 44, 0);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 2, 0, 0, 7, 3, 43, 0);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 1, -5, 0, 9, 4, 46, 0);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 2, 16, 0, 5, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 38, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 12, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 3, 38, 0);
		playerService.insertPlayerWithStatistics("Skyy", "Moore", "KC", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 36, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 35, 0);
		playerService.insertPlayerWithStatistics("Trent", "Sherfield", "MIA", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 2, 33, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 2, 31, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Hodgins", "NYG", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 1, -7, 0, 4, 3, 36, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 29, 0);
		playerService.insertPlayerWithStatistics("Justin", "Watson", "KC", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 26, 0);
		playerService.insertPlayerWithStatistics("Cedrick", "Wilson", "MIA", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 26, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Reagor", "MIN", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 25, 0);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Tutu", "Atwell", "LAR", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 23, 0);
		playerService.insertPlayerWithStatistics("David", "Bell", "CLE", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 23, 0);
		playerService.insertPlayerWithStatistics("Laviska", "Shenault", "CAR", Position.valueOf("WR"), 2022, 12, 0, 0,
				0, 0, 0, 1, 2, 0, 2, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Jarvis", "Landry", "NO", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Chosen", "Anderson", "ARI", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Dyami", "Brown", "WAS", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 12, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Trenton", "Irwin", "CIN", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 12, 0,
				0, 0, 0, 0, 0, 0, 0, 4, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Braxton", "Berrios", "NYJ", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 2, 9, 0, 1, 1, 4, 0);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0, 0,
				1, 5, 0, 2, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 4, 13, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Keelan", "Cole", "LV", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Denzel", "Mims", "NYJ", Position.valueOf("WR"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 31, 2);
		playerService.insertPlayerWithStatistics("Josh", "Oliver", "BAL", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 76, 1);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 63, 1);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 61, 1);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 57, 1);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "MIN", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 43, 1);
		playerService.insertPlayerWithStatistics("Jelani", "Woods", "IND", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 8, 98, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 33, 1);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 29, 1);
		playerService.insertPlayerWithStatistics("John", "Bates", "WAS", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 24, 1);
		playerService.insertPlayerWithStatistics("MyCole", "Pruitt", "ATL", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 9, 1);
		playerService.insertPlayerWithStatistics("Ko", "Kieft", "TB", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 5, 1);
		playerService.insertPlayerWithStatistics("Durham", "Smythe", "MIA", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 4, 1);
		playerService.insertPlayerWithStatistics("Peyton", "Hendershot", "DAL", Position.valueOf("TE"), 2022, 12, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jake", "Ferguson", "DAL", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 57, 0);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 57, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 50, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 50, 0);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 39, 0);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 12, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 3, 35, 0);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 34, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 30, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Jody", "Fortson", "KC", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 26, 0);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 26, 0);
		playerService.insertPlayerWithStatistics("Chris", "Myarick", "NYG", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 23, 0);
		playerService.insertPlayerWithStatistics("James", "Mitchell", "DET", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 22, 0);
		playerService.insertPlayerWithStatistics("Ian", "Thomas", "CAR", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Lawrence", "Cager", "NYG", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Johnny", "Mundt", "MIN", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Teagan", "Quitoriano", "HOU", Position.valueOf("TE"), 2022, 12, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 18, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Adam", "Trautman", "NO", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("CJ", "Uzomah", "NYJ", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 17, 0);
		playerService.insertPlayerWithStatistics("Anthony", "Firkser", "ATL", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Cameron", "Brate", "TB", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Mo", "Alie-Cox", "IND", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Brycen", "Hopkins", "LAR", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dulcich", "DEN", Position.valueOf("TE"), 2022, 12, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Tanner", "Hudson", "NYG", Position.valueOf("TE"), 2022, 12, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 10, 0);

	}

	private void insertStatisticsWeek13() throws StatisticsException {
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 13, 29, 39, 380,
				3, 0, 5, 12, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 13, 25, 31, 286,
				2, 0, 11, 46, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 13, 28, 39, 367,
				3, 1, 2, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 13, 20, 25,
				254, 0, 2, 6, 71, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "White", "NYJ", Position.valueOf("QB"), 2022, 13, 31, 57, 369,
				0, 2, 3, 7, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 13, 31, 41, 340,
				2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 13, 18, 33,
				295, 2, 2, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Taylor", "Heinicke", "WAS", Position.valueOf("QB"), 2022, 13, 27, 41,
				275, 2, 0, 2, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 13, 16, 27,
				223, 1, 0, 2, 9, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 13, 36, 54, 281, 2,
				1, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 13, 28, 47,
				335, 1, 0, 5, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 13, 22, 33, 223,
				2, 0, 8, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 13, 25, 31,
				200, 1, 0, 12, 71, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 13, 16, 30, 250,
				2, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 13, 20, 30,
				170, 3, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Huntley", "BAL", Position.valueOf("QB"), 2022, 13, 27, 32,
				187, 0, 1, 10, 41, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 13, 21, 37, 233,
				2, 3, 3, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brock", "Purdy", "SF", Position.valueOf("QB"), 2022, 13, 25, 37, 210,
				2, 1, 4, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 13, 17, 31,
				179, 1, 0, 4, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 13, 20, 28, 229,
				1, 0, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 13, 16, 28,
				197, 1, 0, 7, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 13, 22, 36, 195, 1,
				0, 3, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 13, 14, 22,
				141, 1, 0, 3, 34, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Allen", "HOU", Position.valueOf("QB"), 2022, 13, 20, 39, 201,
				1, 2, 2, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Mariota", "ATL", Position.valueOf("QB"), 2022, 13, 13, 24,
				167, 1, 1, 3, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 13, 21, 35,
				173, 1, 0, 3, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 13, 18, 31,
				182, 1, 0, 3, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("John", "Wolford", "LAR", Position.valueOf("QB"), 2022, 13, 14, 26,
				178, 0, 2, 5, 29, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 13, 17, 22,
				189, 0, 0, 2, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Deshaun", "Watson", "CLE", Position.valueOf("QB"), 2022, 13, 12, 22,
				131, 0, 1, 7, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jimmy", "Garoppolo", "SF", Position.valueOf("QB"), 2022, 13, 2, 4, 56,
				0, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Malik", "Willis", "TEN", Position.valueOf("QB"), 2022, 13, 2, 4, 16,
				0, 0, 1, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Lamar", "Jackson", "BAL", Position.valueOf("QB"), 2022, 13, 3, 4, 11,
				0, 0, 1, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 12, 91, 2, 3, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 26, 144, 1, 2, 2, 6, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 13, 0, 0,
				0, 0, 0, 17, 66, 0, 10, 8, 80, 1);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0, 0,
				17, 60, 2, 1, 1, 0, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0, 0,
				18, 93, 1, 3, 3, 26, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 14, 62, 1, 6, 4, 49, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 21, 106, 0, 7, 6, 49, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 17, 77, 1, 3, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 20, 86, 1, 3, 2, -3, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 14, 66, 1, 2, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 18, 63, 1, 5, 5, 18, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 9, 28, 0, 8, 6, 41, 1);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 13, 0, 0,
				0, 0, 0, 14, 61, 1, 5, 4, 6, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 8, 51, 0, 2, 2, 9, 1);
		playerService.insertPlayerWithStatistics("Zonovan", "Knight", "NYJ", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 15, 90, 0, 5, 5, 28, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 13, 0, 0,
				0, 0, 0, 21, 96, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 13, 0, 0,
				0, 0, 0, 13, 51, 1, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 14, 64, 0, 6, 6, 41, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 21, 82, 0, 4, 3, 21, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 10, 35, 0, 6, 5, 67, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 10, 24, 1, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 18, 73, 0, 3, 3, 22, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 11, 35, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 17, 86, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Malik", "Davis", "DAL", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 3, 29, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 13, 0, 0,
				0, 0, 0, 10, 49, 0, 7, 6, 32, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 17, 80, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 13, 0, 0,
				0, 0, 0, 3, 14, 1, 2, 2, 4, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 13, 0, 0,
				0, 0, 0, 10, 54, 0, 8, 6, 24, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 9, 56, 0, 3, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Juszczyk", "SF", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 1, 0, 0, 3, 3, 12, 1);
		playerService.insertPlayerWithStatistics("Chris", "Evans", "CIN", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 8, 1);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 13, 54, 0, 3, 3, 12, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 17, 47, 0, 4, 4, 14, 0);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 13, 0,
				0, 0, 0, 0, 11, 60, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 9, 39, 0, 4, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 13, 0, 0,
				0, 0, 0, 3, 15, 0, 4, 3, 38, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 10, 52, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Mason", "SF", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 8, 51, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 9, 26, 0, 5, 5, 24, 0);
		playerService.insertPlayerWithStatistics("Mark", "Ingram", "NO", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 7, 27, 0, 5, 5, 22, 0);
		playerService.insertPlayerWithStatistics("Kenyan", "Drake", "BAL", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 7, 29, 0, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Ty", "Johnson", "NYJ", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 1, 3, 0, 7, 6, 38, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 11, 30, 0, 3, 2, 8, 0);
		playerService.insertPlayerWithStatistics("DeeJay", "Dallas", "SEA", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 10, 37, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 12, 26, 0, 3, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 3, 36, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Benny", "Snell", "PIT", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 6, 24, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Tony", "Jones", "SEA", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 7, 14, 0, 4, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 7, 30, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 7, 30, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "Boone", "DEN", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 6, 18, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jackson", "DET", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 1, 4, 0, 5, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Darrynton", "Evans", "CHI", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 3, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dare", "Ogunbowale", "HOU", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 2, 8, 0, 3, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Boston", "Scott", "PHI", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 6, 16, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 1, 5, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Nyheim", "Hines", "BUF", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 2, -3, 0, 2, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Zack", "Moss", "IND", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0, 0,
				3, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Caleb", "Huntley", "ATL", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 4, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dontrell", "Hilliard", "TEN", Position.valueOf("RB"), 2022, 13, 0, 0,
				0, 0, 0, 1, 2, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Alec", "Ingold", "MIA", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 15, 0);
		playerService.insertPlayerWithStatistics("Julius", "Chestnut", "TEN", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 5, 13, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Gus", "Edwards", "BAL", Position.valueOf("RB"), 2022, 13, 0, 0, 0, 0,
				0, 6, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("James", "Robinson", "NYJ", Position.valueOf("RB"), 2022, 13, 0, 0, 0,
				0, 0, 4, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 8, 177, 2);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 8, 119, 2);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 13, 0, 0,
				0, 0, 0, 1, 2, 0, 12, 11, 114, 2);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 1, 46, 1, 7, 3, 48, 1);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 14, 9, 146, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 9, 128, 1);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 8, 127, 1);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 12, 8, 105, 1);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 102, 1);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 15, 8, 162, 0);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 2, 23, 0, 7, 5, 71, 1);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 7, 92, 1);
		playerService.insertPlayerWithStatistics("Keenan", "Allen", "LAC", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 14, 6, 88, 1);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 86, 1);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 23, 2);
		playerService.insertPlayerWithStatistics("Trent", "Sherfield", "MIA", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 75, 1);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 13, 0, 0,
				0, 0, 0, 2, 11, 0, 11, 7, 45, 1);
		playerService.insertPlayerWithStatistics("Jahan", "Dotson", "WAS", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 5, 54, 1);
		playerService.insertPlayerWithStatistics("Isaiah", "Hodgins", "NYG", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 44, 1);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 104, 0);
		playerService.insertPlayerWithStatistics("DJ", "Chark", "DET", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 98, 0);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 7, 97, 0);
		playerService.insertPlayerWithStatistics("Nico", "Collins", "HOU", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 3, 35, 1);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 35, 1);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 6, 95, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 90, 0);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 3, 23, 0, 7, 6, 63, 0);
		playerService.insertPlayerWithStatistics("Equanimeous", "St Brown", "CHI", Position.valueOf("WR"), 2022, 13, 0,
				0, 0, 0, 0, 1, 1, 0, 4, 3, 85, 0);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 25, 1);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 5, 85, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Powell", "LAR", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 3, 45, 0, 4, 4, 39, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 2, 15, 1);
		playerService.insertPlayerWithStatistics("Rashid", "Shaheed", "NO", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 1, 0, 0, 4, 4, 75, 0);
		playerService.insertPlayerWithStatistics("Ashton", "Dulin", "IND", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 14, 1);
		playerService.insertPlayerWithStatistics("Tutu", "Atwell", "LAR", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 4, 23, 0, 5, 2, 48, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 13,
				0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 71, 0);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 67, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 65, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 65, 0);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 8, 63, 0);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 4, 5, 0, 10, 6, 58, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 60, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 5, 60, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 60, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 4, 59, 0);
		playerService.insertPlayerWithStatistics("N'Keal", "Harry", "CHI", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 49, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 5, 46, 0);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 46, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Reagor", "MIN", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 1, 8, 0, 1, 1, 38, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 1, 2, 0, 5, 4, 43, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 5, 44, 0);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 13, 0,
				0, 0, 0, 0, 0, 0, 0, 3, 3, 44, 0);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 2, 9, 0, 6, 6, 34, 0);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 13, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 7, 41, 0);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 4, 40, 0);
		playerService.insertPlayerWithStatistics("Van", "Jefferson", "LAR", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 39, 0);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 37, 0);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 5, 35, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 13, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 3, 35, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 34, 0);
		playerService.insertPlayerWithStatistics("Tyquan", "Thornton", "NE", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 31, 0);
		playerService.insertPlayerWithStatistics("Ben", "Skowronek", "LAR", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 30, 0);
		playerService.insertPlayerWithStatistics("River", "Cracraft", "MIA", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 29, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "CHI", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 28, 0);
		playerService.insertPlayerWithStatistics("Julio", "Jones", "TB", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 22, 0);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Josh", "Reynolds", "DET", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Steven", "Sims", "PIT", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 3, 19, 0, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Phillip", "Dorsett", "HOU", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Anthony", "Schwartz", "CLE", Position.valueOf("WR"), 2022, 13, 0, 0,
				0, 0, 0, 1, 6, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Nelson", "Agholor", "NE", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Goodwin", "SEA", Position.valueOf("WR"), 2022, 13, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 1, 10, 0, 6, 2, 7, 0);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 2, 16, 0);
		playerService.insertPlayerWithStatistics("DeVante", "Parker", "NE", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Zach", "Pascal", "PHI", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 13, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Michael", "Bandy", "LAC", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Justin", "Watson", "KC", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Jarvis", "Landry", "NO", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 13, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Damiere", "Byrd", "ATL", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Trenton", "Irwin", "CIN", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Skyy", "Moore", "KC", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0, 0,
				1, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Kendall", "Hinton", "DEN", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("DeSean", "Jackson", "BAL", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Shakir", "BUF", Position.valueOf("WR"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 35, 1);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 42, 1);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 30, 1);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 6, 28, 1);
		playerService.insertPlayerWithStatistics("Greg", "Dulcich", "DEN", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 85, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 80, 0);
		playerService.insertPlayerWithStatistics("Connor", "Heyward", "PIT", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 17, 1);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 76, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 6, 72, 0);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 13, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 4, 68, 0);
		playerService.insertPlayerWithStatistics("MyCole", "Pruitt", "ATL", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 7, 1);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 56, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 53, 0);
		playerService.insertPlayerWithStatistics("Brevin", "Jordan", "HOU", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 46, 0);
		playerService.insertPlayerWithStatistics("Jack", "Stoll", "PHI", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 41, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "MIN", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 33, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 2, 33, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 32, 0);
		playerService.insertPlayerWithStatistics("CJ", "Uzomah", "NYJ", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 31, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Likely", "BAL", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 30, 0);
		playerService.insertPlayerWithStatistics("Adam", "Trautman", "NO", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Jelani", "Woods", "IND", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Brock", "Wright", "DET", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 25, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Bellinger", "NYG", Position.valueOf("TE"), 2022, 13, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 5, 24, 0);
		playerService.insertPlayerWithStatistics("Anthony", "Firkser", "ATL", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 22, 0);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 21, 0);
		playerService.insertPlayerWithStatistics("Durham", "Smythe", "MIA", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Logan", "Thomas", "WAS", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Grant", "Calcaterra", "PHI", Position.valueOf("TE"), 2022, 13, 0, 0,
				0, 0, 0, 0, 0, 0, 1, 1, 19, 0);
		playerService.insertPlayerWithStatistics("Kylen", "Granson", "IND", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 19, 0);
		playerService.insertPlayerWithStatistics("Parker", "Hesse", "ATL", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Harrison", "Bryant", "CLE", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Kroft", "SF", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Wilcox", "CIN", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Ko", "Kieft", "TB", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Johnny", "Mundt", "MIN", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Colby", "Parkinson", "SEA", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Pharaoh", "Brown", "CLE", Position.valueOf("TE"), 2022, 13, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 13, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 10, 0);
	}

	private void insertStatisticsWeek14() throws StatisticsException {
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 14, 30, 42,
				368, 3, 0, 3, 7, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 14, 21, 31, 217,
				2, 0, 7, 77, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 14, 23, 36,
				247, 3, 1, 4, 57, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 14, 27, 39, 330,
				3, 0, 2, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 14, 28, 42,
				352, 3, 3, 3, -3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 14, 31, 41,
				425, 2, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 14, 21, 36, 264,
				3, 2, 3, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brock", "Purdy", "SF", Position.valueOf("QB"), 2022, 14, 16, 21, 185,
				2, 0, 2, 3, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 14, 39, 51,
				367, 1, 0, 4, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 14, 25, 38,
				254, 2, 1, 2, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 14, 16, 27, 147,
				1, 0, 10, 47, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Deshaun", "Watson", "CLE", Position.valueOf("QB"), 2022, 14, 26, 42,
				276, 1, 1, 6, 33, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 14, 18, 27,
				169, 1, 0, 4, 26, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 14, 18, 33, 239,
				2, 1, 6, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 14, 24, 39,
				284, 1, 2, 6, 23, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Trubisky", "PIT", Position.valueOf("QB"), 2022, 14, 22,
				30, 276, 1, 3, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 14, 34, 55, 253, 1,
				2, 2, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "LAR", Position.valueOf("QB"), 2022, 14, 22, 35,
				230, 1, 0, 4, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Colt", "McCoy", "ARI", Position.valueOf("QB"), 2022, 14, 27, 40, 246,
				0, 1, 5, 24, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 14, 10, 28,
				145, 1, 0, 3, 28, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "White", "NYJ", Position.valueOf("QB"), 2022, 14, 27, 44, 268,
				0, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Darnold", "CAR", Position.valueOf("QB"), 2022, 14, 14, 24, 120,
				1, 0, 4, 30, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 14, 24, 35, 235, 0,
				1, 5, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyrod", "Taylor", "NYG", Position.valueOf("QB"), 2022, 14, 5, 5, 47,
				1, 0, 2, 40, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Driskel", "HOU", Position.valueOf("QB"), 2022, 14, 4, 6, 38,
				1, 0, 7, 36, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 14, 16, 21, 175,
				0, 1, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 14, 11, 20, 137,
				0, 2, 4, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Huntley", "BAL", Position.valueOf("QB"), 2022, 14, 8, 12, 88,
				0, 0, 9, 31, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brett", "Rypien", "DEN", Position.valueOf("QB"), 2022, 14, 4, 8, 16,
				1, 1, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 14, 0, 1, 0,
				0, 0, 2, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 17, 144, 2, 3, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 14, 0, 0,
				0, 0, 0, 14, 119, 1, 3, 2, 34, 1);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 6, 22, 0, 9, 7, 112, 2);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 17, 121, 1, 5, 3, 34, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 10, 42, 1, 5, 4, 20, 1);
		playerService.insertPlayerWithStatistics("JK", "Dobbins", "BAL", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 15, 120, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 15, 85, 1, 7, 6, 29, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 27, 99, 1, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 15, 45, 1, 8, 8, 59, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 14, 74, 1, 3, 3, 25, 0);
		playerService.insertPlayerWithStatistics("Pierre", "Strong Jr", "NE", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 5, 70, 1, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 15, 62, 1, 5, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Dameon", "Pierce", "HOU", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 22, 78, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zonovan", "Knight", "NYJ", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 17, 71, 1, 2, 2, 6, 0);
		playerService.insertPlayerWithStatistics("Marlon", "Mack", "DEN", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 3, 15, 0, 3, 2, 62, 1);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 12, 33, 1, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Blackshear", "CAR", Position.valueOf("RB"), 2022, 14, 0, 0,
				0, 0, 0, 4, 32, 1, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0, 0,
				14, 96, 0, 2, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0, 0,
				12, 42, 1, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Boston", "Scott", "PHI", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 6, 33, 1, 1, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 15, 23, 1, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 13, 70, 0, 3, 3, 23, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jackson", "DET", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 4, 19, 1, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Kevin", "Harris", "NE", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 8, 26, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 4, 22, 1, 5, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 13, 56, 0, 5, 5, 21, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 21, 74, 0, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Gus", "Edwards", "BAL", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 13, 66, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Mason", "SF", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 11, 56, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 14, 34, 0, 3, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 9, 28, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 14, 0, 0,
				0, 0, 0, 4, 13, 0, 7, 6, 33, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 11, 37, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 14, 0, 0,
				0, 0, 0, 8, 39, 0, 2, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Gary", "Brightwell", "NYG", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 5, 23, 0, 3, 2, 18, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 6, 21, 0, 4, 3, 18, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 16, 37, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 4, 29, 0, 2, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Travis", "Homer", "SEA", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 9, 26, 0, 3, 2, 8, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 17, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 8, 32, 0, 5, 3, -1, 0);
		playerService.insertPlayerWithStatistics("Mike", "Boone", "DEN", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 3, 2, 0, 2, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Kyren", "Williams", "LAR", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 3, 19, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 3, 11, 0, 3, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "MIA", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 4, 26, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Corey", "Clement", "ARI", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 5, 5, 0, 6, 3, 15, 0);
		playerService.insertPlayerWithStatistics("Ameer", "Abdullah", "LV", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Malcolm", "Brown", "LAR", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 1, 5, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 3, 6, 0, 4, 2, 9, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 4, 6, 0, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("JaMycal", "Hasty", "JAC", Position.valueOf("RB"), 2022, 14, 0, 0, 0,
				0, 0, 4, 13, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 14, 0, 0, 0, 0,
				0, 4, 6, 0, 4, 2, 6, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 14, 0, 0,
				0, 0, 0, 3, 8, 0, 3, 2, 2, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 8, 73, 3);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 14, 0, 0,
				0, 0, 0, 0, 0, 0, 15, 11, 223, 0);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 1, 6, 0, 15, 10, 119, 1);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 6, 116, 1);
		playerService.insertPlayerWithStatistics("DJ", "Chark", "DET", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 6, 94, 1);
		playerService.insertPlayerWithStatistics("Marquise", "Goodwin", "SEA", Position.valueOf("WR"), 2022, 14, 0, 0,
				0, 0, 0, 1, -2, 0, 6, 5, 95, 1);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 4, 81, 1);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0, 0,
				0, 0, 0, 12, 8, 77, 1);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 14, 0, 0,
				0, 0, 0, 0, 0, 0, 11, 9, 74, 1);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 5, 71, 1);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 4, 70, 1);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 65, 1);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 10, 124, 0);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 4, 21, 1, 5, 4, 43, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 64, 1);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 7, 61, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 5, 60, 1);
		playerService.insertPlayerWithStatistics("Amari", "Rodgers", "HOU", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 1, 3, 0, 5, 4, 57, 1);
		playerService.insertPlayerWithStatistics("Trenton", "Irwin", "CIN", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 58, 1);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 57, 1);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 14, 0,
				0, 0, 0, 0, 0, 0, 0, 12, 8, 114, 0);
		playerService.insertPlayerWithStatistics("Josh", "Reynolds", "DET", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 51, 1);
		playerService.insertPlayerWithStatistics("Van", "Jefferson", "LAR", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 44, 1);
		playerService.insertPlayerWithStatistics("Jameson", "Williams", "DET", Position.valueOf("WR"), 2022, 14, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 1, 41, 1);
		playerService.insertPlayerWithStatistics("Isaiah", "Hodgins", "NYG", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 38, 1);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 5, 38, 1);
		playerService.insertPlayerWithStatistics("Keenan", "Allen", "LAC", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 14, 12, 92, 0);
		playerService.insertPlayerWithStatistics("Ben", "Skowronek", "LAR", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 7, 89, 0);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 85, 0);
		playerService.insertPlayerWithStatistics("Nick", "Westbrook-Ikhine", "TEN", Position.valueOf("WR"), 2022, 14, 0,
				0, 0, 0, 0, 0, 0, 0, 8, 3, 23, 1);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 82, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Hopkins", "ARI", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 7, 79, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 78, 0);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 6, 78, 0);
		playerService.insertPlayerWithStatistics("Shi", "Smith", "CAR", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 17, 1);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 14, 0, 0,
				0, 0, 0, 1, 6, 0, 9, 6, 68, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 12, 1);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 71, 0);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 3, 40, 0, 4, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 6, 60, 0);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 5, 54, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 53, 0);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 14, 0, 0,
				0, 0, 0, 0, 0, 0, 6, 5, 52, 0);
		playerService.insertPlayerWithStatistics("Chosen", "Anderson", "ARI", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 50, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 49, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 5, 47, 0);
		playerService.insertPlayerWithStatistics("Tutu", "Atwell", "LAR", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 2, -5, 0, 9, 5, 50, 0);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 5, 45, 0);
		playerService.insertPlayerWithStatistics("Jamal", "Agnew", "JAC", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 1, 8, 0, 3, 3, 36, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 4, 44, 0);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 2, 42, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 42, 0);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 2, 40, 0);
		playerService.insertPlayerWithStatistics("Kendall", "Hinton", "DEN", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 38, 0);
		playerService.insertPlayerWithStatistics("Julio", "Jones", "TB", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 38, 0);
		playerService.insertPlayerWithStatistics("Laviska", "Shenault", "CAR", Position.valueOf("WR"), 2022, 14, 0, 0,
				0, 0, 0, 1, 7, 0, 4, 4, 31, 0);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 37, 0);
		playerService.insertPlayerWithStatistics("Denzel", "Mims", "NYJ", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 35, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 4, 34, 0);
		playerService.insertPlayerWithStatistics("DeSean", "Jackson", "BAL", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 34, 0);
		playerService.insertPlayerWithStatistics("Trent", "Taylor", "CIN", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 34, 0);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 33, 0);
		playerService.insertPlayerWithStatistics("Nelson", "Agholor", "NE", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 5, 32, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Steven", "Sims", "PIT", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 1, 1, 0, 4, 4, 30, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 31, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 1, 7, 0, 5, 3, 21, 0);
		playerService.insertPlayerWithStatistics("Tyquan", "Thornton", "NE", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 28, 0);
		playerService.insertPlayerWithStatistics("David", "Bell", "CLE", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Chris", "Conley", "TEN", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 27, 0);
		playerService.insertPlayerWithStatistics("Braxton", "Berrios", "NYJ", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 25, 0);
		playerService.insertPlayerWithStatistics("DeVante", "Parker", "NE", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 22, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 14,
				0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 19, 0);
		playerService.insertPlayerWithStatistics("Cedrick", "Wilson", "MIA", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Phillip", "Dorsett", "HOU", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 14, 0,
				0, 0, 0, 0, 0, 0, 0, 1, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 14, 0, 0, 0,
				0, 0, 3, 7, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Keelan", "Cole", "LV", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Danny", "Gray", "SF", Position.valueOf("WR"), 2022, 14, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 15, 11, 162, 2);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 7, 59, 1);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 14, 0, 0,
				0, 0, 0, 0, 0, 0, 6, 6, 45, 1);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 41, 1);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 33, 1);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 6, 87, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "MIN", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 77, 0);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 4, 71, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 70, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 5, 68, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 45, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dulcich", "DEN", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 3, 42, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 28, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 28, 0);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 28, 0);
		playerService.insertPlayerWithStatistics("Trey", "McBride", "ARI", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 28, 0);
		playerService.insertPlayerWithStatistics("Grant", "Calcaterra", "PHI", Position.valueOf("TE"), 2022, 14, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Chris", "Manhertz", "JAC", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Jack", "Stoll", "PHI", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Bellinger", "NYG", Position.valueOf("TE"), 2022, 14, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Shane", "Zylstra", "DET", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Connor", "Heyward", "PIT", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Cameron", "Brate", "TB", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Ko", "Kieft", "TB", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Ian", "Thomas", "CAR", Position.valueOf("TE"), 2022, 14, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Eric", "Tomlinson", "DEN", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Colby", "Parkinson", "SEA", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Wilcox", "CIN", Position.valueOf("TE"), 2022, 14, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 10, 0);

	}

	private void insertStatisticsWeek15() throws StatisticsException {
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 15, 22, 37, 315,
				0, 2, 17, 61, 3, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 15, 34, 54,
				460, 4, 2, 2, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 15, 25, 40, 304,
				4, 0, 10, 77, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 15, 36, 41,
				336, 2, 0, 5, 33, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 15, 27, 42,
				318, 4, 1, 3, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 15, 30, 44, 312, 3,
				2, 2, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 15, 27, 39, 200,
				4, 1, 3, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 15, 23, 30,
				256, 3, 2, 5, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 15, 14, 21,
				152, 2, 0, 15, 95, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zach", "Wilson", "NYJ", Position.valueOf("QB"), 2022, 15, 18, 35, 317,
				2, 1, 3, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 15, 20, 38, 231,
				3, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 15, 12, 24, 121,
				2, 0, 5, 21, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 15, 17, 30,
				234, 2, 0, 1, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Taylor", "Heinicke", "WAS", Position.valueOf("QB"), 2022, 15, 17, 29,
				249, 1, 0, 3, 33, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brock", "Purdy", "SF", Position.valueOf("QB"), 2022, 15, 17, 26, 217,
				2, 0, 4, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 15, 31, 44, 238,
				1, 0, 1, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 15, 23, 38, 252,
				1, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 15, 28, 42,
				313, 0, 2, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Trubisky", "PIT", Position.valueOf("QB"), 2022, 15, 17,
				22, 179, 0, 0, 6, 9, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 15, 11, 17, 151,
				2, 0, 2, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Darnold", "CAR", Position.valueOf("QB"), 2022, 15, 14, 23, 225,
				1, 0, 2, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 15, 22, 30,
				229, 1, 1, 3, -3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ryan", "Tannehill", "TEN", Position.valueOf("QB"), 2022, 15, 15, 22,
				165, 0, 1, 3, 1, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Deshaun", "Watson", "CLE", Position.valueOf("QB"), 2022, 15, 18, 28,
				161, 1, 0, 6, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brett", "Rypien", "DEN", Position.valueOf("QB"), 2022, 15, 21, 26,
				197, 1, 1, 2, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Matt", "Ryan", "IND", Position.valueOf("QB"), 2022, 15, 19, 33, 182,
				1, 0, 3, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 15, 21, 32,
				160, 0, 0, 10, 35, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "LAR", Position.valueOf("QB"), 2022, 15, 12, 21,
				111, 1, 1, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Desmond", "Ridder", "ATL", Position.valueOf("QB"), 2022, 15, 13, 26,
				97, 0, 0, 6, 38, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Huntley", "BAL", Position.valueOf("QB"), 2022, 15, 17, 30,
				138, 0, 1, 6, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 15, 13, 31, 112, 0,
				0, 4, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trace", "McSorley", "ARI", Position.valueOf("QB"), 2022, 15, 7, 15,
				95, 0, 2, 1, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Colt", "McCoy", "ARI", Position.valueOf("QB"), 2022, 15, 13, 21, 78,
				0, 1, 2, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Malik", "Willis", "TEN", Position.valueOf("QB"), 2022, 15, 3, 4, 20,
				0, 0, 1, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Driskel", "HOU", Position.valueOf("QB"), 2022, 15, 2, 4, 8, 0,
				0, 4, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 17, 95, 0, 4, 4, 95, 1);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 10, 52, 1, 8, 8, 70, 1);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 15, 0, 0,
				0, 0, 0, 19, 172, 1, 3, 2, -4, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 21, 104, 1, 4, 4, 59, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 15, 0, 0,
				0, 0, 0, 12, 53, 1, 3, 3, 38, 1);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 24, 130, 1, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 15, 0, 0,
				0, 0, 0, 26, 108, 1, 8, 6, 30, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 17, 139, 1, 1, 1, -3, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0, 0,
				11, 36, 2, 3, 3, 35, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 17, 90, 0, 5, 4, 36, 1);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 18, 87, 1, 8, 5, 33, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 17, 136, 0, 2, 1, 20, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 16, 63, 1, 5, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 24, 86, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 16, 58, 1, 2, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 12, 58, 1, 3, 2, 12, 0);
		playerService.insertPlayerWithStatistics("JK", "Dobbins", "BAL", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 13, 125, 0, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 19, 103, 0, 3, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Marlon", "Mack", "DEN", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 5, 37, 1, 4, 4, 26, 0);
		playerService.insertPlayerWithStatistics("Deon", "Jackson", "IND", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 13, 55, 0, 1, 1, 1, 1);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 15, 0,
				0, 0, 0, 0, 14, 52, 1, 3, 1, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 22, 93, 0, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 11, 38, 1, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 15, 0, 0,
				0, 0, 0, 12, 89, 0, 1, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 19, 75, 0, 5, 4, 31, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 21, 91, 0, 2, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Salvon", "Ahmed", "MIA", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 6, 43, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0, 0,
				12, 65, 0, 3, 3, 35, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 21, 99, 0, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 5, 34, 0, 3, 2, 5, 1);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 15, 86, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 10, 24, 1, 2, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Zack", "Moss", "IND", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0, 0,
				24, 81, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 12, 47, 0, 5, 4, 32, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 8, 52, 0, 9, 5, 23, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 15, 0, 0,
				0, 0, 0, 10, 44, 0, 4, 4, 30, 0);
		playerService.insertPlayerWithStatistics("Nyheim", "Hines", "BUF", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 10, 1);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 15, 0, 0,
				0, 0, 0, 13, 42, 0, 4, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 4, 10, 0, 3, 3, 57, 0);
		playerService.insertPlayerWithStatistics("CJ", "Ham", "MIN", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0, 0, 2,
				1, 1, 1, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Mason", "SF", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 4, 64, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Royce", "Freeman", "HOU", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 11, 51, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Gus", "Edwards", "BAL", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 7, 55, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0, 0,
				11, 21, 0, 6, 5, 33, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 11, 38, 0, 2, 1, 5, 0);
		playerService.insertPlayerWithStatistics("Pierre", "Strong", "NE", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 4, 25, 0, 3, 3, 12, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 13, 33, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 4, 15, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jackson", "DET", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 6, 16, 0, 2, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Travis", "Homer", "SEA", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 1, 5, 0, 4, 4, 25, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 11, 42, 0, 1, 1, -13, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 5, 21, 0, 4, 2, 6, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 4, 24, 0, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 7, 24, 0, 1, 1, 0, 0);
		playerService.insertPlayerWithStatistics("Zonovan", "Knight", "NYJ", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 13, 23, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kevin", "Harris", "NE", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 5, 19, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justice", "Hill", "BAL", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 1, 3, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Rex", "Burkhead", "HOU", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Hassan", "Haskins", "TEN", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 1, 8, 0, 2, 2, 7, 0);
		playerService.insertPlayerWithStatistics("JaMycal", "Hasty", "JAC", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 1, 13, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Taylor", "GB", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 4, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ameer", "Abdullah", "LV", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 15, 0, 0,
				0, 0, 0, 3, 5, 0, 2, 2, 9, 0);
		playerService.insertPlayerWithStatistics("Dare", "Ogunbowale", "HOU", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 8, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Taylor", "IND", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 2, 6, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("David", "Johnson", "NO", Position.valueOf("RB"), 2022, 15, 0, 0, 0, 0,
				0, 4, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Avery", "Williams", "ATL", Position.valueOf("RB"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 8, 6, 109, 3);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 16, 10, 157, 1);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 15, 0, 0,
				0, 0, 0, 0, 0, 0, 16, 12, 123, 1);
		playerService.insertPlayerWithStatistics("AJ", " Brown", "PHI", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 16, 9, 181, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 8, 59, 2);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 3, 114, 1);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 49, 2);
		playerService.insertPlayerWithStatistics("Jahan", "Dotson", "WAS", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 105, 1);
		playerService.insertPlayerWithStatistics("Rashid", "Shaheed", "NO", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 95, 1);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 8, 83, 1);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 73, 1);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 13, 9, 69, 1);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 1, 1, 0, 7, 7, 126, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 5, 126, 0);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 13, 7, 60, 1);
		playerService.insertPlayerWithStatistics("Keelan", "Cole", "LV", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 50, 1);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 41, 1);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 40, 1);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 1, 2, 0, 10, 10, 98, 0);
		playerService.insertPlayerWithStatistics("Byron", "Pringle", "CHI", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 39, 1);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 4, 98, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 35, 1);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 33, 1);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 6, 92, 0);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 15, 0,
				0, 0, 0, 0, 0, 0, 0, 4, 4, 31, 1);
		playerService.insertPlayerWithStatistics("Michael", "Pittman", "IND", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 2, 30, 0, 14, 10, 60, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 15, 0, 0,
				0, 0, 0, 0, 0, 0, 10, 10, 88, 0);
		playerService.insertPlayerWithStatistics("Keenan", "Allen", "LAC", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 8, 86, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 15,
				0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 26, 1);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 5, 83, 0);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 15, 0, 0,
				0, 0, 0, 1, 6, 0, 10, 7, 76, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 17, 1);
		playerService.insertPlayerWithStatistics("Jeff", "Smith", "NYJ", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 77, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 76, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 70, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 6, 70, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 7, 68, 0);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 4, 67, 0);
		playerService.insertPlayerWithStatistics("Jamal", "Agnew", "JAC", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 3, 52, 0, 3, 2, 12, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Hopkins", "ARI", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 7, 60, 0);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 58, 0);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 1, -3, 0, 9, 5, 60, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 56, 0);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 55, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 7, 55, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 1, 3, 0, 7, 4, 51, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 53, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 2, 53, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 53, 0);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 15, 0,
				0, 0, 0, 0, 0, 0, 0, 3, 3, 51, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 5, 49, 0);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 46, 0);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 5, 1, 0, 5, 3, 44, 0);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 42, 0);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 42, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Hodgins", "NYG", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 37, 0);
		playerService.insertPlayerWithStatistics("Randall", "Cobb", "GB", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 32, 0);
		playerService.insertPlayerWithStatistics("Van", "Jefferson", "LAR", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 32, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Ashton", "Dulin", "IND", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 1, 5, 0, 2, 2, 25, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Johnson", "DEN", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 30, 0);
		playerService.insertPlayerWithStatistics("Devin", "Duvernay", "BAL", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 29, 0);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 15, 0, 0,
				0, 0, 0, 0, 0, 0, 6, 6, 29, 0);
		playerService.insertPlayerWithStatistics("Steven", "Sims", "PIT", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 2, 19, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 4, 28, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, -20, 0, 6, 2, 47, 0);
		playerService.insertPlayerWithStatistics("Amari", "Rodgers", "HOU", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 26, 0);
		playerService.insertPlayerWithStatistics("Daylen", "Baldwin", "CLE", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 25, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Shi", "Smith", "CAR", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 1, 24, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 5, 23, 0);
		playerService.insertPlayerWithStatistics("Tyquan", "Thornton", "NE", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Cedrick", "Wilson", "MIA", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Equanimeous", "St Brown", "CHI", Position.valueOf("WR"), 2022, 15, 0,
				0, 0, 0, 0, 0, 0, 0, 1, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 4, 19, 0);
		playerService.insertPlayerWithStatistics("Chris", "Conley", "TEN", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 19, 0);
		playerService.insertPlayerWithStatistics("DJ", "Chark", "DET", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Deven", "Thompkins", "TB", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 1, 9, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Dyami", "Brown", "WAS", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 1, 15, 0, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Braxton", "Berrios", "NYJ", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Renfrow", "LV", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Nsimba", "Webster", "CHI", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Denzel", "Mims", "NYJ", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Skyy", "Moore", "KC", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0, 0,
				2, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Goodwin", "SEA", Position.valueOf("WR"), 2022, 15, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 15, 0, 0, 0, 0,
				0, 2, 4, 0, 6, 4, 6, 0);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 93, 2);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 67, 2);
		playerService.insertPlayerWithStatistics("CJ", "Uzomah", "NYJ", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 41, 2);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 98, 1);
		playerService.insertPlayerWithStatistics("Brock", "Wright", "DET", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 51, 1);
		playerService.insertPlayerWithStatistics("Darren", "Waller", "LV", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 48, 1);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 10, 105, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Wilcox", "CIN", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 34, 1);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 32, 1);
		playerService.insertPlayerWithStatistics("Eric", "Tomlinson", "DEN", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 28, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 27, 1);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 22, 1);
		playerService.insertPlayerWithStatistics("Peyton", "Hendershot", "DAL", Position.valueOf("TE"), 2022, 15, 0, 0,
				0, 0, 0, 0, 0, 0, 1, 1, 20, 1);
		playerService.insertPlayerWithStatistics("Quintin", "Morris", "BUF", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 14, 1);
		playerService.insertPlayerWithStatistics("Teagan", "Quitoriano", "HOU", Position.valueOf("TE"), 2022, 15, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 1, 8, 1);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 8, 62, 0);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 15, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 4, 54, 0);
		playerService.insertPlayerWithStatistics("Trey", "McBride", "ARI", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 55, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 42, 0);
		playerService.insertPlayerWithStatistics("Jelani", "Woods", "IND", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 36, 0);
		playerService.insertPlayerWithStatistics("Donald", "Parham", "LAC", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 35, 0);
		playerService.insertPlayerWithStatistics("Kylen", "Granson", "IND", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 34, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "MIN", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 33, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Kroft", "SF", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 28, 0);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 28, 0);
		playerService.insertPlayerWithStatistics("Cameron", "Brate", "TB", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 25, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 25, 0);
		playerService.insertPlayerWithStatistics("Jonnu", "Smith", "NE", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 20, 0);
		playerService.insertPlayerWithStatistics("MyCole", "Pruitt", "ATL", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Tommy", "Tremble", "CAR", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Likely", "BAL", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Nick", "Vannett", "NYG", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Marcedes", "Lewis", "GB", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Josh", "Oliver", "BAL", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 13, 0);
		playerService.insertPlayerWithStatistics("James", "Mitchell", "DET", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dulcich", "DEN", Position.valueOf("TE"), 2022, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Maxx", "Williams", "ARI", Position.valueOf("TE"), 2022, 15, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 11, 0);

	}

	private void insertStatisticsWeek16() throws StatisticsException {
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 16, 27, 35,
				347, 3, 1, 6, 41, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Gardner", "Minshew", "PHI", Position.valueOf("QB"), 2022, 16, 24, 40,
				355, 2, 2, 4, 5, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 16, 40, 52, 375,
				3, 2, 4, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 16, 25, 42, 355,
				3, 0, 3, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 16, 34, 48,
				299, 3, 0, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 16, 15, 26, 172,
				2, 2, 6, 41, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 16, 16, 28,
				224, 2, 0, 2, 8, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Darnold", "CAR", Position.valueOf("QB"), 2022, 16, 15, 22, 250,
				1, 0, 6, 19, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 16, 30, 42,
				334, 1, 1, 4, 34, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 16, 20, 31,
				229, 0, 0, 7, 51, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brock", "Purdy", "SF", Position.valueOf("QB"), 2022, 16, 15, 22, 234,
				2, 1, 1, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 16, 21, 33, 240, 2,
				0, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "LAR", Position.valueOf("QB"), 2022, 16, 24, 28,
				230, 2, 0, 2, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tua", "Tagovailoa", "MIA", Position.valueOf("QB"), 2022, 16, 16, 25,
				310, 1, 3, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 16, 32, 48, 281, 1,
				2, 2, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 16, 24, 38,
				238, 1, 1, 7, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 16, 26, 39,
				244, 1, 1, 3, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 16, 15, 27,
				214, 1, 3, 2, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 16, 25, 40, 215,
				1, 1, 3, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Taylor", "Heinicke", "WAS", Position.valueOf("QB"), 2022, 16, 13, 18,
				166, 2, 1, 2, -4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Malik", "Willis", "TEN", Position.valueOf("QB"), 2022, 16, 14, 23, 99,
				0, 2, 7, 43, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Deshaun", "Watson", "CLE", Position.valueOf("QB"), 2022, 16, 15, 31,
				135, 0, 1, 3, 24, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Derek", "Carr", "LV", Position.valueOf("QB"), 2022, 16, 16, 30, 174,
				1, 3, 3, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 16, 17, 28, 178,
				1, 1, 4, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Huntley", "BAL", Position.valueOf("QB"), 2022, 16, 9, 17,
				115, 1, 0, 11, 26, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trace", "McSorley", "ARI", Position.valueOf("QB"), 2022, 16, 24, 45,
				217, 0, 1, 7, 14, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 16, 24, 31,
				235, 0, 1, 5, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Desmond", "Ridder", "ATL", Position.valueOf("QB"), 2022, 16, 22, 33,
				218, 0, 0, 4, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 16, 15, 23,
				119, 1, 0, 7, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Carson", "Wentz", "WAS", Position.valueOf("QB"), 2022, 16, 12, 16,
				123, 1, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chris", "Streveler", "NYJ", Position.valueOf("QB"), 2022, 16, 10, 15,
				90, 0, 0, 9, 54, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Foles", "IND", Position.valueOf("QB"), 2022, 16, 17, 29, 143,
				0, 3, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zach", "Wilson", "NYJ", Position.valueOf("QB"), 2022, 16, 9, 18, 92,
				0, 1, 1, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 16, 8, 15, 92, 0,
				1, 1, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brett", "Rypien", "DEN", Position.valueOf("QB"), 2022, 16, 4, 8, 45,
				0, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Driskel", "HOU", Position.valueOf("QB"), 2022, 16, 3, 4, 40,
				0, 0, 2, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nathan", "Peterman", "CHI", Position.valueOf("QB"), 2022, 16, 3, 5,
				25, 0, 1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0, 0,
				23, 118, 3, 2, 2, 29, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 21, 165, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 18, 67, 2, 4, 4, 12, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 14, 84, 1, 10, 8, 49, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 23, 126, 1, 2, 2, 0, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 12, 106, 1, 3, 2, 19, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 15, 79, 1, 8, 7, 41, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 20, 76, 1, 4, 2, 34, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 11, 99, 1, 2, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 20, 72, 0, 10, 9, 90, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 12, 125, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 16, 55, 1, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 15, 46, 1, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 18, 74, 0, 5, 4, 43, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 7, 36, 0, 4, 4, 17, 1);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 22, 83, 0, 3, 3, 29, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0, 0,
				11, 36, 1, 3, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0, 0,
				16, 65, 0, 9, 7, 43, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 26, 107, 0, 2, 2, -2, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 24, 92, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "MIA", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 9, 37, 1, 2, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Gus", "Edwards", "BAL", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 11, 99, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 5, 7, 0, 3, 3, 31, 1);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 16, 53, 0, 9, 6, 42, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 14, 58, 0, 2, 1, 32, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 16, 62, 0, 4, 4, 22, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 9, 19, 0, 8, 6, 61, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 14, 64, 0, 4, 3, 13, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Blackshear", "CAR", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 3, 3, 1, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 21, 65, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Zack", "Moss", "IND", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0, 0,
				12, 65, 0, 1, 1, 5, 0);
		playerService.insertPlayerWithStatistics("JK", "Dobbins", "BAL", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 12, 59, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 4, 17, 0, 4, 4, 41, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 22, 58, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chase", "Edmonds", "DEN", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 6, 31, 0, 2, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Michael", "Carter", "NYJ", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 2, 6, 0, 5, 5, 44, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 15, 44, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 8, 45, 0, 3, 2, 4, 0);
		playerService.insertPlayerWithStatistics("DeeJay", "Dallas", "SEA", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 2, 10, 0, 6, 6, 32, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 9, 33, 0, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Williams", "WAS", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 3, 13, 0, 3, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 8, 34, 0, 3, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Royce", "Freeman", "HOU", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 16, 32, 0, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 6, 25, 0, 2, 2, 9, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 13, 30, 0, 5, 2, 3, 0);
		playerService.insertPlayerWithStatistics("Antonio", "Gibson", "WAS", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 5, 10, 0, 3, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 16, 0,
				0, 0, 0, 0, 8, 17, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Tyrion", "Davis-Price", "SF", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 9, 30, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 6, 23, 0, 2, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Avery", "Williams", "ATL", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 3, 16, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Dare", "Ogunbowale", "HOU", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 8, 28, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ameer", "Abdullah", "LV", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 27, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 4, 12, 0, 5, 1, 13, 0);
		playerService.insertPlayerWithStatistics("David", "Johnson", "NO", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 7, 16, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 7, 8, 0, 3, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Marlon", "Mack", "DEN", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 4, 22, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 4, 3, 0, 4, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Malcolm", "Brown", "LAR", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 2, 19, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("JaMycal", "Hasty", "JAC", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 3, 10, 0, 3, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Kyren", "Williams", "LAR", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 6, 18, 0, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Hassan", "Haskins", "TEN", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 16, 0, 0,
				0, 0, 0, 4, 17, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Taylor", "GB", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 7, 11, 0, 2, 2, 3, 0);
		playerService.insertPlayerWithStatistics("Zonovan", "Knight", "NYJ", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 6, -2, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Nyheim", "Hines", "BUF", Position.valueOf("RB"), 2022, 16, 0, 0, 0, 0,
				0, 1, 2, 0, 2, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Pierre", "Strong Jr", "NE", Position.valueOf("RB"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 10, 0);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 11, 10, 120, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 12, 8, 113, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 6, 5, 143, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 16, 0, 0,
				0, 0, 0, 16, 12, 133, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 9, 6, 100, 1, 1, 29, 0);
		playerService.insertPlayerWithStatistics("Tee", "Higgins", "CIN", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 9, 8, 128, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trenton", "Irwin", "CIN", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 4, 3, 45, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0, 0,
				7, 5, 83, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "Hodgins", "NYG", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 12, 8, 89, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 7, 6, 83, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 5, 4, 77, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jahan", "Dotson", "WAS", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 9, 6, 76, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 1, 0, 0, 0, 1, 71, 1);
		playerService.insertPlayerWithStatistics("Greg", "Dortch", "ARI", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 11, 10, 98, 0, 3, 25, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 10, 6, 117, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 5, 5, 57, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Curtis", "Samuel", "WAS", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 5, 5, 52, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("DJ", "Chark", "DET", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0, 0,
				5, 4, 108, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 6, 3, 45, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Keenan", "Allen", "LAC", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 14, 11, 104, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0, 0,
				8, 6, 103, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 6, 4, 103, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Renfrow", "LV", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 7, 4, 42, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 7, 4, 36, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 9, 7, 96, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 9, 4, 34, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 11, 8, 90, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 7, 5, 81, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 9, 7, 81, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 11, 8, 79, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 6, 4, 79, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 16, 0, 0,
				0, 0, 0, 13, 7, 76, 0, 1, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 4, 4, 76, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 10, 6, 72, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 5, 2, 11, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kadarius", "Toney", "KC", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 2, 1, 8, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 16, 0, 0,
				0, 0, 0, 1, 1, 6, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 6, 5, 65, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 7, 5, 64, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 1, 1, 56, 0, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 16, 0, 0,
				0, 0, 0, 7, 5, 64, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 10, 8, 63, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 11, 5, 61, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 6, 3, 57, 0, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 16, 0,
				0, 0, 0, 0, 3, 2, 55, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Laviska", "Shenault", "CAR", Position.valueOf("WR"), 2022, 16, 0, 0,
				0, 0, 0, 3, 3, 53, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("TY", "Hilton", "DAL", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0, 0,
				1, 1, 52, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Velus", "Jones Jr", "CHI", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 4, 2, 52, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 8, 6, 49, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Phillip", "Dorsett", "HOU", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 3, 3, 45, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Rashid", "Shaheed", "NO", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 5, 4, 41, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sammy", "Watkins", "BAL", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 1, 1, 40, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 16, 0, 0,
				0, 0, 0, 7, 4, 39, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Amari", "Rodgers", "HOU", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 2, 1, 37, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 6, 3, 36, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Byron", "Pringle", "CHI", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 2, 2, 34, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Reynolds", "DET", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 4, 2, 31, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 9, 4, 30, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 5, 4, 30, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0, 0,
				8, 3, 29, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 16, 0, 0,
				0, 0, 0, 4, 3, 27, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 2, 2, 26, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 6, 3, 22, 0, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 4, 3, 26, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Laquon", "Treadwell", "SEA", Position.valueOf("WR"), 2022, 16, 0, 0,
				0, 0, 0, 7, 3, 26, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 4, 2, 25, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trent", "Sherfield", "MIA", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 2, 2, 25, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Westbrook-Ikhine", "TEN", Position.valueOf("WR"), 2022, 16, 0,
				0, 0, 0, 0, 3, 2, 23, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 4, 3, 21, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 3, 2, 21, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 5, 2, 19, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Van", "Jefferson", "LAR", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 5, 3, 19, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 5, 1, 19, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("David", "Bell", "CLE", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 2, 1, 18, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 16, 0, 0,
				0, 0, 0, 7, 4, 18, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0, 0,
				4, 3, 17, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Shi", "Smith", "CAR", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0, 0,
				2, 1, 17, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 3, 2, 16, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 9, 2, 15, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 2, 0, 0, 0, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Damiere", "Byrd", "ATL", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 2, 1, 15, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 4, 3, 15, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 3, 2, 15, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Powell", "LAR", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 3, 3, 12, 0, 2, 3, 0);
		playerService.insertPlayerWithStatistics("Tutu", "Atwell", "LAR", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 2, 2, 14, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0,
				0, 7, 2, 14, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 16, 0, 0, 0, 0, 0,
				4, 1, 14, 0, 1, -3, 0);
		playerService.insertPlayerWithStatistics("Freddie", "Swain", "DEN", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 2, 1, 11, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DeSean", "Jackson", "BAL", Position.valueOf("WR"), 2022, 16, 0, 0, 0,
				0, 0, 2, 1, 10, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 120, 2);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "MIN", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 16, 13, 109, 2);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 9, 94, 2);
		playerService.insertPlayerWithStatistics("Shane", "Zylstra", "DET", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 26, 3);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 113, 0);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 113, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dulcich", "DEN", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 39, 1);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 38, 1);
		playerService.insertPlayerWithStatistics("Marcedes", "Lewis", "GB", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 32, 1);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 12, 1);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 67, 0);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 7, 66, 0);
		playerService.insertPlayerWithStatistics("Darren", "Waller", "LV", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 58, 0);
		playerService.insertPlayerWithStatistics("Brycen", "Hopkins", "LAR", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 57, 0);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 45, 0);
		playerService.insertPlayerWithStatistics("Colby", "Parkinson", "SEA", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 45, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 43, 0);
		playerService.insertPlayerWithStatistics("Jelani", "Woods", "IND", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 43, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 39, 0);
		playerService.insertPlayerWithStatistics("Logan", "Thomas", "WAS", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 35, 0);
		playerService.insertPlayerWithStatistics("Mitchell", "Wilcox", "CIN", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 6, 35, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 34, 0);
		playerService.insertPlayerWithStatistics("James", "Mitchell", "DET", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 31, 0);
		playerService.insertPlayerWithStatistics("CJ", "Uzomah", "NYJ", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 30, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Bellinger", "NYG", Position.valueOf("TE"), 2022, 16, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 27, 0);
		playerService.insertPlayerWithStatistics("Jake", "Ferguson", "DAL", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 24, 0);
		playerService.insertPlayerWithStatistics("Mike", "Gesicki", "MIA", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 24, 0);
		playerService.insertPlayerWithStatistics("Connor", "Heyward", "PIT", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brevin", "Jordan", "HOU", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Jonnu", "Smith", "NE", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 21, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Will", "Dissly", "SEA", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 19, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Tommy", "Tremble", "CAR", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Dan", "Arnold", "JAC", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Trey", "McBride", "ARI", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 17, 0);
		playerService.insertPlayerWithStatistics("Johnny", "Mundt", "MIN", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Reggie", "Gilliam", "BUF", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Ian", "Thomas", "CAR", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Brock", "Wright", "DET", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Anthony", "Firkser", "ATL", Position.valueOf("TE"), 2022, 16, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Tre'", "McKitty", "LAC", Position.valueOf("TE"), 2022, 16, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 16, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 1, 10, 0);

	}

	private void insertStatisticsWeek17() throws StatisticsException {
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 17, 34, 45, 432, 3,
				0, 3, 4, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Jones", "NYG", Position.valueOf("QB"), 2022, 17, 19, 24,
				177, 2, 0, 11, 91, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jarrett", "Stidham", "LV", Position.valueOf("QB"), 2022, 17, 23, 34,
				365, 3, 2, 7, 34, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Darnold", "CAR", Position.valueOf("QB"), 2022, 17, 23, 37, 341,
				3, 1, 5, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 17, 26, 38,
				222, 1, 1, 4, 27, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 17, 29, 42,
				328, 3, 1, 4, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 17, 21, 29, 255,
				3, 0, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Deshaun", "Watson", "CLE", Position.valueOf("QB"), 2022, 17, 9, 18,
				169, 3, 0, 8, 31, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 17, 29, 41,
				282, 2, 2, 3, 11, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brock", "Purdy", "SF", Position.valueOf("QB"), 2022, 17, 22, 35, 284,
				2, 1, 2, -3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Fields", "CHI", Position.valueOf("QB"), 2022, 17, 7, 21, 75,
				1, 1, 10, 132, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 17, 18, 29, 183,
				2, 0, 5, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 17, 21, 28,
				212, 2, 0, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 17, 20, 33, 204, 2,
				0, 3, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 17, 15, 24,
				159, 1, 0, 1, 2, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 17, 18, 31,
				205, 1, 3, 3, 37, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Gardner", "Minshew", "PHI", Position.valueOf("QB"), 2022, 17, 18, 32,
				274, 1, 1, 1, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Dobbs", "TEN", Position.valueOf("QB"), 2022, 17, 20, 39,
				232, 1, 1, 3, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("David", "Blough", "ARI", Position.valueOf("QB"), 2022, 17, 24, 40,
				222, 1, 0, 2, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Carson", "Wentz", "WAS", Position.valueOf("QB"), 2022, 17, 16, 28,
				143, 0, 3, 3, 7, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 17, 22, 40, 202,
				0, 0, 4, 33, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Huntley", "BAL", Position.valueOf("QB"), 2022, 17, 14, 21,
				130, 1, 1, 7, 24, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Teddy", "Bridgewater", "MIA", Position.valueOf("QB"), 2022, 17, 12,
				19, 161, 1, 1, 1, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 17, 15, 27,
				168, 1, 0, 5, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "White", "NYJ", Position.valueOf("QB"), 2022, 17, 23, 46, 240,
				0, 2, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 17, 18, 22, 205,
				0, 1, 2, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Skylar", "Thompson", "MIA", Position.valueOf("QB"), 2022, 17, 12, 21,
				104, 1, 1, 1, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Desmond", "Ridder", "ATL", Position.valueOf("QB"), 2022, 17, 19, 26,
				169, 0, 0, 4, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Ehlinger", "IND", Position.valueOf("QB"), 2022, 17, 9, 14, 60,
				1, 0, 1, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 17, 17, 21,
				152, 0, 1, 2, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "LAR", Position.valueOf("QB"), 2022, 17, 11, 19,
				132, 0, 0, 3, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Mullens", "MIN", Position.valueOf("QB"), 2022, 17, 4, 4, 57,
				1, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Foles", "IND", Position.valueOf("QB"), 2022, 17, 8, 13, 81, 0,
				1, 1, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("CJ", "Beathard", "JAC", Position.valueOf("QB"), 2022, 17, 5, 8, 29, 0,
				1, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chase", "Daniel", "LAC", Position.valueOf("QB"), 2022, 17, 3, 3, 27,
				0, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Driskel", "HOU", Position.valueOf("QB"), 2022, 17, 3, 4, 9, 0,
				0, 2, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 10, 122, 2, 4, 4, 39, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 17, 0, 0,
				0, 0, 0, 19, 121, 1, 9, 6, 72, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 11, 78, 1, 4, 4, 39, 1);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 22, 144, 1, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 9, 108, 1, 3, 3, 32, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 22, 111, 0, 3, 2, 12, 1);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 2, 4, 0, 6, 5, 52, 2);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 20, 83, 1, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 17, 69, 1, 5, 4, 26, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 9, 29, 0, 8, 8, 62, 1);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 17, 0,
				0, 0, 0, 0, 9, 42, 1, 8, 6, 42, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 23, 133, 0, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0, 0,
				19, 123, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 14, 104, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("JaMycal", "Hasty", "JAC", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 10, 33, 1, 6, 6, 23, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 14, 111, 0, 3, 2, 2, 0);
		playerService.insertPlayerWithStatistics("James", "Conner", "ARI", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 16, 79, 0, 3, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 9, 31, 1, 2, 2, 18, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0, 0,
				12, 41, 1, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DeeJay", "Dallas", "SEA", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 7, 43, 0, 4, 3, 55, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 12, 76, 0, 3, 3, 22, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 19, 37, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("JK", "Dobbins", "BAL", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 17, 93, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brian", "Robinson Jr", "WAS", Position.valueOf("RB"), 2022, 17, 0, 0,
				0, 0, 0, 24, 87, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Malcolm", "Brown", "LAR", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 1, 23, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 16, 73, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Snoop", "Conner", "JAC", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 5, 17, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "MIA", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 15, 45, 0, 7, 3, 31, 0);
		playerService.insertPlayerWithStatistics("Zack", "Moss", "IND", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0, 0,
				15, 74, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chase", "Edmonds", "DEN", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 7, 34, 0, 3, 3, 39, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Mason", "SF", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 2, 13, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 12, 56, 0, 6, 4, 16, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 9, 59, 0, 1, 1, 8, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 3, 12, 0, 3, 3, 53, 0);
		playerService.insertPlayerWithStatistics("Malik", "Davis", "DAL", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 10, 39, 0, 2, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 12, 61, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ty", "Johnson", "NYJ", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 8, 46, 0, 5, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Saquon", "Barkley", "NYG", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 12, 58, 0, 4, 2, -5, 0);
		playerService.insertPlayerWithStatistics("Hassan", "Haskins", "TEN", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 12, 40, 0, 3, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 17, 0, 0,
				0, 0, 0, 8, 42, 0, 4, 2, 9, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 9, 31, 0, 3, 3, 18, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 11, 22, 0, 5, 5, 26, 0);
		playerService.insertPlayerWithStatistics("Leonard", "Fournette", "TB", Position.valueOf("RB"), 2022, 17, 0, 0,
				0, 0, 0, 10, 28, 0, 4, 4, 19, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 9, 45, 0, 2, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 17, 0, 0,
				0, 0, 0, 8, 38, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 9, 27, 0, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Zonovan", "Knight", "NYJ", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 8, 27, 0, 3, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Royce", "Freeman", "HOU", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 7, 19, 0, 5, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Wilkins", "IND", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 6, 23, 0, 2, 2, 14, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 17, 0, 0,
				0, 0, 0, 6, 24, 0, 3, 2, 12, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 13, 35, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Williams", "WAS", Position.valueOf("RB"), 2022, 17, 0, 0,
				0, 0, 0, 9, 30, 0, 5, 3, 3, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Bolden", "LV", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 8, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Julius", "Chestnut", "TEN", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 4, -1, 0, 1, 1, 33, 0);
		playerService.insertPlayerWithStatistics("Corey", "Clement", "ARI", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 7, 32, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 5, 31, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Ward", "TEN", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 4, 26, 0, 1, 1, 4, 0);
		playerService.insertPlayerWithStatistics("Larry", "Rountree III", "LAC", Position.valueOf("RB"), 2022, 17, 0, 0,
				0, 0, 0, 10, 15, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Dare", "Ogunbowale", "HOU", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 7, 21, 0, 3, 2, 4, 0);
		playerService.insertPlayerWithStatistics("Eno", "Benjamin", "NO", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 2, 10, 0, 1, 1, 9, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 17, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Rex", "Burkhead", "HOU", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 10, 0);
		playerService.insertPlayerWithStatistics("Deon", "Jackson", "IND", Position.valueOf("RB"), 2022, 17, 0, 0, 0, 0,
				0, 3, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Taylor", "GB", Position.valueOf("RB"), 2022, 17, 0, 0, 0,
				0, 0, 5, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mike", "Evans", "TB", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 12, 10, 207, 3);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 7, 153, 2);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 105, 2);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 1, 16, 0, 12, 9, 101, 1);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 6, 117, 1);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 9, 4, 97, 1);
		playerService.insertPlayerWithStatistics("Jalen", "Nailor", "MIN", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 89, 1);
		playerService.insertPlayerWithStatistics("Richie", "James", "NYG", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 7, 76, 1);
		playerService.insertPlayerWithStatistics("Shi", "Smith", "CAR", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 4, 70, 1);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 9, 120, 0);
		playerService.insertPlayerWithStatistics("Tyquan", "Thornton", "NE", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 3, 60, 1);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 7, 59, 1);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 1, 2, 1, 7, 4, 55, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 13, 9, 115, 0);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 6, 49, 1);
		playerService.insertPlayerWithStatistics("Isaiah", "Hodgins", "NYG", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 42, 1);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 17, 0, 0,
				0, 0, 0, 0, 0, 0, 8, 6, 41, 1);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 14, 11, 100, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 5, 39, 1);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 7, 94, 0);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 1, 20, 0, 8, 4, 66, 0);
		playerService.insertPlayerWithStatistics("Rashid", "Shaheed", "NO", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 6, 79, 0);
		playerService.insertPlayerWithStatistics("Van", "Jefferson", "LAR", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 77, 0);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 17, 0,
				0, 0, 0, 0, 0, 0, 0, 3, 1, 13, 1);
		playerService.insertPlayerWithStatistics("Kadarius", "Toney", "KC", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 71, 0);
		playerService.insertPlayerWithStatistics("Keenan", "Allen", "LAC", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 1, 8, 0, 6, 5, 60, 0);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 17, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 4, 62, 0);
		playerService.insertPlayerWithStatistics("Marquise", "Brown", "ARI", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 6, 61, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 61, 0);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 59, 0);
		playerService.insertPlayerWithStatistics("DJ", "Chark", "DET", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 2, 56, 0);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 1, 1, 0, 6, 3, 52, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 52, 0);
		playerService.insertPlayerWithStatistics("TY", "Hilton", "DAL", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 50, 0);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 5, 47, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 46, 0);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 45, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 1, 4, 0, 3, 3, 40, 0);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 17, 0, 0,
				0, 0, 0, 0, 0, 0, 6, 4, 44, 0);
		playerService.insertPlayerWithStatistics("Ray-Ray", "McCloud", "SF", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 42, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 42, 0);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 40, 0);
		playerService.insertPlayerWithStatistics("Jameson", "Williams", "DET", Position.valueOf("WR"), 2022, 17, 0, 0,
				0, 0, 0, 1, 40, 0, 3, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 39, 0);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 39, 0);
		playerService.insertPlayerWithStatistics("Racey", "McMath", "TEN", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 39, 0);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 7, 38, 0);
		playerService.insertPlayerWithStatistics("Jahan", "Dotson", "WAS", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 37, 0);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 1, 12, 0, 5, 2, 25, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 2, 35, 0);
		playerService.insertPlayerWithStatistics("Steven", "Sims", "PIT", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 34, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Skyy", "Moore", "KC", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 33, 0);
		playerService.insertPlayerWithStatistics("Trent", "Sherfield", "MIA", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 2, 30, 0);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 29, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 17,
				0, 0, 0, 0, 0, 0, 0, 0, 7, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Justin", "Watson", "KC", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 27, 0);
		playerService.insertPlayerWithStatistics("Braxton", "Berrios", "NYJ", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 24, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Julio", "Jones", "TB", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 1, 13, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 21, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 17, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Randall", "Cobb", "GB", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Romeo", "Doubs", "GB", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Laviska", "Shenault", "CAR", Position.valueOf("WR"), 2022, 17, 0, 0,
				0, 0, 0, 1, 7, 0, 3, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Equanimeous", "St Brown", "CHI", Position.valueOf("WR"), 2022, 17, 0,
				0, 0, 0, 0, 0, 0, 0, 3, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Renfrow", "LV", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 1, 2, 0, 2, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 18, 0);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 11, 3, 18, 0);
		playerService.insertPlayerWithStatistics("AJ", "Green", "ARI", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("N'Keal", "Harry", "CHI", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Amari", "Rodgers", "HOU", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 1, 4, 0, 2, 2, 12, 0);
		playerService.insertPlayerWithStatistics("Cam", "Sims", "WAS", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dortch", "ARI", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 4, 15, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 17, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 17, 0,
				0, 0, 0, 0, 0, 0, 0, 3, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 15, 0);
		playerService.insertPlayerWithStatistics("Laquon", "Treadwell", "SEA", Position.valueOf("WR"), 2022, 17, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 15, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Phillip", "Dorsett", "HOU", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Darius", "Slayton", "NYG", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Chosen", "Anderson", "ARI", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Velus", "Jones Jr", "CHI", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 1, 13, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Damiere", "Byrd", "ATL", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Tutu", "Atwell", "LAR", Position.valueOf("WR"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 10, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 7, 56, 2);
		playerService.insertPlayerWithStatistics("Trey", "McBride", "ARI", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 7, 78, 1);
		playerService.insertPlayerWithStatistics("Brock", "Wright", "DET", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 13, 2);
		playerService.insertPlayerWithStatistics("Darren", "Waller", "LV", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 3, 72, 1);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 52, 1);
		playerService.insertPlayerWithStatistics("Albert", "Okwuegbunam", "DEN", Position.valueOf("TE"), 2022, 17, 0, 0,
				0, 0, 0, 0, 0, 0, 6, 3, 45, 1);
		playerService.insertPlayerWithStatistics("Mark", "Andrews", "BAL", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 9, 100, 0);
		playerService.insertPlayerWithStatistics("Colby", "Parkinson", "SEA", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 5, 36, 1);
		playerService.insertPlayerWithStatistics("Tommy", "Tremble", "CAR", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 33, 1);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 27, 1);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 23, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 6, 80, 0);
		playerService.insertPlayerWithStatistics("Mike", "Gesicki", "MIA", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 18, 1);
		playerService.insertPlayerWithStatistics("Blake", "Bell", "KC", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 17, 1);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 3, 15, 1);
		playerService.insertPlayerWithStatistics("Isaiah", "Likely", "BAL", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 12, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Mabry", "SEA", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 7, 1);
		playerService.insertPlayerWithStatistics("Donald", "Parham", "LAC", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 3, 1);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 62, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "MIN", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 7, 59, 0);
		playerService.insertPlayerWithStatistics("Logan", "Thomas", "WAS", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 56, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 55, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 5, 52, 0);
		playerService.insertPlayerWithStatistics("MyCole", "Pruitt", "ATL", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 49, 0);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 45, 0);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 7, 43, 0);
		playerService.insertPlayerWithStatistics("Daniel", "Bellinger", "NYG", Position.valueOf("TE"), 2022, 17, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 3, 42, 0);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 2, 40, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 38, 0);
		playerService.insertPlayerWithStatistics("Pat", "Freiermuth", "PIT", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 36, 0);
		playerService.insertPlayerWithStatistics("Giovanni", "Ricci", "CAR", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 32, 0);
		playerService.insertPlayerWithStatistics("Eric", "Saubert", "DEN", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 30, 0);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 16, 0);
		playerService.insertPlayerWithStatistics("OJ", "Howard", "HOU", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 2, 1, 26, 0);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 17, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 3, 24, 0);
		playerService.insertPlayerWithStatistics("CJ", "Uzomah", "NYJ", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 7, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Brycen", "Hopkins", "LAR", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 21, 0);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Brevin", "Jordan", "HOU", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 20, 0);
		playerService.insertPlayerWithStatistics("Harrison", "Bryant", "CLE", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Jelani", "Woods", "IND", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 19, 0);
		playerService.insertPlayerWithStatistics("Cade", "Otton", "TB", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Adam", "Trautman", "NO", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("James", "Mitchell", "DET", Position.valueOf("TE"), 2022, 17, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 11, 0);
		playerService.insertPlayerWithStatistics("Andrew", "Beck", "DEN", Position.valueOf("TE"), 2022, 17, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 10, 0);

	}

	private void insertStatisticsWeek18() throws StatisticsException {
		playerService.insertPlayerWithStatistics("Russell", "Wilson", "DEN", Position.valueOf("QB"), 2022, 18, 13, 24,
				283, 3, 1, 8, 18, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Mills", "HOU", Position.valueOf("QB"), 2022, 18, 22, 38, 298,
				3, 2, 1, 6, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Josh", "Allen", "BUF", Position.valueOf("QB"), 2022, 18, 19, 31, 254,
				3, 1, 9, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Mac", "Jones", "NE", Position.valueOf("QB"), 2022, 18, 26, 40, 243, 3,
				3, 4, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Deshaun", "Watson", "CLE", Position.valueOf("QB"), 2022, 18, 19, 29,
				230, 2, 2, 6, 44, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Davis", "Webb", "NYG", Position.valueOf("QB"), 2022, 18, 23, 40, 168,
				1, 0, 6, 41, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Howell", "WAS", Position.valueOf("QB"), 2022, 18, 11, 19, 169,
				1, 1, 5, 35, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Brock", "Purdy", "SF", Position.valueOf("QB"), 2022, 18, 15, 20, 178,
				3, 0, 4, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Herbert", "LAC", Position.valueOf("QB"), 2022, 18, 25, 37,
				273, 2, 0, 2, -1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Ehlinger", "IND", Position.valueOf("QB"), 2022, 18, 23, 35,
				209, 2, 2, 5, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Desmond", "Ridder", "ATL", Position.valueOf("QB"), 2022, 18, 19, 30,
				224, 2, 0, 2, 9, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jarrett", "Stidham", "LV", Position.valueOf("QB"), 2022, 18, 22, 36,
				219, 1, 1, 7, 50, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Geno", "Smith", "SEA", Position.valueOf("QB"), 2022, 18, 19, 31, 213,
				1, 2, 4, 51, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Patrick", "Mahomes", "KC", Position.valueOf("QB"), 2022, 18, 18, 26,
				202, 1, 0, 3, 29, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Dobbs", "TEN", Position.valueOf("QB"), 2022, 18, 20, 29,
				179, 1, 1, 5, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Burrow", "CIN", Position.valueOf("QB"), 2022, 18, 25, 42, 215,
				1, 0, 3, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kirk", "Cousins", "MIN", Position.valueOf("QB"), 2022, 18, 17, 20,
				225, 1, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Rodgers", "GB", Position.valueOf("QB"), 2022, 18, 17, 27,
				205, 1, 1, 3, 10, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Anthony", "Brown", "BAL", Position.valueOf("QB"), 2022, 18, 19, 44,
				286, 0, 2, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trevor", "Lawrence", "JAC", Position.valueOf("QB"), 2022, 18, 20, 32,
				212, 1, 0, 4, -3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenny", "Pickett", "PIT", Position.valueOf("QB"), 2022, 18, 13, 29,
				195, 1, 0, 3, 1, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("David", "Blough", "ARI", Position.valueOf("QB"), 2022, 18, 14, 18,
				180, 1, 2, 2, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Andy", "Dalton", "NO", Position.valueOf("QB"), 2022, 18, 15, 25, 171,
				1, 0, 1, 2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Hurts", "PHI", Position.valueOf("QB"), 2022, 18, 20, 35, 229,
				0, 1, 9, 13, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Dak", "Prescott", "DAL", Position.valueOf("QB"), 2022, 18, 14, 37,
				128, 1, 1, 6, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jared", "Goff", "DET", Position.valueOf("QB"), 2022, 18, 23, 34, 224,
				0, 0, 2, 5, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nathan", "Peterman", "CHI", Position.valueOf("QB"), 2022, 18, 11, 19,
				114, 1, 0, 2, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Baker", "Mayfield", "LAR", Position.valueOf("QB"), 2022, 18, 13, 26,
				147, 0, 1, 5, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tom", "Brady", "TB", Position.valueOf("QB"), 2022, 18, 13, 17, 84, 1,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Skylar", "Thompson", "MIA", Position.valueOf("QB"), 2022, 18, 20, 31,
				152, 0, 0, 3, 3, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Joe", "Flacco", "NYJ", Position.valueOf("QB"), 2022, 18, 18, 33, 149,
				0, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Mullens", "MIN", Position.valueOf("QB"), 2022, 18, 11, 13,
				116, 0, 1, 4, 8, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Chase", "Daniel", "LAC", Position.valueOf("QB"), 2022, 18, 5, 7, 25,
				1, 0, 1, 4, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Blaine", "Gabbert", "TB", Position.valueOf("QB"), 2022, 18, 6, 8, 29,
				1, 0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Sam", "Darnold", "CAR", Position.valueOf("QB"), 2022, 18, 5, 15, 43,
				0, 2, 6, 32, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Trace", "McSorley", "ARI", Position.valueOf("QB"), 2022, 18, 6, 9, 29,
				0, 1, 3, 13, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tim", "Boyle", "CHI", Position.valueOf("QB"), 2022, 18, 2, 8, 33, 0,
				2, 2, -2, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Driskel", "HOU", Position.valueOf("QB"), 2022, 18, 2, 2, 13,
				0, 0, 3, 7, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Trask", "TB", Position.valueOf("QB"), 2022, 18, 3, 9, 23, 0,
				0, 0, 0, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jamaal", "Williams", "DET", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 16, 72, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Nick", "Chubb", "CLE", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 12, 77, 0, 6, 5, 45, 1);
		playerService.insertPlayerWithStatistics("Zack", "Moss", "IND", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0, 0,
				18, 114, 1, 3, 3, 7, 0);
		playerService.insertPlayerWithStatistics("Alexander", "Mattison", "MIN", Position.valueOf("RB"), 2022, 18, 0, 0,
				0, 0, 0, 10, 54, 2, 1, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Latavius", "Murray", "DEN", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 15, 103, 1, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Mitchell", "SF", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 5, 55, 2, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Najee", "Harris", "PIT", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 23, 80, 1, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Kenyan", "Drake", "BAL", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 16, 60, 1, 5, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Christian", "McCaffrey", "SF", Position.valueOf("RB"), 2022, 18, 0, 0,
				0, 0, 0, 10, 45, 0, 3, 3, 34, 1);
		playerService.insertPlayerWithStatistics("Tyler", "Allgeier", "ATL", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 24, 135, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Cam", "Akers", "LAR", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0, 0,
				21, 104, 0, 3, 3, 24, 0);
		playerService.insertPlayerWithStatistics("Derrick", "Henry", "TEN", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 30, 109, 0, 1, 1, 19, 0);
		playerService.insertPlayerWithStatistics("Joe", "Mixon", "CIN", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0, 0,
				11, 27, 1, 5, 5, 41, 0);
		playerService.insertPlayerWithStatistics("Isiah", "Pacheco", "KC", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 8, 64, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Walker", "SEA", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 29, 114, 0, 1, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Boston", "Scott", "PHI", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 9, 54, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Deon", "Jackson", "IND", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 8, 35, 0, 8, 6, 75, 0);
		playerService.insertPlayerWithStatistics("Alvin", "Kamara", "NO", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 23, 107, 0, 2, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Corey", "Clement", "ARI", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 8, 23, 1, 4, 3, 25, 0);
		playerService.insertPlayerWithStatistics("Ronald", "Jones", "KC", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 10, 45, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("D'Andre", "Swift", "DET", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 6, 25, 0, 7, 7, 61, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Badie", "DEN", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 1, 0, 0, 1, 1, 24, 1);
		playerService.insertPlayerWithStatistics("Rhamondre", "Stevenson", "NE", Position.valueOf("RB"), 2022, 18, 0, 0,
				0, 0, 0, 6, 54, 0, 6, 5, 28, 0);
		playerService.insertPlayerWithStatistics("Cordarrelle", "Patterson", "ATL", Position.valueOf("RB"), 2022, 18, 0,
				0, 0, 0, 0, 5, 18, 1, 3, 2, 1, 0);
		playerService.insertPlayerWithStatistics("Jaret", "Patterson", "WAS", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 17, 78, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jeff", "Wilson", "MIA", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 16, 72, 0, 2, 2, 2, 0);
		playerService.insertPlayerWithStatistics("Austin", "Ekeler", "LAC", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 11, 34, 0, 4, 4, 36, 0);
		playerService.insertPlayerWithStatistics("Chuba", "Hubbard", "CAR", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 21, 69, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("D'Onta", "Foreman", "CAR", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 12, 68, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Aaron", "Jones", "GB", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 12, 48, 0, 4, 3, 20, 0);
		playerService.insertPlayerWithStatistics("Jerick", "McKinnon", "KC", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 2, 6, 0, 3, 2, 0, 1);
		playerService.insertPlayerWithStatistics("Gary", "Brightwell", "NYG", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 11, 60, 0, 3, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Raheem", "Mostert", "MIA", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 11, 71, 0, 2, 2, -10, 0);
		playerService.insertPlayerWithStatistics("Derek", "Watt", "PIT", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 1, 1, 1, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Damien", "Harris", "NE", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 13, 48, 0, 4, 1, 4, 0);
		playerService.insertPlayerWithStatistics("James", "Cook", "BUF", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 9, 45, 0, 2, 2, 6, 0);
		playerService.insertPlayerWithStatistics("Josh", "Jacobs", "LV", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 17, 45, 0, 3, 2, 5, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Herbert", "CHI", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 10, 50, 0, 2, 1, -1, 0);
		playerService.insertPlayerWithStatistics("CJ", "Ham", "MIN", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0, 0, 0,
				0, 0, 4, 4, 47, 0);
		playerService.insertPlayerWithStatistics("Chase", "Edmonds", "DEN", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 9, 45, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Warren", "PIT", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 6, 36, 0, 4, 3, 7, 0);
		playerService.insertPlayerWithStatistics("Kenneth", "Gainwell", "PHI", Position.valueOf("RB"), 2022, 18, 0, 0,
				0, 0, 0, 5, 35, 0, 1, 1, 7, 0);
		playerService.insertPlayerWithStatistics("Jonathan", "Williams", "WAS", Position.valueOf("RB"), 2022, 18, 0, 0,
				0, 0, 0, 14, 32, 0, 2, 2, 9, 0);
		playerService.insertPlayerWithStatistics("Matt", "Breida", "NYG", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 4, 28, 0, 8, 7, 12, 0);
		playerService.insertPlayerWithStatistics("Dare", "Ogunbowale", "HOU", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 11, 33, 0, 6, 5, 5, 0);
		playerService.insertPlayerWithStatistics("Dalvin", "Cook", "MIN", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 11, 37, 0, 1, 1, 0, 0);
		playerService.insertPlayerWithStatistics("Travis", "Etienne", "JAC", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 7, 17, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Justice", "Hill", "BAL", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 7, 34, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ke'Shawn", "Vaughn", "TB", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 8, 26, 0, 2, 2, 8, 0);
		playerService.insertPlayerWithStatistics("AJ", "Dillon", "GB", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0, 0,
				9, 33, 0, 3, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Miles", "Sanders", "PHI", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 11, 33, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Devin", "Singletary", "BUF", Position.valueOf("RB"), 2022, 18, 0, 0,
				0, 0, 0, 7, 29, 0, 1, 1, 3, 0);
		playerService.insertPlayerWithStatistics("Kyle", "Juszczyk", "SF", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 1, 3, 0, 1, 1, 26, 0);
		playerService.insertPlayerWithStatistics("Kene", "Nwangwu", "MIN", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 5, 13, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Kareem", "Hunt", "CLE", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 4, 13, 0, 4, 3, 15, 0);
		playerService.insertPlayerWithStatistics("David", "Johnson", "NO", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 28, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Mason", "SF", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 8, 28, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Giovani", "Bernard", "TB", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 7, 28, 0, 2, 2, -1, 0);
		playerService.insertPlayerWithStatistics("Tyrion", "Davis-Price", "SF", Position.valueOf("RB"), 2022, 18, 0, 0,
				0, 0, 0, 8, 27, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("DeeJay", "Dallas", "SEA", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 2, 29, 0, 1, 1, -3, 0);
		playerService.insertPlayerWithStatistics("Ty", "Johnson", "NYJ", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 5, 12, 0, 3, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Joshua", "Kelley", "LAC", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 5, 18, 0, 4, 1, 6, 0);
		playerService.insertPlayerWithStatistics("Zonovan", "Knight", "NYJ", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 12, 22, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Samaje", "Perine", "CIN", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 6, 18, 0, 1, 1, 4, 0);
		playerService.insertPlayerWithStatistics("David", "Montgomery", "CHI", Position.valueOf("RB"), 2022, 18, 0, 0,
				0, 0, 0, 7, 21, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ty", "Chandler", "MIN", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 6, 20, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Malik", "Davis", "DAL", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 5, 19, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Tony", "Pollard", "DAL", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 7, 19, 0, 1, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Royce", "Freeman", "HOU", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 7, 15, 0, 1, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Gus", "Edwards", "BAL", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 4, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Hassan", "Haskins", "TEN", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 2, 3, 0, 2, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Rachaad", "White", "TB", Position.valueOf("RB"), 2022, 18, 0, 0, 0, 0,
				0, 4, 15, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jackson", "DET", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 1, 2, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Avery", "Williams", "ATL", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 4, 12, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Ameer", "Abdullah", "LV", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Ezekiel", "Elliott", "DAL", Position.valueOf("RB"), 2022, 18, 0, 0, 0,
				0, 0, 8, 10, 0, 2, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Keenan", "Allen", "LAC", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 11, 8, 102, 2);
		playerService.insertPlayerWithStatistics("DeVante", "Parker", "NE", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 6, 79, 2);
		playerService.insertPlayerWithStatistics("Jerry", "Jeudy", "DEN", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 3, 39, 0, 6, 5, 154, 0);
		playerService.insertPlayerWithStatistics("Brandin", "Cooks", "HOU", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 5, 106, 1);
		playerService.insertPlayerWithStatistics("Stefon", "Diggs", "BUF", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 10, 7, 104, 1);
		playerService.insertPlayerWithStatistics("Christian", "Kirk", "JAC", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 6, 99, 1);
		playerService.insertPlayerWithStatistics("AJ", "Green", "ARI", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 3, 91, 1);
		playerService.insertPlayerWithStatistics("Ja'Marr", "Chase", "CIN", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 13, 8, 86, 1);
		playerService.insertPlayerWithStatistics("Terry", "McLaurin", "WAS", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 74, 1);
		playerService.insertPlayerWithStatistics("George", "Pickens", "PIT", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 72, 1);
		playerService.insertPlayerWithStatistics("Velus", "Jones Jr", "CHI", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 1, 42, 1, 2, 1, 28, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Renfrow", "LV", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 7, 63, 1);
		playerService.insertPlayerWithStatistics("Drake", "London", "ATL", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 6, 120, 0);
		playerService.insertPlayerWithStatistics("Chris", "Olave", "NO", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 12, 5, 60, 1);
		playerService.insertPlayerWithStatistics("KJ", "Osborn", "MIN", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 5, 117, 0);
		playerService.insertPlayerWithStatistics("Christian", "Watson", "GB", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 2, 12, 0, 6, 5, 104, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Lockett", "SEA", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 54, 1);
		playerService.insertPlayerWithStatistics("CeeDee", "Lamb", "DAL", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 52, 1);
		playerService.insertPlayerWithStatistics("Kadarius", "Toney", "KC", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 3, 26, 1, 2, 2, 18, 0);
		playerService.insertPlayerWithStatistics("John", "Brown", "BUF", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 42, 1);
		playerService.insertPlayerWithStatistics("Allen", "Lazard", "GB", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 2, 0, 0, 6, 4, 41, 1);
		playerService.insertPlayerWithStatistics("Tutu", "Atwell", "LAR", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 1, 11, 1, 3, 2, 27, 0);
		playerService.insertPlayerWithStatistics("Olamide", "Zaccheaus", "ATL", Position.valueOf("WR"), 2022, 18, 0, 0,
				0, 0, 0, 0, 0, 0, 7, 4, 37, 1);
		playerService.insertPlayerWithStatistics("AJ", "Brown", "PHI", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 10, 4, 95, 0);
		playerService.insertPlayerWithStatistics("Courtland", "Sutton", "DEN", Position.valueOf("WR"), 2022, 18, 0, 0,
				0, 0, 0, 0, 0, 0, 7, 3, 33, 1);
		playerService.insertPlayerWithStatistics("Jakobi", "Meyers", "NE", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 3, 32, 1);
		playerService.insertPlayerWithStatistics("Kenny", "Golladay", "NYG", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 2, 30, 1);
		playerService.insertPlayerWithStatistics("Michael", "Pittman Jr", "IND", Position.valueOf("WR"), 2022, 18, 0, 0,
				0, 0, 0, 1, 0, 0, 5, 3, 30, 1);
		playerService.insertPlayerWithStatistics("Garrett", "Wilson", "NYJ", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 17, 9, 89, 0);
		playerService.insertPlayerWithStatistics("Sammy", "Watkins", "BAL", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 79, 0);
		playerService.insertPlayerWithStatistics("Russell", "Gage", "TB", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 3, 15, 1);
		playerService.insertPlayerWithStatistics("Davante", "Adams", "LV", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 9, 5, 73, 0);
		playerService.insertPlayerWithStatistics("Jahan", "Dotson", "WAS", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 72, 0);
		playerService.insertPlayerWithStatistics("Adam", "Thielen", "MIN", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 1, 4, 0, 3, 2, 8, 1);
		playerService.insertPlayerWithStatistics("Parris", "Campbell", "IND", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 1, 26, 0, 9, 6, 42, 0);
		playerService.insertPlayerWithStatistics("DeVonta", "Smith", "PHI", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 8, 7, 67, 0);
		playerService.insertPlayerWithStatistics("Justin", "Watson", "KC", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 1, 67, 0);
		playerService.insertPlayerWithStatistics("Kalif", "Raymond", "DET", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 66, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Nailor", "MIN", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 62, 0);
		playerService.insertPlayerWithStatistics("Van", "Jefferson", "LAR", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 3, 61, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Aiyuk", "SF", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 59, 0);
		playerService.insertPlayerWithStatistics("Chris", "Godwin", "TB", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 55, 0);
		playerService.insertPlayerWithStatistics("Freddie", "Swain", "DEN", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 54, 0);
		playerService.insertPlayerWithStatistics("Jaylen", "Waddle", "MIA", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 1, 9, 0, 5, 5, 44, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Boyd", "CIN", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 5, 51, 0);
		playerService.insertPlayerWithStatistics("Amari", "Cooper", "CLE", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 51, 0);
		playerService.insertPlayerWithStatistics("Amon-Ra", "St Brown", "DET", Position.valueOf("WR"), 2022, 18, 0, 0,
				0, 0, 0, 0, 0, 0, 9, 6, 49, 0);
		playerService.insertPlayerWithStatistics("Kendrick", "Bourne", "NE", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 45, 0);
		playerService.insertPlayerWithStatistics("Greg", "Dortch", "ARI", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 2, 15, 0, 4, 4, 30, 0);
		playerService.insertPlayerWithStatistics("DeAndre", "Carter", "LAC", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 43, 0);
		playerService.insertPlayerWithStatistics("Donovan", "Peoples-Jones", "CLE", Position.valueOf("WR"), 2022, 18, 0,
				0, 0, 0, 0, 0, 0, 0, 4, 2, 42, 0);
		playerService.insertPlayerWithStatistics("Alec", "Pierce", "IND", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 3, 42, 0);
		playerService.insertPlayerWithStatistics("Deven", "Thompkins", "TB", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 1, 17, 0, 9, 4, 25, 0);
		playerService.insertPlayerWithStatistics("Rashid", "Shaheed", "NO", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 1, 7, 0, 4, 3, 34, 0);
		playerService.insertPlayerWithStatistics("DK", "Metcalf", "SEA", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 3, 40, 0);
		playerService.insertPlayerWithStatistics("Robert", "Woods", "TEN", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 40, 0);
		playerService.insertPlayerWithStatistics("Gabriel", "Davis", "BUF", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 3, 39, 0);
		playerService.insertPlayerWithStatistics("Josh", "Palmer", "LAC", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 39, 0);
		playerService.insertPlayerWithStatistics("Justin", "Jefferson", "MIN", Position.valueOf("WR"), 2022, 18, 0, 0,
				0, 0, 0, 0, 0, 0, 5, 4, 38, 0);
		playerService.insertPlayerWithStatistics("Diontae", "Johnson", "PIT", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 2, 38, 0);
		playerService.insertPlayerWithStatistics("Marcus", "Johnson", "NYG", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 3, 36, 0);
		playerService.insertPlayerWithStatistics("JuJu", "Smith-Schuster", "KC", Position.valueOf("WR"), 2022, 18, 0, 0,
				0, 0, 0, 0, 0, 0, 2, 2, 35, 0);
		playerService.insertPlayerWithStatistics("Mike", "Williams", "LAC", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 4, 32, 0);
		playerService.insertPlayerWithStatistics("Chase", "Claypool", "CHI", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 2, 29, 0);
		playerService.insertPlayerWithStatistics("Marvin", "Jones", "JAC", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 29, 0);
		playerService.insertPlayerWithStatistics("Khalil", "Shakir", "BUF", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 28, 0);
		playerService.insertPlayerWithStatistics("Marquez", "Valdes-Scantling", "KC", Position.valueOf("WR"), 2022, 18,
				0, 0, 0, 0, 0, 0, 0, 0, 6, 3, 27, 0);
		playerService.insertPlayerWithStatistics("Demarcus", "Robinson", "BAL", Position.valueOf("WR"), 2022, 18, 0, 0,
				0, 0, 0, 0, 0, 0, 9, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Deebo", "Samuel", "SF", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 1, 4, 0, 3, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Dareke", "Young", "SEA", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 24, 0);
		playerService.insertPlayerWithStatistics("Tyreek", "Hill", "MIA", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Terrace", "Marshall Jr", "CAR", Position.valueOf("WR"), 2022, 18, 0,
				0, 0, 0, 0, 0, 0, 0, 3, 2, 23, 0);
		playerService.insertPlayerWithStatistics("Jalen", "Reagor", "MIN", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 1, 5, 0, 2, 2, 17, 0);
		playerService.insertPlayerWithStatistics("Amari", "Rodgers", "HOU", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 22, 0);
		playerService.insertPlayerWithStatistics("Cade", "Johnson", "SEA", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 21, 0);
		playerService.insertPlayerWithStatistics("Zay", "Jones", "JAC", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 6, 4, 21, 0);
		playerService.insertPlayerWithStatistics("Chris", "Moore", "HOU", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 1, -2, 0, 6, 2, 22, 0);
		playerService.insertPlayerWithStatistics("Treylon", "Burks", "TEN", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 4, 19, 0);
		playerService.insertPlayerWithStatistics("TY", "Hilton", "DAL", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Isaiah", "McKenzie", "BUF", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Dante", "Pettis", "CHI", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 19, 0);
		playerService.insertPlayerWithStatistics("Corey", "Davis", "NYJ", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 17, 0);
		playerService.insertPlayerWithStatistics("Brandon", "Powell", "LAR", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 1, 15, 0, 3, 1, 2, 0);
		playerService.insertPlayerWithStatistics("Josh", "Reynolds", "DET", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Steven", "Sims", "PIT", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 1, 16, 0, 0, 0, 0, 0);
		playerService.insertPlayerWithStatistics("Frank", "Darby", "ATL", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("Mack", "Hollins", "LV", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 15, 0);
		playerService.insertPlayerWithStatistics("Michael", "Woods", "CLE", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 15, 0);
		playerService.insertPlayerWithStatistics("DJ", "Chark", "DET", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Quez", "Watkins", "PHI", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 14, 0);
		playerService.insertPlayerWithStatistics("Pharoh", "Cooper", "ARI", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 2, 7, 0, 2, 2, 6, 0);
		playerService.insertPlayerWithStatistics("Tyquan", "Thornton", "NE", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 13, 0);
		playerService.insertPlayerWithStatistics("Trenton", "Irwin", "CIN", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Tylan", "Wallace", "BAL", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 12, 0);
		playerService.insertPlayerWithStatistics("Randall", "Cobb", "GB", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 11, 0);
		playerService.insertPlayerWithStatistics("Elijah", "Moore", "NYJ", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Noah", "Brown", "DAL", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Michael", "Gallup", "DAL", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Jauan", "Jennings", "SF", Position.valueOf("WR"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 1, 10, 0);
		playerService.insertPlayerWithStatistics("DJ", "Moore", "CAR", Position.valueOf("WR"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 1, 10, 0);
		playerService.insertPlayerWithStatistics("Jordan", "Akins", "HOU", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 8, 4, 70, 2);
		playerService.insertPlayerWithStatistics("George", "Kittle", "SF", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 29, 2);
		playerService.insertPlayerWithStatistics("Cole", "Kmet", "CHI", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 5, 4, 57, 1);
		playerService.insertPlayerWithStatistics("Isaiah", "Likely", "BAL", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 13, 8, 103, 0);
		playerService.insertPlayerWithStatistics("David", "Njoku", "CLE", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 42, 1);
		playerService.insertPlayerWithStatistics("Chigoziem", "Okonkwo", "TEN", Position.valueOf("TE"), 2022, 18, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 3, 42, 1);
		playerService.insertPlayerWithStatistics("MyCole", "Pruitt", "ATL", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 34, 1);
		playerService.insertPlayerWithStatistics("Teagan", "Quitoriano", "HOU", Position.valueOf("TE"), 2022, 18, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 3, 83, 0);
		playerService.insertPlayerWithStatistics("Dawson", "Knox", "BUF", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 2, 2, 13, 1);
		playerService.insertPlayerWithStatistics("Lawrence", "Cager", "NYG", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 10, 8, 69, 0);
		playerService.insertPlayerWithStatistics("Gerald", "Everett", "LAC", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 8, 1);
		playerService.insertPlayerWithStatistics("Kyle", "Rudolph", "TB", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 8, 1);
		playerService.insertPlayerWithStatistics("Mo", "Alie-Cox", "IND", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 4, 1);
		playerService.insertPlayerWithStatistics("Eric", "Tomlinson", "DEN", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 3, 1);
		playerService.insertPlayerWithStatistics("Connor", "Heyward", "PIT", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 3, 45, 0);
		playerService.insertPlayerWithStatistics("Charlie", "Kolar", "BAL", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 6, 4, 49, 0);
		playerService.insertPlayerWithStatistics("Colby", "Parkinson", "SEA", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 47, 0);
		playerService.insertPlayerWithStatistics("Mike", "Gesicki", "MIA", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 4, 46, 0);
		playerService.insertPlayerWithStatistics("Dallas", "Goedert", "PHI", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 6, 46, 0);
		playerService.insertPlayerWithStatistics("Hunter", "Henry", "NE", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 42, 0);
		playerService.insertPlayerWithStatistics("Trey", "McBride", "ARI", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 41, 0);
		playerService.insertPlayerWithStatistics("Durham", "Smythe", "MIA", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 5, 3, 39, 0);
		playerService.insertPlayerWithStatistics("Austin", "Hooper", "TEN", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 4, 38, 0);
		playerService.insertPlayerWithStatistics("Travis", "Kelce", "KC", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 6, 38, 0);
		playerService.insertPlayerWithStatistics("Darren", "Waller", "LV", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 6, 2, 35, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Higbee", "LAR", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 7, 4, 33, 0);
		playerService.insertPlayerWithStatistics("Dalton", "Schultz", "DAL", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 9, 4, 33, 0);
		playerService.insertPlayerWithStatistics("Donald", "Parham", "LAC", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 31, 0);
		playerService.insertPlayerWithStatistics("Robert", "Tonyan", "GB", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 3, 29, 0);
		playerService.insertPlayerWithStatistics("Evan", "Engram", "JAC", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 4, 27, 0);
		playerService.insertPlayerWithStatistics("Taysom", "Hill", "NO", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 1, 0);
		playerService.insertPlayerWithStatistics("Zach", "Gentry", "PIT", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 23, 0);
		playerService.insertPlayerWithStatistics("Juwan", "Johnson", "NO", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 21, 0);
		playerService.insertPlayerWithStatistics("Harrison", "Bryant", "CLE", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 2, 2, 20, 0);
		playerService.insertPlayerWithStatistics("Noah", "Fant", "SEA", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 4, 4, 20, 0);
		playerService.insertPlayerWithStatistics("Adam", "Trautman", "NO", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 18, 0);
		playerService.insertPlayerWithStatistics("Nick", "Vannett", "NYG", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 4, 2, 18, 0);
		playerService.insertPlayerWithStatistics("TJ", "Hockenson", "MIN", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 16, 0);
		playerService.insertPlayerWithStatistics("Logan", "Thomas", "WAS", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 2, 16, 0);
		playerService.insertPlayerWithStatistics("Noah", "Gray", "KC", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 14, 0);
		playerService.insertPlayerWithStatistics("Hayden", "Hurst", "CIN", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 5, 4, 14, 0);
		playerService.insertPlayerWithStatistics("Irv", "Smith", "MIN", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0, 0,
				0, 0, 0, 3, 3, 14, 0);
		playerService.insertPlayerWithStatistics("Tyler", "Conklin", "NYJ", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 4, 2, 13, 0);
		playerService.insertPlayerWithStatistics("Luke", "Farrell", "JAC", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Anthony", "Firkser", "ATL", Position.valueOf("TE"), 2022, 18, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 1, 11, 0);
		playerService.insertPlayerWithStatistics("Foster", "Moreau", "LV", Position.valueOf("TE"), 2022, 18, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 1, 10, 0);

	}

}