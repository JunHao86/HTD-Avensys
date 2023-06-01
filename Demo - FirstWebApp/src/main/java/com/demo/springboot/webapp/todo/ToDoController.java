package com.demo.springboot.webapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

/* Week 6 - Day 3
 * Completed on 2023/05/31
 */

@Controller
@SessionAttributes("name") 
public class ToDoController {
	
	private ToDoService todo_s;

	public ToDoController(ToDoService todo_s) {
		super();
		this.todo_s = todo_s;
	}
	
	//==================================================================
	//listTodos.jsp
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<ToDo>todos = todo_s.findByUserName("Siddu");
		model.addAttribute("todos",todos);
		return "listTodos";
	} 
	
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id)
	{
		todo_s.removeTodo(id);
		return "redirect:list-todos"; 
	}
	
	//==================================================================
	//add-todo.jsp
	
	@RequestMapping(value="add-todo",method=RequestMethod.GET)
	public String showNewTodoPage(ModelMap model)
	{
		String username = (String) model.get("name");
		ToDo todo = new ToDo(0,username,"",LocalDate.now().plusYears(1),false);
		model.put("add-todo", todo);
		return "add-todo";
	}   
	    
	@RequestMapping(value="add-todo",method=RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid ToDo todo, BindingResult result)
	{
//		//Check for errors, redirect
//		if(result.hasErrors()) {
//			return "add-todo";
//		}
		  
		//Retrieve name from SessionController 
		String username = (String) model.get("name"); 
		todo_s.addTodo(username,todo.getDescription(),LocalDate.now().plusYears(1),false);
		return "redirect:list-todos";
	}
	//==================================================================
	//update-todo.jsp
	
	@RequestMapping("update-todo")
	public String showUpdateTodoPage(@RequestParam int id,ModelMap model)
	{
		//update func here
		ToDo todo = todo_s.findById(id);
		model.addAttribute("todo",todo);
		return "redirect:add-todo"; 
	}
	
	@RequestMapping(value="update-todo",method=RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid ToDo todo, BindingResult result) {
//		//Check for errors, redirect
//		if(result.hasErrors()) {
//			return "add-todo";
//		}
		   
		//Retrieve name from SessionController 
		String username = (String) model.get("name"); 
		todo_s.updateTodo(todo);
		return "redirect:list-todos";	
	}

	
}

//Missing stuff
//Validation check 
//css
