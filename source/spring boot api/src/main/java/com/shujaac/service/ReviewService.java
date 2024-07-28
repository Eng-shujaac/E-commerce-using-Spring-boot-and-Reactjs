package com.shujaac.service;

import java.util.List;

import com.shujaac.exception.ProductException;
import com.shujaac.modal.Review;
import com.shujaac.modal.User;
import com.shujaac.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
