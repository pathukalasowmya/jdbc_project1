package com.edubridge.onlineportal.service;

import com.edubridge.onlineportal.dao.StudentDao;
import com.edubridge.onlineportal.model.Student;

public class StudentService {
    StudentDao dao = new StudentDao();
    
    public Student[]displayAllStudents() {
    	return dao.getAllStudents();
    	
	
}

	}


