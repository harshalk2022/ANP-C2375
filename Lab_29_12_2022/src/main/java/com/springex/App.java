package com.springex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springex.entity.Book;
import com.springex.entity.Company;
import com.springex.entity.Product;
import com.springex.entity.Student;

public class App {
	public static void main(String[] args) {

//		for Book class
//		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Book b = (Book) c.getBean("bookBean");
//		b.display();
//
//		System.out.println();
//
////		for student class
//		Resource res = new ClassPathResource("applicationContext.xml");
//		BeanFactory f = new XmlBeanFactory(res);
//
//		Student s = (Student) f.getBean("ab");
//		s.display();

		
//		for company
//		System.out.println();
//		ApplicationContext ac1 = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Company comp = (Company) ac1.getBean("com");
//		comp.display1();
		
//		for company
		System.out.println();
		ApplicationContext dec = new ClassPathXmlApplicationContext("applicationContext.xml");
		Product product = (Product) dec.getBean("product");
		product.show(); // function calling
		System.out.println(product);  // using toString method
	}  
}
