package com.shujaac.service;

import java.util.List;

import com.shujaac.exception.ProductException;
import com.shujaac.modal.Rating;
import com.shujaac.modal.User;
import com.shujaac.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
