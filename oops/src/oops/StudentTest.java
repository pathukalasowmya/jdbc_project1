public class StudentTest {

	public static void main(String[] args) {
		//object creation or instantiation -  constructor executed to perform initialization of newly created objects 
		Student s1 = new Student(235,"Sowmya",'F',45.0); 
		s1.display();
		System.out.println("Result: "+s1.findResult());
		
		System.out.println("-----------------");
		
		Student s2 = new Student(236,"Smith",'M',55.0);
				s2.display();System.out.println("Result: " +s2.findResult());
		
		//zero parameterized constructor/0-arg constructor
		public Student() {
			System.out.println("0-arg constructor");
		}

	}
//parameterized constructor
	public Student (int studentId,String student,char studentGender,double studentMarks) {
		System.out.println("parameterized constructor");
		this.studentId = studentId;
		
	}
}
