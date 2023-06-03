package com.demo.springboot.webapp.employee.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

/* Week 6 - Completed on 2023/06/03
 * Last Updated - 2023/06/03
 */

@Controller
@SessionAttributes("user")
public class EmployeeLoginController {

	private EmployeeLoginAuthService loginAuth_s;

	public EmployeeLoginController(EmployeeLoginAuthService login_as) {
		super();
		this.loginAuth_s = login_as;
	}

	//==================================================================
	//Handling e_login page only
		
	@RequestMapping(value = "elogin", method = RequestMethod.GET)
	public String loginPage()
	{
		return "e_login"; 
	}

	@RequestMapping(value = "elogin", method = RequestMethod.POST)
	public String welcomePage
	(@RequestParam String username, @RequestParam String password, ModelMap model)
	{
		if(loginAuth_s.authenticate(username, password)) {
			model.put("user",username);
			return "e_welcome";
		}
		model.put("errorMessage","Invalid Credentials, please try again!");
		return "e_login";
	}
}  