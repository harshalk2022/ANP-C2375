package com.anudip.hb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 3)
	private int sId;
	
	@Column(length = 30, nullable = false)
	private String sname;
	
	@Column(length = 2, nullable = false)
	private int sage;
	
	@Column(length = 30, nullable = false, unique = true)
	private long sphone;
	
	@Column(length = 11, nullable = false)
	private String sedu;
	
	@Column(length = 30, nullable = false, unique = true)
	private String semil;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public long getSphone() {
		return sphone;
	}

	public void setSphone(long sphone) {
		this.sphone = sphone;
	}

	public String getSedu() {
		return sedu;
	}

	public void setSedu(String sedu) {
		this.sedu = sedu;
	}

	public String getSemil() {
		return semil;
	}

	public void setSemil(String semil) {
		this.semil = semil;
	}
	
	
	
	
	
	

}
