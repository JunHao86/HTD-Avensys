package com.demo.learnspringframework.scope;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/* Week 5 - Day 3
 * Completed on 2023/05/24
 */

@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
//1. 	Default Singleton Design Pattern
//2.    Same Object reused every call
//3.	One object created for Spring Container
//4.    Used frequently
class GeneralClass{
	
}

//==================================================================

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
//1.	Not Default Prototype Design Pattern
//2.	New Bean Object created every call
//3.	Many Objects created per Spring IOC Container
//4. 	Used rarely
class PrototypeClass{
	
}

//==================================================================

@Configuration
@ComponentScan
public class SpringBeansScopeApplication {

	public static void main(String[] args) {
		
		
		try(var context = new AnnotationConfigApplicationContext(SpringBeansScopeApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println();
			
			//New Bean Object created in each call
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
			System.out.println();
			
			//Same object reused in each call
			System.out.println(context.getBean(GeneralClass.class));
			System.out.println(context.getBean(GeneralClass.class));
			
		}
		catch(BeansException e)
		{
			e.printStackTrace();
		}
	}
}
