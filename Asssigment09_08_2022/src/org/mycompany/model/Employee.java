package org.mycompany.model;

public class Employee {
	int employeeId ;
	char employeeInitial;
	float employeeSalary;
	
	
	public Employee() {
		
	}
	
	public Employee(int eId , char eIni , float   eSal) {
		employeeId = eId;
		employeeInitial= eIni;
		employeeSalary = eSal;
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public char getEmployeeInitial() {
		return employeeInitial;
	}

	public void setEmployeeInitial(char employeeInitial) {
		this.employeeInitial = employeeInitial;
	}
}
