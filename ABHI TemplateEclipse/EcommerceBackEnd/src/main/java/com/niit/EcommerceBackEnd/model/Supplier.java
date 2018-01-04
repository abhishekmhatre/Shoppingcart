package com.niit.EcommerceBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Supplier
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int suppid;
	String name;
	public int getSuppid() {
		return suppid;
	}
	public void setSuppid(int suppid) {
		this.suppid = suppid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	String address;
	
}
