package com.demo.springboot.webapp;

import org.springframework.stereotype.Service;

/* Week 6 - Day 3
 * Completed on 2023/05/31
 */

@Service
public class LoginAuthenticationService {

	public boolean authenticate(String username, String password) {
	
		boolean isValidUserName = username.equalsIgnoreCase("username");
		boolean isValidPassWord = password.equalsIgnoreCase("password");
		
		return isValidUserName && isValidPassWord;
	}
}
