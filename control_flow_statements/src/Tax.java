
public class Tax {
		public static double calctax(int tax) {
			double discount = 0.0;
		if (tax>= 250000) {
			discount = tax*.2;//20%
		}else if (tax >= 750) {
			discount = tax *.15;//15%
		}else if (tax >= 500) {
			discount = tax *.1;//10%
		}else if (tax >=250) {
			discount = tax*.5;//5%
		}
		return discount;
		}
		public static void main(String[] args) {
			int taxAmount = 250000;
			double discount = calctax(taxAmount);
			double finaltaxAmount = taxAmount-discount;
			System.out.println("Tax Amount : " +taxAmount);
			System.out.println("Discount: " +discount);
			System.out.println("Final Tax Amount :"+finaltaxAmount);
	     
		}

}
