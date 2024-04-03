package factory;

public class CarFactory {
	public static Car getCar(String carType) {
		Car car = null;
		switch(carType) {
		
		case "luxury":
			car = new LuxuryCar();
			break;
		case  "sports":
			car = new SportsCar();
			break;
			
			default:
				car = new StandardCar();
				break;
				
		}
	car.assemble();
    car.roadTest();
	car.deliver();
	
	return car;
		
	}

}
