
public class TryCatchDemo2 {
		 public static void main(String[]args) {
			 try {
			 //to maintain risky code
			 System.out.println(10/5); 
		 }catch(ArithmeticException ae) {
			 //to maintain handling code
			 System.out.println("can't divide number by zero");
		 }
		 }
}
