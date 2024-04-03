
public class StringDemo {

	public static void main(String[] args) {
		//Creating String using String Literal
		String s1 = "Java";
		
		//Creating String using new Operator
		String s2 = new String("Python");
		
		System.out.println(s1);
		System.out.println(s2); 
		
		String s3="Java";
		String s4= new String("Python");
		
		//Meant for Reference comparision
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		
		//Meant for content comparision
		System.out.println(s1.equals(s3));
		
		System.out.println(s2.equals(s4));
		String s5 ="Spring";
		String s6= new String ("Spring");
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
	}

}
