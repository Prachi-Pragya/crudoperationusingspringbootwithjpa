package com.springbootapi.servive.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapi.dao.EmployeeDao;
import com.springbootapi.entity.Employee;
import com.springbootapi.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return  employeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveAndFlush(employee);
	}

	@Override
	public List<Employee> getAllEmployeeList() {
		// TODO Auto-generated method stub
		return  employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(long employeeId) {
		// TODO Auto-generated method stub
//		return  employeeDao.findOne(employeeId);
		return null;
	}

	@Override
	public void deleteEmployee(long employeeId) {
		// TODO Auto-generated method stub
		  employeeDao.deleteById(employeeId);
	}

}
