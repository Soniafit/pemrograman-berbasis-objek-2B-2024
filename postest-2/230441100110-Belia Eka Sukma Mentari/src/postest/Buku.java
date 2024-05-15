/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest;

/**
 *
 * @author asus
 */
public class Buku extends Media {
    private double harga;

    public Buku(String judul, int tahunTerbit, double harga) {
        super(judul, tahunTerbit);
        this.harga = harga;
    }

    @Override
    public String getInfo() {
        return "Judul: " + judul + ", Tahun Terbit: " + tahunTerbit + ", Harga: Rp" + harga;
    }
}
