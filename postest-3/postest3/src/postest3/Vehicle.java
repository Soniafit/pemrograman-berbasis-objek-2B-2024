package postest3;

// Abstract class a vehicle
public abstract class Vehicle {
    protected String brand;
    protected String ownerName;
    protected int year;
    protected long price;

    // Constructor Vehicle class
    public Vehicle(String brand, String ownerName, int year, long price) {
        this.brand = brand;
        this.ownerName = ownerName;
        this.year = year;
        this.price = price;
    }

    // Abstract method
    public abstract void displayInfo();
    
    
}
