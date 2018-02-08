package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Vendor;
import com.app.service.IVendorService;

@Controller
public class VendorController {

	@Autowired
	private IVendorService service;
	



	@RequestMapping("/venReg")
	public String showRegPage(){
		return "VendorReg";
	}
	
	
	
	@RequestMapping(value="/insertVen",method=RequestMethod.POST)
	public String saveVendor(@ModelAttribute("vendor")Vendor ven,ModelMap map){
		int venId=service.saveVendor(ven);
		map.addAttribute("msg", "Saved with Id:"+venId);
		return "VendorReg";
	}	
	
	
	
	@RequestMapping("/viewVens")
	public String getAllVendors(ModelMap map){
		List<Vendor> venList=service.getAllVendors();
		map.addAttribute("venListObj", venList);
		return "VendorData";
	}
	
	
	
	@RequestMapping("/deleteVen")
	public String deleteVen(@RequestParam("venId")int Id){
		service.deleteVenById(Id);
		return "redirect:viewVens";
	}
	
	
	@RequestMapping("/editVen")
	public String showEditPage(@RequestParam("venId")int venId, ModelMap map){
		Vendor ven=service.getVendorById(venId);
		map.addAttribute("venObj",ven);
		return "VendorDataEdit";
	}
	
	
	
	@RequestMapping(value="/updateVen",method=RequestMethod.POST)
	public String updateVendor(@ModelAttribute("Vendor")Vendor ven){
		service.updateVendor(ven);
		return "redirect:viewVens			";
	}
}
