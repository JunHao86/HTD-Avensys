package com.demo.learnjpahibernate.customer;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/* Week 6 - Day 1
 * Completed on 2023/05/29
 */

@Repository
@Transactional
public class CustomerJpaRepository {

	@PersistenceContext
	private EntityManager customerManager;
	
	//==================================================================
	
	public void insert(Customer customer) {
		customerManager.merge(customer);
	}
	
	public Customer read(long id) {
		return customerManager.find(Customer.class, id);
	}
	
	public void delete(long id) {
		Customer customer = customerManager.find(Customer.class, id);
		customerManager.remove(customer);
	}
}
