package oops1;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentId(1001);
		s.setStudentName("Sowmya");
		s.setStudentMarks(55);
			
		System.out.println("Id:"+s.getStudentId());
		System.out.println("Name:" +s.getStudentName());
		System.out.println("Marks:"+s.getStudentMarks());
		
		
}
}