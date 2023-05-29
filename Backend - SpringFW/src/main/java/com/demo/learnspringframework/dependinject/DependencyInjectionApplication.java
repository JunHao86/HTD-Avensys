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
class Football{
	PlayerOne playerOne;
	PlayerTwo playerTwo;
	
	@Autowired //3. through constructor - desired,default
	public Football(PlayerOne playerOne, PlayerTwo playerTwo) {
		super();
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}
	
	public String toString() {
		return "Using " + playerOne + " and " + playerTwo + " dependencies";
	}
	
	//==================================================================
	
//	@Autowired //2. through setters
//	void setPlayerOne(PlayerOne playerOne) {
//		this.playerOne = playerOne;
//	}
//	
//	@Autowired //2. through setters
//	void setPlayerTwo(PlayerTwo playerTwo) {
//		this.playerTwo = playerTwo;
//	}
	
	//==================================================================
}

@Component
class PlayerOne{
	
}
@Component
class PlayerTwo{
	
}

//==================================================================

@Configuration
@ComponentScan
public class DependencyInjectionApplication {
	
	public static void main(String[] args) {
		
		
		try(var context = new AnnotationConfigApplicationContext(DependencyInjectionApplication.class))
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

