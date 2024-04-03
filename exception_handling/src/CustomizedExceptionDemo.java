//creating checked exception
class InvalidAgeException extends Exception{
	private static final long serialVersionUID = 1L;
	
	private InvalidAgeException() {
		super();
}
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
//creating unchecked exception
class InsufficientFundsException extends RuntimeException{
	private static final long SerialVersionUID = 1L;
	
	public InsufficientFundsException() {
		super();
	}
  public InsufficientFundsException(String msg) {
	  super(msg);
  }
  
} 
public class CustomizedExceptionDemo {
	public static void checkEligibility(int age) throws InvalidAgeException{
		if(age>= 18) {
			System.out.println("You are eligible to vote");
		}else {
			throw new InvalidAgeException("not eligible to vote");
			
			
		}
	}
	public static void withdraw(int withdrawamount) {
		int balance = 5000;
		if(withdrawamount> balance) {
		throw new InsufficientFundsException("You have balance :" +balance);
	} else {
		System.out.println("Take Cash!!!");
		}
}
	public static void main(String[]args) {
		try 
		{
			checkEligibility(17);	
		}
		catch (InvalidAgeException e)
		{
			System.out.println(e);
		}
		withdraw(6000);
	}
}