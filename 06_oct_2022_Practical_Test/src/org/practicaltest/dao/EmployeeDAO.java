package org.practicaltest.dao;

import java.util.HashSet;

import org.practicaltest.model.Employee;


public class EmployeeDAO {
	static HashSet<Employee> hashSet = new HashSet<Employee>();
	
	public static void addEmployee(Employee employee) {
		hashSet.add(employee);
		System.out.println(hashSet);
	}
	
	public HashSet<Employee> getEmployeeDetails(){
		return hashSet;
	}

}
