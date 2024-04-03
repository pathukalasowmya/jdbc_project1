package oops1;
//tightly Encapsulated class
public class Student {
	private int studentId= 101;
	private String studentName = "Jones";
	private int studentMarks=55;
	
	//getters and setters methods
	
	//getter method
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	public int getStudentId() {
		return studentId;
	}
	//setter method
	public int setStudentId() {
		return this.studentId;
	}

}
