package com.demo.microservices.employee;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservices.employee.exceptions.EmployeeAddFailureException;
import com.demo.microservices.employee.exceptions.EmployeeNotFoundException;
import com.demo.microservices.employee.exceptions.EmployeeUpdateFailureException;
import com.demo.microservices.employee.model.Employee;
import com.demo.microservices.employee.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	protected Logger logger = Logger.getLogger(EmployeeController.class.getName());

	protected EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		logger.info("employee-service EmployeeController invoked: ");
		this.employeeService = employeeService;
		logger.info("employee-service EmployeeController invoked: ");
	}


	/**
	 * add an employee with the name DOB and sex.
	 * @param name
	 * @param DOB
	 * @param Sex
	 * @return The list of Employee successfully saved.
	 * @throws EmployeeAddFailureException
	 */
	@PostMapping(value = "/addAll", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
		return this.employeeService.addEmployees(employees);
	}

	/**
	 * find all employees.
	 * @return The list of Employees.
	 * @throws EmployeeNotFoundException
	 */
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> findAllEmployees() {
		return this.employeeService.findAllEmployees();
	}

	/**
	 * updateAll all employees.
	 * @return The list of Employee successfully updated.
	 * @throws EmployeeUpdateFailureException
	 */
	@PutMapping(value = "/updateAll", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> updateEmployees(@RequestBody List<Employee> employees) {
		return this.employeeService.updateEmployees(employees);
	}

	/**
	 * find all employee having age greater than x.
	 * @return The list of Employee having age greater than x .
	 * @throws EmployeeUpdateFailureException
	 */
	@GetMapping(value = "/find/{age}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> findByAge(@PathVariable("age") int age) {
		return this.employeeService.findByAgeGreaterThanEqual(age);
	}

}
