package com.demo.learnspringframework.prepost;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/* Week 5 - Day 3
 * Completed on 2023/05/24
 */

@Component
class NormalClass{
	private Dependency dependency;
	
	public NormalClass(Dependency d) {
		super();
		this.dependency = d;
		System.out.println("Dependency created in NormalClass ");
	}
	
	@PostConstruct //runs after startup 
	public void onInitialize() {
		dependency.getReady();
	}
	
	@PreDestroy //before object is destroyed
	public void cleanUp() {
		dependency.run();
	}
}

@Component
class Dependency{

	public void getReady() {
		System.out.println("PostConstruct - should appear at start");
	}
 
	public void run() {
		System.out.println("PreDestroy - should appear at end");
	}
	
}

//==================================================================

@Configuration
@ComponentScan
public class PrePostAnnotationApplication {

	public static void main(String[] args) {
	
		try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println();		
			
//			context.getBean(NormalClass.class).onInitialize();
//			context.getBean(NormalClass.class).cleanUp();
		}
		catch(BeansException e)
		{
			e.printStackTrace();
		}
	}
}
