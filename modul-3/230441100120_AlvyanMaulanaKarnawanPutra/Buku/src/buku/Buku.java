/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;
import java.util.ArrayList;
import java.util.Scanner;

public class Buku {

    private String judul, penulis, publisher, kategori;
    private int stok, tahunTerbit;

    public Buku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public static void main(String[] args) {
        ArrayList<Buku> listBuku = new ArrayList<>();
        Scanner ST = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Buku : ");
        int jumlahBuku = ST.nextInt();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Buku ST" + (i + 1) + "");
            System.out.println("Pilih Kategori Buku :");
            System.out.println("SU = Semua Umur ");
            System.out.println("D = Dewasa ");
            System.out.println("R = Remaja ");
            System.out.println("A = Anak-anak");

            String kategori = ST.next();

            String Kategori;

            if (kategori.equalsIgnoreCase("SU")) {
                Kategori = "Semua Umur";
            } else if (kategori.equalsIgnoreCase("D")) {
                Kategori = "Dewasa";
            } else if (kategori.equalsIgnoreCase("R")) {
                Kategori = "Remaja";
            } else if (kategori.equalsIgnoreCase("A")) {
                Kategori = "Anak-anak";
            } else {
                System.out.println("Kategori tidak valid, default Semua Umur.");
                Kategori = "Semua Umur";
            }

            Buku buku = new Buku("", "", "", Kategori, 0, 0);
            buku.Input(ST);
            listBuku.add(buku);
        }

        System.out.println("Daftar Buku ");
        for (Buku b : listBuku) {
            b.Tampil();
            System.out.println();
        }
        JudulBuku.print();
    }

    public void Input(Scanner ST) {
        System.out.println("Masukkan Judul Buku : ");
        judul = ST.next();
        System.out.println("Masukkan Nama Penulis : ");
        penulis = ST.next();
        System.out.println("Masukkan Perusahaan Penerbit Buku : ");
        publisher = ST.next();
        System.out.println("Masukkan Stok Buku : ");
        stok = ST.nextInt();
        System.out.println("Masukkan Tahun Terbit : ");
        tahunTerbit = ST.nextInt();
    }

    public void Tampil() {
        System.out.println("Judul : " + judul);
        System.out.println("Penulis :" + penulis);
        System.out.println("Penerbit :" + publisher);
        System.out.println("Kategori :" + kategori);
        System.out.println("Stok :" + stok);
        System.out.println("Tahun Terbit :" + tahunTerbit);
    }


}

