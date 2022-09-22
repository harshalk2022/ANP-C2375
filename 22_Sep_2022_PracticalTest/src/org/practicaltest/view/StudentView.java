package org.practicaltest.view;

import java.util.Scanner;

import org.practicaltest.model.Student;
import org.practicaltest.service.StudentService;

public class StudentView {
	 static Scanner sc = new Scanner(System.in);
	    StudentService studentService = new StudentService();

	    public void acceptStudentData() {
	        for(int i=1; i<=10; i++) {
	            System.out.println("Enter Student Details : "+i);
	            System.out.print("Enter Student Id : ");
	            int id = (sc.nextInt());
	            sc.nextLine();
	            System.out.print("Enter Student Name : ");
	            String name = (sc.nextLine());

	            studentService.addStudent(new Student(id,name));
	            System.out.println();
	        }
	    }
}
