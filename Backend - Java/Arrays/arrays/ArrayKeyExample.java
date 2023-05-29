package arrays;

import java.util.Scanner;

/* Week 2 - Day 2
 * Completed on 2023/05/02
 */

public class ArrayKeyExample {
	//Searching for Key in array
	//Generates an array of specified length
	//Find key (as a multiple of 10) in array
	//if Found, prints array index.
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);    
		
		System.out.println("Length of array:");
		int len = kb.nextInt();
		int a[] = new int[len];
		
		System.out.println("Find key to search for in array A");
		int key = kb.nextInt();
		//==================================================================
		
		//Fill array A
		for(int i=0;i<a.length;i++)
		{
			a[i] = (i+1)*10; //multiples of 10
		}		

		//Print array A
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]: "+a[i]);
		}	
				
		System.out.println();

		//==================================================================
		
		//Search for key
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == key)
			{
				System.out.println("Key found with value "+key+" at a["+i+"]");
				//Exits if there is matching key
				return;
			}
		}
		//Comes here if no matching key
		System.out.println("Key not found");
				
		kb.close();

	}

}
