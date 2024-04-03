package java8features;

interface MyFunInterface{
	void greet();
}
class MyFunInterfaceImp1 implements MyFunInterface{
	
	public void greet() {
		System.out.println("hello everybody");
	}
}
interface MyFuncInterface2{
	int findSquare(int num);
	}
interface MyFuncInterface3{
	int findSum(int num1, int num2);
}
interface MyFuncInterface4{
	int characterCount(String s);
}
interface MyFuncInterface5{
	int findMax(int num1 ,int num2);
}
public class LambdaExpressionDemo1 {
	public static void main(String[] args) {
		MyFuncInterface4 myFun4 =(s) -> s.length();
		int count = myFun4.characterCount("Python");
		System.out.println(count);
		
		MyFuncInterface3 myFun3 = (x ,y)->x+y;
		int total = myFun3.findSum(10,20);
		System.out.println(total);
		
		MyFuncInterface5 myFun5 = (x,y)-> (x>y)?x:y;
		int max = myFun5.findMax(13,12 );
		System.out.println(max);
		
		
		//MyFunInterface myFun = new MyFunInterfaceImp1();
		//myfun.greet();
MyFunInterface myfun =()->System.out.println("hii everybody!");
 myfun.greet();
 MyFuncInterface2 myfun2 =(num) -> num*num;
 
 int square = myfun2.findSquare(10);
 System.out.println(square);
 
	}

}

