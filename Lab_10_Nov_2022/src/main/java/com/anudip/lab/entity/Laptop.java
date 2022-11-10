package com.anudip.lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class Laptop {
	
	@Id
	private int lapId;
	
	@Column(length = 25, nullable = false)
	private String brand;
	
	@Column(length = 10, nullable = false)
	private String processor;
	
	@Column(length = 20, nullable = false)
	private String operatingSystem;
	
	@Column(length = 2, nullable = false)
	private int ram;
	
}