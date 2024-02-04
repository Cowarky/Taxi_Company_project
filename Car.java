import java.util.List;
import java.util.ArrayList;

public class Car {
    private int ID;
    private String carsModel;
    private List<SeatLocation> seats;
    private Order currentOrder;
    private boolean isFree;
    private String licensePlate;
    private CarModel model;

//    hello world
    public Car(int ID, String carsModel, String licensePlate) {
        this.ID = ID;
        this.carsModel = carsModel;
        this.licensePlate = licensePlate;
        this.seats = new ArrayList<>();
        this.isFree = true;  // Assume the car is initially free
    }
    
    public Car(String licensePlate, CarModel model) {
    	this.licensePlate = licensePlate;
    	this.model = model;
    	seats = new ArrayList<>(model.getNumberOfSeats());
    }

    // Method to assign an order to the car
    public void assignOrder(Order order) {
        if (isFree) {
            currentOrder = order;
            isFree = false;
            System.out.println("Order assigned to car " + ID);
        } else {
            System.out.println("Car " + ID + " is not available.");
        }
    }

    // Method to clear the current order from the car
    public void clearOrder() {
        currentOrder = null;
        isFree = true;
        System.out.println("Current order cleared from car " + ID);
    }

    // Method to update the availability status of the car
    public void updateAvailability(boolean isFree) {
        this.isFree = isFree;
    }

    // Method to handle seat assignments within the car
//    public void assignSeat(Seat seat) {
//        seats.add(seat);
//        seat.updateAvailability(false);
//        System.out.println("Seat " + seat.getID() + " assigned in car " + ID);
//    }
    
    public CarModel GetCarModel() {
    	return this.model;
    }
    
    public void AddDefaultSeats() {
    	seats.add(SeatLocation.Driver);
    	seats.add(SeatLocation.Front);
    	seats.add(SeatLocation.backLeft);
    	seats.add(SeatLocation.backMiddle);
    	seats.add(SeatLocation.backRight);
    }

    // Additional getters and setters as needed

    public int getID() {
        return ID;
    }

    public boolean isFree() {
        return isFree;
    }

	@Override
	public String toString() {
		return "Car [carsModel=" + model+ ", seats=" + seats + ", isFree=" + isFree + ", licensePlate="
				+ licensePlate + ", model=" + model + "]";
	}
    

    // Other getters and setters for the remaining attributes

    // Additional methods as needed for the Car class
}
