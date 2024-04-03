package oops1;
/*
//by default a child class inherits parent class,
automatically every thing is avaiable to child class like 
 properties and methods 
 but if child is satisfied with parent class implementations
 then child is allowed to redefine the same method with differnt 
 implementation
 this process is known as overriding  
 









*/
class Parents{
	public void property() {
	System.out.println("Cash+Gold+Land");
}
	public void study() {
		System.out.println("Engineering");
	}
	public void marry() {
		System.out.println("Arrange Marriage");
	}
}
class Children extends Parents{
	@Override
	public void study() {
		super.study();
		System.out.println("Acting");
	}
	@Override
	public void marry() {
		super.marry();
		System.out.println("Love Marriage");
	}

}
public class OverridingDemo {
	public static void main(String[]args) {
		Children c = new Children();
		c.property();
		c.study();
		c.marry();
	}

}
