/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author M S I
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan plat nomor motor: ");
        String platNomor = scanner.nextLine();

        System.out.print("Masukkan merek motor: ");
        String merek = scanner.nextLine();

        System.out.print("Masukkan tahun pembuatan: ");
        int tahun = scanner.nextInt();

        System.out.print("Masukkan harga: Rp");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan warna motor: ");
        scanner.nextLine();
        String warna = scanner.nextLine();

        Motor motor = new Motor(platNomor, merek, tahun, harga, warna);

        System.out.println("\nInformasi Motor:");
        motor.tampilkanSpesifikasi();

        System.out.println("\nTotal jumlah motor: " + Motor.getTotalJumlahMotor());

        scanner.close();
    }
}

