package com.shujaac.service;

import java.util.List;

import com.shujaac.exception.UserException;
import com.shujaac.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
