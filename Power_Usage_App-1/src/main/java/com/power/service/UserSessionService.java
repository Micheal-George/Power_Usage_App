package com.power.service;

import java.util.List;

import com.power.model.LoginUser;
import com.power.model.User;
import com.power.model.UserSession;

public interface UserSessionService {
	public String logIntoAccount(LoginUser user) throws Exception;
	
	public String logOutAccount(String key);
	
	public List<UserSession> getAllCurrentUsers();

}
