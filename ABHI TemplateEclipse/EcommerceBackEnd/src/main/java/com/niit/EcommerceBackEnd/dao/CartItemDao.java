package com.niit.EcommerceBackEnd.dao;

import com.niit.EcommerceBackEnd.model.Cart;
import com.niit.EcommerceBackEnd.model.CartItem;
import com.niit.EcommerceBackEnd.model.CustomerOrder;

public interface CartItemDao 
{
	void saveOrUpdateCartItem(CartItem cartItem);
	void removeCartItem(int cartItemId);
	Cart getCart(int cartId);
	CustomerOrder createOrder(Cart cart);
}
