package com.demo.learnspringframework.jakartaEE;

import java.util.Arrays;

import jakarta.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/* Week 5 - Day 4
 * Completed on 2023/05/25
 */

//incomplete

@Component
class Data{
	
}

//@Component 
@Named
class BusinessClass
{
	private Data data;
	
	
	public Data getData() {
		return data;
	}

	//@Autowired
	@Inject
	public void setData(Data data) {
		System.out.println("Setter injection");
		this.data = data;
	}
}

//==================================================================

@Configuration
@ComponentScan
public class JakartaApplication {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(JakartaApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessClass.class)); //needs @Component to work
		}
		catch(BeansException e)
		{
			e.printStackTrace();
		}
	}

}
