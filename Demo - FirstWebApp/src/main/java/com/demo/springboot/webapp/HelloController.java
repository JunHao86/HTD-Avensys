package com.demo.springboot.webapp;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* Week 6 - Day 2
 * Completed on 2023/05/30
 */

@Controller
public class HelloController {

	//Method #1: return a String
	@RequestMapping("hello")
	@ResponseBody
	public String hello()
	{
		return "Hey! Welcome to your first WebApp!";
	}
	
	//==================================================================
	
	//Method #2: use StringBuilder to append and return String
	@RequestMapping("hello-html")
	@ResponseBody
	public String helloHtml()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> Wow ! </title>");
		sb.append("</head>");
		
		sb.append("<body>");
		sb.append("wowe~");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}

	//==================================================================
	
	//Method #3
	@RequestMapping("hello-jsp")
	public String helloJsp()
	{
		//After configuring in application.properties
		//Returns hello.jsp
		//Add dependency in pom.xml
		return "hello";
	}	
}