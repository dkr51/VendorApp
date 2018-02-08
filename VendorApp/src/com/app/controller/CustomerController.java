package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Customer;

import com.app.service.ICustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	
	
	@RequestMapping("/custReg")
	public String shoeRegPage(){
		return "CustomerReg";
		
	}

	@RequestMapping(value="/insertCust",method=RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer")Customer cust, ModelMap map){
		int custId=service.saveCustomer(cust);
		map.addAttribute("msg","Saved with Id :"+custId);
		return "CustomerReg";
	}
		
		@RequestMapping("/viewCusts")
		public String showLocs(ModelMap map){
			List<Customer> custList=service.getAllCustomers();
			map.addAttribute("custListObj", custList);
			return "CustomerData";
		}
		
		
		
		@RequestMapping("/deleteCust")
		public String deleteCust(@RequestParam("custId")int Id){
			service.deleteCustById(Id);
			return "redirect:viewCusts";
		}
		
		
		@RequestMapping("/updateCust")
		public String showEditPage(
	     @RequestParam("custId")int custId,ModelMap map){
			Customer cust=service.getCustomerById(custId);
			map.addAttribute("custObj", cust);
			return "CustomerDataEdit";
		}
		
		
		@RequestMapping(value="/updateCustData",method=RequestMethod.POST)
		public String updateLoc(@ModelAttribute("customer")Customer cust){
			service.updataCustomer(cust);
			return "redirect:viewCusts";
		
	}
	
	
	
}
