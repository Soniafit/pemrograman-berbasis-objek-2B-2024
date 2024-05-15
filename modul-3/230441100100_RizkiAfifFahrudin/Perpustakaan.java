package perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan Data Buku");
            System.out.println("2. Tampilkan Daftar Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            String pilih = scanner.nextLine();

            switch (pilih) {
                case "1":
                    System.out.print("Masukkan jumlah buku yang ingin dimasukkan: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); 
                    for (int i = 0; i < n; i++) {
                        System.out.println("Masukkan data untuk buku ke-" + (i + 1) + ":");
                        System.out.print("Judul : ");
                        String judul = scanner.nextLine();
                        System.out.print("Penulis : ");
                        String penulis = scanner.nextLine();
                        System.out.print("Publisher : ");
                        String publisher = scanner.nextLine();
                        System.out.print("Kategori (SU/D/R/A): ");
                        System.out.println("(Semua Umur,Dewasa,Remaja,Anak-Anak)");
                        String kategori = scanner.nextLine().toUpperCase();
                        System.out.print("Stok: ");
                        int stok = scanner.nextInt();
                        System.out.print("Tahun Terbit: ");
                        int tahun = scanner.nextInt();
                        scanner.nextLine(); 

                        Buku buku1;
                        switch (kategori) {
                            case "SU":
                                buku1 = new Kategori.SemuaUmur(judul, penulis, publisher, stok, tahun);
                                break;
                            case "D":
                                buku1 = new Kategori.Dewasa(judul, penulis, publisher, stok, tahun);
                                break;
                            case "R":
                                buku1 = new Kategori.Remaja(judul, penulis, publisher, stok, tahun);
                                break;
                            case "A":
                                buku1 =new Kategori.AnakAnak(judul, penulis, publisher, stok, tahun);
                                break;
                            default:
                                System.out.println("Kategori tidak valid.");
                                continue;
                        }

                        daftarBuku.add(buku1);
                        System.out.println("Data buku berhasil dimasukkan.\n");
                    }
                    break;
                case "2":
                    if (daftarBuku.isEmpty()) {
                        System.out.println("Belum ada data buku yang dimasukkan.");
                    } else {
                        System.out.println("Daftar Buku:");
                        System.out.println("");
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            System.out.println("Buku ke-" + (i + 1) + ":");
                            daftarBuku.get(i).tampilkanInfo();
                        }
                    }
                    break;
                case "3":
                    System.out.println("Terima kasih! Sampai jumpa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang benar.");
            }
        }
    }   
}
