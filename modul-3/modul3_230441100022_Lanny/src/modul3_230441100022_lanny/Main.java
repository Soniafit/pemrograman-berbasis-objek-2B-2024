/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3_230441100022_lanny;

/**
 *
 * @author lanny aprilia
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Perpustakaan2> daftarBuku = new ArrayList<>();
        
        System.out.println("--------------------------------------");
        System.out.println("            Selamat Datang            ");
        System.out.println("--------------------------------------");

        System.out.print("Masukkan jumlah buku yang akan diinput: ");
        int jumlahBuku = scanner.nextInt();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println();
            System.out.println("Data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.next();
            System.out.print("Penulis: ");
            String penulis = scanner.next();
            System.out.print("Publisher: ");
            String publisher = scanner.next();
            System.out.println("KATEGORI : ");
            System.out.println("SU = Semua Umur");
            System.out.println("D = Dewasa");
            System.out.println("R = Remaja");
            System.out.println("A = Anak-Anak");
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.next();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();

            Perpustakaan2 buku = new Perpustakaan2(judul, penulis, publisher, kategori, stok, tahunTerbit);
            daftarBuku.add(buku);
        }
        
        System.out.println();
        System.out.println("===========================================");
        System.out.println("         Daftar Buku Diperpustakaan");
        System.out.println("===========================================");
        System.out.println();
        for (Perpustakaan1 p : daftarBuku) {
            System.out.println("Judul : " + p.getJudul());
            System.out.println("Penulis : " + p.getPenulis());
            System.out.println("Publisher : " + p.getPublisher());
            System.out.println("Kategori : " + ((Perpustakaan2)p).getKategoriString());
            System.out.println("Stok : " + p.getStok());
            System.out.println("Tahun Terbit : " + p.getTahunterbit());
            System.out.println();
            System.out.println("===========================================");
        }
    }
}
    
    

