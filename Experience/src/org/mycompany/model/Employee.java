package org.mycompany.model;

public class Employee {
	int employeeId;
	float employeeSalary;
	char employeeInitial;
	int employeeExperiance;
	
	public Employee() {
		
	}
	
	public Employee(int eId, char eIni, float eSal, int eExp) {
		employeeId= eId;
		employeeInitial= eIni;
		employeeSalary= eSal;
		employeeExperiance= eExp;
	
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

	public void setEmployeeSalary(char employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public float getEmployeeInitial() {
		return employeeInitial;
	}

	public void setEmployeeInitial(char employeeInitial) {
		this.employeeInitial = employeeInitial;
	}

	public int getEmployeeExperiance() {
		return employeeExperiance;
	}

	public void setEmployeeExperiance(int employeeExperiance) {
		this.employeeExperiance = employeeExperiance;
	}

}
