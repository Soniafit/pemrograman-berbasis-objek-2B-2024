package com.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bangun datar: ");
        int jumlahBangunDatar = scanner.nextInt();
        BangunDatar[] bangunDatarhasil = new BangunDatar[jumlahBangunDatar];
        // ini adalah array yang berisi objek BangunDatar, jumlahBangundatar berfungsi untuk menentukan panjang jumlah yg akan dihitung
        
        for (int i = 0; i < jumlahBangunDatar; i++) {
            System.out.println("Bangun datar ke-" + (i+1));
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi");
            System.out.println("4. Lingkaran");
            System.out.print("Pilih bangun datar: ");
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                bangunDatarhasil[i] = new PersegiPanjang(panjang, lebar);
                break;
            case 2:
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                bangunDatarhasil[i] = new Segitiga(alas, tinggi);
                break;
            case 3:
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                bangunDatarhasil[i] = new Persegi(sisi);
                break;
            case 4:
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                bangunDatarhasil[i] = new Lingkaran(jariJari);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                i--;
                break;
            }
        }
        for (BangunDatar bangunDatarprint : bangunDatarhasil) {
            System.out.println("Luas: " + bangunDatarprint.hitungLuas());
        }
        scanner.close();
    }
    
}