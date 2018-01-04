package com.niit.EcommerceBackEnd.dao;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;

import com.niit.EcommerceBackEnd.model.Category;
import com.niit.EcommerceBackEnd.model.Product;

@ComponentScan
public interface ProductDao 
{
	List<Product> getAllProducts(); //select * from product
	Product getProduct(int id); //select * from product where id=1
	void deleteProduct(int id); //delete from product where id=?
	List<Category> getCategories();
	void saveOrUpdateProduct(Product product);
}
