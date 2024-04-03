import java.io.*;
import java.util.regex.*;


public class mobileNumberExtraction2 {
	public static void main (String[]args){
		String path = "abc.txt";
		File f = new File(path);
		   String[]files = f.list();

		   for(String file: files) {
			   
		   }


		
		Pattern p = Pattern.compile("\\d{10}$");
		Matcher m = p.matcher(path);

		

	}
		
		
		}

		
	


