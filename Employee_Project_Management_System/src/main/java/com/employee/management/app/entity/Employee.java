package com.employee.management.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employee_Details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employee_id")
	private long eId;

	@Column(name = "First_Name", length = 30, nullable = false)
	@NotBlank(message = "Please enter your first name")
	private String firstName;

	@Column(name = "Last_Name", length = 30, nullable = false)
	@NotBlank(message = "Please enter your last name")
	private String lastName;

	@Column(length = 30, nullable = false, unique = true)
	@Email(message = "Please enter proper Email")
	@NotBlank(message = "Please enter your Email")
	private String email;

	@Column(length = 12, nullable = false, unique = true)
	@NotNull(message = "Please enter your mobile number")
	private long mobile;

	@Column(length = 25, nullable = false)
	@NotBlank(message = "Please enter your city")
	private String city;

	@Column(length = 15, nullable = false)
	@NotNull(message = "Please enter your salary amount")
	private double salary;

	@Column(name = "Joining_Date", length = 12, nullable = false)
	@NotBlank(message = "Please enter your date of joining")
	private String joiningDate;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "Project_Id", referencedColumnName = "Project_id")
	@JsonBackReference
	private Project project;

}
