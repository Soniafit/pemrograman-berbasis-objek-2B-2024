/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3_230441100022_lanny;

/**
 *
 * @author lanny aprilia
 */


public class Perpustakaan2 extends Perpustakaan1 {
    
    public Perpustakaan2(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, kategori, stok, tahunTerbit);
    }
    
    public String getKategoriString() {
        return switch (kategori) {
            case "SU" -> "Semua Umur";
            case "D" -> "Dewasa";
            case "R" -> "Remaja";
            case "A" -> "Anak-anak";
            default -> "Kategori tidak valid";
        };
                }
}
