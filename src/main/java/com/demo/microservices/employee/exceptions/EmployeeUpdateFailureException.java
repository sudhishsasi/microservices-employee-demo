package com.demo.microservices.employee.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeUpdateFailureException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeUpdateFailureException() {
		super("Something went wrong and update employee failed . Please try again");
	}
}
