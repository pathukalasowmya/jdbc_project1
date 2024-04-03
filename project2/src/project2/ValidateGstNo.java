package project2;


	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class ValidateGstNo {
		public static boolean validate(String gstNo) {
			//implement logic
			String regex = "[0-5]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[0-2]{1}[A-Z]{1}[0-5]{1}";
			
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(gstNo);
			
			if(m.find()&& m.group().equals(gstNo)) {
				return true;
			}else{
			
			return false;
		}
		}
	 public static void main(String[] args) {
		 
		 String gstNo = "55AAAAA0000A1Z5";
		 if(validate(gstNo)) {
			 System.out.println("valid");
		 }else {
			 System.out.println("Invalid");
		 }
		
	}
	}



