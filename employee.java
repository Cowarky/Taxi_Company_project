public class employee extends Person {
    private boolean isOnDuty;
    private int totalOrdersHandled;

    public employee(int ID, String name, String address, String phone) {
        super(ID, name, address, phone);
        this.isOnDuty = false;  // Assume the employee is initially off-duty
        this.totalOrdersHandled = 0;
    }

    // Method to update the on-duty status of the employee
    public void updateOnDutyStatus(boolean isOnDuty) {
        this.isOnDuty = isOnDuty;
    }

    // Method to handle an order by the employee
    public void handleOrder(Order order) {
        if (isOnDuty) {
            // Perform actions to handle the order
            System.out.println("Order handled by employee " + getID());
            totalOrdersHandled++;
        } else {
            System.out.println("Employee " + getID() + " is not on duty.");
        }
    }

    // Method to update the total number of orders handled
    public void updateTotalOrdersHandled(int totalOrdersHandled) {
        this.totalOrdersHandled = totalOrdersHandled;
    }

    // Getters for additional attributes

    public boolean isOnDuty() {
        return isOnDuty;
    }

    public int getTotalOrdersHandled() {
        return totalOrdersHandled;
    }

    // Additional methods as needed for the Employee class
}

