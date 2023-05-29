package excepts;
import java.util.Scanner;

/* Week 4 - Day 2
 * Completed on 2023/05/16
 */

public class FirstExceptionHandle {

		static public void performErrorFix(Exception e) {	
			if(e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
				System.out.println("Do not divide by zero"); //assuming AE is only from this
			}	
			else if(e.getClass().getCanonicalName().equals("java.util.InputMismatchException")) {
				System.out.println("Please enter a valid number");
			}
			else if(e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
				System.out.println("Please enter a valid array size");
			}
			else if(e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
				System.out.println("Array Index is out of bounds");
			}
			else
			{
				System.out.println(e.getMessage());
				System.out.println("Other error occured");
			}
		}

		//==================================================================
		
		public static void main(String[] args) {
			try {	
				//Math
				System.out.println("Connection Established");
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter a number");
				int a = scan.nextInt();
				System.out.println("Enter a number to divide it by");
				int b = scan.nextInt();
				int c = a/b;
				System.out.println(a+" / "+b+" = " + c);
				
				//Array
				System.out.println();
				System.out.println("Enter length of array");
				int len = scan.nextInt();
				int arr[] = new int[len];
				System.out.println("Enter input element to store in array");
				int ele = scan.nextInt();
				System.out.println("Enter position to store in array");
				int pos = scan.nextInt();
				arr[pos] = ele;
				System.out.println("The element " + ele + " is present in " + pos + " position");
			}
			catch(Exception e)
			{
				performErrorFix(e);
			}
				System.out.println("Connection is Closed");
	}
}