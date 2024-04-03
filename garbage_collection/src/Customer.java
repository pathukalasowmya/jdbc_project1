
public class Customer {
	private int customerId;
	private String customerName;
	private String customerEmail;
	public Customer(int customerId, String customerName, String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
	}
@Override
public String toString() {
	return this.customerId+"\t"+this.customerName+"\t"+this.customerEmail;
}
}
