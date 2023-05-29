package Strings;

import java.util.Scanner;

/* Week 2 - Day 5
 * Completed on 2023/05/05
 */

/*
 * Create method that accepts two strings as input
 * Returns boolean value
 */
class Equator{
	
	public boolean equaler(String i1, String i2) {	
		if(i1.equals(i2)) {
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
 * check whether the two strings are equal
 */
public class StringProgram2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Equator e = new Equator();
		
		String input1,input2 = new String();
		System.out.println("Input1: ");
		input1 = kb.next();
		System.out.println("Input2: ");
		input2 = kb.next();
		System.out.println("\nInput1: "+input1);
		System.out.println("Input2: "+input2);
		
		
		if(e.equaler(input1,input2)) {
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("NOT EQUAL");
		}
		kb.close();
	}
}
