package com.anudip.lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Contact_Info")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 30, nullable = false)
	@NotBlank(message = "Please Enter Your Name")
	private String name;

	@Column(length = 30, nullable = false)
	@NotBlank(message = "Please Enter Your City")
	private String city;

	@Column(length = 30, nullable = false, unique = true)
	@Email(message = "Please Enter Proper Email")
	@NotBlank(message = "Please Enter Your Email")
	private String email;

	@Column(length = 30, nullable = false, unique = true)
	@NotNull(message = "Please Enter Your Mobile Number")
	private long phone;

}
