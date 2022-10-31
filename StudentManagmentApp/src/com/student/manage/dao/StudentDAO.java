package com.student.manage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.student.manage.model.ConnectWithDB;
import com.student.manage.model.Student;

public class StudentDAO {

	// ADD student Details into DATABASE
	public static boolean insertStudentToDB(Student student) {
		boolean flag = false;

		try {
			// JDBC code
			Connection connection = ConnectWithDB.createConnection();
			String query = "insert into student(name, phone, city) values(?, ?, ?)";

			// Prepared Statement
			PreparedStatement pstmt = connection.prepareStatement(query);

			// Set the value of parameter
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getPhone());
			pstmt.setString(3, student.getCity());

			// Execute
			pstmt.executeUpdate();
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	// Delete student Details from DATABASE
	public static boolean deleteStudent(int studentId) {
		boolean flag = false;

		try {
			Connection connection = ConnectWithDB.createConnection();
			String query = "delete from student where id=?";

			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, studentId);

			pstmt.executeUpdate();
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	// Display student Details from DATABASE
	public static void displayAllStudent() {
		try {
			Connection connection = ConnectWithDB.createConnection();
			String query = "select * from student;";
			Statement stmt = connection.createStatement();

			ResultSet result = stmt.executeQuery(query);

			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				String phone = result.getString(3);
				String city = result.getString(4);

//				System.out.println();
				System.out.println("+++++++++++++++++++++++++");

				System.out.println("Id : " + id);
				System.out.println("Name : " + name);
				System.out.println("Phone : " + phone);
				System.out.println("Address : " + city);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean UpdateStudent(int sId, String sName) {
		boolean flag = false;

		try {
			// JDBC code
			Connection connection = ConnectWithDB.createConnection();
			String query = "update student set name =? where id =?;";

			// Prepared Statement
			PreparedStatement pstmt = connection.prepareStatement(query);

			// Set the value of parameter
			pstmt.setString(1, sName);
			pstmt.setInt(2, sId);

			// Execute
			pstmt.executeUpdate();
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
