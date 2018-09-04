package com.cg.application.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.application.DAO.SportsRepo;
import com.cg.application.bean.Day;

@Service(value="service")
public class SportsServiceImpl implements SportsService {

@Autowired
private SportsRepo repo;
	
	/*public SportsServiceImpl(SportsRepo repo) {
		
		this.repo = repo;
	}
*/
	@Transactional
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
