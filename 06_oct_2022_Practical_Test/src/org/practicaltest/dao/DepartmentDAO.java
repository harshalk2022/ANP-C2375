package org.practicaltest.dao;

import java.util.HashSet;

import org.practicaltest.model.Department;

public class DepartmentDAO {
	static HashSet<Department> hashSet = new HashSet<Department>();
	
	public static void addDepartment(Department department) {
		hashSet.add(department);
		System.out.println(hashSet);
	}
	
	public HashSet<Department> getDepartment(){
		return hashSet;
	}
}
