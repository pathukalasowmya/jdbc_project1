
public class GarbageCollectionDemo {
	//4.object created inside a method
	public static void m1() {
		Employee e4 = new Employee();
		System.out.println("m1()");
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		//1.Anonymous object
		new Employee();
	
		
		//assigning one referene to another reference
		e2 = e1;
		
		// nullifying the reference
		e3 = null;
		
		System.gc();
		
	}

}
