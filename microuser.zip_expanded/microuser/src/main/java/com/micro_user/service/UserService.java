package com.micro_user.service;

import java.util.List;

import com.micro_user.model.User;

public interface UserService {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getuser(String id);
	
	
	
	

}
