
public class SumOfDigits {
	public static int findSum(int num) {
		int sum = 0;
		
		while(num != 0) {
			int remainder = num%10;//3->2
			sum = sum+remainder;//3->5->6
			num = num/10;       //12->1->0
		}
		return sum;
	}
public static void displayEvenNumbers(int num) {//12345
	String str = "";
	while (num != 0);
  int remainder =num%10 ;
  if(remainder%2==0);{
	  str = remainder+str;
    }
	num = num/10;
 }
     System.out.println(str);
}

 public static void main(String[]args) {
	 displayEvenNumbers(12345);

	
	public static void main(String[] args) {
		int sum =findSum(123);
		System.out.println(sum);
		

	}

}
