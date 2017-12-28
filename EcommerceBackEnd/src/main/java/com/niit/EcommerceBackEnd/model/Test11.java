package com.niit.EcommerceBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Test11
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int id;
	String name;
	String add;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Test11(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public Test11() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
