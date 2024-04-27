/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;

public class Buku {
    private String judul;
    private final int kodeBuku;
    private boolean ketersediaan;
    private static int totalBukuTersedia = 0;

    public Buku(String judul, int kodeBuku) {
        this.judul = judul;
        this.kodeBuku = kodeBuku;
        this.ketersediaan = true; // Secara default, buku dianggap tersedia
        totalBukuTersedia++;
    }
    public void ubahStatusKetersediaan(boolean status) {
        this.ketersediaan = status;
        if(status) {
            totalBukuTersedia++;
        } else {
            totalBukuTersedia--;
        }
    }
    public static int getTotalBukuTersedia() {
        return totalBukuTersedia;
    }
    public void tampilkanInfo() {
        System.out.println("Kode Buku: " + this.kodeBuku);
        System.out.println("Judul: " + this.judul);
        System.out.println("Tersedia: " + (this.ketersediaan ? "Ya" : "Tidak"));
    }
    public void tambahEdisi(String edisi) {
        this.judul += " - Edisi " + edisi;
    }
}

