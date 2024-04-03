
public class TryCatchDemo5 {

	public static void main(String[] args) {
		System.out.println("Java");
		try {
			System.out.println(10/0);
		}catch(NullPointerException e) {
			System.out.println("Python");
			}finally {
				//to maintain mandatory code like closing network connection
				//or database connection
         System.out.println("GoLang");
	}

}
}
//finally block will exceuted always if there is no System.exit();
//once  given System.exit() program gets locked
//finally block will always dominate return statement.