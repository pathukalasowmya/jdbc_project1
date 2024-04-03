
public class GPAException extends Exception {
		private static final long SerialVersionUID = 5L;
		
		public GPAException() {
			super();
		
	  }
		public GPAException(String msg)
		{
			super(msg);
		}
	  
}
//creating unchecked exception
class IncomeException extends RuntimeException{
private static final long SerialVersionUID = 1L;
private static final int Income = 0;
 public IncomeException()
 {
	 super();
 }
public IncomeException(String msg) {
	super(msg);


	
}


public static void checkGPA(double GPA) throws GPAException{
	if(GPA<= 5.0) {
		System.out.println("You are not promoted");
	}else {
		throw new GPAException("You are promoted");
		
		
	}
}


public static void checkIncome(long income)throws IncomeException{
	if(Income>=500000) {
	throw new IncomeException("Not eligible for Schlorship" );
} else {
	System.out.println("eligible for Schlorship");
	}
}
public static void main(String[]args) {
	try 
	{
		checkGPA(3.0);	
	}
	catch (GPAException e)
	{
		System.out.println(e);
	}
	checkIncome(400000);
}
}
	


