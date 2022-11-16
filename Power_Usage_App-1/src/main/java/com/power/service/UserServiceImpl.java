package com.power.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.power.model.User;
import com.power.model.UserSession;
import com.power.repository.UserDao;
import com.power.repository.UserSessionDao;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Autowired
	UserSessionDao userSessionDao;
	
	@Override
	public User createUser(User user) {
       Optional<User> opt= userDao.findByMobileNumber(user.getMobileNumber());
		
		if(opt.isPresent()) {
			System.out.println("User already exist");
		  }
		return userDao.save(user);
		
	}

	@Override
	public User updateUser(User user, String key) {
		 Optional<UserSession> optCurrUser= userSessionDao.findByUuid(key);
			
			if(!optCurrUser.isPresent()) {
				
				throw new RuntimeException("Unauthorised access");
			}
			
			return userDao.save(user);
			
			
	}

}
