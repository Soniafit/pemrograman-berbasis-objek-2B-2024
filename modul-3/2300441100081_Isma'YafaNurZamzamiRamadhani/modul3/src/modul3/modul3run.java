/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP VICTUS
 */
public class modul3run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ArrayList<bukuperpustakaan> daftarBuku = new ArrayList<>();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Data Buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            System.out.println("======================");
            System.out.println(" | DAFTAR KATEGORI | ");
            System.out.println("SEMUA UMUR  [SU]");
            System.out.println("DEWASA      [D]");
            System.out.println("REMAJA      [R]");
            System.out.println("ANAK-ANAK   [A]");
            System.out.println("======================");
            System.out.print("Kategori (SU/D/R/A): ");
            String kategoriInput = scanner.nextLine();
            String kategori;

            // Memproses input kategori
            if (kategoriInput.equalsIgnoreCase("SU")) {
                kategori = "Semua Umur";
            } else if (kategoriInput.equalsIgnoreCase("D")) {
                kategori = "Dewasa";
            } else if (kategoriInput.equalsIgnoreCase("R")) {
                kategori = "Remaja";
            } else if (kategoriInput.equalsIgnoreCase("A")) {
                kategori = "Anak-anak";
            } else {
                System.out.println("Kategori tidak valid, default Semua Umur.");
                kategori = "Semua Umur";
            }
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            // Clear the buffer

            
            // Membuat objek buku dan menambahkannya ke daftar buku
            daftarBuku.add(new bukuperpustakaan(judul, penulis, publisher, kategori, stok, tahunTerbit));
            scanner.nextLine(); // Clear the buffer
        }

        // Menampilkan daftar buku yang telah di-input
        System.out.println("\nDaftar Buku:");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println("\nBuku ke-" + (i + 1) + ":");
            System.out.println(daftarBuku.get(i));
        }

    }
}
    
    