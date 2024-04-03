package project2;


	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class ValidateEmailId {
		public static boolean validate(String EmailId) {
			//implement logic
			String regex = "[a-z]{15}[@]{1}[a-z]{5}.[a-z]{3}";
			
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(EmailId);
			
			if(m.find()&& m.group().equals(EmailId)) {
				return true;
			}else{
			
			return false;
		}
		}
	 public static void main(String[] args) {
		 
		 String EmailId = "pathukalasowmya@gmail.com";
		 if(validate(EmailId)) {
			 System.out.println("valid");
		 }else {
			 System.out.println("Invalid");
		 }
		
	}
}
