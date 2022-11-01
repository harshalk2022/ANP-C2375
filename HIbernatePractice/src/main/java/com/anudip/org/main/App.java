package com.anudip.org.main;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.anudip.org.entity.Employee;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("							*** Project Started ***");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.println("Enter Employee Details ");
		System.out.print("Id :");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("name :");
		String name = sc.nextLine();
		
		System.out.print("Age :");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Phone :");
		long phone = sc.nextLong();
		sc.nextLine();
		
		System.out.print("designation :");
		String designation = sc.nextLine();;
		
		System.out.print("Email :");
		String email = sc.nextLine();

		Employee employee = new Employee(id, name, age, phone, designation, email);
		System.out.println();
		System.out.println(employee);
		System.out.println();
		
		session.save(employee);
		
		transaction.commit();

		System.out.println();
		System.out.println("							*** Added Successfully ***");

		session.close();
	}
}
