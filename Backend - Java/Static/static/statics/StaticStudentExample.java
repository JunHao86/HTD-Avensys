package statics;

import java.util.Scanner;

/* Week 3 - Day 3
 * Completed on 2023/05/10
 */

class Student{
	private String name;
	private int age;
	private int marks;
	private static String collegename;
	
	//==================================================================
	
	public void setParams(String n, int a, int m) {
		this.name = n;
		this.age = a;
		this.marks = m;
		collegename = "Avensys";
	}
	
	public void printParams() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Marks: "+marks);
		System.out.println("College: "+collegename);
	}
}

//==================================================================

public class StaticStudentExample {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.setParams("Abba",26,100);
		s1.printParams();
		System.out.println();
		s2.setParams("Bailey",25,80);
		s2.printParams();
		System.out.println();
		s3.setParams("Cassandra",27,89);
		s3.printParams();
		
		kb.close();	
	}
}
