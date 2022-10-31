package com.student.manage.main;

import java.io.IOException;
import java.util.Scanner;

import com.student.manage.dao.StudentDAO;
import com.student.manage.model.Student;


public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("			-- Welcome to Student Management App --");
		
		while(true) {
			System.out.println();
			System.out.println("PRESS 1 to ADD Student");
			System.out.println("PRESS 2 to Delete Student");
			System.out.println("PRESS 3 to Display Student");
			System.out.println("PRESS 4 to Update Student");
			System.out.println("PRESS 5 to Exit App");
			
			System.out.print("Enter Your Choice :");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				// ADD Student
				System.out.println("Enter Student Details ");
				sc.nextLine();

				System.out.print("Name : ");
				String name = sc.nextLine();
				
				System.out.print("Phone : ");
				String phone = sc.nextLine();
				
				System.out.print("City : ");
				String city = sc.nextLine();
				
				Student student = new Student(name, phone, city);
				boolean isAdded = StudentDAO.insertStudentToDB(student);
				
				if(isAdded) {
					System.out.println("            -- Student Added Successfully --");
				}else {
					System.out.println("            -- Someting went wrong --");
				}
			 	
				System.out.println(student);
				break;
				
			case 2:
				// Delete Student
				System.out.print("Enter Student Id to delete Student : ");
				int studentId = sc.nextInt();
				
				boolean isDeleted = StudentDAO.deleteStudent(studentId);
				
				if(isDeleted) {
					System.out.println("            -- Student Deleted Successfully --");
				}else {
					System.out.println("            -- Someting went wrong --");
				}
				
				break;
				
			case 3:
				// Display Student
				StudentDAO.displayAllStudent();
				break;
				
			case 4:
				//Update Student
//				System.out.println("What you want to Update \n1. Name \n2. Phone \n3. City");
//				System.out.print("Enter Choice : ");
//				int choice1 = sc.nextInt();
				
				System.out.print("Enter Student Id to Update Student : ");
				int sId = sc.nextInt();
				sc.nextLine();
				
//				System.out.print("Enter here :");
//				String string = sc.nextLine();
				
//				if (choice1 == 1){
//					System.out.print("Enter Name to Update :");
//					String string = sc.nextLine();
//				}else if (choice1 == 2) {
//					System.out.print("Enter Phone to Update :");
//					String string = sc.nextLine();
//				}else if (choice1 == 3) {
//					System.out.print("Enter City to Update :");
//					String string = sc.nextLine();
//				}else {
//					System.out.println("Invalid Choice");
//				}
				
				
				System.out.print("Enter Name to Update :");
				String sName = sc.nextLine();
				boolean isUpdated = StudentDAO.UpdateStudent(sId, sName);
				
				if(isUpdated) {
					System.out.println("            -- Student Updated Successfully --");
				}else {
					System.out.println("            -- Someting went wrong --");
				}
				break;
		
			case 5:
				// Exit App
				System.out.println("            			-- Thank You! --");
				System.exit(0);
				break;
				
			default :
				System.out.println("Invalid Choice");
				
			}
			
		}
	}
}
