package arrays;

import java.util.Scanner;

/* Week 2 - Day 2
 * Completed on 2023/05/02
 */

public class ArrayCollegeExample {
	//Custom Jagged Array College
	//3 College
	//For each college, there are predefined number of classes
	//For each class, there are predefined number of students
	//Input the marks for each student
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);    

		//College/Classes/Students thing 
		int college[][][] = new int[3][][];
		
		//Initializing Classes
		college[0] = new int[3][];
		college[1] = new int[2][];
		college[2] = new int[4][];
		
		//Initializing Students
		college[0][0] = new int[3];
		college[0][1] = new int[2];
		college[0][2] = new int[4];
		
		//Initializing Students
		college[1][0] = new int[5];
		college[1][1] = new int[3];
		
		//Initializing Students
		college[2][0] = new int[1];
		college[2][1] = new int[4];
		college[2][2] = new int[2];
		college[2][3] = new int[3];
		
		//==================================================================
		
		//Assign Marks for each student in each college+class
		for(int i=0;i<college.length;i++)
		{
//			System.out.println("College "+ (i+1) +", number of classes: ");
//			college[i] = new int[kb.nextInt()][];
			for (int j=0;j<college[i].length;j++)
			{
//				System.out.println("College "+ (i+1) +", Classes "+ (j+1) +", number of studs: ");
//				college[i][j] = new int[kb.nextInt()];
				for (int k=0;k<college[i][j].length;k++)
				{
					System.out.println("Co"+ (i+1) +", Cl"+ (j+1) +", S" + (k+1) + ", Marks = ");
					college[i][j][k] = kb.nextInt();
				}
			}
			System.out.println();
		}
		
		//==================================================================
		
		//Printing
		for(int i=0;i<college.length;i++)
		{
			for (int j=0; j<college[i].length;j++)
			{
				for (int k=0; k<college[i][j].length;k++)
				{
					System.out.println("College " + i + ", Class " + j + ", Student " + k + " Mark:" + college[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
