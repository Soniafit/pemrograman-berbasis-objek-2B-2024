/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100022_lanny;

/**
 *
 * @author lanny aprilia
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Hasil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BangunDatar> hasilHitung = new ArrayList<>(); 

        do {
            System.out.println("====================");
            System.out.println("Menu Bangun Datar:");
            System.out.println("--------------------");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("====================");
            System.out.print("Masukkan pilihan: ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    BangunDatar bangunDatarPersegi = new Persegi();
                    System.out.print("Masukkan sisi: ");
                    double sisi = scanner.nextDouble();
                    ((Persegi) bangunDatarPersegi).setSisi(sisi);
                    bangunDatarPersegi.hitungLuas();
                    bangunDatarPersegi.info();
                    hasilHitung.add(bangunDatarPersegi); 
                    break;

                case 2:
                    BangunDatar bangunDatarPersegiPanjang = new PersegiPanjang();
                    System.out.print("Masukkan panjang: ");
                    double panjang = scanner.nextDouble();
                    ((PersegiPanjang) bangunDatarPersegiPanjang).setPanjang(panjang);
                    System.out.print("Masukkan lebar: ");
                    double lebar = scanner.nextDouble();
                    ((PersegiPanjang) bangunDatarPersegiPanjang).setLebar(lebar);
                    bangunDatarPersegiPanjang.hitungLuas();
                    bangunDatarPersegiPanjang.info();
                    hasilHitung.add(bangunDatarPersegiPanjang); 
                    break;

                case 3:
                    BangunDatar bangunDatarLingkaran = new Lingkaran();
                    System.out.print("Masukkan jari-jari: ");
                    double jariJari = scanner.nextDouble();
                    ((Lingkaran) bangunDatarLingkaran).setJariJari(jariJari);
                    bangunDatarLingkaran.hitungLuas();
                    bangunDatarLingkaran.info();
                    hasilHitung.add(bangunDatarLingkaran);
                    break;

                case 4:
                    BangunDatar bangunDatarSegitiga = new Segitiga();
                    System.out.print("Masukkan alas: ");
                    double alas = scanner.nextDouble();
                    ((Segitiga) bangunDatarSegitiga).setAlas(alas);
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();
                    ((Segitiga) bangunDatarSegitiga).setTinggi(tinggi);
                    bangunDatarSegitiga.hitungLuas();
                    bangunDatarSegitiga.info();
                    hasilHitung.add(bangunDatarSegitiga); 
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (Ya/Tidak): ");
        } while (scanner.next().equalsIgnoreCase("Ya"));
        
        System.out.println("====================");
        System.out.println("Hasil Hitung:");
        System.out.println("====================");
        for (BangunDatar bangunDatar : hasilHitung) {
            bangunDatar.info();
            System.out.println("====================");
        }
    }
}
