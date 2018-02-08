package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustTab")
public class Customer implements Comparable<Customer>{
	@Id
	@Column(name="CustId")
	private int custId;
	@Column(name="CustName")
	private String custName;
	@Column(name="CustEmail")
	private String custEmail;
	@Column(name="CustAddr")
	private String custAddr;
	@Column(name="CustType")
	private String custType;
	
	
	public Customer() {
		
	}
	
	


	public Customer(int custId) {
		super();
		this.custId = custId;
	}




	public Customer(int custId, String custName, String custEmail,
			String custAddr, String custType) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custAddr = custAddr;
		this.custType = custType;
	}


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCustEmail() {
		return custEmail;
	}


	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}


	public String getCustAddr() {
		return custAddr;
	}


	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}


	public String getCustType() {
		return custType;
	}


	public void setCustType(String custType) {
		this.custType = custType;
	}


	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName
				+ ", custEmail=" + custEmail + ", custAddr=" + custAddr
				+ ", custType=" + custType + "]";
	}


	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
