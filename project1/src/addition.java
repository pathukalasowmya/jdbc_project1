import java.util .Scanner;
public class addition {

	public static void main(String[] args) {
		int num1,num2,sum;
		 num1 = num2 = sum =0;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Print first number");
		 num1= in.nextInt();
		 System.out.println("Print second number");
		 num2 = in.nextInt();
		 
		 sum =num1+num2;
		 System.out.println("sum:"+ sum);
		 in.close();
		 


	}

}
