package org.practicaltest.question2.view;

import java.util.Scanner;

import org.practicaltest.question2.exception.PasswordFormatException;
import org.practicaltest.question2.model.User;
import org.practicaltest.question2.service.UserService;

public class UserView {
	UserService userService = new UserService();
	static Scanner sc = new Scanner(System.in);
	
	
	public void getUserDetails() {

		User user = new User();
		
		System.out.print("User Name : ");
		user.setUsername(sc.nextLine());
		
		System.out.print("Password :");
		user.setPassword(sc.nextLine());
		
		try {
			System.out.println(userService.setUser(user));
		} 
		catch (PasswordFormatException e) {
			System.out.println("Warning:"+e.getMessage());
			System.out.println("Enter Details Again");
			System.out.println();
		}	
	}
	public void displayUserDetails() {
		User[] user = userService.displayUserDetails();
		int i=0;
		while(user[i] != null) {
		System.out.println(user[i]);
		i++;
		}
	}
}
