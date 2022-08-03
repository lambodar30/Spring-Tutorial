package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Error.ResourceNotFoundException;
import com.springrest.springrest.dao.EmployeeDao;
import com.springrest.springrest.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	//List<Employee> emp;
	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		/*
		 * emp=new ArrayList<>(); emp.add(new Employee(1, "Java Dev",
		 * "Working As JAva")); emp.add(new Employee(2, ".Net Dev", "Working As .Net"));
		 */
		}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
		//return emp;
	}
	
	public Employee addEmployee(Employee emp) {
		//employeeDao.save(emp);
		//return emp;
		System.out.print("Success");
		return employeeDao.save(emp);
	}

	@Override
	public Employee getAllEmployee(long employeeId) {
		System.out.print("Success");
		//Employee emp=employeeDao.findById(employeeId);
		return employeeDao.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + employeeId));
		//return employeeDao.getOne(employeeId);
		
		/*
		 * // TODO Auto-generated method stub Employee e=null; for (Employee employee :
		 * emp) { if(employee.getId()==employeeId) { e=employee; break; } } return e;
		 */
		
	}

	@Override
	public Employee addEmployee(long l) {
		// TODO Auto-generated method stub
		System.out.print("Success");
		return null;
	}
	
	public Employee updateEmployee(Employee emp) {
		//employeeDao.save(emp);
		//return emp;
		System.out.print("Success");
		return employeeDao.save(emp);
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.print("Success");
		return null;
	}

	/*
	 * @Override public Employee addEmployee(long employeeId) { // TODO
	 * Auto-generated method stub return null; }
	 */

}
