package com.java.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/* Week 5 - Day 1 
 * Completed on 2023/05/22
 * Updated on 2023/05/23
 */

@Component //Retrieved by ComponentScan in com.java.learnspringframework package
public class GameRunner {
	
	GamingConsole game;
		
	//Default: Primary
	//If no qualifier is specified, it loads @Primary game (MarioGame)
	//public GameRunner(GamingConsole game) {
	//	this.game = game;
	//}

	//Default: Primary
	//Higher priority: Qualifier
	//Autowired using the default constructor
	public GameRunner(@Qualifier("PacManQualifier")GamingConsole game) {
		this.game = game;
	}
	
	//Runs the game loaded using the above constructor
	public void run()
	{
		System.out.println("Running game: " +game);
		
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
