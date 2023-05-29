package com.demo.learnspringframework.lazyinit;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.demo.learnspringframework.dependinject.DependencyInjectionApplication;

/* Week 5 - Day 3
 * Completed on 2023/05/24
 */

@Component 
@Lazy(value=false)
//1. default
//2. Eager initialization - initialized at start of application
//3. Errors preventable before application runs (fix compile time errors)
//4. Always initialized at startup - more memory consumption
class DemoOne{
	
}

//==================================================================

@Component
@Lazy(value=true)
//1. not default
//2. Lazy Initialization - initialized when first made used in application
//3. Errors resulted as runtime exception
//4. Only initialized when required - less memory consumption
class DemoTwo{
	
	private DemoOne demoOne;
	
	public DemoTwo(DemoOne demoOne) {
		//Criteria logic to be executed before initialization
		System.out.println("Initialization of DemoTwo");
		this.demoOne = demoOne;
	}	
	
	public void display() {
		System.out.println("Some display");
	}	
	
}

//==================================================================

@Configuration
@ComponentScan
public class LazyInitializationApplication {

	public static void main(String[] args) {
		
		
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println();
			
			System.out.println("Lazy DemoTwo - Initializing ");
			System.out.println("======================");
			context.getBean(DemoTwo.class).display();
			System.out.println("======================");
			System.out.println("Lazy DemoTwo - Showcased");
		}
		catch(BeansException e)
		{
			e.printStackTrace();
		}
	}
}
