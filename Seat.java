public class Seat {
    private int ID;
    private boolean isFree;
    private String seatLocation;
    private SeatLocation seat;
    private Customer customer;

    public Seat(int ID, String seatLocation) {
        this.ID = ID;
        this.isFree = true;  // Assume the seat is initially free
        this.seatLocation = seatLocation;
    }
    public Seat(SeatLocation seat) {
    	this.seat = seat;
    }

    // Method to update the availability status of the seat
    public void updateAvailability(boolean isFree) {
        this.isFree = isFree;
    }

    // Additional getters and setters as needed

    public int getID() {
        return ID;
    }

    public boolean isFree() {
        return isFree;
    }
    
    public SeatLocation GetSeatLocation() {
    	return this.seat;
    }

}
