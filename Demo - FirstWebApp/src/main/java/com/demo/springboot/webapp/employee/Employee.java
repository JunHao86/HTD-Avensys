package com.demo.springboot.webapp.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

/* Week 6 - Completed on 2023/06/03
 * Last Updated - 2023/06/03
 */

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private long emp_id;
	
	@Column(name="employee_name")
	private String emp_name;
	
	@Column(name="employee_isActive")
	private boolean emp_isActive;
	
	@Column(name="employee_password")
	@Size(min=8,message="Password requires 8 or more characters.")
	private String emp_pw;

	@Column(name="employee_position")
	@Size(min=8,message="Please enter his/her position within the company.")
	private String emp_pos;

	public Employee() {}
	
	public Employee(String emp_name, String emp_pw, String emp_pos, boolean emp_isActive) {
		super();
		this.emp_name = emp_name;
		this.emp_pw = emp_pw;
		this.emp_pos = emp_pos;
		this.emp_isActive = emp_isActive;
	}
	
	
	public Employee(long emp_id, String emp_name, String emp_pw, String emp_pos, boolean emp_isActive) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_pw = emp_pw;
		this.emp_pos = emp_pos;
		this.emp_isActive = emp_isActive;
	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_pw() {
		return emp_pw;
	}

	public void setEmp_pw(String emp_pw) {
		this.emp_pw = emp_pw;
	}

	public String getEmp_pos() {
		return emp_pos;
	}

	public void setEmp_pos(String emp_pos) {
		this.emp_pos = emp_pos;
	}

	public boolean isEmp_isActive() {
		return emp_isActive;
	}

	public void setEmp_isActive(boolean emp_isActive) {
		this.emp_isActive = emp_isActive;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_pw=" + emp_pw + ", emp_pos=" + emp_pos
				+ ", emp_isActive=" + emp_isActive + "]";
	}
}
