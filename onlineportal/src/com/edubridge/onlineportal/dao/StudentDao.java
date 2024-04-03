package com.edubridge.onlineportal.dao;

import com.edubridge.onlineportal.model.Student;

public class StudentDao {
	Student[]students = new Student[2];
	
	public StudentDao() {
		students = new Student[] {
				new Student(235,"Sowmya","Sowmya@gmail.com"),
				new Student(222,"Shinde","Shinde@gmail.com"),
		};
	}
	public Student[] getAllStudents() {
		return students;
	}
}
