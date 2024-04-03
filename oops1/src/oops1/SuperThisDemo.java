package oops1;
class Parent{
	int a = 10;
	int b = 20;
	int c = 111;
}

class Child extends Parent{
	int a = 100;
	int b = 200;
	int j = 222;
	public void total(int a,int b) {
		System.out.println(a+b);
        System.out.println(this.a +this.b);
		System.out.println(super.a + super.b);
		System.out.println(j);
		System.out.println(c);
		
	}
}
public class SuperThisDemo {
	public static void main(String[] args)
	{
		Child c = new Child();
		c.total(1000,2000);
		
	}
}
