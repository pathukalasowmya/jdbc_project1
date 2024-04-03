
public class IfDemo {
	public static boolean isEven(int num) {
		boolean status = false;
		
		if (num%2 ==0) {
			status = true;
		}
		return status;
	}
	public static void main (String[] args) {
		boolean status = isEven(10);
		System.out.println(status);
		
		System.out.println(isEven(13));
	}

}
