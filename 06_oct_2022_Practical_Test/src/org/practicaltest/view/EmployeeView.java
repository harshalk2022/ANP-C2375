package org.practicaltest.view;

import java.util.Scanner;

import org.practicaltest.model.Employee;

public class EmployeeView {
	Scanner sc = new Scanner(System.in);
	
	public boolean addEmployeeDetails() {
		System.out.println("Enter Employee Details :- ");
		
		System.out.print("Enter Employee Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Employee Email : ");
		String email = sc.nextLine();
		
		System.out.print("Enter Employee Salary : ");
		double salary = sc.nextDouble();
		
		
		Employee employee = new Employee(id, name, email, salary);
		return true;
	}
}
