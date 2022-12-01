package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.daoimpl.StudentDaoImpl;
import com.springjdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDaoImpl daoImpl = (StudentDaoImpl) ap.getBean("edao");

//		Adding student 
		int status = daoImpl.saveStudent(new Student(102, "Achal", 732352867, "BEE"));
		System.out.println(status);

//		Updating Student
		int status1 = daoImpl.updateStudent(new Student(102, "Achal", 732352867, "BE"));
		System.out.println(status1);

//		Deleting Student
		Student student = new Student();
		student.setId(102);
		int status2 = daoImpl.deleteStudent(student);
		System.out.println(status2);
	}
}
