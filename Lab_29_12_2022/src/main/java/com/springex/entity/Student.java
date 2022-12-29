package com.springex.entity;

public class Student {
	private String sName;
	private String sEdu;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String sName, String sEdu) {
		super();
		this.sName = sName;
		this.sEdu = sEdu;
	}
	
	
	public void display() {
		System.out.println("Student Name: "+ sName + "\nStudent Education : " +sEdu);
	}
	

}
