/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postes2;
import postes2.Car;
import java.util.Scanner;
/**
 *
 * @author HP VICTUS
 */
public class runpostes2 {
    public static Car inputCarDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMasukkan Detail Mobil Anda:");
        System.out.print("Enter nama pemilik: ");
        String ownerName = scanner.nextLine();
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter tahun: ");
        int year = scanner.nextInt();
        System.out.print("Enter harga: ");
        long price = scanner.nextLong();
        scanner.nextLine(); 

        System.out.print("Enter type: ");
        String type = scanner.nextLine();

        return new Car(brand, ownerName, year, price, type);
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== TOKO JUAL MOBIL ===");

        char inputChoice = 'y'; // Inisialisasi dengan 'y' agar loop berjalan pertama kali
        while (inputChoice == 'y' || inputChoice == 'Y') {
            Car mobil = inputCarDetails(); 
            System.out.println("\nDetails of Car:");
            mobil.displayInfo();

            System.out.print("\nApakah ingin memasukkan mobil lain? (y/n): ");
            inputChoice = scanner.next().charAt(0);
            scanner.nextLine(); 
        }

        scanner.close();
        System.out.println("Terima kasih telah menggunakan layanan kami.");
    }
}