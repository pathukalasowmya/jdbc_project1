public class MethodsDemo {
	//Instance Method
	
	public int findSum(int num)
	{
	return num+num+num+num+num+num;
	}
 public int findSum(int num1, int num2 ,int num3,int num4 ,int num5,int num6) 
 {
	int total = num1+num2+num3+num3+num4+num5+num6;
	return total;
}
   public double findAverage(int total) {
     return total/6;
   }
     
	public static void main(String[]args) {
	MethodsDemo demo= new MethodsDemo();
	
		
		int sum =demo.findSum(10,12,13,14,15,16);
		double avg =demo.findAverage(sum);
		
		System.out.println(sum);
		System.out.println(avg);
		
		
		
		
		

	}

}
