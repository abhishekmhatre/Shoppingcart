package com.niit.EcommerceBackEnd.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.EcommerceBackEnd.model.Authorities;
import com.niit.EcommerceBackEnd.model.Cart;
import com.niit.EcommerceBackEnd.model.User;

import com.niit.EcommerceBackEnd.model.Customer;

@Service
@Repository
@Transactional
public class CustomerDaoImpltn implements CustomerDao
{
	private static final String Customer = null;
	@Autowired
	
	private SessionFactory sessionFactory;
	 public void registerCustomer(Customer customer)
	 {
		 Session session=sessionFactory.getCurrentSession();
		 
		 Authorities authorities=new Authorities();
		 authorities.setRole("ROLE_USER");
		 authorities.setUser(customer.getUser());//FK column in authorities table
		 
		
		 customer.getUser().setAuthorities(authorities);
		 customer.getUser().setEnabled(true);
		 
		 Cart cart=new Cart();
		 customer.setCart(cart);
		 cart.setCustomer(customer);
		 
		 session.save(customer);
		 
	 }
	public boolean isEmailValid(String email) 
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=(Query) session.createQuery("from Customer where email=?");
		query.setString(0,email);
		Customer customer=(Customer)query.uniqueResult();
		if(customer!=null) //duplicate email address,invalid
			return false;
		else
			return true; //if customer =null,unique email address,valid
	}
	
	public boolean isUsernameValid(String username)
	{
		Session session=sessionFactory.getCurrentSession();
		User user=(User)session.get(User.class, username);  //Select * from User where username=?
		if(user!=null) 
			return false; //duplicate username,invalid
		else
			return true; //unique username,valid username
	}
	public User getUser(String username)
	{
		Session session=sessionFactory.getCurrentSession();
		User user=(User)session.get(User.class,username);
		return user;
	}
}




