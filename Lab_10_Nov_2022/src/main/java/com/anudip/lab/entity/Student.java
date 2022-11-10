package com.anudip.lab.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Student_lap_details")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 3)
	private int id;

	@Column(length = 30, nullable = false)
	private String name;
	
	@Column(length = 30, nullable = false, unique = true)
	private String email;
	
	@Column(length = 12, nullable = false, unique = true)
	private long phone;
	
	@OneToOne(targetEntity = Laptop.class, cascade = CascadeType.ALL )
	private Laptop laptop;  

}
