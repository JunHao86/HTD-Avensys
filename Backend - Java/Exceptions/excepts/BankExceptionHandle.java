package excepts;
import java.util.Scanner;

/* Week 4 - Day 3
 * Completed on 2023/05/17
 */

// Custom Exception Handling
class InvalidInputException extends Exception {
	public String getMessage() {
		return "Invalid entry.";
	}
}

//==================================================================

class ATM {
	int accNo = 1111;
	int passWord = 0123;
	int accInput;
	int pwInput;

	public void acceptInput() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the account number");
		accInput = kb.nextInt();
		System.out.println("Enter the password");
		pwInput = kb.nextInt();
		
		kb.close();
	}

	public void verify() throws InvalidInputException {
		if (accNo == accInput && passWord == pwInput) {
			System.out.println("Welcome to our Banking Application");
	    }else{
	    	InvalidInputException ie = new InvalidInputException();
	    	throw ie;
	    }
	}
}

//==================================================================

class Bank {
	public void initiate(){
		ATM atm = new ATM();
		try {
			atm.acceptInput();
		    atm.verify();
		}catch (InvalidInputException e) {
		   	System.out.println("Invalid input. 2 more attempt(s) left.");
			try {
				atm.acceptInput();
			    atm.verify();
			}catch (InvalidInputException e2) {
		    	System.out.println("Invalid input. 1 more attempt(s) left.");
				try {
					atm.acceptInput();
				    atm.verify();
				}catch(InvalidInputException e3) {
					System.out.println("\nThis ATM card has been disabled due to the number of incorrect attempts.");
				}
			}
		}
	}	
}

//==================================================================

public class BankExceptionHandle {
	
	public static void main(String[] args) {
	    Bank bank1 = new Bank();
	    bank1.initiate();
	}
}
