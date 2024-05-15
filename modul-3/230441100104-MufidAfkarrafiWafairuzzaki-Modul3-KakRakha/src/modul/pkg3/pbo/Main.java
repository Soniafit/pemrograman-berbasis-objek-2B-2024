package modul.pkg3.pbo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Perpustakaan> daftarBuku = new ArrayList<>();

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

            Perpustakaan buku = new Perpustakaan(judul, penulis, publisher, kategori, stok, tahunTerbit);
            daftarBuku.add(buku);
        }
        System.out.println("\nDaftar Buku Diperpustakaan:");
        System.out.println();
        for (Perpustakaan m : daftarBuku) {
            m.displayInfo();
        }
    }
}
