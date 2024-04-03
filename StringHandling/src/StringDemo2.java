
public class StringDemo2 {

	public static void main(String[] args) {
		//String Methods
	String s1= "Java";
	String s2="21";
	
	//concatination
	System.out.println(s1+s2);
	System.out.println(s1.concat(s2));
	
	//find length
	System.out.println(s1.length());
	System.out.println("Python".length());
	
	//find char in string
	System.out.println("Python".charAt(0));
	System.out.println("Python".charAt(5));
	//System.out.println("Python".charAt(6));
	System.out.println("Python".charAt("Python".length()-1));
	
	//to divide string into multiple tokens
	String s = "Java programming is fun";
	String[]words=s.split("");
	for(String word:words) {
		System.out.println(word);
	}
	
	//comparing String Content
	System.out.println("Java".equals("Java"));
	System.out.println("java".equals("Java"));
	
	System.out.println("java".equalsIgnoreCase("Java"));
	System.out.println("java".equalsIgnoreCase("JaVa"));
	
	System.out.println("hyDerAbaD");
	System.out.println("hyDerAbaD".toUpperCase());
	System.out.println("hyDerAbaD".toLowerCase());
	
	s = "React";
	char[]chars = s.toCharArray();
	System.out.println(chars);
	
	String s3 = new String(chars);
	System.out.println(s3);
	
	byte[]bytes = s.getBytes();
	String s4=new String(bytes);
	System.out.println(s4);
	
	System.out.println("   java   ");
	//remove while paces begining 
	System.out.println("    java ".stripLeading());
	
	//remove white spaces ending
	System.out.println("  java  ".stripTrailing());
	
	//remove white spaces both beginning and ending
	System.out.println("Java".strip());
	System.out.println("JAva".endsWith("a"));
	
	System.out.println("Java is fun ".substring(8));
	System.out.println("Java is fun".substring(5,8));
	
	System.out.println("  ".length());
	
	System.out.println(" ".isBlank());
	System.out.println(" ".isEmpty());
	
	System.out.println("Java ".isBlank());
	System.out.println("Java".isEmpty());
	
	String a ="Java";
	System.out.println(a);
	
	a.concat("21");
	System.out.println(a);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
	

	}

}
