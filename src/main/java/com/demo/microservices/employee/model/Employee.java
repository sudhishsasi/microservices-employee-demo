package com.demo.microservices.employee.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_EMPLOYEE")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	public static Long nextId = 0L;

	@Id
	protected long id;
	protected String dob;
	protected String name;
	protected int age;
	protected String sex;

	protected static Long getNextId() {
		synchronized (nextId) {
			return nextId++;
		}
	}

	public Employee() {
	}

	public Employee(String name, int age, String DOB, String sex) {
		this.id = getNextId();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.dob = DOB;
	}

	public long getId() {
		return id;
	}

	/**
	 * Set JPA id - for testing and JPA only. Not intended for normal use.
	 * 
	 * @param id The new id.
	 */
	protected void setId(long id) {
		this.id = id;
	}

	protected String getDob() {
		return dob;
	}

	protected void setDob(String dob) {
		this.dob = dob;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getSex() {
		return sex;
	}

	protected void setSex(String sex) {
		this.sex = sex;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age + " " + dob + " " + sex;
	}

}
