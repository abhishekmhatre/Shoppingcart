package com.niit.EcommerceBackEnd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.EcommerceBackEnd.dao.CustomerDao;
import com.niit.EcommerceBackEnd.model.Customer;
import com.niit.EcommerceBackEnd.model.User;

@Service
@Repository
@Transactional
public class CustomerServiceImpltn implements CustomerService
{
	@Autowired
	private CustomerDao customerDao;
	public void registerCustomer(Customer customer)
	{
	customerDao.registerCustomer(customer);

	}
	public boolean isEmailValid(String email) 
	{
		return customerDao.isEmailValid(email);
	}
	public boolean isUsernameValid(String Username) 
	{
		return customerDao.isUsernameValid(Username);
	}
	public User getUser(String username) 
	{
		return customerDao.getUser(username);	
	}

}
