/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6;

/**
 *
 * @author SONIA
 */
import java.util.Scanner;

// Interface untuk jari-jari
interface Radius {
    double getRadius();
}

// Interface untuk lebar
interface Width {
    double getWidth();
}

// Interface untuk tinggi
interface Height {
    double getHeight();
}

// Kelas abstrak BangunRuang
abstract class BangunRuang {
    // Method abstrak untuk menghitung volume
    abstract double hitungVolume();
    
    // Method abstrak untuk menampilkan informasi
    abstract void info();
}

// Kelas Kubus
class Kubus extends BangunRuang implements Width {
    private double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public void info() {
        System.out.println("Kubus dengan sisi " + sisi);
    }

    @Override
    public double getWidth() {
        return sisi;
    }
}

// Kelas Balok
class Balok extends BangunRuang implements Width, Height {
    private double panjang;
    private double lebar;
    private double tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    void info() {
        System.out.println("Balok dengan panjang " + panjang + ", lebar " + lebar + ", dan tinggi " + tinggi);
    }

    @Override
    public double getWidth() {
        return lebar;
    }

    @Override
    public double getHeight() {
        return tinggi;
    }
}

// Kelas Tabung
class Tabung extends BangunRuang implements Radius, Height {
    private double radius;
    private double tinggi;

    Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }

    @Override
    void info() {
        System.out.println("Tabung dengan jari-jari " + radius + " dan tinggi " + tinggi);
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getHeight() {
        return tinggi;
    }
}

// Kelas Kerucut
class Kerucut extends BangunRuang implements Radius, Height {
    private double radius;
    private double tinggi;

    Kerucut(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return (1.0/3.0) * Math.PI * radius * radius * tinggi;
    }

    @Override
    void info() {
        System.out.println("Kerucut dengan jari-jari " + radius + " dan tinggi " + tinggi);
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getHeight() {
        return tinggi;
    }
}

public class Modul6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner = new Scanner(System.in);

        // Array BangunRuang
        BangunRuang[] bangunRuangArray = new BangunRuang[4];    
        // Input untuk memilih objek yang ingin dieksekusi
        System.out.println("Pilih objek yang ingin dieksekusi:");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Kerucut");
        System.out.print("Masukkan nomor pilihan Anda: ");
        int choice = scanner.nextInt();

        // Meminta input sesuai dengan pilihan pengguna
        switch (choice) {
            case 1:
                // Input untuk Kubus
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisiKubus = scanner.nextDouble();
                bangunRuangArray[0] = new Kubus(sisiKubus);
                break;
            case 2:
                // Input untuk Balok
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = scanner.nextDouble();
                bangunRuangArray[1] = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                break;
            case 3:
                // Input untuk Tabung
                System.out.print("Masukkan jari-jari tabung: ");
                double jariJariTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiTabung = scanner.nextDouble();
                bangunRuangArray[2] = new Tabung(jariJariTabung, tinggiTabung);
                break;
            case 4:
                // Input untuk Kerucut
                System.out.print("Masukkan jari-jari kerucut: ");
                double jariJariKerucut = scanner.nextDouble();
                System.out.print("Masukkan tinggi kerucut: ");
                double tinggiKerucut = scanner.nextDouble();
                bangunRuangArray[3] = new Kerucut(jariJariKerucut, tinggiKerucut);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

       // Menampilkan informasi dan volume objek yang dipilih
        bangunRuangArray[choice - 1].info();
        System.out.println("Volume: " + bangunRuangArray[choice - 1].hitungVolume());

        scanner.close();
    }
}
