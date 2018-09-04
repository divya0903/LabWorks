package com.cg.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cg.bean.Day;
import com.cg.bean.Game;

@Configuration
@ComponentScan(basePackages= {"com.cg"})
public class AppConfig {

	@Bean
	@Scope("singleton")
	public Map getAllValues() {
		Map<String, List<Game>> data = new HashMap<String, List<Game>>();

		Day d1 = new Day();
		List<Game> day1 = new ArrayList<Game>();

		Game g11 = new Game();
		g11.setName("Hockey");
		Game g12 = new Game();
		g12.setName("Cricket");
		Game g13 = new Game();
		g13.setName("Football");
		day1.add(g11);
		day1.add(g12);
		day1.add(g13);

		d1.setName("Day 1");
		d1.setGame(day1);
		
		data.put("Day 1", day1);
		return data;

		// System.out.println(service.addDay(d1).getName() + " Added");
	}
}