package com.cg.service;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.dao.GearDao;
import com.cg.dto.Gear;


@Service("gearService")

public class GearService implements IGearService{

	
	@Autowired
	GearDao geardao;

	@Override
	public List<Gear> showGear() {
		return geardao.showGear();
	}

	
	@Override
	public Gear searchGear(int id) {
		return geardao.searchGear(id);
	}

	@Override
	public void updateGear(Gear e) {
		// TODO Auto-generated method stub
		geardao.updateGear(e);
	}

}
