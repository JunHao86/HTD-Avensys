package com.demo.learnjpahibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.learnjpahibernate.student.Student;

/* Week 6 - Day 1
 * Completed on 2023/05/29
 */

@Repository
public class StudentJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	//==================================================================
	
	//Create operation
	private static String INSERT_QUERY =
			"insert into Student(id,name,address) values(?,?,?)";
	
	//Read operation
	private static String SELECT_QUERY = 
			"select * from Student where id = ?";
	
	//Delete operation
	private static String DELETE_QUERY = 
			"delete from Student where id = ?";
	
	//==================================================================
	
	//Create operation
	public void insert(Student student) {
		springJdbcTemplate.update(INSERT_QUERY,student.getId(),student.getName(),student.getAddress());
	}
	
	//Read operation - does not use JdbcTemplate.update method (only for C,U,D operations)
	public Student read(long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Student.class), id);
	}
	
	//Delete operation
	public void delete(long id) {
		springJdbcTemplate.update(DELETE_QUERY,id);
	}
}
