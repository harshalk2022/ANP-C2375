package com.springjdbc.entity;

public class Student {
	private int id;
	private String name;
	private int mobile;
	private String edu;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int mobile, String edu) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.edu = edu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}
}
