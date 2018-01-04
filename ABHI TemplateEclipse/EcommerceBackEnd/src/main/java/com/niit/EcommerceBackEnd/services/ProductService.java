package com.niit.EcommerceBackEnd.services;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.niit.EcommerceBackEnd.model.Category;
import com.niit.EcommerceBackEnd.model.Product;

@ComponentScan
@Service
public interface ProductService 
{
	List<Product> getAllProducts();  //select * from product
	Product getProduct(int id);   //select * from product where id=1
	void deleteProduct(int id); //delete from product where id=?
	List<Category> getAllCategories();
	void saveOrUpdateProduct(Product product);
}
