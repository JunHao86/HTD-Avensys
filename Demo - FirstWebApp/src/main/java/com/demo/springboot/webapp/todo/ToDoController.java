package com.demo.springboot.webapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<ToDo>todos = todo_s.findByUserName("Siddu");
		model.addAttribute("todos",todos);
		return "listTodos";
	}
}
