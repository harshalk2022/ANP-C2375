package com.employee.management.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.management.app.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

	public Login findByUserNameAndPassword(String userName, String Password);
}
