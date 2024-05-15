/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

public class TokoBuku {
    public static void main(String[] args) {
        BukuTeks buku1 = new BukuTeks("Godzilla 2014", 1);
        BukuTeks buku2 = new BukuTeks("The Smurf 2", 2);

        System.out.println("Buku Sebelum Perubahan:");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        buku1.ubahStatusKetersediaan(false);
        buku2.tambahEdisi("Terbaru");

        System.out.println("\nBuku Setelah Perubahan:");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        System.out.println("\nTotal Buku Yang Ada: " + Buku.getTotalBukuTersedia());
    }
}
