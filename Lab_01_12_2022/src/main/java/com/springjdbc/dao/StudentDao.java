package com.springjdbc.dao;

import com.springjdbc.entity.Student;

public interface StudentDao {
	public int saveStudent(Student student);

	public int updateStudent(Student student);

	public int deleteStudent(Student student);
}
