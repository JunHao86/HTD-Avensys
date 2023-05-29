package com.demo.learnspringframework.XML;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* Week 5 - Day 4
 * Completed on 2023/05/25
 */

//Jakarta CDI - Context and Dependency Injection
public class XMLConfigurationContextApplication {

	//Pre-requisite: contextConfiguration.xml (see src/main/resources)
	public static void main(String[] args) {
		try(var context = new ClassPathXmlApplicationContext
				("contextConfiguration.xml")) 
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			//Bean id - name / age from xml
			System.out.println();
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			//Running game from xml
//			context.getBean(gameRunner.class).run();
			
			
		}
		catch(BeansException e)
		{
			e.printStackTrace();
		}
	}


}

