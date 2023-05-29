package Strings;

import java.util.Scanner;

/* Week 2 - Day 5
 * Completed on 2023/05/05
 */

/*
 * Create method that accepts two strings as input
 * Returns boolean value
 */
class Grater{
	
	public boolean great(String i1, String i2) {	
		if(i1.compareTo(i2) > 0 ) {
			return true;
		}
		else {
			return false;
		}
	}
}

//==================================================================

/*
 * Write a Java Program to take two strings as input,
 * check which of the two strings is greater
 */
public class StringProgram3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Grater g = new Grater();
		
		String input1,input2 = new String();
		System.out.println("Input1: ");
		input1 = kb.next();
		System.out.println("Input2: ");
		input2 = kb.next();
		System.out.println("\nInput1: "+input1);
		System.out.println("Input2: "+input2);
	
		
		if(g.great(input1,input2)) {
			System.out.println("Input 1 is greater than Input 2");
		}
		else
		{
			System.out.println("Input 2 is greater than Input 1");
		}
		kb.close();
	}
}
