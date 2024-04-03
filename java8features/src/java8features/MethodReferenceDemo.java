package java8features;

interface Printer{
	void Print();
}
public class MethodReferenceDemo {
	public static void callPrint() {
		System.out.println("printing job...");
	}
	public void m2() {
		System.out.println("Welcome to Java world");
	}
public static void main(String[] args) {
	Printer p =()  -> MethodReferenceDemo.callPrint();
	p.Print();                     
	
	//static methodreferences
Printer p2 = MethodReferenceDemo ::callPrint;
p.Print();

//instance method reference
MethodReferenceDemo m = new MethodReferenceDemo();
Printer p3 = m::m2;
p3.Print();
}
}
