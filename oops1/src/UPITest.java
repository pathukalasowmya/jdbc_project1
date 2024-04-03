

	public class UPITest {
	    public static void main(String[] args) {
	        double paymentAmount = 100; // payment amount

	        //  GPay
	        UPI gpay = new GPay();
	        gpay.pay(paymentAmount);

	        //  Amazon Pay
	        UPI amazonPay = new AmazonPay();
	        amazonPay.pay(paymentAmount);

	        //  Paytm
	        UPI paytm = new Paytm();
	        paytm.pay(paymentAmount);

	        //  PhonePe
	        UPI phonePe = new PhonePe();
	        phonePe.pay(paymentAmount);
	    }
	}







