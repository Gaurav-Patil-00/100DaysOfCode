class Customer{
	private int customerId;
	private String customerName;
	//Has-a relationship
	private Address address;
	
	public Customer() {
	}
	
	public Customer(int customerId, String customerName, Address address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		return String.format("CustomerId=%d, CustomerName=%s, Address=%s",customerId,customerName, address);
	}

}

class Address{
	private String address;
	public Address() {
	}
	
	public Address(String address) {
		this.address =address;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return String.format(" %s",address);
	}
}
public class AggregationDemo {
	public static void main(String[] args) {
		Address address = new Address("abc, abc colony, abc area, 11111");
		Customer c = new Customer(123, "Ram",address);
		System.out.println(c);
	}
}
