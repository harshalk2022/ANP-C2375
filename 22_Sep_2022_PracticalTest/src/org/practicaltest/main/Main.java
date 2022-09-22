package org.practicaltest.main;

import org.practicaltest.view.StudentView;

public class Main {
	public static void main(String[] args) {
        StudentView studentView = new StudentView();
        System.out.println("Enter 10 Student Details");
        studentView.acceptStudentData();
    }
}
