/*case 1:
 * Once exception is raised in try block then rest of code
 * wont be excuted then that become unreachable.
 * 
 */
public class TryCatchDemo3 {

	public static void main(String[] args) {
		
		try {
			String str = null;
			System.out.println(str.charAt(5));
			
			int[] arr = {10,20,30};
			System.out.println(arr[5]);
			//System.out.println(10/0);
            

		}catch(ArithmeticException ae) {
		  System.out.println("can't divide number zero");
		}catch (ArrayIndexOutOfBoundsException e)
		{
	     System.out.println("no element is allowed");
		}catch(Exception e) {
			System.out.println("some exception happened");
			
		}

	}

}
