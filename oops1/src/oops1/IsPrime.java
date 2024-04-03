package oops1;

public class IsPrime {
	public static boolean IsPrime(int num) {
		boolean status = false;
		
		if (num%2 ==0) {
			status = true;
		}
		return status;
		
		
	}
	public static void main (String[] args) {
		boolean status = IsPrime(10);
		System.out.println(status);
		
		System.out.println(IsPrime(13));


	
   
	}

}
