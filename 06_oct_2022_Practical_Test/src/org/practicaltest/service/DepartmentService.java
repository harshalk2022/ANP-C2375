package org.practicaltest.service;

import java.util.HashSet;

import org.practicaltest.dao.DepartmentDAO;
import org.practicaltest.model.Department;

public class DepartmentService {
	static DepartmentDAO departmentDAO=new DepartmentDAO();
		
	public void addDepartment(Department department) {
		departmentDAO.addDepartment(department);
			
	}
	
	public HashSet<Department> getDepartmentDetails(){
		return departmentDAO.getDepartment();
	}

}
