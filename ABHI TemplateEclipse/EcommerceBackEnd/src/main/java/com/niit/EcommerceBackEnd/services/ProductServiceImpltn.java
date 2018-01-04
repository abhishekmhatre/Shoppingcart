package com.niit.EcommerceBackEnd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.EcommerceBackEnd.dao.ProductDao;
import com.niit.EcommerceBackEnd.model.Category;
import com.niit.EcommerceBackEnd.model.Product;

@ComponentScan
@Service
@Transactional
public class ProductServiceImpltn implements ProductService
{
	@Autowired
	private ProductDao productDao;

	public List<Product> getAllProducts()
	{
		return productDao.getAllProducts();
	}
	public Product getProduct(int id)
	{
		return productDao.getProduct(id);
	}
	public void deleteProduct(int id) 
	{
		productDao.deleteProduct(id);
	}
	public List<Category> getAllCategories()
	{
	return productDao.getCategories();	
	}
	public void saveOrUpdateProduct(Product product) 
	{
		productDao.saveOrUpdateProduct(product);
	}
}
