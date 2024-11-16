package com.EmployeeDetails.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeDetails.Entity.Employee;
import com.EmployeeDetails.Repository.EmployeeRepo;
import com.EmployeeDetails.Service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private  EmployeeRepo empRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return empRepository.save(employee);
	}
	

}