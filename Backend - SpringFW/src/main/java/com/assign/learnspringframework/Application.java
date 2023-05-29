package com.assign.learnspringframework;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/* Week 5 - Day 4
 * Completed on 2023/05/25
 */

@Component
class BusinessCalculator{
	public DataProvider dp;
	
	@Autowired
	public BusinessCalculator (DataProvider dp) {
		this.dp = dp;
	}
	
	public int findMax() {
		return Arrays.stream(dp.provideData()).max().orElse(0);
	}
}

@Configuration
@ComponentScan("com.assign.learnspringframework")
public class Application {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(Application.class))
		{
			System.out.println("Max value of FirstDataCollector = " + context.getBean(BusinessCalculator.class).findMax());
		}
		catch(BeansException e)
		{
			e.printStackTrace();
		}
	}

}
