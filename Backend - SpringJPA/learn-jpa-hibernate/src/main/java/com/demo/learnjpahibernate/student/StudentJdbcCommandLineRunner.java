package com.demo.learnjpahibernate.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/* Week 6 - Day 1
 * Completed on 2023/05/29
 */

@Component
public class StudentJdbcCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private StudentRepositoryJdbc student_repo;
	
//	@Autowired
//	private StudentRepositoryJpa student_repo;
//	
	@Autowired
	private StudentRepositorySpringDataJpa student_repo;
	
	//==================================================================
	
	@Override
	public void run(String... args) throws Exception {		
		//for use with non-interface methods derived from Jdbc/Jpa
//		student_repo.insert((new Student(1,"Silas","Singapore")));
//		student_repo.insert((new Student(2,"Rish","Singapore" )));
//		student_repo.insert((new Student(3,"James","Malaysia" )));
//		
//		student_repo.delete(3);
//		
//		System.out.println(student_repo.read(1));
//		System.out.println(student_repo.read(2));
		
		//making use of JpaRepository interface
		student_repo.save((new Student(1,"Silas","Singapore")));
		student_repo.save((new Student(2,"Rish","Singapore" )));
		student_repo.save((new Student(3,"James","Malaysia" )));
		
		//Cast to long type
		student_repo.deleteById(3l);
		
		System.out.println(student_repo.findById(1l));
		System.out.println(student_repo.findById(2l));
	}

}
