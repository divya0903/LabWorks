package com.cg.application.DAO;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.application.bean.Day;

public interface SportsRepo extends JpaRepository<Day, Integer>{
	//Day save(Day day);
	
	@Query(value="select d from Day d where d.name=(:name)")
	Day findByDayName(@Param(value="name")String name);
	
	@Query(value="select d from Day d Inner join d.game g where g.name=(:g)")
	List<Day> findByGameName(@Param(value="g")String name);

}


