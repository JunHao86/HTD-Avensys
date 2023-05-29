package com.java.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/* Week 5 - Day 2 
 * Completed on 2023/05/23
 */

@Component
//@Service: If you have business logic in class
//@Controller: If you have controllers related to REST API/WebApps
//@Repository: If you have Database CRUD logic (Create/Update)
@Qualifier("PacManQualifier")
public class PacManGame implements GamingConsole {

	//public, higher visibility while overriding
	public void up()
	{
		System.out.println("Joystick shifted upwards");
	}
	
	public void down()
	{
		System.out.println("Joystick shifted downwards");
	}
	
	public void left()
	{
		System.out.println("Joystick shifted to the left");
	}
	
	public void right()
	{
		System.out.println("Joystick shifted to the right");
	}

}