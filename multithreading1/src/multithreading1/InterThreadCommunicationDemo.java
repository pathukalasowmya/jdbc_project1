package multithreading1;

class  CalcThread extends Thread{
 int total = 0;
 
	public void run() {
		System.out.println("2.CalcThread begins Calculations");
      for (int i =1; i<=100; i++) {
    	  total += i;
      }
      System.out.println("3.CalcThread gives notification");
      synchronized (this){
      this.notify();
      }
	//send network 
	}
	
}
public class InterThreadCommunicationDemo {
public static void main(String[] args)throws InterruptedException {
	CalcThread ct = new CalcThread ();
	ct.start();
	//ct.join();
	//Thread.sleep(1);
	System.out.println("1.Main thread calling wait()");
	synchronized(ct) {
		ct.wait();
	}

// main thread
	System.out.println("4.Main Thread received notification");
	System.out.println(ct.total);
}
}
