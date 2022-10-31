package com.student.manage.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectWithDB {
	
	static Connection connection;
		
	public static Connection createConnection(){
		try {
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create the Connection
			String user ="root";
			String password ="Password@123";
			String url ="jdbc:mysql://localhost:3306/student_manage";
			
			connection = DriverManager.getConnection(url, user, password);
				
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","Password@123");
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	return connection;
	
	}

}

