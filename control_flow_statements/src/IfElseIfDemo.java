
public class IfElseIfDemo {
public static double calcDiscount(int billAmount) {
	double discount = 0.0;
if (billAmount>= 1000) {
	discount = billAmount *.2;//20%
}else if (billAmount >= 750) {
	discount = billAmount *.15;//15%
}else if(billAmount >= 500) {
	discount = billAmount *.1;//10%
}else if (billAmount >=250) {
	discount = billAmount *.5;//5%
}
return discount;

}
	public static void main(String[] args) {
		int billAmount = 1000;
		double discount = calcDiscount(billAmount);
		double finalBillAmount = billAmount-discount;
		System.out.println("Bill Amount : " +billAmount);
		System.out.println("Discount: " +discount);
		System.out.println("Final Bill Amount :"+finalBillAmount);
     
	}

}
