package com.java.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/* Week 5 - Day 2 
 * Completed on 2023/05/23
 * Used with HelloWorldApp.java
 */


record Student(String name, int age, Address address) {} ;

record Address(String city) {} ;



@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name()
	{
		return "Emmanuel";
	}
	
	@Bean
	public int age()
	{
		return 45;
	}
	
	@Bean
	public Student student()
	{
		//return new Student("Emma",26);
		
		//Injecting of bean is possible using method calls 
		return new Student(name(),age(),new Address("Singapore"));
	}
	
	
	@Bean //use @Qualifier to use a specific Address Bean
	public Student student2(String name, int age, @Qualifier("addressSecondQualifier") Address addressTwo)
	{
		return new Student(name,age,addressTwo);
	}
	
	
	@Bean //(name="addressFirst")
	@Primary
	public Address addressOne() {
		return new Address("Tampines Street 51");
	}
	
	@Bean //(name="addressSecond")
	@Qualifier("addressSecondQualifier")
	public Address addressTwo() {
		return new Address("Simei St 69");
	}

}        
