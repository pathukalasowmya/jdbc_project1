
public class Employee {
  public Employee() {
	  System.out.println("Employee object is created");
  }
 @Override
	public void finalize() {
	 System.out.println("Employee object is destroyed");
	}
}
