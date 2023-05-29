package com.demo.learnjpahibernate.student.jpa;

import org.springframework.stereotype.Repository;

import com.demo.learnjpahibernate.student.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/* Week 6 - Day 1
 * Completed on 2023/05/29
 */

@Repository
@Transactional
public class StudentJpaRepository {

	@PersistenceContext //Specific autowiring used in databases to persist and store
	private EntityManager entityManager;
	
	//==================================================================
	
	public void insert(Student student) {
		entityManager.merge(student);
	}
	
	public Student read(long id) {
		return entityManager.find(Student.class, id);
	}
	
	public void delete(long id) {
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
	}
}
