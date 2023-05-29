package com.demo.learnjpahibernate.student;

import jakarta.persistence.*;

/* Week 6 - Day 1
 * Completed on 2023/05/29
 */

@Entity
public class Student {

	@Id
	private long id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "address")
	private String address;
	
	//==================================================================
	
	public Student() {

	}
	
	public Student(long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	//==================================================================
	
	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", address = " + address + "]";
	}
	
	//==================================================================
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
