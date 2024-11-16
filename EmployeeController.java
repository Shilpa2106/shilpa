package com.EmployeeDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeDetails.Entity.Employee;
import com.EmployeeDetails.ServiceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/save")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("/employee")
	public Employee createEmpDetails(@RequestBody Employee employee) {
		return employeeServiceImpl.saveEmployee(employee);

	}

}
