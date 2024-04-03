package multithreading1;
//which is name of curent thread - main
//Creating a user defined by extending Thread class
class JavaThread extends Thread{
	@Override
	public void run() {
		// define job
		for(int i =1; i<=5; i++) {
			System.out.println("Java Thread-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
//creating a user defined by implementing Runnable interface
class PythonThread implements Runnable {
	@Override
	public void run() {
	 for(int i =1; i<=5; i++) {
		 System.out.println("Python-"+i);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
	 }
		
	}
}

public class Test {
public static void main(String[] args) 
{
	PythonThread pt = new PythonThread();
	Thread t = new Thread(pt);
	t.start();
	
	JavaThread jt = new JavaThread();
	jt.start();
	
	for(int i =1; i<=5; i++){
	 System.out.println("Main Thread-"+i);
}

}
}