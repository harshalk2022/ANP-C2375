package com.employee.management.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.app.entity.Login;
import com.employee.management.app.repository.LoginRepository;
import com.employee.management.app.service.LoginService;

@Service
// All business logic
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;

	@Override
	public Login loginUser(String userName, String password) {
		Login login = loginRepository.findByUserNameAndPassword(userName, password);
		return login;
	}

}
