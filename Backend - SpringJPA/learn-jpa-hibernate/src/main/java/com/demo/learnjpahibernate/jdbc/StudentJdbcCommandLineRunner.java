package com.demo.learnjpahibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.learnjpahibernate.student.Student;
import com.demo.learnjpahibernate.student.jpa.StudentJpaRepository;
import com.demo.learnjpahibernate.student.jpa.StudentSpringDataJpaRepository;

//@Component
//public class StudentJdbcCommandLineRunner implements CommandLineRunner {
//
//	@Autowired
//	private StudentJdbcRepository student_repo;
//	
////	@Autowired
////	private StudentJpaRepository student_repo;
////	
////	@Autowired
////	private StudentSpringDataJpaRepository student_repo;
//	
//	@Override
//	public void run(String... args) throws Exception {		
//		student_repo.insert((new Student(1,"Silas","Singapore")));
//		student_repo.insert((new Student(2,"Rish","Singapore" )));
//		student_repo.insert((new Student(3,"James","Malaysia" )));
//		
//		student_repo.delete(3);
//		
//		System.out.println(student_repo.read(1));
//		System.out.println(student_repo.read(2));
//	}
//
//}
