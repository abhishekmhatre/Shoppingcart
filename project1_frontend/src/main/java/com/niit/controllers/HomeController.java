package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	public HomeController()
	{
		System.out.println("Home Controller is Instatinated");
	}
	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/home")
	public String homepage()
	{
		return "home";
	}
	
	@RequestMapping(value="/aboutus")
	public String aboutUs()
	{
		return "aboutUs";
	}
}
