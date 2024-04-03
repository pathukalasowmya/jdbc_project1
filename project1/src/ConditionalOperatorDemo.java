
public class ConditionalOperatorDemo {

	public static void main(String[] args) {
		int num1 = 200;
		int num2 = 700;
		int num3 = 1000;
		int max = (num1>num2>num3)? num1  : num2 : num3;
		 System.out.println("max value is"+ max);

	}

}
