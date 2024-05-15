package postes2;

import postes2.Vehicle;


public class Car extends Vehicle {

    private final String type;

    // Constructor Car class
    public Car(String brand, String ownerName, int year, long price, String type) {
        super(brand, ownerName, year, price);
        this.type = type;
    }

    // Implementasi dari abstract method 
    @Override
    public void displayInfo() {
        System.out.println("Nama Pemilik: " + ownerName);
        System.out.println("Brand: " + brand);
        System.out.println("Tahun: " + year);
        System.out.println("Harga: " + price);
        System.out.println("Type: " + type);
    }
        
}    
    