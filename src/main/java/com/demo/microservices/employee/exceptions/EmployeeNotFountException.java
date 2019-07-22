package com.demo.microservices.employee.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFountException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFountException() {
		super("Something went wrong and Add employee failed . Please try again");
	}
}
