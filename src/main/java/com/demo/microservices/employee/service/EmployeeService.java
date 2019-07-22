package com.demo.microservices.employee.service;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.microservices.employee.exceptions.EmployeeAddFailureException;
import com.demo.microservices.employee.exceptions.EmployeeNotFoundException;
import com.demo.microservices.employee.exceptions.EmployeeUpdateFailureException;
import com.demo.microservices.employee.model.Employee;
import com.demo.microservices.employee.repositories.EmplyeeRepository;

@Service
public class EmployeeService {
	protected Logger logger = Logger.getLogger(EmployeeService.class.getName());

	@Autowired
	protected EmplyeeRepository emplyeeRepository;

	public List<Employee> findAllEmployees() {
		logger.info("employee-service findAllEmployees() invoked: ");
		List<Employee> employees = emplyeeRepository.findAll();
		for(Employee employee: employees) {
			logger.info("employee-service findAllEmployees() : "+employee.toString());
		}
		logger.info("employee-service findAllEmployees() : done ");
		if (employees == null)
			throw new EmployeeNotFoundException();
		else {
			return employees;
		}
	}

	public List<Employee> addEmployees(List<Employee> employees) {
		logger.info("employee-service addEmployees() invoked: ");
		List<Employee> employeeRes = employees.stream().map(employee -> emplyeeRepository.save(employee))
				.collect(Collectors.toList());
		for(Employee employee: employees) {
			logger.info("employee-service addEmployees() : "+employee.toString());
		}
		logger.info("employee-service addEmployees() done: ");
		if (employeeRes == null)
			throw new EmployeeAddFailureException();
		else {
			return employeeRes;
		}
	}

	public List<Employee> updateEmployees(List<Employee> employees) {
		logger.info("employee-service updateEmployees() invoked: ");
		List<Employee> employeeRes = employees.stream()
				.filter(employee -> emplyeeRepository.existsById(employee.getId()))
				.map(employee -> emplyeeRepository.save(employee)).collect(Collectors.toList());
		logger.info("employee-service updateEmployees() done: ");
		for(Employee employee: employees) {
			logger.info("employee-service addEmployees() : "+employee.toString());
		}
		if (employeeRes == null)
			throw new EmployeeUpdateFailureException();
		else {
			return employeeRes;
		}
	}

	public List<Employee> findByAgeGreaterThanEqual(int age) {
		logger.info("employee-service findByAgeGreaterThanEqual() invoked: ");
		List<Employee> employees = emplyeeRepository.findByAgeGreaterThanEqual(age);
		for(Employee employee: employees) {
			logger.info("employee-service findByAgeGreaterThanEqual() : "+employee.toString());
		}
		logger.info("employee-service findByAgeGreaterThanEqual() done: ");
		if (employees == null)
			return null;
		else {
			return employees;
		}
	}

}
