package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dto.EmployeeDTO;
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
	public EmployeeDTO saveEmployee(Employee employee) {
		EmployeeDTO dto = new EmployeeDTO();

		Employee entityEmployee = employeeRepository.save(employee);

		if (employeeRepository.save(employee) != null) {
			dto.setFirstName(entityEmployee.getFirstName());
			dto.setLastName(entityEmployee.getLastName());
			dto.setJobTitle(entityEmployee.getJobTitle());
		}

		return dto;
	}

	/*
	 * 
	 */
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

}
