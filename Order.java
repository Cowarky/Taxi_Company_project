public class Order {
    private int ID;
    private Customer customer;
    private Car car;
    private Seat seat;
    private employee employeeTakenCareOf;

    public Order(int ID, Customer customer, Car car, Seat seat) {
        this.ID = ID;
        this.customer = customer;
        this.car = car;
        this.seat = seat;
    }

    // Getters and setters for all attributes

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public Seat getSeat() {
        return seat;
    }

    public employee getEmployeeTakenCareOf() {
        return employeeTakenCareOf;
    }

    public void setEmployeeTakenCareOf(employee employeeTakenCareOf) {
        this.employeeTakenCareOf = employeeTakenCareOf;
    }
}