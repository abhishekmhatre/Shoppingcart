package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import com.niit.model.Product;
import com.niit.services.ProductService;

@Controller
public class ProductController 
{
	@Autowired
	private ProductService productService;
		@RequestMapping(value="all/getallproducts")
		
	public ModelAndView getAllProducts()
	{
		List<Product>products=productService.getAllProducts();
		
		//productlist=logical view name[productlist.jpg]
		//products=model attribute[using this attribute in jsp]
		//products=List<products> data
		
		return new ModelAndView("productlist","productAttr",products);
		//JSTL and EL
	}
		//  all/viewproduct/1
		@RequestMapping(value="all/viewproduct/{id}")
		public ModelAndView getProduct(@PathVariable int id)
		{
			Product product=productService.getProduct(id);
			return new ModelAndView("viewproduct","product",product);
			
	    }
	
}
