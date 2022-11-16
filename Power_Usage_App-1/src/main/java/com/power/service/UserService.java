package com.power.service;

import com.power.model.User;

public interface UserService {
	
    public User createUser(User user);
	
	public User updateUser(User user, String key);

}
