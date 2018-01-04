package com.niit.EcommerceBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Test {

	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  int testID;
	  String testName;
	public Test(int testID, String testName) {
		super();
		this.testID = testID;
		this.testName = testName;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTestID() {
		return testID;
	}
	public void setTestID(int testID) {
		this.testID = testID;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	  
	  
}
