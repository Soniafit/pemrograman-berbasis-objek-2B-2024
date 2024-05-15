/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;
/**
 *
 * @author sonia
 */
// Kelas BangunDatar
abstract class BangunDatar {
    abstract double hitungLuas();
    abstract void info();
}

class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas() {
        return panjang * lebar;
    }

    void info() {
        System.out.println("Persegi Panjang dengan panjang " + panjang + " dan lebar " + lebar);
    }
}

class Segitiga extends BangunDatar {
    double alas, tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    void info() {
        System.out.println("Segitiga dengan alas " + alas + " dan tinggi " + tinggi);
    }
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuas() {
        return sisi * sisi;
    }

    void info() {
        System.out.println("Persegi dengan sisi " + sisi);
    }
}

class Lingkaran extends BangunDatar {
    double jari_jari;

    Lingkaran(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    double hitungLuas() {
        return Math.PI * jari_jari * jari_jari;
    }

    void info() {
        System.out.println("Lingkaran dengan jari-jari " + jari_jari);
    }
}
// Kelas Main
public class Main {
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        BangunDatar[] bangun_datar_list = new BangunDatar[4];
        System.out.println("Masukkan panjang dan lebar persegi panjang (pisahkan dengan spasi): ");
        double panjang = scanner.nextDouble();
        double lebar = scanner.nextDouble();
        System.out.println("Masukkan alas dan tinggi segitiga (pisahkan dengan spasi): ");
        double alas = scanner.nextDouble();
        double tinggi = scanner.nextDouble();
        System.out.println("Masukkan sisi persegi: ");
        double sisi_persegi = scanner.nextDouble();
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jari_jari = scanner.nextDouble();

        bangun_datar_list[0] = new PersegiPanjang(panjang, lebar);
        bangun_datar_list[1] = new Segitiga(alas, tinggi);
        bangun_datar_list[2] = new Persegi(sisi_persegi);
        bangun_datar_list[3] = new Lingkaran(jari_jari);

        for (BangunDatar bangun_datar : bangun_datar_list) {
            System.out.println("Luas: " + bangun_datar.hitungLuas());
            bangun_datar.info();
        }
    }
    
}
