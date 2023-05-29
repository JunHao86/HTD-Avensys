package excepts;

/* Week 4 - Day 2
 * Completed on 2023/05/16
 */

class DemoOne
{
	public void alpha()
	{
		try {
		System.out.println("Connection 3 Estd");
		//method occurs recursively at this point 
		//ends only when memory threshold is reached
		//error caught, then closes connection
		alpha(); 
		}
		catch(Error e)
		{
			System.out.println("Dont keep alpha method in loop");
		}
		System.out.println("Connection 3 is Closed");
	}
}
class ExceptionLoopHandle
{
	public static void main(String[] args) {
		System.out.println("Main Connection is Estd");
		DemoOne d1 = new DemoOne();
		d1.alpha();
		System.out.println("Main Connection is closed");
	}
}

//program with specific catch blocks
