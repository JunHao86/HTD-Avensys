package com.demo.springboot.webapp.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springboot.webapp.employee.Employee;

/* Week 6 - Completed on 2023/06/04
 * Last Updated - 2023/06/04
 */

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
