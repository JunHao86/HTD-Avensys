package com.java.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.java.learnspringframework.game.GameRunner;
//import com.java.learnspringframework.game.GamingConsole;

/* Week 5 - Day 2 
 * Completed on 2023/05/23
 * Used with games, GamingApplication.java
 */


@Configuration
@ComponentScan("com.java.learnspringframework.game") //get @Components from other packages
public class GamingApplication {
	
	public static void main(String[] args) {
		
		//Try-catch for errors
		//Finds GameRunner class component
		//GameRunner class component loads up game using default constructor
		//Uses run() method to simulate up/down/left/right in specified game
		try(var context = new AnnotationConfigApplicationContext(GamingApplication.class))
		{
			context.getBean(GameRunner.class).run();
		}
		catch(BeansException e)
		{
			e.printStackTrace();
		}
	}
}
	
//  Defunct after using @ComponentScan
//	@Bean
//	public GameRunner gameRunner(GamingConsole game)
//	{
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}
	

