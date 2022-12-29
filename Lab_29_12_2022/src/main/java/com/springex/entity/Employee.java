package com.springex.entity;

public class Employee {
	private String empName;
	private String empEmail;
	private String empDept;
	
	
	public Employee(String empName, String empEmail, String empDept) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empDept = empDept;
	}


	@Override
	public String toString() {
		return "Company [empName=" + empName + ", empEmail=" + empEmail + ", empDept="
				+ empDept + "]";
	}

}
