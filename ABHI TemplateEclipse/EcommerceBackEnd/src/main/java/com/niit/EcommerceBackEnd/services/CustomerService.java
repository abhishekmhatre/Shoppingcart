package com.niit.EcommerceBackEnd.services;

import com.niit.EcommerceBackEnd.model.Customer;
import com.niit.EcommerceBackEnd.model.User;

public interface CustomerService 
{
	void registerCustomer(Customer customer);
	boolean isEmailValid(String email);
	boolean isUsernameValid(String Username);
	User getUser(String username);
}
