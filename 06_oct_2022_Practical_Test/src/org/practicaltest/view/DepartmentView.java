package org.practicaltest.view;

import java.util.Scanner;

import org.practicaltest.model.Department;


public class DepartmentView {
	Scanner sc = new Scanner(System.in);
	
	public boolean addDepartment() {
		System.out.println("Enter Department Details :- ");
		
		System.out.print("Enter Department Id : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Department Name : ");
		String name = sc.nextLine();
		
		Department department = new Department(id, name);
		return true;
	}
	
}
