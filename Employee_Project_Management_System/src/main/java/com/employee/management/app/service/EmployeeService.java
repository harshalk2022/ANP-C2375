package com.employee.management.app.service;

import java.util.List;

import com.employee.management.app.entity.Employee;

// Abstract method for performing CRUD on entity Employee
public interface EmployeeService {

	// Method to save Employee Details
	Employee saveEmployee(Employee employee);

	// Method to fetch All Employees
	List<Employee> getAllEmployees();

	// Method to fetch Employee details using eId
	Employee getEmployeeById(long eId);

	// Method to update Employee details based on eId
	Employee updateEmployeeById(Employee employee, long eId);

	// Method to delete Employee based on eId
	void deleteEmployeeById(long eId);

	// Method to fetch Employee Details using firstName
	List<Employee> getEmployeeByFirstName(String firstName);

	// Method to fetch Employee Details using lastName
	List<Employee> getEmployeeByLastName(String lastName);

	// Method to fetch Employee Details using city
	List<Employee> getEmployeeByCity(String city);

}
