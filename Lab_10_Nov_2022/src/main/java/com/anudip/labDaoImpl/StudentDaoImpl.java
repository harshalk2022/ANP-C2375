package com.anudip.labDaoImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.lab.config.HibernateUtil;
import com.anudip.lab.dao.StudentDao;
import com.anudip.lab.entity.Laptop;
import com.anudip.lab.entity.Student;

public class StudentDaoImpl implements StudentDao {

	Scanner sc = new Scanner(System.in);

	@Override
	public void addStudent() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			
			System.out.println("Enter Student Details ");
			
			System.out.print("Name :");
			String name = sc.nextLine();
			
			System.out.print("Email :");
			String email = sc.nextLine();
			
			
			System.out.print("Phone :");
			long phone = sc.nextLong();

			

			System.out.println("Enter Laptop Details");
			System.out.print("Id :");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Brand :");
			String brand = sc.nextLine();
			
			System.out.print("Operating System :");
			String os = sc.nextLine();
			
			System.out.print("Processor :");
			String processor = sc.nextLine();
			
			System.out.print("Ram in GB :");
			int ram = sc.nextInt();
			
			Student st = new Student();
			st.setName(name);
			st.setEmail(email);
			st.setPhone(phone);
			
			Laptop lap = new Laptop();
			lap.setLapId(id);
			lap.setBrand(brand);
			lap.setOperatingSystem(os);
			lap.setProcessor(processor);
			lap.setRam(ram);
			
			st.setLaptop(lap);

			session.save(st);
			tx.commit();
			System.out.println("			***** Student Added Successfully *****");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void getStudent() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			TypedQuery<Student> query = session.createQuery("from Student");

			List<Student> students = query.getResultList();

			Iterator<Student> iterator = students.iterator();
			System.out.println("--- Students Details are ---");
			System.out.println();

			while (iterator.hasNext()) {
				Student student = iterator.next();
				System.out.println(student);
				Laptop laptop = student.getLaptop();
				System.out.println(laptop);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
