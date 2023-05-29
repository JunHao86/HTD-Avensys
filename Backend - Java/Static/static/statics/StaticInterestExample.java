package statics;

import java.util.Scanner;

/* Week 4 - Day 1 
 * Completed on 2023/05/15
 */


interface CalculateSimpleInterest{
	
	static final int time = 1; //Assuming time = 1 year
	public void acceptInput();
	public void findSI();
	public void display();
}

//==================================================================

//Assuming interest = 4%/annum, hardcoded
class BusinessMan1 implements CalculateSimpleInterest{
	int baseAmount;
	float interestRate = 0.04f;
	float simpleInterest;
	
	public void acceptInput() {
		//hardcoded
		baseAmount = 5000;
	}
	public void findSI() {
		simpleInterest = baseAmount * interestRate * time;
	}
	public void display() {
		System.out.println("BusinessMan1 returns a simple interest value of: "+simpleInterest);
	}
}

//==================================================================

//Assuming interest = 6%/annum, normal
class BusinessMan2 implements CalculateSimpleInterest{
	int baseAmount;
	float interestRate = 0.06f;
	float simpleInterest;
	
	public void acceptInput() {
		System.out.println("BusinessMan2: Please input your principle amount: ");
		Scanner scan = new Scanner(System.in);
		baseAmount = scan.nextInt();
	}
	public void findSI() {
		simpleInterest = baseAmount * interestRate * time;
	}
	public void display() {
		//no condition check
		System.out.println("BusinessMan2 returns a simple interest value of: "+simpleInterest);
	}
}

//==================================================================

//Assuming interest = 5%/annum, normal+condition check
class BusinessMan3 implements CalculateSimpleInterest{
	int baseAmount;
	float interestRate = 0.05f;
	float simpleInterest;
	
	public void acceptInput() {
		System.out.println("BusinessMan3: Please input your principle amount: ");
		Scanner scan = new Scanner(System.in);
		baseAmount = scan.nextInt();

	}
	public void findSI() {
		simpleInterest = baseAmount * interestRate * time;
	}
	public void display() {
		//condition check
		if(baseAmount == 0 || baseAmount < 0)
		{
			System.out.println("BusinessMan3 concludes there is no simple interest");
		}
		else
		{
			System.out.println("BusinessMan3 returns a simple interest value of: "+simpleInterest);
		}
	}
}

//==================================================================

class Calculation {
	public void useCalculation(CalculateSimpleInterest csi)
	{
		csi.acceptInput();
		csi.findSI();
		csi.display();
	}
}

//==================================================================

public class StaticInterestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessMan1 bm1 = new BusinessMan1();
		BusinessMan2 bm2 = new BusinessMan2();
		BusinessMan3 bm3 = new BusinessMan3();
		Calculation c = new Calculation();
		c.useCalculation(bm1);
		c.useCalculation(bm2);
		c.useCalculation(bm3);
	}

}