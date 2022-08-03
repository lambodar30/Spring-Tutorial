package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.service.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/welcome")
	public String  home() {
		
		return "Hello";
	}
	
	@GetMapping("/Employees")
	public List<Employee> getAllEmployees(){
		System.out.print("Success work");
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/getEmployee/{employeeId}")
	public Employee getEmployee(@PathVariable String employeeId) {
		System.out.print("Success");
		return employeeService.getAllEmployee(Long.parseLong(employeeId));
	}
	
	@PostMapping(value="saveEmp")
	public Employee addEmployee(@RequestBody Employee emp) {
		System.out.print("Success");
		return employeeService.addEmployee(emp);
	}
	
	@PutMapping(value="updateEmp")
	public Employee updateEmployee(@RequestBody Employee emp) {
		System.out.print("Success");
		return employeeService.updateEmployee(emp);
	}

}
