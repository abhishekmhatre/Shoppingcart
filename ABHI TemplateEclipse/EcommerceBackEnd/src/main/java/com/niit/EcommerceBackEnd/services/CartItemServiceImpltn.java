/*package com.niit.EcommerceBackEnd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.EcommerceBackEnd.dao.CartItemDao;
import com.niit.EcommerceBackEnd.model.Cart;
import com.niit.EcommerceBackEnd.model.CartItem;
import com.niit.EcommerceBackEnd.model.CustomerOrder;

@Service
public class CartItemServiceImpltn implements CartItemService
{
	@Autowired
	private CartItemDao cartItemDao;
	public void saveOrUpdatCartItem(CartItem cartItem)
	{
	cartItemDao.saveOrUpdateCartItem(cartItem);
	}
	public void removeCartItem(int cartItemId) 
	{
		cartItemDao.removeCartItem(cartItemId);
	}
	public Cart getCart(int cartId) 
	{
		return cartItemDao.getCart(cartId);
	}
	public CustomerOrder createOrder(Cart cart) 
	{
		return cartItemDao.createOrder(cart);
	}
}
*/