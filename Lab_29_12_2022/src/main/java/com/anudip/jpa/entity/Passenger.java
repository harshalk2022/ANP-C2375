package com.anudip.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "PassengerInfo")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length=30, nullable=false)
	@NotBlank(message="Enter your first name")
	private String pName;
	
	@Column(length=30, nullable=false)
	@NotBlank(message="Enter your surname")
	private String pSurname;
	
	@Column(length=30, nullable=false, unique=true)
	@Email(message="Enter proper Email Id")
	@NotBlank(message="Enter your Email Id")
	private String pEmail;
	
	@Column(length=12, nullable=false, unique=true)
	@NotNull(message="Enter your phone number")
	private long phone;

}
