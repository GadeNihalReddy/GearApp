package com.cg.service;



import java.util.List;

import com.cg.dto.Gear;



public interface IGearService {
	
	public List<Gear> showGear();
	
	public Gear searchGear(int id);
	public void updateGear(Gear e);
}
