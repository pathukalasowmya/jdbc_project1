
public class OddDemo {
	public static boolean isOdd(int num) {
		boolean status = false;
		
		if (num%2 ==0) {
			status = true;
		}
	return status;
	}
public static void main(String[] args){
	boolean status = isOdd(10);
	System.out.println(status);
	
	System.out.println(isOdd(11));
}
}
