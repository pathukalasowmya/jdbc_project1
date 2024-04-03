package project2;

 
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class ArrayListMobileNo {
		public static boolean validate(String arraylistmobileNo) {
			//implement logic
			String regex = "[0-9]{10}";
			
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(arraylistmobileNo);
			
			if(m.find()&& m.group().equals(arraylistmobileNo)) {
				return true;
			}else{
			
			return false;
		}
		}
	 public static void main(String[] args) {
		 
		 String arraylistmobileNo = "7569272937";
		 if(validate(arraylistmobileNo)) {
			 System.out.println("valid");
		 }else {
			 System.out.println("Invalid");
		 }
		
	}
	}


