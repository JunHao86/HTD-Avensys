package arrays;

import java.util.Scanner;

/* Week 2 - Day 2
 * Completed on 2023/05/02
 */

public class ArrayReverseExample {
	//Fill array A with elements
	//Using array A, fill array B in reverse order
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);    
		
		System.out.println("Length of array:");
		//Create array A
		int len = kb.nextInt();
		int a[] = new int[len];
		
		//Create array B
		int b[] = new int[a.length];
		
		//==================================================================
		
		//Fill array A
		for(int i=0;i<a.length;i++)
		{
			a[i] = i*10; //multiples of 10
		}		
		
		//==================================================================
		
		//Fill array B backwards
		for(int i=0;i<b.length;i++)
		{
			b[i] = a[a.length-1-i];
		}
		
		//Print Array B
		for(int i=0;i<b.length;i++)
		{
			System.out.println("b at ["+i+"] is "+ b[i]);
		}
		
		kb.close();
		
	}

}
