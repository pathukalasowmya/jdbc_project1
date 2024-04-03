
public class Student {
	private static Student instance = null;
	
	public Student () {
		System.out.println("Student Object is Created");
		
	}
	public static Student getinstance() {
		if(instance == null) {
			instance = new Student();
		}
		return instance;
		
	}
	
	

}
