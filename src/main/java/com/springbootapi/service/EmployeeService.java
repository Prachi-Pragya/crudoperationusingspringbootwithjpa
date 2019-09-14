package com.springbootapi.service;

import java.util.List;

import com.springbootapi.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	List<Employee> getAllEmployeeList();
	
	Employee getEmployee(long employeeId);
	
	void deleteEmployee(long employeeId);

}
