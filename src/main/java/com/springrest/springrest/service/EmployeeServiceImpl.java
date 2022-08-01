package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	List<Employee> emp;

	public EmployeeServiceImpl() {
		emp=new ArrayList<>();
		emp.add(new Employee(1, "Java Dev", "Working As JAva"));
		emp.add(new Employee(2, ".Net Dev", "Working As .Net"));
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		return emp;
	}

	@Override
	public Employee getAllEmployee(long employeeId) {
		// TODO Auto-generated method stub
		Employee e=null;
		for (Employee employee : emp) {
			if(employee.getId()==employeeId) {
				e=employee;
				break;
			}
		}
		return e;
	}

}
