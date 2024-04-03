package factory;

public class LuxuryCar implements Car {

	@Override
	public void assemble() {
		System.out.println("Assembling Luxury Car");
		
	}

	@Override
	public void roadTest() {
		System.out.println("Road Test Luxury Car");
		
	}

	@Override
	public void deliver() {
		System.out.println("Delivery Luxury Car");
		
	}
	
	

}
