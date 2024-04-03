
public class IncomeTaxDemo {
	public static double calcIncomeTax(int incometaxAmount) {
		double taxdiscount = 0.0;

		if (incometaxAmount >= 250000) {
			taxdiscount = incometaxAmount * .2;// 20%
		} else if (incometaxAmount >= 20000) {
			taxdiscount = incometaxAmount * .15;// 15%
		} else if (incometaxAmount >= 15000) {
			taxdiscount = incometaxAmount * .1;// 10%
		} else if (incometaxAmount >= 10000) {
			taxdiscount = incometaxAmount * .5;// 5%
		}
		return taxdiscount;

	}

	public static void main(String[] args) {
		int incometaxAmount = 250000;
		double discount = calcIncomeTax(incometaxAmount);
		double finalBillAmount = incometaxAmount-discount;
		System.out.println("incometaxAmount:" +incometaxAmount);
		System.out.println("Discount: " +discount);
		System.out.println("FinaltaxAmount: "+finaltaxAmount);
     

	}


}
