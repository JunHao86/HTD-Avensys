package com.demo.springboot.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping("avensys")
	public String welcome(@RequestParam String name, ModelMap model) 
	{
		System.out.println("Requested Param is "+name);
		model.put("name", name);
		return "avensys";
	}
}
