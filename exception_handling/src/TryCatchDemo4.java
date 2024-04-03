
public class TryCatchDemo4 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception e) {
		
			
			e.printStackTrace();
			System.out.println("------------");
			
			System.out.println(e);
			System.out.println("-----------");
			System.out.println(e.getMessage());
			
			
			
		}

	}

}
