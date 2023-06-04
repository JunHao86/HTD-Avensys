package com.demo.springboot.webapp.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.springboot.webapp.employee.repo.EmployeeRepository;

/* Week 6 - Completed on 2023/06/04
 * Last Updated - 2023/06/04
 */

@Component
public class EmployeeCommandLineRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository emp_r;
	
	
	@Override
	public void run(String... args) throws Exception{
		
		//testing if it works before implementing CRUD actions, web implementation
		emp_r.save((new Employee("Employee10","password10","President",false))); 
		emp_r.save((new Employee("Employee20","password20","Vice President",false)));
		emp_r.save((new Employee("Employee30","password30","Office Wage Slave",false)));
		
		System.out.println("From CLR");
	}
	
}
