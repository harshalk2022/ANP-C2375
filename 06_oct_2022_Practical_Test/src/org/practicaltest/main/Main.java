package org.practicaltest.main;

import org.practicaltest.view.DepartmentView;
import org.practicaltest.view.EmployeeView;

public class Main {
	public static void main(String[] args) {
		
		EmployeeView employeeView = new EmployeeView();
		DepartmentView departmentView = new DepartmentView();
		
		employeeView.addEmployeeDetails();
		System.out.println();
		System.out.println("			-- Employee Added Successully --");
		System.out.println();
		
		departmentView.addDepartment();
		System.out.println();
		System.out.println("			-- Department Added Successully --");
		
	}

}
