package com.cg.application.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.cg.application.bean.Day;
import com.cg.application.bean.Game;

public class SportsRepoImpl implements SportsRepo {
	Map<String, Day> data = new HashMap<String, Day>();

	@Override
	public Day save(Day day) {
		
		data.put(day.getName(), day);
		return day;
	}

	@Override
	public Day findByDayName(String name) {
		
		if (data.containsKey(name)) {
			return data.get(name);
		} else {
			return null;
		}
	}

	@Override
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
