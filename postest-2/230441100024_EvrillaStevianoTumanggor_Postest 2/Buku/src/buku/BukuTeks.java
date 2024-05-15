/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

public class BukuTeks extends Buku {
    // Constructor
    public BukuTeks(String judul, int kodeBuku) {
        super(judul, kodeBuku);
    }

    // Implementasi abstract method untuk menampilkan informasi buku
    @Override
    public void tampilkanInfo() {
        System.out.println("Kode Buku: " + this.kodeBuku);
        System.out.println("Judul: " + this.judul);
        System.out.println("Tersedia: " + (this.ketersediaan ? "Ya" : "Tidak"));
    }
}

