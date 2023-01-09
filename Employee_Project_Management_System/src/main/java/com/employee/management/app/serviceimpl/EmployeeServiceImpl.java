package com.employee.management.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.app.entity.Employee;
import com.employee.management.app.exception.EmployeeNotFoundException;
import com.employee.management.app.repository.EmployeeRepository;
import com.employee.management.app.service.EmployeeService;

@Service
//Implement all CRUD methods, all business logic
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	// Saving Employee details into table using save() of JPA Repository
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	// fetching all Employees from table using findAll() of JPA Repository
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	// fetching Employee from table based on eId using findById() of JPA Repository
	// If Employee not found then throw exception
	public Employee getEmployeeById(long eId) {
		return employeeRepository.findById(eId)
				.orElseThrow(() -> new EmployeeNotFoundException("The employee ID you entered does not exist."));
	}

	@Override
	// Updating Employee details based on eId from table using save()
	public Employee updateEmployeeById(Employee employee, long eId) {
		Employee updateEmployee = employeeRepository.findById(eId)
				.orElseThrow(() -> new EmployeeNotFoundException("The employee ID you entered does not exist."));

		// Setting new values
		updateEmployee.setEmail(employee.getEmail());
		updateEmployee.setMobile(employee.getMobile());
		updateEmployee.setCity(employee.getCity());
		updateEmployee.setSalary(employee.getSalary());

		// Saving updated Employee Details
		employeeRepository.save(updateEmployee);
		return updateEmployee;
	}

	@Override
	// Delete Employee Based on eId using deleteById()
	public void deleteEmployeeById(long eId) {
		employeeRepository.findById(eId)
				.orElseThrow(() -> new EmployeeNotFoundException("The employee ID you entered does not exist."));
		employeeRepository.deleteById(eId);
	}

	@Override
	// fetching Employee details from table based on firstName
	public List<Employee> getEmployeeByFirstName(String firstName) {
		return employeeRepository.getEmployeeByFirstName(firstName);
	}

	@Override
	// fetching Employee details from table based on lastName
	public List<Employee> getEmployeeByLastName(String lastName) {
		return employeeRepository.getEmployeeByLastName(lastName);
	}

	@Override
	// fetching Employee details from table based on city
	public List<Employee> getEmployeeByCity(String city) {
		return employeeRepository.getEmployeeByCity(city);
	}

}
