package com.demo.microservices.employee.main;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

import com.demo.microservices.employee.EmplyeeConfiguration;

@EnableAutoConfiguration
@Import(EmplyeeConfiguration.class)
public class EmployeeServer {

	protected Logger logger = Logger.getLogger(EmployeeServer.class.getName());

	public static void main(String[] args) {

		System.setProperty("spring.config.name", "employee-server");

		SpringApplication.run(EmployeeServer.class, args);
	}
}
