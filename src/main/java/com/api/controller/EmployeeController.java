package com.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dto.EmployeeDTO;
import com.api.model.Employee;
import com.api.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/create")
	public EmployeeDTO createEmployee(@Valid @RequestBody Employee emp) {
		return employeeService.saveEmployee(emp);
	}

	@GetMapping("/findAll")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}
}
