
public class Customer extends Person{
	private String destination;
	private String pickupLocation;
	private Boolean isUrgent;
    private Company company;
	
	public Customer(int ID, String name, String address, String phone, String destination, String pickupLocation,
			Boolean isUrgent) {
		super(ID, name, address, phone);
		this.destination = destination;
		this.pickupLocation = pickupLocation;
		this.isUrgent = isUrgent;
		company = new Company(5616161, "Lebanon, Beirut", "96103355533");
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public Boolean getIsUrgent() {
		return isUrgent;
	}
	public void setIsUrgent(Boolean isUrgent) {
		this.isUrgent = isUrgent;
	}
	public Call CallCompany() {
		Call call = new Call(super.getPhone(), company.getContactDetails());
		company.ReceiveCall(call);
		return call;
	}
	
}
