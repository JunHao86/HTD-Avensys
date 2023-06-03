package com.demo.springboot.webapp.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;
 
/* Week 6 - Day 4
 * Completed on 2023/06/02
 */
 
//Database
//Static List of Todos
public class ToDo {
	private int id;
	private String username;
	
	//Set minimum/maximum, alert message
	@Size(min=10,message="Enter at least 10 characters!")
	private String description;
	 
	private LocalDate targetDate;
	private boolean done;
		
	public ToDo(int id, String username, String description, LocalDate targetDate, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = isDone;
	}
  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean getDone() {
		return done;
	}

	public void setDone(boolean isDone) {
		this.done = isDone;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", isDone=" + done + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
