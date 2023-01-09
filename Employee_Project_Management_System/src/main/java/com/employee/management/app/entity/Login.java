package com.employee.management.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Login {

	@Id
	private int uid;

	@Column(length = 10, nullable = false, unique = true)
	private String userName;

	@Column(length = 8, nullable = false)
	private String password;

}
