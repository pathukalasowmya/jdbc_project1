package project2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePanNo {
	public static boolean validate(String panNo) {
		//implement logic
		String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(panNo);
		
		if(m.find()&& m.group().equals(panNo)) {
			return true;
		}else{
		
		return false;
	}
	}
 public static void main(String[] args) {
	 
	 String panNo = "DYEPP5031D";
	 if(validate(panNo)) {
		 System.out.println("valid");
	 }else {
		 System.out.println("Invalid");
	 }
	
}
}

