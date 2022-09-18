package org.practicaltest.question1;

public class EmployeeDAO {
	Employee[]employeeArray=new Employee[10];
	static int i=0;
	public String setEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeArray[i]=employee;
		i++;
		return "successfully added the employee deatils";
	}
	public Employee[] displayEmployeeDetails() {
		// TODO Auto-generated method stub
		return employeeArray;
	}
}
