
public class TryCatchDemo {
 public static void main(String[]args) {
	 try {
	 //to maintain risky code
	 System.out.println(10/0); 
 }catch(ArithmeticException ae) {
	 //to maintain handling code
	 System.out.println("can't divide number by zero");
 }
 }
}
/* note - the exception which are extending runtime exceptions which 
are called unchecked exceptions
the exceptions which are not extending exceptions class are called checked exceptions.








*/