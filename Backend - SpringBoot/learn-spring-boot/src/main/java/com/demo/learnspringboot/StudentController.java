package com.demo.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Week 5 - Day 5
 * Completed on 2023/05/26
 */

//REST API
//running on localhost:8080 (see Spring log upon startup)
@RestController
public class StudentController {

	//localhost:8080/student
	@RequestMapping("/student")
	public List<Student> retrieveStudents(){
		return Arrays.asList(
		new Student(0001,"Siddu",23,"India"),
		new Student(0002,"Emmanuel",23,"Sweden"),
		new Student(0003,"Silas",23,"Singapore"));
	}
		
	
}
