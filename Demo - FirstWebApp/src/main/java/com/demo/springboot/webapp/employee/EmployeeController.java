package com.demo.springboot.webapp.employee;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;


@Controller
@SessionAttributes("user")
public class EmployeeController {

	private EmployeeService emp_s;

	public EmployeeController(EmployeeService emps) {
		super();
		this.emp_s = emps;
	}

	//==================================================================
	//e_todolist.jsp

	@RequestMapping("list-employees")
	public String listAllEmployees(ModelMap model) {		
		//View EmployeeService
		List<Employee> emps = emp_s.viewEmployeeList();
		model.addAttribute("employee",emps);
		return "e_list";
	}
	  
	@RequestMapping("delete-employee")
	public String deleteEmployee(@RequestParam int eid)
	{
		//Delete action for EmployeeService (done)
		emp_s.deleteEmployee(eid);
		System.out.println("Employee with ID " + eid + " deleted");
		return "redirect:list-employees";
	}  
	 	
	//==================================================================
	//e_add.jsp
	
	@RequestMapping(value="create-employee",method=RequestMethod.GET)
	public String showCreateEmployeePage(ModelMap model)
	{
		Employee emp = new Employee(0,"","","",false);
		model.put("ma-employee", emp);
		return "e_add";  
	}     
	
	@RequestMapping(value="create-employee",method=RequestMethod.POST)
	public String createEmployee(ModelMap model, @Valid Employee emp, BindingResult result)
	{    	   
		//Create action for EmployeeService
		emp_s.createEmployee(emp.getEmp_name(),emp.getEmp_pw(),emp.getEmp_pos(),emp.isEmp_isActive());
		return "redirect:list-employees"; 
	}    
	    
	//==================================================================
	//e_update.jsp
	
	@RequestMapping(value="update-employee",method=RequestMethod.GET)
	public String updateEmployee(@RequestParam int eid, ModelMap model)
	{
		Employee emp = emp_s.retrieveEmployee(eid);
		model.put("ma-update-employee", emp);
		return "e_update";  
	}
	
	@RequestMapping(value="update-employee",method=RequestMethod.POST)
	public String updateEmployee(ModelMap model, @Valid Employee emp, BindingResult result)
	{    	   
		//Update action for EmployeeService
		emp_s.updateEmployee(emp);
		System.out.println("Employee with ID " + emp.getEmp_id() + " updated");
		return "redirect:list-employees"; 
	} 
	 
}       