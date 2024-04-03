
public class PrinterTest {

	public static void main(String[] args) {
		Printer p1 =  Printer.getinstance();
	    Printer p2 =  Printer.getinstance();
        p1.printJob();
        p2.printJob();
        
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1 == p2);
	}

}
