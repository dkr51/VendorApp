package com.app.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;
import com.app.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerDao dao;

	@Override
	public int saveCustomer(Customer cust) {
		return dao.saveCustomer(cust);
	}

	@Override
	public void updataCustomer(Customer cust) {
		dao.updataCustomer(cust);
		
	}

	
	@Override
	public Customer getCustomerById(int custId) {
		return dao.getCustomerById(custId);
	}



	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> custList=dao.getAllCustomers();
		if(custList!=null && !custList.isEmpty()){
			Collections.sort(custList);
		}
		return custList;
	}

	public void deleteCustById(int custId) {
		
		dao.deleteCustById(custId);
	}
	
}
