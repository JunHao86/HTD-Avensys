package com.demo.springboot.webapp.employee.login;

import org.springframework.stereotype.Service;

/* Week 6 - Completed on 2023/06/03
 * Last Updated - 2023/06/03
 */

@Service
public class EmployeeLoginAuthService {

	public boolean authenticate(String username, String password) {

		//Hard code tentatively
		boolean isValidUserName = username.equalsIgnoreCase("Admin");
		boolean isValidPassWord = password.equalsIgnoreCase("Password");

		return isValidUserName && isValidPassWord;
	}
}
