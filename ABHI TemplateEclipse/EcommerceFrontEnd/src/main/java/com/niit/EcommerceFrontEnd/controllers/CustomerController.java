package com.niit.EcommerceFrontEnd.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.EcommerceBackEnd.model.Customer;
import com.niit.EcommerceBackEnd.services.CustomerService;

@Controller
@ComponentScan
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value="/all/registrationform")
	public ModelAndView getRegistrationForm()
	{
		return new ModelAndView("registrationform","customer",new Customer());
	}
	@RequestMapping(value="/all/registercustomer")
	public String registerCustomer(@Valid @ModelAttribute Customer customer,BindingResult result,Model model)
	{
		if(result.hasErrors())//hibernate validation
			return "registrationform";
		if(!customerService.isUsernameValid(customer.getUser().getUsername()))
		{
			model.addAttribute("duplicateUsername","This Username already exists.Please enter diffrent username.");
			return "registrationform";
		}
		
		if(!customerService.isEmailValid(customer.getEmail()))
		{
			model.addAttribute("duplicateEmail","this email already exists.Please enter diffrent email id.");
			return "registrationform";
		}
		customerService.registerCustomer(customer);
		return "login";
	}
}
