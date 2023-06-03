package com.demo.springboot.webapp.todo;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

/* Week 6 - Day 4
 * Completed on 2023/06/02
 */

@Service
public class ToDoService {

	private static List<ToDo> todos = new ArrayList<>();
	
	//used for ID auto-increment 
	private static int todosCount = 0;
	
	static {
		todos.add(new ToDo(++todosCount,"Siddu","Trekking",LocalDate.now().plusYears(1),false));
		todos.add(new ToDo(++todosCount,"Siddu","Racing",LocalDate.now().plusYears(2),true));
		todos.add(new ToDo(++todosCount,"Siddu","Farming",LocalDate.now().plusYears(3),false));
		todos.add(new ToDo(++todosCount,"Siddu","Coding",LocalDate.now().plusYears(4),true));	
	}
	
	public List<ToDo> findByUserName(String username) {
		return todos;
	}
	
	//==================================================================
	
	public void addTodo(String username,String description, LocalDate date,boolean done) {
		ToDo todo = new ToDo(++todosCount,username,description,date,done);	 
		todos.add(todo);
	}
	
	public void removeTodo(int id) {
		//Search for ToDo for object w/ ID, store in predicate
		Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
		//Remove object stored in predicate
		todos.removeIf(predicate);
	}
	
	public ToDo findById(int id) {
		Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
		ToDo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid ToDo todo) {
		// TODO Auto-generated method stub
		removeTodo(todo.getId());
		todos.add(todo);
	}
	
}