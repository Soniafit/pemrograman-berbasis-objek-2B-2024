/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author M S I
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        System.out.print("Masukkan jumlah buku yang ingin dimasukkan: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan detail buku ke-" + (i + 1) + ":");
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            String kategori;
            do {
                System.out.print("Kategori (SU/D/R/A): ");
                kategori = scanner.nextLine().toUpperCase();
            } while (!kategori.equals("SU") && !kategori.equals("D") && !kategori.equals("R") && !kategori.equals("A"));
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();

            Buku bukuBaru = new Perpustakaan(judul, penulis, publisher, kategori, stok, tahunTerbit);
            daftarBuku.add(bukuBaru);
            scanner.nextLine();
        }

        tampilkanDaftarBuku(daftarBuku);

        scanner.close();
    }

    public static void tampilkanDaftarBuku(ArrayList<Buku> daftarBuku) {
        System.out.println("\nDaftar Buku:");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println("\nBuku ke-" + (i + 1) + ":");
            daftarBuku.get(i).displayInfo();
        }
    }
}
