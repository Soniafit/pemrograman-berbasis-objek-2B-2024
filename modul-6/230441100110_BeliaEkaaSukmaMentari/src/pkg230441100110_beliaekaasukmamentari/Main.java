/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100110_beliaekaasukmamentari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunRuang[] bangunRuangArray = new BangunRuang[4];

        int choice;
        do {
            System.out.println("\nPilih bangun ruang:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();
                    bangunRuangArray[0] = new Kubus(sisiKubus);
                    break;
                case 2:
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    bangunRuangArray[1] = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    bangunRuangArray[2] = new Tabung(jariJariTabung, tinggiTabung);
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = scanner.nextDouble();
                    bangunRuangArray[3] = new Kerucut(jariJariKerucut, tinggiKerucut);
                    break;
                case 0:
                    System.out.println("Terima kasih! Sampai jumpa lagi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            // Menampilkan informasi dan menghitung volume setiap bangun ruang yang sudah dimasukkan
            for (BangunRuang bangunRuang : bangunRuangArray) {
                if (bangunRuang != null) {
                    System.out.println("=============================================");
                    bangunRuang.info();
                    System.out.println("Volume: " + bangunRuang.hitungVolume());
                    System.out.println("=============================================");
                }
            }
        } while (choice != 0);

        scanner.close();
    }
}
