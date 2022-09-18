package org.practicaltest.question1.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.practicaltest.question1.model.Employee;
import org.practicaltest.question1.service.EmployeeService;

public class EmployeeView {
	static Scanner sc=new Scanner(System.in);
	EmployeeService employeeService=new EmployeeService();


  public void addEmployeeDetails() throws ParseException {
	  Employee employee=new Employee();
	  
	  System.out.print("Enter the employee Id : ");
	  employee.setEmployeeId(sc.nextInt());
	  sc.nextLine();
	  
	  System.out.print("Enter the Employee Name : ");
	  employee.setEmployeeName(sc.nextLine());
	  
	  System.out.print("Enter the joining Date of the Employee (dd/MM/yyyy): ");
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
