package com.cg.DAO;

import java.util.List;

import com.cg.bean.Day;

public interface SportsRepo {
	Day save(Day day);
	Day findByDayName(String name);
	List<Day> findByGameName(String name);

}
