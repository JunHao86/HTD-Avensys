package encapsulations;

import java.util.Scanner;

/* Week 3 - Day 2
 * Completed on 2023/05/09
 */


class Fan{
	
	//Encapsulation - no public access to class variables
	private int cost;
	private int wingcount;
	private String brandname;
	
	//==================================================================
	
	//Introduction to Constructor Overloading
	//(constructor chaining, local chaining)
	
	public Fan(){}
		
	//using this to prevent shadowing problem
	public Fan(int amount, int wings, String brand) {
		this();
		this.cost = amount;
		this.wingcount = wings;
		this.brandname = brand;
	}
	
	public Fan(int amount, int wings){
		this(100, 2, "Mitsubishi");
		this.cost = amount;
		this.wingcount = wings;
	}
	
	//==================================================================
	
	//Encapsulation - use setter/getter pairs to provide access to private/protected variables
	
	public void setBrand(String brand) {
		brandname = brand;
	}
	
	public String getBrand() {
		return brandname;
	}	
	
	public void setWings(int wings) {
		if(wings>=0) {
			wingcount = wings;
		}
	}
	
	public int getWings() {
		return wingcount;
	}
	
	public void setCost(int amount) {
		if(amount>=0) {
			cost = amount;
		}
	}
	public int getCost() {
		return cost;
	}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);    
		Fan fare = new Fan();
		System.out.println("Fan cost: "+fare.getCost());
		System.out.println("Number of wings: "+fare.getWings());
		System.out.println("Fan Brand: "+fare.getBrand());
		
		fare = new Fan(360,3,"Dyson");
		System.out.println("\nFan cost: "+fare.getCost());
		System.out.println("Number of wings: "+fare.getWings());
		System.out.println("Fan Brand: "+fare.getBrand());
		
		fare = new Fan(1700,5);
		System.out.println("\nFan cost: "+fare.getCost());
		System.out.println("Number of wings: "+fare.getWings());
		System.out.println("Fan Brand: "+fare.getBrand());
		kb.close();
	}
}