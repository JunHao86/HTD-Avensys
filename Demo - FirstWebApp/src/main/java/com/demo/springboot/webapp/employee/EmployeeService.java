package com.demo.springboot.webapp.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	//testing without cohesion to database
	private static List<Employee> emps = new ArrayList<>();

	//==================================================================
	//Initialized variables for Unit Testing
	
	//used for ID auto-increment
	private static int emp_id_counter = 0;

	//Initializing default objects; always same ArrayList upon startup
	static {
		emps.add(new Employee(emp_id_counter++,"Employee1","password1","President",true));
		emps.add(new Employee(emp_id_counter++,"Employee2","password2","Vice President",true));
		emps.add(new Employee(emp_id_counter++,"Employee3","password3","Office Wage Slave",true));
		emps.add(new Employee(emp_id_counter++,"Employee4","password4","Office Wage Slave",true));
		emps.add(new Employee(emp_id_counter++,"Employee5","password5","Concierge Staff",true));
	}

	//View list
	public List<Employee> viewEmployeeList(){
		return emps;
	}
	
	//==================================================================
	//CRUD Actions #1 (for unit testing)
	
	//Create Action
	public void createEmployee(String username, String password, String position, boolean isActive) {
		Employee emp = new Employee(emp_id_counter++,username,password,position,isActive);
		emps.add(emp);
	}
	
	//Read Action
	public Employee retrieveEmployee(int id){
		
		for (int i=0;i<emps.size();i++) {
			if (emps.get(i).getEmp_id() == id) {
				Employee emp = emps.get(i);
				return emp;
			}
		}
		System.out.println("could not find Employee with id "+ id);
		return null;
	}
	
	//Update Action
	public void updateEmployee(Employee emp) {
		for (int i=0;i<emps.size();i++) {
			if (emps.get(i).getEmp_id() == emp.getEmp_id()) {
				emps.set(i, emp);
			}
		}
	}
	
	//Delete Action
	public void deleteEmployee(int id) {
		Predicate<? super Employee> predicate = emp -> emp.getEmp_id() == id;
		emps.removeIf(predicate);
	}   
 
	//==================================================================
	//CRUD Actions #2 (implemented with SQL Database)
}
