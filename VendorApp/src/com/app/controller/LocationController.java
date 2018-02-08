package com.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Location;
import com.app.service.ILocationService;

@Controller
public class LocationController {
	@Autowired
	private ILocationService service;
	
	
	@RequestMapping("/locReg")
	public String showRegPage(){
		return "LocationReg";
	}

	@RequestMapping(value="/insertLoc",method=RequestMethod.POST)
	public String saveLocation(@ModelAttribute("location")Location loc, ModelMap map){
		int locId=service.saveLocation(loc);
		map.addAttribute("msg","Saved with Id :"+locId);
		return "LocationReg";
	}
	
	
	@RequestMapping("/viewLocs")
	public String showLocs(ModelMap map){
		List<Location> locList=service.getAllLocations();
		map.addAttribute("locListObj", locList);
		return "LocationData";
	}
	
	
	@RequestMapping("/deleteLoc")
	public String deleteLoc(@RequestParam("locId")int id){
		service.deleteLocById(id);
		return "redirect:viewLocs";
	}
	
	
	@RequestMapping("/updateLoc")
	public String showEditPage(
     @RequestParam("locId")int locId,ModelMap map){
		Location loc=service.getLocationById(locId);
		map.addAttribute("locObj", loc);
		return "LocationDataEdit";
	}
	
	
	@RequestMapping(value="/updateLocData",method=RequestMethod.POST)
	public String updateLoc(@ModelAttribute("location")Location loc){
		service.updateLocation(loc);
		return "redirect:viewLocs";
	}
	
	@RequestMapping("/locExcelExport")
	public String exportExcel(ModelMap map){
		List<Location> locList=service.getAllLocations();
		map.addAttribute("locListObj",locList);
		return "LocExcelView";
	}
	@RequestMapping("/locPdfExport")
	public String exportToPdf(ModelMap map){
		List<Location> locList=service.getAllLocations();
		map.addAttribute("locListObj",locList);
		return "LocPdfView";
		
	}
		
}
