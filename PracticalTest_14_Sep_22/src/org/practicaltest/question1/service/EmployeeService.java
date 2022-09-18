package org.practicaltest.question1.service;

import org.practicaltest.question1.DAO.EmployeeDAO;
import org.practicaltest.question1.model.Employee;

public class EmployeeService {
	EmployeeDAO employeeDAO=new EmployeeDAO();

	public String setEmpolyee(Employee employee) {
		return employeeDAO.setEmployee(employee);
	}

	public Employee[] displayEmployeeDetails() {
		return employeeDAO.displayEmployeeDetails();
	}

}
