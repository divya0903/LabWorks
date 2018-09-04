package com.cg.DAO;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.bean.Day;
import com.cg.bean.Game;

@Repository
public class SportsRepoImpl implements SportsRepo {
	
	@Resource
	Map<String, Day> data ;
	
	
	/*public SportsRepoImpl(Map<String, Day> data) {
		super();
		this.data = data;
	}*/


	public Day save(Day day) {
		
		data.put(day.getName(), day);
		return day;
	}

	
	public Day findByDayName(String name) {
		
		if (data.containsKey(name)) {
			return data.get(name);
		} else {
			return null;
		}
	}

	
	public List<Day> findByGameName(String name) {
		

		List<Day> dayList = new ArrayList<Day>();
		for (Day day : data.values()) {
			List<Game> list = day.getGame();
			for (Game game : list) {
				/*System.out.println(game);
				System.out.println();*/
				if(game.getName().equals(name)){
					dayList.add(day);
				}
			}
		}
		return dayList;
	}

}
