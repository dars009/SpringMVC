package com.test.controller;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.beans.Employee;
 
 
@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
 
	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET, 
			produces = "application/xml")
	@ResponseBody
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee empl1 = new Employee("001", "Darshit", "Patel", 25, 5000d);
		Employee empl2 = new Employee("002", "Ravi", "Patil", 22, 4500d);
		Employee empl3 = new Employee("003", "Amit", "Bhatt", 27, 6000.50);
		employees.add(empl1);
		employees.add(empl2);
		employees.add(empl3);
		return employees;
	}
	
}