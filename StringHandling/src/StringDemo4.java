
public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String ("Java");
		String s2 = new String("Java");
		System.out.println(s1==s2);
		
		String s3 = "Java";
		
		 String s4=s1.intern();
		 System.out.println(s3 ==s4);
		 
		 
		 

	}

}
