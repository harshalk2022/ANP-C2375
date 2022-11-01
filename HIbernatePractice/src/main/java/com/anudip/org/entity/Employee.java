package com.anudip.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Data")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 3)
	private int Id;
	
	@Column(length = 40, nullable = false)
	private String name;
	
	@Column(length = 2, nullable = false)
	private int age;
	
	@Column(length = 12, nullable = false, unique = true)
	private long phone;
	
	@Column(length = 30, nullable = false)
	private String designation;
	
	@Column(length = 30, nullable = false, unique = true)
	private String email;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, long phone, String designation, String email) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.designation = designation;
		this.email = email;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", designation="
				+ designation + ", email=" + email + "]";
	}
	

}
