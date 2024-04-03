package project2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTsRigistration {
	public static boolean validate(String tsrigistration) {
		//implement logic
		String regex = "[A-Z]{2}[0-5]{2}[A-Z]{1}[0-9]{4}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(tsrigistration);
		
		if(m.find()&& m.group().equals(tsrigistration)){
			return true;
		}else{
		
		return false;
	}
	}
 public static void main(String[] args) {
	 
	 String tsrigistration = "TS24G6780";
	 if(validate(tsrigistration)) {
		 System.out.println("valid");
	 }else {
		 System.out.println("Invalid");
	 }
	
}
}



