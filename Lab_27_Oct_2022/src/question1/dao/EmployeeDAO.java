package question1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import question1.model.ConnectWithDB;
import question1.model.Employee;

public class EmployeeDAO {
	

	public static boolean insertEmployeeToDB(Employee employee) {
		boolean flag = false;
		
		try {
			Connection connection = ConnectWithDB.createConnection();
			String query = "insert into Employee(id, name, phone, address, email, dept) values(?, ?, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setString(4, employee.getPhone());
			pstmt.setString(5, employee.getAddress());
			pstmt.setString(3, employee.getEmail());
			pstmt.setString(6, employee.getDepartment());
			
			pstmt.executeUpdate();
			flag = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		try {
			Connection connection = ConnectWithDB.createConnection();
			String query = "delete from Employee where id=?";
			
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, empId);
			
			pstmt.executeUpdate();
			flag = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	public static void displayAllEmployee() {
		// TODO Auto-generated method stub		
		try {
			Connection connection = ConnectWithDB.createConnection();
			String query = "select * from Employee;";
			Statement stmt = connection.createStatement();
			
			ResultSet result = stmt.executeQuery(query);
			
			while(result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				String phone = result.getString(3);
				String address = result.getString(4);
				String email = result.getString(5);
				String dept = result.getString(6);

				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println("Id : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+phone);
				System.out.println("Address : "+address);
				System.out.println("Email : "+email);
				System.out.println("Department : "+dept);				
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static boolean updateEmployee(int employeeId, String employeeName) {
		boolean flag = false;

		try {
			Connection connection = ConnectWithDB.createConnection();
			String query = "update Employee set name =? where id =?;";

			PreparedStatement pstmt = connection.prepareStatement(query);

			pstmt.setString(1, employeeName);
			pstmt.setInt(2, employeeId);

			// Execute
			pstmt.executeUpdate();
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	
}
