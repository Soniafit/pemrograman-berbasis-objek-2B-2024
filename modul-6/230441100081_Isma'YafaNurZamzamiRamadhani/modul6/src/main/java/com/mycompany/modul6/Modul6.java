/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul6;
import java.util.Scanner;
/**
 *
 * @author HP VICTUS
 */
public class Modul6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunRuang[] BangunRuang = new BangunRuang[4]; // Array untuk menyimpan objek bangun datar
        
        System.out.println("Silakan pilih bangun Ruang:");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Tabung");
        System.out.println("4. kerucut");
        System.out.println("Masukkan Pilihan anda : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                BangunRuang[0] = balok.balokInput();
                BangunRuang[0].info();
                break;
            case 2:
                BangunRuang[1] = kubus.kubusInput(); 
                BangunRuang[1].info();
                break;
            case 3:
                BangunRuang[2] = tabung.tabungInput();
                BangunRuang[2].info();
                break;
            case 4:
                BangunRuang[3] = kerucut.kerucutInput(); 
                BangunRuang[3].info();
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                break;
        }
    }
}
