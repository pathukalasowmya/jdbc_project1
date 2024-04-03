
public class SwitchDemo {
	public static String getPlan(int age) {
		String plan = "";
		
		switch(age) {
		case 18:
			plan = "Educational Plan";
			break;
		case 21:
			plan = "Career Plan";
			break;
		case 25:
		    plan = "Financial Plan";
		    break;
		case 22:
		plan = "Annual Plan";
		   break;
		case 60:
		plan = "Retirement Plan";
	       break;
	    default:
	    	plan = "you dont have any plans";
		}
		return plan;
		
	}

	public static void main(String[] args) {
		int age = 13;
		String plan = getPlan(age);
		System.out.println(plan);
		

	}

}
