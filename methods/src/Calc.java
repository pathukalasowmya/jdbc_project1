
public class Calc {
	public static int findSquare(int num) {
		return num*num;
	
	}

	public static int findCube(int num) {
		return num*num*num;
	}
	
	public static int findMax(int num1,int num2){
			return(num1>num2)? num1 : num2;
	}
	
	public static void main(String[]args){
    int square = Calc.findSquare(13);
    System.out.println(square);
    
    
    int cube= Calc.findCube(20);
    System.out.println(cube);
    
    
    int max = Calc.findMax(50, 70);
    System.out.println(max);
	}

}
