package com.niit.EcommerceBackEnd.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //Automatically generate value for Id using sequence
	private int id; //product.setId(0)
	
	@NotEmpty(message="Product name is mandatory.")
	private String productname;
	
	@NotEmpty(message="Product description cannot be empty.")
	private String productDescription;
	
	private int quantity;
	
	@Min(value=10,message="Minimum price is 10")
	private double price;
	
	@ManyToOne
	private Category category;
	@Transient
	private MultipartFile image; //image will not get persisted in the table

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
	public String getproductDescription() //getter method
	{
		return productDescription;
	}
	public void setproductDescription(String productDescription) //setter method
	{
		this.productDescription=productDescription;
	}
	public Category getCategory() 
	{
		return category;
	}
	public void setCategory(Category category) 
	{
		this.category = category;
	}
	public MultipartFile getImage() 
	{
		return image;
	}
	public void setImage(MultipartFile image) 
	{
		this.image = image;
	}
}
