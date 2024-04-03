package oops1;

import java.util.Arrays;

class Calc{
	//var arg or variable length arguments
	public static void sum (Object... varArgs) {
		System.out.println(Arrays.toString(varArgs));
		int total = 0;
		for(Object obj : varArgs) {
			int num =(int)obj;
			total += num;
		}
		System.out.println("Total :"+total);
	}
	
	}

public class Test {
	public static void main (String[] args) {
		Calc.sum(10);
		 Calc.sum(10,20);
		Calc.sum(10,20,30);
		Calc.sum(10,20,30,40 );
		Calc.sum(10,20,30,40,50);
		Calc.sum(10,20,30,40,50,60);
		Calc.sum(10,20,30,40,50,60,70);
		
	}

}
