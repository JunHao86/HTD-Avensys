package statics;

/* Week 3 - Day 2 
 * Completed on 2023/05/09
 */

class Example extends Object 
{
	static int first,second,third;
	int a,b,c; //0 on initialization 
	
	//==================================================================
	
	//Default 
	static 
	{	
	first = 123;
	second = 456;
	third = 789;
	//	a = 2;
	//	b = 4;
	//	c = 6;
	//Cannot set a,b,c
	//static ref to non-static field
	}
	
	{
	a = 111;
	b = 222;
	c = 333;
	first = 444;
	second = 555;
	third = 666;
	}
	
	//==================================================================
	
	//Methods
	static void printStatics() {
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
		//Cannot print a,b,c
		//static ref to non-static field
	}
		
	//Printing values
	void printInstances() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

//==================================================================

public class StaticPrintExample {

	public static void main(String[] args) {
		Example.printStatics(); //Statics already in heap, printable
		
		//Alphabet.printInstances();
		//Cannot print instances, 
		//static ref to non-static method
		
		Example e = new Example();
		System.out.println();
		e.printInstances();
		Example.printStatics();
	}

}