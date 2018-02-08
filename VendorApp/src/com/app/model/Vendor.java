package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventab")
public class Vendor implements Comparable<Vendor>{

	@Id
	@Column(name="venid")
	private int venId;
	@Column(name="venname")
	private String venName;
	@Column(name="venmail")
	private String venEmail;

	public Vendor() {
		
	}
	


	public Vendor(int venId) {
		super();
		this.venId = venId;
	}



	public Vendor(int venId, String venName, String venEmail) {
		super();
		this.venId = venId;
		this.venName = venName;
		this.venEmail = venEmail;
	}



	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getVenEmail() {
		return venEmail;
	}

	public void setVenEmail(String venEmail) {
		this.venEmail = venEmail;
	}

	@Override
	public String toString() {
		return "Vendor [venId=" + venId + ", venName=" + venName
				+ ", venEmail=" + venEmail + "]";
	}

	@Override
	public int compareTo(Vendor o) {
		return this.getVenId()-o.getVenId();
	}


}
