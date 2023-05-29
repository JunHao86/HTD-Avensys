package arrays;

import java.util.Scanner;

/* Week 1 - Day 5
 * Completed on 2023/04/28
 */

public class ArrayExample_2D {
	//	2 Dimensional Array
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int bank[][][] = new int[5][3][1]; //5 banks with 3 customers each, 1 amount
		
		//For each bank (input)
		for(int i=0;i<bank.length;i++)
		{
			//For each customer (input)
			for(int j=0;j<bank[i].length;j++) {
				System.out.println("Bank No. " + (i+1) + ", Amount for Customer No. " + (j+1)+" :");
				
				//Amount held by each customer 
				bank[i][j][0] = kb.nextInt();
			}
		}
		
		//Printing amounts
		for(int i=0;i<bank.length;i++)
		{
			for (int j=0; j<bank[i].length;j++)
			{
				System.out.println("B." + (i+1) + ",C." + (j+1)+" Amount is : " + bank[i][j][0]);
			}
		}

	}

}
