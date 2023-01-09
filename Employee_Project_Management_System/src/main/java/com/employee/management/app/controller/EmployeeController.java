package com.employee.management.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.app.entity.Employee;
import com.employee.management.app.service.EmployeeService;

@RestController
// Rest controller to handle all incoming request using REST API
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	// Saving Employee details using Post Mapping
	@PostMapping("/employees")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}

	// fetching all Employee details using Get Mapping
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	// fetching Employee details by eId using Get Mapping
	@GetMapping("/employees/{eId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("eId") long eId) {
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(eId), HttpStatus.OK);
	}

	// Updating Employee details by eId using put mapping
	@PutMapping("/employees/{eId}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("eId") long eId, @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.updateEmployeeById(employee, eId), HttpStatus.OK);
	}

	// Deleting Employee details by eId using Delete Mapping
	@DeleteMapping("/employees/{eId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("eId") long eId) {
		employeeService.deleteEmployeeById(eId);
		return new ResponseEntity<String>("The employee was successfully deleted.", HttpStatus.OK);
	}

	// fetching Employee details by firstName using Get Mapping
	@GetMapping("/employees/fname/{firstName}")
	public List<Employee> getEByFirstName(@PathVariable("firstName") String firstName) {
		return employeeService.getEmployeeByFirstName(firstName);
	}

	// fetching Employee details by lastName using Get Mapping
	@GetMapping("/employees/lname/{lastName}")
	public List<Employee> getEByLastName(@PathVariable("lastName") String lastName) {
		return employeeService.getEmployeeByLastName(lastName);
	}

	// fetching Employee details by city using Get Mapping
	@GetMapping("/employees/city/{city}")
	public List<Employee> getEmployeeByCity(@PathVariable("city") String city) {
		return employeeService.getEmployeeByCity(city);
	}
}
