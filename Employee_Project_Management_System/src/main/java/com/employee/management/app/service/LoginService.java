package com.employee.management.app.service;

import com.employee.management.app.entity.Login;

// Abstract method for Login entity
public interface LoginService {

	public Login loginUser(String userName, String password);

}
