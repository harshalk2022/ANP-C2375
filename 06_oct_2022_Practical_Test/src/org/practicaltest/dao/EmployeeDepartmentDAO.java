package org.practicaltest.dao;

import java.util.HashMap;

import org.practicaltest.model.Department;
import org.practicaltest.model.Employee;

public class EmployeeDepartmentDAO {
	
	public void addEmployeeDepartment(Employee employee, Department department) {
		HashMap<Employee, Department> hashMap = new HashMap<>();
		hashMap.put(employee, department);
		System.out.println(hashMap);			
	}
}
