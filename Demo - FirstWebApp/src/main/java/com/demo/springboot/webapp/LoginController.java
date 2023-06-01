package com.demo.springboot.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/* Week 6 - Day 3
 * Completed on 2023/05/31
 */

@Controller
@SessionAttributes("name") 
public class LoginController {
	
	private LoginAuthenticationService login_as;
	 
	public LoginController(LoginAuthenticationService login_as) {
		super();
		this.login_as = login_as;
	}
	   
	//==================================================================
 
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginPage() 
	{
		return "login";
	}
	 
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String welcomePage
	(@RequestParam String name, @RequestParam String password, ModelMap model) 
	{ 
		if(login_as.authenticate(name, password)) {
			model.put("name",name);
			return "welcome";
		}
		model.put("errorMessage","Invalid Credentials! Please try again.");
		return "login";
	}
	 
	//==================================================================
	
	@RequestMapping("avensys")
	public String welcome(@RequestParam String name, ModelMap model) 
	{
		System.out.println("Requested Param is "+name);
		model.put("name", name);
		return "avensys";
	}
}
