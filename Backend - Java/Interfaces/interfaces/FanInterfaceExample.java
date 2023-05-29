package interfaces;
import java.util.Scanner;

/* Week 4 - Day 1 
 * Completed on 2023/05/15
 */

//providing method signature
//method body must be written for all methods
interface Calculator
{
	abstract public void mul();
	abstract public void div();
}

//==================================================================

//possible approach - hard code 
class CalcA implements Calculator
{
	public void mul(){
		int a = 5;
		int b = 10;
		int c = a*b;
		System.out.println("5 * 10 = "+c);
	}
	public void div(){
		int a = 10;
		int b = 5;
		int c = a/b;
		System.out.println("10 / 5 = "+c);
	}
}

//==================================================================

//normal + condition check
class CalcB implements Calculator
{
	public void mul(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a==0 || b==0)
		{
			int c = 0;
			System.out.println(a+" * "+b+" = "+c);
		}
		else 
		{
			int c = a*b;
			System.out.println(c);
		}
	}
	public void div(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(b!=0)
		{
			int c = a/b;
			System.out.println(a+" / "+b+" = "+c);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}

//==================================================================

class MathFunction
{
	public void useCalculator(Calculator calc) 
	{
		calc.mul();
		calc.div();
	}
}

//==================================================================

public class FanInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcA c1 = new CalcA();
		MathFunction mf = new MathFunction();
		mf.useCalculator(c1);
	}

}
