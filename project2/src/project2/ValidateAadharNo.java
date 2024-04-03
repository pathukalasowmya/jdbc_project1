package project2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAadharNo {
	public static boolean validate(String aadharNo) {
		//implement logic
		String regex = "[2-9]{4}[0-9]{4}[0-9]{4}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(aadharNo);
		
		if(m.find()&& m.group().equals(aadharNo)) {
			return true;
		}else{
		
		return false;
	}
	}
 public static void main(String[] args) {
	 
	 String aadharNo = "324905599834";
	 if(validate(aadharNo)) {
		 System.out.println("valid");
	 }else {
		 System.out.println("Invalid");
	 }
	
}
}



