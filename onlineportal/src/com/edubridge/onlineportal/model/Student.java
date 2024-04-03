package com.edubridge.onlineportal.model;

public class Student {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private static int studentBatchCode = 11223;
	
	
	
	public Student() {
		super();
	}



	public Student(int studentId, String studentName, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	public void getStudentDetails() {
	System.out.println("ID: "+studentId);
	System.out.println("NAME: "+studentName);
	System.out.println("EMAIL: "+studentEmail);
	System.out.println("BATCH: "+studentBatchCode);

}	
		
	}
