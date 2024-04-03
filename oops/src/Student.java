
public class Student {
    int studentId = 235;
    String studentName = "Sowmya";
    String studentEmail= "pathukalasowmya@gmail.com";
    char studentGender ='M';
    double studentMarks= 55.0;
    
    public String findResult() {
    	if(studentMarks>= 50) {
    		return "Pass";
    	}else {
    		return "Fail";
    	}
    }
    
    public void display() {
    	System.out.println("student Id :" +studentId);
		System.out.println("studentName :" +studentName);
		System.out.println("Gender:" +studentGender);
		System.out.println("Marks :" +studentMarks);    }
}
