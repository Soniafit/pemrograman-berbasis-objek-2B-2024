import java.util.Scanner;

abstract class Product {
    protected String productName;
    protected double price;
    protected int stock;

    public Product(String name, double price, int stock) {
        this.productName = name;
        this.price = price;
        this.stock = stock;
    }

    public abstract void displayInfo();

    public boolean isInStock() {
        return stock > 0;
    }

    public void updateStock(int quantity) {
        stock += quantity;
    }

    public double totalValue() {
        return price * stock;
    }
}

class Laptop extends Product {
    public Laptop(String name, double price, int stock) {
        super(name, price, stock);
    }

    @Override
    public void displayInfo() {
        System.out.println("Laptop Information:");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
    }
}

class Smartphone extends Product {
    public Smartphone(String name, double price, int stock) {
        super(name, price, stock);
    }

    @Override
    public void displayInfo() {
        System.out.println("Smartphone Information:");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laptop laptop = new Laptop("Laptop", 1200.00, 10);
        Smartphone smartphone = new Smartphone("Smartphone", 800.00, 15);

        System.out.println("Product Information:");
        laptop.displayInfo();
        System.out.println("\nIs laptop in stock? " + laptop.isInStock());

        System.out.println("\nSmartphone Information:");
        smartphone.displayInfo();
        System.out.println("\nIs smartphone in stock? " + smartphone.isInStock());

        System.out.print("\nEnter additional stock for smartphone: ");
        int additionalStock = scanner.nextInt();
        smartphone.updateStock(additionalStock);

        System.out.println("\nUpdated Smartphone Information:");
        smartphone.displayInfo();

        System.out.println("\nTotal value of available stock: $" + (laptop.totalValue() + smartphone.totalValue()));

        scanner.close();
    }
}
