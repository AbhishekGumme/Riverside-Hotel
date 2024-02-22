package com.riverhotel.service;

import java.util.List;

import com.riverhotel.model.User;

public interface IUserService {
   
	User registerUser(User user);
    
	List<User> getUsers();
    
	void deleteUser(String email);
    
	User getUser(String email);
}
