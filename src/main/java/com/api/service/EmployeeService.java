package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.Employee;
import com.api.model.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * 
	 * @param employee
	 * @return
	 */
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	/*
	 * 
	 */
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

}
