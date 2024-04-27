/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

public class TokoBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("The Dark of The Moon", 1);
        Buku buku2 = new Buku("King of The Monster", 2);
        
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        
        buku1.ubahStatusKetersediaan(false);
        buku2.tambahEdisi("Terbaru");
        
        System.out.println("\nInfo Buku Setelah Perubahan:");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        System.out.println("\nTotal Buku Yang Ada: " + Buku.getTotalBukuTersedia());
    }
}

