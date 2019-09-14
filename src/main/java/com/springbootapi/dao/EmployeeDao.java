package com.springbootapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootapi.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

	

	//Employee findOne(long employeeId);

	//Employee findOne(long employeeId);

	//Employee delete(long employeeId);

}
