package com.demo.learnspringboot;

/* Week 5 - Day 5
 * Completed on 2023/05/26
 */

public class Student {

	//Requires variables
	int id;
	String name;
	int age;
	String country;
	
	//Requires constructor with variables passed in
	public Student(int id, String name, int age, String country) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
	}

	//Requires all getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

}
