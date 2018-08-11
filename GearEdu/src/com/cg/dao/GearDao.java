package com.cg.dao;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.dto.Gear;


@Repository("geardao")
public class GearDao implements IGearDao {

	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	
	
	


	@Override
	public List<Gear> showGear() {
		// TODO Auto-generated method stub
		List<Gear> list =new ArrayList<>();
		Query q=entityManager.createQuery("from Gear");
		list =q.getResultList();
		return list;
		
	}

	
	@Override
	public Gear searchGear(int id) {
		
		Gear gearList =	entityManager.find(Gear.class, id);
		return gearList;
	}

	@Override
	public void updateGear(Gear e) {
		

		entityManager.merge(e);


		
	}

	
	
	
	
}
