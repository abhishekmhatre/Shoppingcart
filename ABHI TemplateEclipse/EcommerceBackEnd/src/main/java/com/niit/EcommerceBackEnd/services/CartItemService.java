package com.niit.EcommerceBackEnd.services;

import com.niit.EcommerceBackEnd.model.Cart;
import com.niit.EcommerceBackEnd.model.CartItem;
import com.niit.EcommerceBackEnd.model.CustomerOrder;

public interface CartItemService 
{
	void saveOrUpdatCartItem(CartItem cartItem);
	void removeCartItem(int cartItemId);
	Cart getCart(int cartId);
	CustomerOrder createOrder(Cart cart);
}
