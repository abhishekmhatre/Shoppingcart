package com.niit.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Product;
@Repository
public class ProductDaoImpltn implements ProductDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	public List<Product> getAllProducts() 
	{
		Session session=sessionFactory.getCurrentSession();
		//HQL - Hibernate query Language
		Query query=session.createQuery("from Product");//Select * from Product
		return query.list(); //List of Product objects
	}
	public Product getProduct(int id)
	{
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,id); //select * from product where id=1
		return product;
	}
}

