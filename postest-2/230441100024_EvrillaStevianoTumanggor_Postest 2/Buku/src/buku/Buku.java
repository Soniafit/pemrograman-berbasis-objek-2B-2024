/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;

public abstract class Buku {
    protected String judul;
    protected final int kodeBuku;
    protected boolean ketersediaan;
    protected static int totalBukuTersedia = 0;

    public Buku(String judul, int kodeBuku) {
        this.judul = judul;
        this.kodeBuku = kodeBuku;
        this.ketersediaan = true; 
        totalBukuTersedia++;
    }

    public abstract void tampilkanInfo();
    
    public static int getTotalBukuTersedia() {
        return totalBukuTersedia;
    }

    public void ubahStatusKetersediaan(boolean status) {
        this.ketersediaan = status;
        if (status) {
            totalBukuTersedia++;
        } else {
            totalBukuTersedia--;
        }
    }

    public void tambahEdisi(String edisi) {
        this.judul += " - Edisi " + edisi;
    }
}





