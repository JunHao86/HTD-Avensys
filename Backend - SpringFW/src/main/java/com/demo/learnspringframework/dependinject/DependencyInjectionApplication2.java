package com.demo.learnspringframework.dependinject;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

/* Week 5 - Day 3
 * Completed on 2023/05/24
 */

@Component
class Supermarket{

	@Autowired //1. variable declaration
	CustomerOne custOne;
	
	@Autowired //1. variable declaration
	CustomerTwo custTwo;
	
	
	public String toString() {
		return "Using " + custOne + " and " + custTwo + " dependencies";
	}
	
}

//==================================================================

@Component
class CustomerOne{
	
}
@Component
class CustomerTwo{
	
}

//==================================================================

@Configuration
@ComponentScan
public class DependencyInjectionApplication2 {
	
	public static void main(String[] args) {
		
		
		try(var context = new AnnotationConfigApplicationContext(DependencyInjectionApplication2.class))
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
		catch(BeansException e)
		{
			e.printStackTrace();
		}
	}
}

