package com.demo.springboot.webapp.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

/* Week 6 - Completed on 2023/06/03
 * Last Updated - 2023/06/03
 */

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
		//View EmployeeService (static)
//		List<Employee> emps = emp_s.viewEmployeeList();
		
		//View EmployeeService (repo)
		List<Employee> emps = emp_s.viewEmployeeRepo();
		
		//Do not interfere
		model.addAttribute("employee",emps);
		return "e_list";
	}
	  
	@RequestMapping("delete-employee")
	public String deleteEmployee(@RequestParam long eid)
	{
		//Delete action for EmployeeService (static)
//		emp_s.deleteEmployee(eid);
		
		//Delete action for EmployeeService (repo) 
		emp_s.deleteEmpFromRepo(eid);
		
		//Do not interfere
		System.out.println("Employee with ID " + eid + " deleted");
		return "redirect:list-employees";
	}  
	 	
	//==================================================================
	//e_add.jsp
	
	@RequestMapping(value="create-employee",method=RequestMethod.GET)
	public String showCreateEmployeePage(ModelMap model)
	{
		//Do not interfere
		Employee emp = new Employee(0,"","","",false);
		model.put("ma-employee", emp);
		return "e_add";  
	}     
	
	@RequestMapping(value="create-employee",method=RequestMethod.POST)
	public String createEmployee(ModelMap model, @Valid Employee emp, BindingResult result)
	{    	   
//		if(result.hasErrors()) {
//		return "add-todo";
//	}
		
		//Create action for EmployeeService (static)
//		emp_s.createEmployee(emp.getEmp_name(),emp.getEmp_pw(),emp.getEmp_pos(),emp.isEmp_isActive());
		
		//Create action for EmployeeService (repo) 
		//If could not commit JPA transaction, due to validation for emp_pw, emp_pos
		emp_s.createEmpToRepo(emp.getEmp_name(),emp.getEmp_pw(),emp.getEmp_pos(),emp.isEmp_isActive());
		
		//Do not interfere
		System.out.println("Employee with ID " + emp.getEmp_id() + " created");
		return "redirect:list-employees"; 
	}    
	    
	//==================================================================
	//e_update.jsp
	
	@RequestMapping(value="update-employee",method=RequestMethod.GET)
	public String updateEmployee(@RequestParam long eid, ModelMap model)
	{
		//Read action for EmployeeService (static)
//		Employee emp = emp_s.retrieveEmployee(eid);
		
		//Read action for EmployeeService (repo) 
		Optional<Employee> emp = emp_s.readEmpFromRepo(eid);
		
		//Do not interfere
		model.put("ma-update-employee", emp);
		return "e_update";  
	}
	
	@RequestMapping(value="update-employee",method=RequestMethod.POST)
	public String updateEmployee(ModelMap model, @Valid Employee emp, BindingResult result)
	{    	   
//		if(result.hasErrors()) {
//		return "add-todo";
//	}
		
		//Update action for EmployeeService (static)
//		emp_s.updateEmployee(emp);
		
		//Update action for EmployeeService (repo) 
		//If could not commit JPA transaction, due to validation for emp_pw, emp_pos
		emp_s.updateEmpInRepo(emp);
		
		//Do not interfere
		System.out.println("Employee with ID " + emp.getEmp_id() + " updated");
		return "redirect:list-employees"; 
	} 
	 
}       