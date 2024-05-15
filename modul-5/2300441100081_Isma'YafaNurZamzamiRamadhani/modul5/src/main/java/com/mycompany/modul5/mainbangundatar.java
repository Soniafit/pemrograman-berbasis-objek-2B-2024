/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modul5;
import java.util.Scanner;
/**
 *
 * @author HP VICTUS
 */
public class mainbangundatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunDatar[] BangunDatar = new BangunDatar[4]; // Array untuk menyimpan objek bangun datar
        
        System.out.println("Silakan pilih bangun datar:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Persegi");
        System.out.println("Masukkan Pilihan anda : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                BangunDatar[0] = PersegiPanjang.PersegiPanjangInput();// Memasukkan objek PersegiPanjang ke dalam array
                BangunDatar[0].info();
                break;
            case 2:
                BangunDatar[1] = Segitiga.SegitigaInput(); // Memasukkan objek Segitiga ke dalam array
                BangunDatar[1].info();
                break;
            case 3:
                BangunDatar[2] = Lingkaran.LingkaranInput(); // Memasukkan objek Lingkaran ke dalam array
                BangunDatar[2].info();
                break;
            case 4:
                BangunDatar[3] = Persegi.PersegiInput(); // Memasukkan objek Persegi ke dalam array
                BangunDatar[3].info();
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                break;
        }
    }
}

    
   
    
