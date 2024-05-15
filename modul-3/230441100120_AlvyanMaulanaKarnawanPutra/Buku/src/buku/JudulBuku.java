/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

/**
 *
 * @author TOSHIBA
 */
public class JudulBuku extends Buku{
    public JudulBuku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, kategori, stok, tahunTerbit);
    }
    
    public static void print(){
        System.out.println(" Terima Kasih ");
        
    }
    
}
