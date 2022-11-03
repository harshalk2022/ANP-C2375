package com.anudip.myapp.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.myapp.config.HibernateUtil;
import com.anudip.myapp.dao.ActorDAO;
import com.anudip.myapp.entity.Actor;

public class ActorDAOImpl implements ActorDAO {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void getActor() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.print("Enter your Actor Id :");
			int id = sc.nextInt();
			Actor actor = session.get(Actor.class, id);
			System.out.println("				**** Actor Details are ****");
			System.out.println(actor);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void addActor() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
	
			System.out.println("Enter Actor Details");
			System.out.print("Name :");
			String name = sc.nextLine();

			System.out.print("Age :");
			int age = sc.nextInt();

			System.out.print("Number:");
			Long number = sc.nextLong();
			sc.nextLine();

			System.out.print("Faceshape :");
			String faceshape = sc.nextLine();

			System.out.print("Hieght :");
			float height = sc.nextFloat();
			sc.nextLine();

			
			System.out.print("Color :");
			String color = sc.nextLine();
			
			Actor actor = new Actor();
			
			actor.setName(name);
			actor.setAge(age);
			actor.setNumber(number);
			actor.setFaceshape(faceshape);
			actor.setHeight(height);
			actor.setColor(color);

			session.save(actor);
			tx.commit();
			System.out.println("*** Added Successfully ***");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void updateActor() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			System.out.print("Enter your Actor id :");
			int i = sc.nextInt();
			sc.nextLine();
			Actor actor = session.get(Actor.class, i);
			System.out.print("Enter Phone Number to Update :");
			Long num = sc.nextLong();

			actor.setNumber(num);

			session.update(actor);

			tx.commit();
			System.out.println("Updated successfully");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void deleteActor() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			System.out.print("Enter your Actor id :");
			int i = sc.nextInt();
			sc.nextLine();
			Actor actor = session.get(Actor.class, i);

			session.delete(actor);
			
			tx.commit();
			System.out.println("Deleted successfully");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
