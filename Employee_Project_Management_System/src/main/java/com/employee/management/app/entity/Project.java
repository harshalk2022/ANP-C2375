package com.employee.management.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Project_Details")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Project_id")
	private long pId;

	@Column(name = "Project_Name", length = 70, nullable = false)
	@NotBlank(message = "Please enter name of project")
	private String projectName;

	@Column(length = 150, nullable = false)
	@NotBlank(message = "Please enter description of project")
	private String description;

	@Column(name = "Start_Date", length = 12, nullable = false)
	@NotBlank(message = "Please enter start date of project")
	private String startDate;

	@Column(name = "End_Date", length = 12)
	private String endDate;

	@Column(length = 25, nullable = false)
	@NotNull(message = "Please enter budget of project")
	private double budget;

	@Column(length = 20, nullable = false)
	@NotBlank(message = "Please enter status of project")
	// Project status will be (active, hold, completed)
	private String status;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "project", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Employee> employee;
}
