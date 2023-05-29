package com.demo.learnjpahibernate.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="payment_type")
	private String payment_type;
	
	@Column(name="payment_amount")
	private int payment_amount;
	
	public Customer() {
	}
	
	public Customer(long id, String name, String payment_type, int payment_amount) {
		super();
		this.id = id;
		this.name = name;
		this.payment_type = payment_type;
		this.payment_amount = payment_amount;
	}

	@Override
	public String toString() {
		return "id - " + id + ", name - " + name + ", payment mode - " + payment_type + ", amount payable - " + payment_amount + ".";
	}

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

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public int getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(int payment_amount) {
		this.payment_amount = payment_amount;
	}
	
	
}
