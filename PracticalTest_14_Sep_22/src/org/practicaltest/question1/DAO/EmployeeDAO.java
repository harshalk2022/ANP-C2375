package org.practicaltest.question1.DAO;
import org.practicaltest.question1.model.Employee;

public class EmployeeDAO {
	Employee[]employeeArray=new Employee[10];
	static int i=0;
	public String setEmployee(Employee employee) {
		employeeArray[i]=employee;
		i++;
		return "              || Successfully added the Employee Deatils. ||";
	}
	
	public Employee[] displayEmployeeDetails() {
		return employeeArray;
	}

}
