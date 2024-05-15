/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg6;


import java.util.Scanner;
/**
 *
 * @author AMANDA AULIA
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("===========================================");
            System.out.println("           MENU PILIH BANGUN RUANG         ");
            System.out.println("===========================================");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("5. Keluar");
            System.out.print("Pilih bangun ruang (1-5): ");
            int pilihan = scanner.nextInt();
            System.out.println("============================================");

            BangunRuang[] arrayBangunRuang = new BangunRuang[1]; // Sesuaikan jumlah elemen array dengan jumlah objek yang ingin dibuat

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();
                    arrayBangunRuang[0] = new Kubus(sisiKubus);
                    break;
                case 2:
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    arrayBangunRuang[0] = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    arrayBangunRuang[0] = new Tabung(jariJariTabung, tinggiTabung);
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = scanner.nextDouble();
                    arrayBangunRuang[0] = new Kerucut(jariJariKerucut, tinggiKerucut);
                    break;
                case 5:
                    exit = true;
                    System.out.println("===========================================");
                    System.out.println("Terimakasih!!..Sampai Jumpa Lagi!!..");
                    System.out.println("===========================================");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue; // Melanjutkan iterasi loop
            }

            if (!exit) { // Jika pilihan bukan keluar, maka tampilkan informasi
                System.out.println("===============================================");
                System.out.println("               HASIL HITUNG!                   ");
                System.out.println("===============================================");
                double volume = arrayBangunRuang[0].hitungVolume(); // Hitung volume
                System.out.println("Volume: " + volume); // Tampilkan volume
                arrayBangunRuang[0].info(); // Tampilkan informasi
                System.out.println("===============================================");
            }
        }
        scanner.close();
    }
}

