package multithreading1;


class RedThread extends Thread{
	@Override
public void run() {
	for(int i =1;i<=5;i++) {
		System.out.println("Red");
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

		}
	}
	 }
	 class YellowThread extends Thread{
		 @Override
		 public void run() {
		 for(int i=1;i<=5;i++) {
			 System.out.println("Yellow");
		 }
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
			 
		 }
		 
	 }
	 
		 class GreenThread extends Thread{
			 @Override
			 public void run() {
				 for (int i =1;i<=5;i++) {
				 System.out.println("Green");
					 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
		
						e.printStackTrace();
					}
				 }
			 }
		 }
		 
public class TrafficSignalTest{
	public static void main(String[]args) throws InterruptedException {
		RedThread red = new RedThread();
		red.start();
	    red.join();
		         
          YellowThread yellow = new YellowThread();
		  yellow.start();
		  yellow.join();
		  
          GreenThread green = new GreenThread();
		  green.start();
		  green.join();
	}
}
