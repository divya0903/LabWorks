package com.cg.application.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.application.DAO.SportsRepo;
import com.cg.application.DAO.SportsRepoImpl;
import com.cg.application.bean.Day;
import com.cg.application.bean.Game;
import com.cg.application.service.SportsService;
import com.cg.application.service.SportsServiceImpl;

public class Client {
	static Scanner sc = new Scanner(System.in);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
	EntityManager em = emf.createEntityManager();
	
	SportsRepo repo = new SportsRepoImpl(em);
	SportsService service = new SportsServiceImpl(repo);

	public static void main(String[] args) {
		
		Client c = new Client();
		int opt ;
		while (true) {
			System.out.println("1. Add Day Schedule");
			System.out.println("2. Retrive Games on this Day");
			System.out
					.println("3. Retrive Days on whicn This game will be played");
			System.out.println("4. Exit");
			System.out.println("Enter choice:");
			opt = Integer.parseInt(sc.nextLine());
			switch (opt) {
			case 1:
				c.addData();
				break;
			case 2:
				c.retriveByDay();
				break;
			case 3:
				c.retriveByGame();
				break;
			case 4:
				System.exit(0);
				break;
			}
			
		}
		
		
	}

	private void addData() {

		Game g1 = new Game();
		g1.setName("Hockey");
		Game g2 = new Game();
		g2.setName("Cricket");
		Game g3 = new Game();
		g3.setName("Football");
		Game g4 = new Game();
		g4.setName("Swimming");
		Game g5 = new Game();
		g5.setName("Volley Ball");
		Game g6 = new Game();
		g6.setName("Long Jump");
		Game g7 = new Game();
		g7.setName("Badminton");
		Game g8 = new Game();
		g8.setName("Throw Ball");
		Game g9 = new Game();
		g9.setName("High Jump");
		
	
		
		Day d1 = new Day();
		List<Game> day1 = new ArrayList<Game>();

		day1.add(g1);
		day1.add(g2);
		day1.add(g3);

		d1.setName("Day 1");
		d1.setGame(day1);

		System.out.println(service.addDay(d1).getName() + " Added");

		
		Day d2 = new Day();
		List<Game> day2 = new ArrayList<Game>();
			
		day2.add(g5);
		day2.add(g6);
		day2.add(g4);
		day2.add(g9);

		d2.setName("Day 2");
		d2.setGame(day2);

		System.out.println(service.addDay(d2).getName() + " Added");

		
		Day d3 = new Day();
		List<Game> day3 = new ArrayList<Game>();

		
		day3.add(g3);
		day3.add(g8);
		day3.add(g7);
		day3.add(g2);

		d3.setName("Day 3");
		d3.setGame(day3);

		System.out.println(service.addDay(d3).getName() + " Added");

		
		Day d4 = new Day();
		List<Game> day4 = new ArrayList<Game>();

		day4.add(g4);
		day4.add(g1);
		day4.add(g5);
		

		d4.setName("Day 4");
		d4.setGame(day4);

		System.out.println(service.addDay(d4).getName() + " Added");

	}

	private void retriveByDay() {

		String dayName = "";
		System.out.println("Enter Day:");
		dayName = sc.nextLine();
		Day day = service.findByDay(dayName);
		System.out.println(day.getGame());

	}

	private void retriveByGame() {

		String gameName = "";
		System.out.println("Enter Game:");
		gameName = sc.nextLine();
		List<Day> dayList = service.findByGame(gameName);

		for (Day day : dayList) {
			System.out.println(day.getName());
		}
	}
}
