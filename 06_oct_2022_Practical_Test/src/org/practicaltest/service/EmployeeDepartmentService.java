package org.practicaltest.service;

import org.practicaltest.dao.EmployeeDepartmentDAO;
import org.practicaltest.model.Department;
import org.practicaltest.model.Employee;

public class EmployeeDepartmentService {
	static EmployeeDepartmentDAO empDep=new EmployeeDepartmentDAO();
	public void addEmployeeDepartment(Employee emp,Department dep) {
		empDep.addEmployeeDepartment(emp, dep);
	}

}
