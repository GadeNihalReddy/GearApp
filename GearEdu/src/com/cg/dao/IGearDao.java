package com.cg.dao;



import java.util.List;

import com.cg.dto.Gear;


public interface IGearDao {

	
	
	public List<Gear> showGear();
	
	public Gear searchGear(int id);
	public void updateGear(Gear e);
}
