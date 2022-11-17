package com.power.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.power.model.LoginUser;
import com.power.model.User;
import com.power.model.UserSession;
import com.power.repository.UserDao;
import com.power.repository.UserSessionDao;

import net.bytebuddy.utility.RandomString;

@Service
public class UserSessionServiceImpl implements UserSessionService{
	
	@Autowired
	UserDao udao;
	
	@Autowired
	UserSessionDao usessiondao;

	@Override
	public String logIntoAccount(LoginUser user) throws Exception {
	
		
			Optional<User> opt=udao.findByMobileNumber(user.getMobileNumber());
			  if(!opt.isPresent())
				  return "Enter Registered Mobile Number";
			  
			  Integer userId = opt.get().getId();
			Optional<UserSession>  currUser= usessiondao.findByuserId(userId);
				
				if(currUser.isPresent()) {
					return "User already logged in with this number.";
				}
				
				if(user.getPassword().equals(opt.get().getPassword())) {
					
					String key = RandomString.make(6);
					UserSession currentUserSession = new UserSession(userId, key, LocalDateTime.now());
					
					usessiondao.save(currentUserSession);
			     return currentUserSession.toString();
			  
		        }
				else
			  return "Please enter valid password";
		
		
	}

	@Override
	public String logOutAccount(String key) {
Optional<UserSession> currUserOpt=usessiondao.findByUuid(key);
		
		if(currUserOpt.isPresent()) {
			usessiondao.delete(currUserOpt.get());
			return "User logged out successfully.";
		}
		return "User does not exist, Enter correct uuid";
	}



}