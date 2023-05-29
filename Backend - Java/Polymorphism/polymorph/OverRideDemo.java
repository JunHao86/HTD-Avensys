package polymorph;

/* Week 3 - Day 5
 * Completed on 2023/05/12
 */

class Demo1 extends Object
{
	//Step 3 - Object initialized with a = 0 ; b = 0
	//Enters public Demo1() constructor
	int a;
	int b;
	
	public Demo1() {
		//Step 4 - Object values changed, a = 10 ; b = 20
		//Returns to aforementioned Demo2 constructor
		a=10;
		b=20;
	}
	
	public Demo1(int a,int b)
	{
		this.a = a;
		this.b=b;
	}
}

//==================================================================

class Demo2 extends Demo1
{
	public Demo2()
	{
		super();
		a=100;
		b=200;
	}
	
	
	public Demo2(int a,int b) 
	{
		//Step 2 - Enters public Demo1 constructor via explicit super() call
		//Step 5 - Object values changed, a = 1000 ; b = 2000
		//Returns to main method
		this.a = a;
		this.b = b;
	}
}

//==================================================================

public class OverRideDemo {

	public static void main(String[] args) {
		//Step 1 - Enters public Demo2 (int a, int b) constructor
		Demo2 d2 = new Demo2(1000,2000);
		//Prints value of a and b for d2 Object.
		System.out.println(d2.a);
		System.out.println(d2.b);
	}

}
