package com.anudip.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Data
@Entity
@Table(name = "Actor_Details")
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "Name cannot be blank")
	@Min(value = 3)
	private String name;
	
	@Column(length = 2, nullable = false)
	@NotBlank(message = "Age cannot be blank")
	private int age;
	
	@Column(length = 12, nullable = false, unique = true)
	@NotNull(message = "Number cannot be blank")
	private Long number;
	
	@Column(length = 25, nullable = false)
	@NotNull(message = "Faceshape cannot be blank")
	private String faceshape;
	
	@Column(length = 4, nullable = false)
	@NotNull(message = "Height cannot be blank")
	private float height;
	
	@Column(length = 25, nullable = false)
	@NotNull(message = "Color cannot be blank")
	private String color;
	
	
	
	
	
	
	

}
