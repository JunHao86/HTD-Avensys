package com.java.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/* Week 5 - Day 1 
 * Completed on 2023/05/22
 * Updated on 2023/05/23
 */

@Component
//@Service: If you have business logic in class
//@Controller: If you have controllers related to REST API/WebApps
//@Repository: If you have Database CRUD logic (Create/Update)
@Primary
public class MarioGame implements GamingConsole{

	//public, higher visibility while overriding
	public void up()
	{
		System.out.println("Jumping");
	}
	
	public void down()
	{
		System.out.println("Entering Pipe");
	}
	
	public void left()
	{
		System.out.println("Braking");
	}
	
	public void right()
	{
		System.out.println("Accelerating");
	}

}
