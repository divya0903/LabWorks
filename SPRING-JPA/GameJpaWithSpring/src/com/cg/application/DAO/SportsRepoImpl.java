package com.cg.application.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.application.bean.Day;
import com.cg.application.bean.Game;

@Repository
public class SportsRepoImpl implements SportsRepo {
	
	@PersistenceContext
	protected EntityManager em;
	
	public SportsRepoImpl(EntityManager em) {
		this.em=em;
		
	}

@Transactional
	public Day save(Day day) {
		em.merge(day);
		return day;
	}


	public Day findByDayName(String name) {
		
		/*if (data.containsKey(name)) {
			return data.get(name);
		} else {
			return null;
		}*/
		
		TypedQuery<Day> query=em.createQuery("select d from Day d where d.name=:name",Day.class);
		query.setParameter("name", name);
		Day day=query.getSingleResult();
		
		return day;
	}

	
	public List<Day> findByGameName(String name) {
		

		/*List<Day> dayList = new ArrayList<Day>();
		for (Day day : data.values()) {
			List<Game> list = day.getGame();
			for (Game game : list) {
				System.out.println(game);
				System.out.println();
				if(game.getName().equals(name)){
					dayList.add(day);
				}
			}
		}
		return dayList;*/
		
		TypedQuery<Day> query=em.createQuery("select d from Day d Inner join d.game g where g.name=:g",Day.class);
		query.setParameter("g", name);
		
		
		return query.getResultList();
	}

}
