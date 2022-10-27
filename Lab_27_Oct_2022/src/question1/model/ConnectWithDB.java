package question1.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectWithDB {
	
	static Connection connection;
		
		public static Connection createConnection(){
			try {
			
//				Class.forName("com.mysql.cj.jdbc.Driver");
//				String user ="root";
//				String password ="Password@123";
//				String url ="jdbc:mysql://localhost:3306/assignment_27_10_2022";
//				connection = DriverManager.getConnection(url, user, password);
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment_27_10_2022","root","Password@123");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			return connection;
			
		}

}
