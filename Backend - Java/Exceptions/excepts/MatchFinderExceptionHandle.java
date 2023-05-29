package excepts;

import java.util.Scanner;

/* Week 4 - Day 3
 * Completed on 2023/05/17
 */



class UnderAgeException extends Exception
{
	public String getMessage()
	{
		return "Users under the age of 18 may not use the MatchFinder application, terminating";
	}
}

//==================================================================

class OverAgeException extends Exception
{
	public String getMessage()
	{
	return "Users over the age of 45 may not use the MatchFinder application, terminating";
	}
}

//==================================================================

public class MatchFinderExceptionHandle {

	int age;
	
	public void acceptInput() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		age = s.nextInt();
	}
	
	public void verify() throws UnderAgeException,OverAgeException
	{
		if(age < 18)
		{
			UnderAgeException uae = new UnderAgeException();
			throw uae;
		}
		if(age > 45)
		{
			OverAgeException oae = new OverAgeException();
			throw oae;
		}
		else
		{
			System.out.println("Age verified, proceeding");
		}
	}
	
	
//==================================================================
	
	//age <18 , raise UnderAgeException
	//age >45 , raise OverAgeException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MatchFinderExceptionHandle mf = new MatchFinderExceptionHandle();
			mf.acceptInput();
			mf.verify();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("End of MatchFinder registration process");
		}
		
	}

}
