    
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
		class CarRacingGame extends Racing{
			@Override
			public  void stop() {
			System.out.println("stop...");
			}
		@Override
			public  void wheels() {
		 System.out.println("4-wheels");
		}
}
		public class AbstractClassCar{
			public static void main(String[] args) {
				
				CarRacingGame car = new CarRacingGame();
				car.start();
				car.move();
				car.stop();
				car.wheels();
				
			}
		}
