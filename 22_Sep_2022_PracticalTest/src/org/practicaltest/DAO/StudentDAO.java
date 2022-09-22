package org.practicaltest.DAO;

import java.util.TreeSet;

import org.practicaltest.model.Student;

public class StudentDAO {
	 TreeSet<Student> treeSet = new TreeSet<>();

	    public String addStudent(Student student) {
	        treeSet.add(student);
	        System.out.println(treeSet);
	        return "Student added successfully";
	    }
}