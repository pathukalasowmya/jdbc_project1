
public class Printer {
	private static Printer instance = null;
	
	private Printer() {
		System.out.println("Printer Object is Created");
		
	}
	public static Printer getinstance() {
		if(instance == null) {
			instance = new Printer();
		}
		return instance;
		
	}
	
 public void printJob() {
	 System.out.println("printing job........");
 }
 
}
