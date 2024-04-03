
public interface  Printer {
// constant properties 
	public static final String version ="v1.0.0";
	
	//abstract methods
	public abstract void print();
	
	//From JAva 8v
	//can be acessible through implementation classes
	//can be overriden in implementation classes
	public static void scan() {
		System.out.println("scanning ");
	}
}
//from java 8v
//can be accessed onle by interface name
//As static methods is not accessable  in implementation classes
//so nomchmace of overridden					