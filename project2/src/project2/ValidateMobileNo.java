package project2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNo {
	public static boolean validate(String mobileNo) {
		//implement logic
		String regex = "[6-9][0-9]{9}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobileNo);
		
		if(m.find()&& m.group().equals(mobileNo)) {
			return true;
		}else{
		
		return false;
	}
	}
 public static void main(String[] args) {
	 
	 String mobileNo = "9988224433";
	 if(validate(mobileNo)) {
		 System.out.println("valid");
	 }else {
		 System.out.println("Invalid");
	 }
	
}
}
