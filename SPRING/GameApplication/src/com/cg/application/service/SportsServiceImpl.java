package com.cg.application.service;

import java.util.List;

import com.cg.application.DAO.SportsRepo;
import com.cg.application.bean.Day;

public class SportsServiceImpl implements SportsService{
	
	private SportsRepo repo;
	
	public SportsServiceImpl(SportsRepo repo) {
		
		this.repo = repo;
	}

	@Override
	public Day addDay(Day day) {
		
		return repo.save(day);
	}

	@Override
	public Day findByDay(String name) {
		
		return repo.findByDayName(name);
	}

	@Override
	public List<Day> findByGame(String name) {
		
		return repo.findByGameName(name);
	}

}
