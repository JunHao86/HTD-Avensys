package Strings;

import java.util.Scanner;

/* Week 2 - Day 5
 * Completed on 2023/05/05
 */

/*
 * Create method that accepts name as input
 * Returns boolean value
 */
class Comparator{
	
	public boolean hasS(String input) {
		System.out.println("\nEntered method");
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i) == 's') {
				return true;
			}
		}
		return false;
	}
}

//==================================================================

/*
 * Write a Java Program to take the name as input from the keyboard,
 * check whether the name contains 's' or not
 */
public class StringProgram1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Comparator c = new Comparator();
		
		String input = new String();
		System.out.println("Type:");
		input = kb.next();
		System.out.println("String: "+input);
		
		System.out.println(c.hasS(input));
		
		kb.close();
	}
}
