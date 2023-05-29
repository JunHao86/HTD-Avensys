package excepts;
import java.util.Scanner;

/* Week 4 - Day 1
 * Completed on 2023/05/15
 */


//Propagation of exceptions
class Demo1
{
	public void alpha()
	{
		System.out.println("Connection 3 Estd");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int a = scan.nextInt();
		System.out.println("Enter the Denominator");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println("Result is :" + c);
		System.out.println("Connection 3 is Closed");
	}
}
	
//==================================================================
	
class Demo2
{
	public void beta()
	{
		System.out.println("Connection 2 is Estd");
		Demo1 d1 = new Demo1();
		d1.alpha();
		System.out.println("Connection 2 is closed");
	}
}

//==================================================================
	
class Demo3
{
	public void gamma()
	{
		System.out.println("Connection 1 is Estd");
		Demo2 d2 = new Demo2();
		d2.beta();
		System.out.println("Connection 1 is closed");
	}
}
	
//==================================================================

public class ExceptionPropagationHandle {

	public static void main(String[] args) {
			System.out.println("Main Connection is Estd");
			Demo3 d3 = new Demo3();
			d3.gamma();
			System.out.println("Main Connection is closed");
	}
	
}