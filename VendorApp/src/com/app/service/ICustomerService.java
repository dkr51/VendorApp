package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerService {
	
	public int saveCustomer(Customer cust);
	public void updataCustomer(Customer cust);
	public void deleteCustById(int custId);	
	public Customer getCustomerById(int custId);
	public List<Customer> getAllCustomers();
	

}
