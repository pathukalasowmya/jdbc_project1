
public class PrinterTest {

	public static void main(String[] args) {
		//Instantiation is not possible for interface
		//printer p = new printer();
		EpsonPrinter epson = new EpsonPrinter();
		epson.print();
		epson.scan();
        CanonPrinter canon = new CanonPrinter();
        canon.print();
        canon.scan();
        
        Printer p = new EpsonPrinter();
        p.print();
        Printer p1 = new CanonPrinter();
       p1.print();
	}

}
