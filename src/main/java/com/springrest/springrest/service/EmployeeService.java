package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public Employee getAllEmployee(long employeeId);

}
