import java.util.List;

public class Driver extends employee{
	private String LicenseNumber;
	private Car car;
	private List<Order> OnGoingOrders;
	
	public Driver(int ID, String name, String address, String phone, String LicenseNumber, Car car) {
		super(ID, name, address, phone);
		this.LicenseNumber = LicenseNumber;
		this.car = car;
	}
	public void Driver(String LN, Car car){
		this.LicenseNumber = LN;
		this.car = car;
	}
	public String getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public List<Order> getOnGoingOrders() {
		return OnGoingOrders;
	}
	public void setOnGoingOrders(List<Order> onGoingOrders) {
		OnGoingOrders = onGoingOrders;
	}
	@Override
	public String toString() {
		return "Driver [LicenseNumber=" + LicenseNumber + ", car=" + car + ", OnGoingOrders=" + OnGoingOrders + "]";
	}
	
	
}
