package com.demo.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Week 5 - Day 5
 * Completed on 2023/05/26
 */

class Customer {
	
	//Requires variables
	String custName;
	int custNumber;
	String billingAddress;
	int payableAmount;
	
	//Requires constructor with variables passed in
	public Customer(String custName, int custNumber, String billingAddress, int payableAmount) {
		super();
		this.custName = custName;
		this.custNumber = custNumber;
		this.billingAddress = billingAddress;
		this.payableAmount = payableAmount;
	}
	
	//Requires all getters
	public String getCustName() {
		return custName;
	}
	public int getCustNumber() {
		return custNumber;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public int getPayableAmount() {
		return payableAmount;
	}
}

//==================================================================

//localhost:8080/customers
@RestController
public class CustomerController {
		@RequestMapping("/customers")
		public List<Customer> retrieveCustomers(){
			return Arrays.asList(
			new Customer("A",90001111,"Pasir Ris Block 111",999),
			new Customer("B",90002222,"Tampines Block 222",888),
			new Customer("C",90003333,"Simei Block 333",7777));

		}
			
}