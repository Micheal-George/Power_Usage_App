package com.power.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.power.model.LoginUser;
import com.power.service.UserSessionService;

@RestController

@RequestMapping("/user")
public class LoginController {
	
	

		@Autowired
		private UserSessionService userSessionService;

		

		// for user login
		@PostMapping("/userlogin")
		public String logInUser(@RequestBody LoginUser user) throws Exception {
			return userSessionService.logIntoAccount(user);
		}

		// for user logout
		@PatchMapping("/userlogout")
		public String logOutUser(@RequestParam(required = false) String key) {
			return userSessionService.logOutAccount(key);
		}


}
