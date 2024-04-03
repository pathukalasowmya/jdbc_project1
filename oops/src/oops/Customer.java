package oops;

public class Customer {
	String customerName,customerEmail,customerAddress,customerofficeAddress;
    int customerId;
    
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, String customerEmail, String customerAddress, String customerofficeAddress,
			int customerId) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.customerofficeAddress = customerofficeAddress;
		this.customerId = customerId;
	

	}

}
