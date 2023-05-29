package com.demo.learnjpahibernate.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.learnjpahibernate.student.Student;

@Component
public class CustomerJdbcCommandLineRunner implements CommandLineRunner{

	public CustomerJdbcCommandLineRunner(CustomerSpringDataJpaRepository repo) {
		this.cust_repo = repo;
	}
//	@Autowired
//	private CustomerJdbcRepository cust_repo;
	
//	@Autowired
//	private CustomerJpaRepository cust_repo;
	
	@Autowired
	private CustomerSpringDataJpaRepository cust_repo;
	
	@Override
	public void run(String... args) throws Exception {
		cust_repo.save((new Customer(1,"Karen","Credit Card",300)));
		cust_repo.save((new Customer(2,"Brandon","NETS",265)));
		cust_repo.save((new Customer(3,"Silva","Cash",100)));
		
		cust_repo.deleteById((long) 3);
		
		System.out.println(cust_repo.findById((long) 1));
		System.out.println(cust_repo.findById((long) 2));
	}
}
