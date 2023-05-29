package com.java.learnspringframework;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* Week 5 - Day 2 
 * Completed on 2023/05/23
 * Used with HelloWorldConfiguration.java
 */

public class HelloWorldApp {

	public static void main(String[] args) {
		//Step 1 - Launch Spring Context
		
		//Option 1
//		var config = HelloWorldConfiguration();                        
//		var context = new AnnotationConfigApplicationContext();
		
		//Option 2
//		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//Step 2 - Configure things for spring to manage - Configuration Class
		//get Beans from HelloWorldConfiguration	
		
		//Step 3 - Retrieve the beans being managed by Spring
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) 
		{
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("student"));
			
			//Alternative method to retrieve beans
			System.out.println();
			System.out.println(context.getBean("addressOne"));
			System.out.println(context.getBean("student2"));
			
			//Does not work if there is more than one Address class
			//Work around using @Qualifier
			System.out.println();
			System.out.println(context.getBean(Address.class));
			
			//Getting a list of all beans in Spring
			//	-SpringFramework beans
			//	-Spring class HelloWorldConfig (@Configuration declaration)
			//	-Each @Bean declaration
			System.out.println();
			System.out.println(context.getBeanDefinitionCount());
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
