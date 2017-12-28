package com.niit.EcommerceBackEnd.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Abhi {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	 int abhiid;
	
	 String abhiname;
	public Abhi(int abhiid, String abhiname) {
		super();
		this.abhiid = abhiid;
		this.abhiname = abhiname;
	}
	public Abhi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAbhiid() {
		return abhiid;
	}
	public void setAbhiid(int abhiid) {
		this.abhiid = abhiid;
	}
	public String getAbhiname() {
		return abhiname;
	}
	public void setAbhiname(String abhiname) {
		this.abhiname = abhiname;
	}
	 
	 
}
