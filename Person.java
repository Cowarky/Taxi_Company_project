public abstract class Person {
    private int ID;
    protected String name;
    protected String address;
    protected String phone;

    public Person(int ID, String name, String address, String phone) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public Person() {
    	
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

	public void setID(int iD) {
		ID = iD;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

    // Additional methods as needed for the Person class
}
