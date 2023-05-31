package com.demo.springboot.webapp.todo;

import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Service;

/* Week 6 - Day 3
 * Completed on 2023/05/31
 */

@Service
public class ToDoService {

	private static List<ToDo> todos = new ArrayList<>();
	
	static {
		todos.add(new ToDo(1,"Siddu","Trekking",LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(2,"Siddu","Racing",LocalDate.now().plusYears(2),true));
		todos.add(new ToDo(3,"Siddu","Farming",LocalDate.now().plusYears(3),false));
		todos.add(new ToDo(4,"Siddu","Coding",LocalDate.now().plusYears(4),true));	
	}
	
	public List<ToDo> findByUserName(String username) {
		return todos;
	}
	
}
