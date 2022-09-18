package org.practicaltest.question2.DAO;

import org.practicaltest.question2.model.User;

public class UserDAO {
	User[]userArray = new User[10];
	static int i=0;

	public String setUser(User user) {
		userArray[i] = user;
		i++;
		return "            ||  Succefully Added User Details  ||";
	}

	public User[] displayUserDetails() {
		return userArray;
	}
}
