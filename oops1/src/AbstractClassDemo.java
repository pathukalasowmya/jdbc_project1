/*
 Abstract Class
 It is partial implementation
 Abstract class can be created by using abstract keyword
 instantiation is not possible
 */
abstract class RacingGame{
public void start() {
	System.out.println("start");
}
public void move() {
	System.out.println("move");
}
public abstract void stop() ;

public abstract void wheels();
}
class BikeRacingGame extends RacingGame{
	@Override
	public  void stop() {
	System.out.println("stop...");
	}
@Override
	public  void wheels() {
 System.out.println("2-wheels");
	// TODO Auto-generated method stub

}
}
class CarRacingGame extends RacingGame{
	@Override
	public  void stop() {
	System.out.println("stop...");
	}
@Override
	public  void wheels() {
 System.out.println("4-wheels");
	
}
public class AbstractClassDemo {
	public static void main(String[] args) {
		//instantiation is not possible
		//RacingGame = new RacingGame();
		BikeRacingGame bike = new BikeRacingGame();
		CarRacingGame car = new CarRacingGame();
		bike.start();
		bike.move();
		bike.stop();
		bike.wheels();
		car.start();
		car.stop();
		car.stop();
		car.wheels();
		

	}

}
