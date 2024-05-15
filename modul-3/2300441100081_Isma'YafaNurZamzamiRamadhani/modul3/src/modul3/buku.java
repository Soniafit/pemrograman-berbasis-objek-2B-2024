/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author HP VICTUS
 */
class buku {
    public String judul;
    public String penulis;
    public String publisher;
    public String kategori;
    public int stok;
    public int tahunTerbit;

    public buku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + "\nPenulis: " + penulis + "\nPublisher: " + publisher + "\nKategori: " + kategori + "\nStok: " + stok + "\nTahun Terbit: " + tahunTerbit;
    }
}
