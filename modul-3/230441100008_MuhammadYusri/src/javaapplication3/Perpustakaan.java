// Child class dari Buku.java
package javaapplication3;

/**
 *
 * @author Muhammad Yusri
 */
import java.util.ArrayList;
import java.util.Scanner;

   public class Perpustakaan extends Buku {
       private ArrayList<Buku> daftarBuku;

    public Perpustakaan(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
        daftarBuku = new ArrayList<>();
    }

    public void entryBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku yang akan dientrikan: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine();
             
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data buku ke-" + (i + 1) + ":");
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Penerbit: ");
            String penerbit = scanner.nextLine();

            boolean kategoriBuku = false;
            String kategori = "";
            
            while (!kategoriBuku) {
                System.out.print("Kategori (SU/D/R/A): ");
                kategori = scanner.nextLine().toUpperCase();
            
                switch (kategori) {
                    case "SU":
                        kategori = "Semua Umur";
                        kategoriBuku = true;
                        break;
                    case "D":
                        kategori = "Dewasa";
                        kategoriBuku = true;
                        break;
                    case "R":
                        kategori = "Remaja";
                        kategoriBuku = true;
                        break;
                    case "A":
                        kategori = "Anak-anak";
                        kategoriBuku = true;
                        break;
                    default:
                        System.out.println("Kategori tidak valid. Masukkan SU, D, R, atau A.");
                        kategoriBuku = false;
                }
            }

            
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            Buku buku = new Buku(judul, penulis, penerbit, kategori, stok, tahunTerbit);
            daftarBuku.add(buku);
        }
    }
            
    public void viewDaftarBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku di dalam daftar.");
        } else {
            System.out.println("\nDaftar Buku:");
            for (Buku buku : daftarBuku) {
                System.out.println("Judul: " + buku.getJudul());
                System.out.println("Penulis: " + buku.getPenulis());
                System.out.println("Penerbit: " + buku.getPenerbit());
                System.out.println("Kategori: " + buku.getKategori());
                System.out.println("Stok: " + buku.getStok());
                System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
                System.out.println();
            }
        }
    }
}