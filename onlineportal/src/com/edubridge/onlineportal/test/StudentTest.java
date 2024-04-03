package com.edubridge.onlineportal.test;
import com.edubridge.onlineportal.model.Student;
import com.edubridge.onlineportal.service.StudentService;


public class StudentTest {
	public static void main(String[]args) {
		StudentService service = new StudentService();
		Student[] students = service.displayAllStudents();
		for(Student student : students) {
			student.getStudentDetails();
			System.out.println("-------------------");
		}
				
				
			
	
		
	}

}
