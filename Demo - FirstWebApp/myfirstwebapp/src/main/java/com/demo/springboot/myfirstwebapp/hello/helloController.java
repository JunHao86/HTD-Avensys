package com.demo.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello()
	{
		return "Hey Team !! Welcome to learn your first web application";
	}
	
	@RequestMapping("hello-html")
	@ResponseBody
	public String helloHtml()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First Html Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("Hey Team !! Welcome to learn your first web application from html");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("hello-jsp")
	public String helloJsp()
	{
		return "hello";
	}

}
