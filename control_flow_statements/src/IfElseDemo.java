
public class IfElseDemo {
	public static String checkEligibility(int age) {
		String status = "";
		if (age >= 18) {
			 status = "You are eligible to vote";
		}else {
			status = "You are not eligible to vote";
		}
		return status;
	}
	

	public static void main(String[] args) {
String eligibility =checkEligibility(22);
System.out.println(eligibility);

	}

}
