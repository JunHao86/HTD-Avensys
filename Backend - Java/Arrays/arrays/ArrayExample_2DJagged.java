package arrays;

/* Week 1 - Day 5
 * Completed on 2023/04/28
 */

public class ArrayExample_2DJagged {
	//2 Dimensional Jagged Array
	public static void main(String[] args) {
		
		int bank[][] = new int[5][];
		bank[0] = new int[] {555,666,777}; //defined
		bank[1] = new int[1]; //undefined
		bank[2] = new int[4]; //undefined
		bank[3] = new int[] {111,222,333,444,555}; //defined
		bank[4] = new int[] {1234,4567}; //defined
		
		//==================================================================
		
		//Initializing for bank[1]/bank[2]
		for(int i=1;i<3;i++)
		{
			for(int j=0;j<bank[i].length;j++)
			{
				bank[i][j] = j;
			}
		}
		
		//==================================================================
		
		//Printing
		for(int i=0;i<bank.length;i++)
		{
			for (int j=0; j<bank[i].length;j++)
			{
				System.out.println("B." + i + ",C." + bank[i][j]);
			}
			System.out.println();
		}
	}

}
