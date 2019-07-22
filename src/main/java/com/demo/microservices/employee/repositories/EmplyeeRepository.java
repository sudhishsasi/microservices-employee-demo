package com.demo.microservices.employee.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.microservices.employee.model.Employee;

@Repository
public interface EmplyeeRepository extends JpaRepository<Employee, Long> {

	public List<Employee> findAll();

	@SuppressWarnings("unchecked")
	public Employee save(Employee employee);

	public List<Employee> findByAgeGreaterThanEqual(Integer age);

}
