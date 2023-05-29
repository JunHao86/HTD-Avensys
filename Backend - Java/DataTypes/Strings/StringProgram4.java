package Strings;

import java.util.Scanner;

/* Week 2 - Day 5
 * Completed on 2023/05/05
 */

/*
 * Create method that accepts name as input
 * Returns boolean value
 * 
 * Hint: String convert into char array
 */
class Comparator2{
	
	public boolean hasS(String input) {
		System.out.println("\nEntered method");
		
		char ch[] = input.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == 's') {
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
 * Do not use contains(), charAt(), indexOf()
 */
public class StringProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		Comparator2 c = new Comparator2();
		
		String input = new String();
		System.out.println("Type:");
		input = kb.next();
		System.out.println("String: "+input);
		
		System.out.println(c.hasS(input));
		
		kb.close();
	}
}

