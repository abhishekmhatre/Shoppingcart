package com.niit.ShoppingCartFrontend.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.niit.ShoppingCartBackend.model.Product;

public class ProductValidator implements Validator
{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Product.class.equals(clazz);
	}

	@Override
	public void validate(Object target ,Errors errors) 
	{
		Product product = (Product) target;
		
		//Whether file has been selected or not
		if(product.getFile() == null || product.getFile().getOriginalFilename().equals(""))
		{
			errors.reject("file" , null, "Please Select an image file to upload!");
			return;
		}
		
		if(! (product.getFile().getContentType().equals("image/jpeg") ||
			  product.getFile().getContentType().equals("image/png")||
			  product.getFile().getContentType().equals("image/gif")
			 ))
			
		{
			  errors.rejectValue("file", null, "Please use only image file for upload!..");
		      return;
		}
	
	
	
	
	}

}
