package com.niit.EcommerceBackEnd.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.EcommerceBackEnd.model.Category;
import com.niit.EcommerceBackEnd.model.Product;

@Repository
@Transactional
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
		Product product=(Product)session.get(Product.class, id); //select * from product where id=1
		return product;
	}
	public void deleteProduct(int id) 
	{
		Session session=sessionFactory.getCurrentSession();
		//select * from product where id=?
		Product product=(Product)session.get(Product.class, id);
		//delete from product where id=?
		session.delete(product);	
	}
	public List<Category> getCategories() 
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		return query.list();//List of Category objects
	}
	public void saveOrUpdateProduct(Product product)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		//if id==0 ,insert query
		//if id exits in the table , update query
	}
}
