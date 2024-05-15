package projectmodul3;

import java.util.Scanner;

public class Buku {

    String Judul, Penulis, Publisher, Kategori;
    int Stok, TahunTerbit;

    public Buku() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan judul buku : ");
        Judul = sc.nextLine();
        System.out.print("Masukkan nama penulis : ");
        Penulis = sc.nextLine();
        System.out.print("Masukkan nama publisher : ");
        Publisher = sc.nextLine();
        System.out.print("Masukkan jumlah stok buku : ");
        Stok = sc.nextInt();
        System.out.print("Masukkan tahun terbit : ");
        TahunTerbit = sc.nextInt();
    }

    public void tampilan() {
        System.out.println("Judul : " + Judul);
        System.out.println("Penulis : " + Penulis);
        System.out.println("Publisher : " + Publisher);
        System.out.println("Kategori : " + Kategori);
        System.out.println("Stok : " + Stok);
        System.out.println("Tahun Terbit : " + TahunTerbit);
    }
}