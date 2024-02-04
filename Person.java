public abstract class Person {
    private int ID;
    private String name;
    private String address;
    private String phone;

    public Person(int ID, String name, String address, String phone) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // Getters and setters for all attributes

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    // Additional methods as needed for the Person class
}
