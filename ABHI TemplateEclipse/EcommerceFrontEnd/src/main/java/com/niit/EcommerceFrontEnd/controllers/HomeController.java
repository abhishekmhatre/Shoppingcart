package com.niit.EcommerceFrontEnd.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan
public class HomeController
{
	public HomeController()
	{
		System.out.println("HomeController is instantiated");
	}
	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/home")
	public String homePage()
	{
		return "home";//logical view name
	}
	
	@RequestMapping(value="/aboutUs")
	public String aboutUs()	
	{
		return "aboutUs";//logical view name
	}
	
	//for logout -> /login?logout=''
	//for invalid credentials -> /login?error=''
	@RequestMapping("/login")
	public String loginPage(@RequestParam(required=false) String error,@RequestParam(required=false) String logout,Model model)
	{
	if(error!=null)
		model.addAttribute("error","Invalid Username/Password");
		if(logout!=null)
			model.addAttribute("msg","Loggedout successfully");
			return "login";
	}

}
