import java.util.List;
import java.util.ArrayList;

public class Company implements CallCenter {
    private int ID;
    private int totalOrdersHandled;
    private List<Order> orders;
    private List<Car> cars;
    private String location;
    private String contactDetails;
    public List<Call> calls;
    private static final int maxCars = 100;  // Replace with the actual maximum number of cars
    private static final int maxDrivers = 50;  // Replace with the actual maximum number of drivers
    private static final int maxCustomers = 200;  // Replace with the actual maximum number of customers

    public Company(int ID, String location, String contactDetails) {
        this.ID = ID;
        this.location = location;
        this.contactDetails = contactDetails;
        this.totalOrdersHandled = 0;
        this.orders = new ArrayList<>();
        this.cars = new ArrayList<>();
        calls = new ArrayList<>();
    }

    // Methods to add and remove cars
    public void addCar(Car car) {
        if (cars.size() < maxCars) {
            cars.add(car);
        } else {
            System.out.println("Max number of cars reached.");
        }
    }
    public String getContactDetails() {
    	return contactDetails;
    }
    public int getCallSize() {
    	return calls.size();
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    // Methods to add and remove orders
    public void addOrder(Order order) {
        orders.add(order);
        totalOrdersHandled++;
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    // Getters and setters for other attributes

    public int getID() {
        return ID;
    }

    public int getTotalOrdersHandled() {
        return totalOrdersHandled;
    }
    

	@Override
	public void ReceiveCall(Call call) {
		calls.add(call);
	}

	@Override
	public void OrderCar(Car car) {
		// TODO Auto-generated method stub
		
	}
		// Call center
	public void main(String[] args) {
		
	}

    // Other getters and setters for the remaining attributes

    // Additional methods as needed for the TaxiCompany class
}

