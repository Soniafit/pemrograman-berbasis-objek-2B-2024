/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunDatar[] bangundatar1 = new BangunDatar[4];

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi");
        System.out.println("4. Lingkaran");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                double panjang, lebar;
                System.out.println("Masukkan panjang dan lebar persegi panjang:");
                panjang = scanner.nextDouble();
                lebar = scanner.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                bangundatar1[0] = persegiPanjang;
                break;
            case 2:
                double alas, tinggi;
                System.out.println("Masukkan alas dan tinggi segitiga:");
                alas = scanner.nextDouble();
                tinggi = scanner.nextDouble();
                Segitiga segitiga = new Segitiga(alas, tinggi);
                bangundatar1[1] = segitiga;
                break;
            case 3:
                double sisi;
                System.out.println("Masukkan panjang sisi persegi:");
                sisi = scanner.nextDouble();
                Persegi persegi = new Persegi(sisi);
                bangundatar1[2] = persegi;
                break;
            case 4:
                double jari;
                System.out.println("Masukkan jari-jari lingkaran:");
                jari = scanner.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jari);
                bangundatar1[3] = lingkaran;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        for(BangunDatar bangunDatar : bangundatar1){
            if(bangunDatar != null){
                bangunDatar.info();
                System.out.println("Luas :" + bangunDatar.hitungLuas());
            }
        }
        
        scanner.close();
    }
}