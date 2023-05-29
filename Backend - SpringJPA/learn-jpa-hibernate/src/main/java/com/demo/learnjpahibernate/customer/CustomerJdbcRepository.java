package com.demo.learnjpahibernate.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/* Week 6 - Day 1
 * Completed on 2023/05/29
 */

@Repository
public class CustomerJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	//==================================================================
	
	//Create operation
	private static String INSERT_QUERY =
			"insert into Customer(id,name,payment_type,payment_amount) values(?,?,?,?)";
	
	//Read operation
	private static String SELECT_QUERY = 
			"select * from Customer where id = ?";
	
	//Delete operation
	private static String DELETE_QUERY = 
			"delete from Customer where id = ?";
	
	//==================================================================
	
	//Create operation
	public void insert(Customer cust) {
		springJdbcTemplate.update(INSERT_QUERY,cust.getId(),cust.getName(),cust.getPayment_type(),cust.getPayment_amount());
	}
	
	//Read operation - does not use JdbcTemplate.update method (only for C,U,D operations)
	public Customer read(long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Customer.class), id);
	}
	
	//Delete operation
	public void delete(long id) {
		springJdbcTemplate.update(DELETE_QUERY,id);
	}
}
