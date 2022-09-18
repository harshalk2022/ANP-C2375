package org.practicaltest.question1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EmployeeView {
	static Scanner sc=new Scanner(System.in);
	EmployeeService employeeService=new EmployeeService();


  public void addEmployeeDetails() throws ParseException {
	  Employee employee=new Employee();
	  
	  System.out.println("Enter the employee id");
	  employee.setEmployeeId(sc.nextInt());
	  sc.nextLine();
	  
	  System.out.println("Enter the Employee Name");
	  employee.setEmployeeName(sc.nextLine());
	  
	  System.out.println("Enter the joining Date of the Employee");
	  String date=sc.nextLine();
	  employee.setJoiningDate(new SimpleDateFormat("dd/MM/yyyy").parse(date));
	  
	  System.out.println(employeeService.setEmpolyee(employee));
	  
  }
  
  public void displayEmployeeDetails() {
	  Employee[] employee=employeeService.displayEmployeeDetails();
		int i=0;
		while(employee[i]!=null) {
			System.out.println(employee[i]);
			i++;
		}
  }
}
