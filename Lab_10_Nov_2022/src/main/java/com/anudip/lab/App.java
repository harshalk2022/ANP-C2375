package com.anudip.lab;

import java.util.Scanner;

import com.anudip.labDaoImpl.StudentDaoImpl;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("				--- LabTest_10_Nov_2022 ---");

		Scanner scanner = new Scanner(System.in);

		StudentDaoImpl daoImpl = new StudentDaoImpl();

		while (true) {
			System.out.println("1. Add Student and Laptop Details \n2. Display Student \n3. Exit");

			System.out.print("Enter Your Choice :");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				daoImpl.addStudent();
				break;

			case 2:
				daoImpl.getStudent();
				break;

			case 3:
				System.out.println("				--- THANK YOU! ---");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice");
			}

		}

	}
}
