package arrays;

import java.util.Scanner;

/* Week 1 - Day 5
 * Completed on 2023/04/28
 */

public class ArrayLoopsExample {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int a[] = new int[10];
		int i=0;
		int k=0;
	
		//==================================================================
		
		//Do-While Loops
		do{
			System.out.println("["+(i+1)+"]:");
			a[i] = kb.nextInt();
			i++;
		}while(i < a.length);
		
		System.out.println();
		//==================================================================
		
		//For Loops
		for (int j=0;j<10;j++)
		{
			System.out.println("(For loop): Age of ["+(j+1)+"]:"+(a[j]));
		}
		
		System.out.println();
		//==================================================================
		
		//While Loops
		while(k<a.length)
		{
			System.out.println("(While loop): Age of ["+(k+1)+"]:"+(a[k]));
			k++;
		}
	}
}