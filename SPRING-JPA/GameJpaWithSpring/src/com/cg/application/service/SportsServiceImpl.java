package com.cg.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.application.DAO.SportsRepo;
import com.cg.application.bean.Day;

@Service(value="service")
public class SportsServiceImpl implements SportsService{
	
	private SportsRepo repo;
	
	public SportsServiceImpl(SportsRepo repo) {
		
		this.repo = repo;
	}

	
	public Day addDay(Day day) {
		
		return repo.save(day);
	}

	
	public Day findByDay(String name) {
		
		return repo.findByDayName(name);
	}

	
	public List<Day> findByGame(String name) {
		
		return repo.findByGameName(name);
	}

}
