package org.practicaltest.question1.main;

import java.text.ParseException;
import java.util.Scanner;

import org.practicaltest.question1.view.EmployeeView;

public class Main {
	static Scanner sc=new Scanner(System.in);
	
	public static void displayMainMenu() throws ParseException {
		EmployeeView employeeView=new EmployeeView();
		
		while(true) {
		System.out.println("1 : Add employee details");
		System.out.println("2 : Display employee  Details");
		System.out.println("3 : Start application");
		System.out.print("Enter Your Choice : ");
		int choice=sc.nextInt();
	
			switch(choice) {
			case 1:
				employeeView.addEmployeeDetails();
				System.out.println();
				break;
		       
			case 2:
				employeeView.displayEmployeeDetails();
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) throws ParseException {
		System.out.println("1 : Start Applicaton");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: 
			displayMainMenu();
		    break;
		default:
			System.out.println("Enter Your Choice : ");   
		}
	}
}
