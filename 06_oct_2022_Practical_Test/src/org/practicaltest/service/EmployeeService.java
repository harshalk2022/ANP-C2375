package org.practicaltest.service;

import java.util.HashSet;

import org.practicaltest.dao.EmployeeDAO;
import org.practicaltest.model.Employee;

public class EmployeeService {
	static EmployeeDAO empDAO=new EmployeeDAO();
	
	public void addEmployee(Employee employee) {
	empDAO.addEmployee(employee);
	
	}
	public HashSet<Employee> getEmployeeDetails(){
		return empDAO.getEmployeeDetails();
	}

}
