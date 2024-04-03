package oops1;

class UPIPayment{
	public void pay() {
		System.out.println("UPI Payment");
	}
}
class CreditCardPayment{
	public void pay() {
		System.out.println("Credit Card Payment");
	}
}
class PaymentProcess{
	//overloaded methods
	//Defining same methods with different arguements

	public void doPayment(UPIPayment upi){
		upi.pay();
	}
	public void doPayment(CreditCardPayment cc) {
		cc.pay();
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		PaymentProcess pp = new PaymentProcess();
		pp.doPayment(new UPIPayment());
		pp.doPayment(new CreditCardPayment());

	}
}


