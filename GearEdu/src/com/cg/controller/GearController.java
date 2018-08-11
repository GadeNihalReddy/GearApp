package com.cg.controller;



import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.Gear;
import com.cg.service.GearService;


@Controller
public class GearController {

	
	@Autowired
	GearService gearService;
	
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	public ModelAndView getAllGear() {
		
		List<Gear> list=gearService.showGear();
		return new ModelAndView("show","emps",list);
		
	}
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public String searchEmployee(@ModelAttribute("emp") Gear g)
	{
		return "search";
	}
	@RequestMapping(value="/show1",method=RequestMethod.GET)
	public ModelAndView showGear(@ModelAttribute("emp") Gear g)
	{
		int id=g.getQuery_id();
		Gear gear= gearService.searchGear(id);
		return new ModelAndView("show1","emp",gear);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String updateEmployee(@ModelAttribute("emp") Gear g)
	{
		return "update";
	}
	@RequestMapping(value="/update1",method=RequestMethod.GET)
	public ModelAndView updateDetails(@ModelAttribute("emp") Gear g)
	{
		
		Gear gear= gearService.searchGear(g.getQuery_id());
		return new ModelAndView("update2","empu",gear);
		
	}
	
	@RequestMapping(value="/updategear",method=RequestMethod.POST)
	public String update(@ModelAttribute("emp") Gear g)
	{
		gearService.updateGear(g);
		return "redirect:/showall";
		
	}
	
	
}
