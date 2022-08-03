package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return employeeDao.getOne(employeeId);
		
		/*
		 * // TODO Auto-generated method stub Employee e=null; for (Employee employee :
		 * emp) { if(employee.getId()==employeeId) { e=employee; break; } } return e;
		 */
		
	}

	@Override
	public Employee addEmployee(long l) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public Employee addEmployee(long employeeId) { // TODO
	 * Auto-generated method stub return null; }
	 */

}
