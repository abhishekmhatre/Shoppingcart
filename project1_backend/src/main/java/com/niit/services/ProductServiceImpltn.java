package com.niit.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

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
}