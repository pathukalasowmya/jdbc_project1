package oops1;
//parent or Base class
class Mobile {
	 public void call() {
		 System.out.println("call...");
	 }
   public void msg() {
	System.out.println("message...");
 }
}
//child or derived class

  class SmartMobile extends Mobile{
	public void browseing() {
	System.out.println("browseing");
	}
}
  public class InheritanceDemo {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.call();
		m.msg();
		
		System.out.println("-----------------");
		
		SmartMobile sm = new SmartMobile();
			sm.call();
		    sm.msg();
		sm.browseing();
		
		
	}
  }

