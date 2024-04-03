package factory;

public class SportsCar implements Car{

	@Override
	public void assemble() {
		System.out.println("Assemble SportsCar");
		
	}

	@Override
	public void roadTest() {
	 System.out.println("RoadTest SportsCar");
		
	}

	@Override
	public void deliver() {
		System.out.println("Deliver SportsCar");
		
	}
	

}
