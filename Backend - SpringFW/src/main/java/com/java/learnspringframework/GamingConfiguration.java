package com.java.learnspringframework;

import com.java.learnspringframework.game.GameRunner;
import com.java.learnspringframework.game.GamingConsole;
import com.java.learnspringframework.game.MarioGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* Week 5 - Day 2 
 * Completed on 2023/05/23
 * Used with games, GamingApplication.java
 */

/* defunct
@Configuration
public class GamingConfiguration {
	
	@Bean //loose couple version
	public GamingConsole game()
	{
		var game = new MarioGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game)
	{
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	 
}
*/