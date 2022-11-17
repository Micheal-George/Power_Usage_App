package com.power.service;

import com.power.model.LoginUser;
import com.power.model.User;

public interface UserSessionService {
	public String logIntoAccount(LoginUser user) throws Exception;
	
	public String logOutAccount(String key);

}
