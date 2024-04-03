package oops1;

interface A{
	int a = 100;
	int i =  333;
	public void m1();
}
interface B{
	int b = 200;
	int j = 222;
	public void m2();
}
class X implements A,B{
	public void m1() {
		System.out.println("Java");
	}
	public void m2() {
		System.out.println("Spring");
	}

}
	
public class InterfaceInheritanceDemo {
 public static void main (String[] args) {
	 X x = new X();
	 x.m1();
	 x.m2();
	 System.out.println(x.a);
	 System.out.println(x.b);
	 System.out.println(A.i);
	 System.out.println(B.j);
	 
 }
}
