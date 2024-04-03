
public class StudentTest {

		public static void main(String[] args) {
	Student s1 =Student.getinstance();
		    Student  s2 =  Student.getinstance();
	        
	    
	        
	        
	        System.out.println(s1.hashCode());
	        System.out.println(s2.hashCode());
	        System.out.println(s1 == s2);
		}

	}

