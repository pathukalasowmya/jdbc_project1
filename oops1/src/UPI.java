interface UPI {
	   void pay(double amount);
	}
	// Implement GPay
	class GPay implements UPI {
	    @Override
	    public void pay(double amount) {
	        System.out.println("GPay payment initiated. Amount: " + amount);
	    }
	}

	// Implement Amazon Pay
	class AmazonPay implements UPI {
	    @Override
	    public void pay(double amount) {
	        System.out.println("Amazon Pay payment initiated. Amount: " + amount);
	    }
	}

	// Implement Paytm
	class Paytm implements UPI {
	    @Override
	    public void pay(double amount) {
	        System.out.println("Paytm payment initiated. Amount: " + amount);
	    }
	}

	// Implement PhonePe
	class PhonePe implements UPI {
	    @Override
	    public void pay(double amount) {
	        System.out.println("PhonePe payment initiated. Amount: " + amount);
	    }
	}

	


