package com.springex.entity;

public class Company {
	private String compName;
	private String compAdd;
	private String year;
	private Employee employee;
	
	
	public Company(String compName, String compAdd, String year, Employee employee) {
		super();
		this.compName = compName;
		this.compAdd = compAdd;
		this.year = year;
		this.employee = employee;
	}
	
	public void display1() {
		System.out.println("Comapny name: "+compName + "\nCompany address: "+compAdd + "\nFounded In: "+year);
		System.out.println(employee.toString());
	}
}
