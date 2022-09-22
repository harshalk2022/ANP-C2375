package org.practicaltest.service;

import org.practicaltest.DAO.StudentDAO;
import org.practicaltest.model.Student;

public class StudentService {
	 StudentDAO studentDAO = new StudentDAO();

	    public String addStudent(Student student) {
	        return studentDAO.addStudent(student);
	    }

}
