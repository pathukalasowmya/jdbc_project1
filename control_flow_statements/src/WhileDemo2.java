
public class WhileDemo2 {
	public static void printNumbersDesc(int range) {
		int i = 1;
		while (i >= range) {
			System.out.println(i+"");
			range --;
		}
	}
	//Define a method to find reverse of given number
	public static int findReverse(int num) {
	int reverse = 0;
	
while(num != 0) {
	int remainder = num%10;
	reverse = (reverse*10)+remainder;
	num = num/10;
	
	
}
	
	return reverse;
	
	}
	
	public static void main (String[] args){
		int rev = findReverse(123);
		System.out.println(rev);
		
		findReverse(123);
		
	}

	public static void main(String[] args) {
	   printNumbersDesc(25);
	 System.out.println("---------");
	 
       printNumbersDesc(10);
       
	}

}
