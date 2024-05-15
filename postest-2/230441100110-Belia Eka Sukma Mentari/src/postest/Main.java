/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {
    private static int jumlahMedia = 0;

    public static void tambahMedia(Media media) {
        jumlahMedia++;
    }

    public static int getJumlahMedia() {
        return jumlahMedia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan informasi buku:");
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahunTerbit = scanner.nextInt();
        System.out.print("Harga: Rp");
        double harga = scanner.nextDouble();

        Buku buku1 = new Buku(judul, tahunTerbit, harga);
        tambahMedia(buku1);

        System.out.println("\nInformasi Buku:");
        System.out.println(buku1.getInfo());
        System.out.println("Total media: " + getJumlahMedia());
    }
}
