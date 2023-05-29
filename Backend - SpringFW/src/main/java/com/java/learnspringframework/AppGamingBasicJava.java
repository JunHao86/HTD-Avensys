package com.java.learnspringframework;

//import com.java.learnspringframework.game.*;

import com.java.learnspringframework.game.GameRunner;
import com.java.learnspringframework.game.MarioGame;
import com.java.learnspringframework.game.SuperContraGame;

/* Week 5 - Day 1 
 * Completed on 2023/05/22
 */

public class AppGamingBasicJava {

	public static void main(String[] args) {
		//Object Creation for Mario/SuperContra game
		var marioGame = new MarioGame();
		var contraGame = new SuperContraGame();
		
		//Object Creation for GameRunner object
		//Wiring dependencies
		var gameRunner = new GameRunner(contraGame);
		var gameRunner2 = new GameRunner(marioGame);
		
		gameRunner.run();
		System.out.println();
		gameRunner2.run();
	}

}
