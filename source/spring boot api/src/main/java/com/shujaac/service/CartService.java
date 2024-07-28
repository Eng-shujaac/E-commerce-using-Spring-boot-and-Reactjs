package com.shujaac.service;

import com.shujaac.exception.ProductException;
import com.shujaac.modal.Cart;
import com.shujaac.modal.CartItem;
import com.shujaac.modal.User;
import com.shujaac.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
