package org.mycompany.service;
import org.mycompany.model.Employee;

public class EmployeeService {
	public Employee calculateSalarayIncrement(Employee obj1,int increment) {
		 obj1.setEmployeeSalary(obj1.getEmployeeSalary()+(obj1.getEmployeeSalary()*increment)/100);
		return obj1;
	}

}
