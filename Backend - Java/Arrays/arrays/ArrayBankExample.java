package arrays;

import java.util.Scanner;

/* Week 1 - Day 5
 * Completed on 2023/04/28
 */

public class ArrayBankExample {
	//Custom Jagged Array Bank
	//3 Banks
	//For each bank, decide the number of branches
	//For each branch, decide the number of customers
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);  
		int bank[][][] = new int[3][][];
		
		//==================================================================
		
		for(int i=0;i<bank.length;i++)
		{
			System.out.println("Bank "+ (i+1) +", number of branches: ");
			bank[i] = new int[kb.nextInt()][];
			
			for (int j=0;j<bank[i].length;j++)
			{
				System.out.println("Bank "+ (i+1) +", Branch "+ (j+1) +", number of custs: ");
				bank[i][j] = new int[kb.nextInt()];
				
				for (int k=0;k<bank[i][j].length;k++)
				{
		//			System.out.println("B"+ (i+1) +", Br"+ (j+1) +", C" + (k+1) + ", Value = ");
		//			bank[i][j][k] = kb.nextInt();
					bank[i][j][k] = k;
				}
			}
			System.out.println();
		}
		
		//==================================================================
		
		//Printing
		for(int i=0;i<bank.length;i++)
		{
			for (int j=0; j<bank[i].length;j++)
			{
				for (int k=0; k<bank[i][j].length;k++)
				{
					System.out.println("B." + i + ",Br." + j + ",C." + bank[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
