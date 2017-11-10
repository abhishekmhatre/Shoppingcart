package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //Automatically generate value for Id using sequence
	private int id;
	private String productname;
	private String productDescription;
	private int quantity;
	private double price;
	
	public int getId() //getter method
	{
		return id;
	}
	public void setId(int id) //setter method
	{
		this.id = id;
	}
	
	public String getProductname() //getter method
	{
		return productname;
	}
	public void setProductname(String productname) //setter method
	{
		this.productname = productname;
	}
	
	public int getQuantity() //getter method
	{
		return quantity;
	}
	public void setQuantity(int quantity) //setter method
	{
		this.quantity = quantity;
	}
	
	public double getPrice() //getter method
	{
		return price;
	}
	public void setPrice(double price) //setter method
	{
		this.price = price;
	}
	public String getproductDescription() //geter method
	{
		return productDescription;
	}
	public void setproductDescription(String productDescription) //setter method
	{
		this.productDescription=productDescription;
	}
}
