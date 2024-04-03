package multithreading1;

class Table{
	public  synchronized void printMulTable(int num) {
		for(int i =1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}
}
class MyThread1 extends Thread{
	Table t;
	int num;
	
	public MyThread1(Table t , int num) {
		this.t = t;
		this.num = num;
	}
@Override
public void run() {
	t.printMulTable(num);
}
	
}
class MyThread2 extends Thread{
	Table t;
	int num;
	
	public MyThread2(Table t , int num) {
		this.t = t;
		this.num = num;
	}
	@Override
	public void run() {
		t.printMulTable(num);
	}
	

		
	

}

public class SynchronizationDemo {
public static void main(String[] args) {
	Table t = new Table();
	MyThread1 t1 = new MyThread1(t,5);
	MyThread2 t2 = new MyThread2(t,9);
   
    
    t1.start();
    t2.start();
 
	
	
}
	
}
