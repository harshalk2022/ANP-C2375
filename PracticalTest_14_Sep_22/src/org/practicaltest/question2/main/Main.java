package org.practicaltest.question2.main;

import java.util.Scanner;

import org.practicaltest.question2.view.UserView;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserView userView = new UserView();

		while(true) {
		System.out.println("1 : Add User");
		System.out.println("2 : Display User");
		System.out.println("3 : Exit");
		System.out.print("Enter Your Choice :");
		int ch=sc.nextInt();
		
			switch(ch) {
			case 1:
				userView.getUserDetails();
			    break;
			case 2:
				userView.displayUserDetails();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.print("Enter Your Choice : ");
			
			}
		}
	}
}
