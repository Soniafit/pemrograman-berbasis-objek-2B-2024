/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postestt1;

/**
 *
 * @author THINKPAD
 */
public class barangnya {
    private String kode;
    private String Barang;
    private float harga;
    private int jumlahPembelian;
    
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    public void setBarang(String Barang) {
        this.Barang = Barang;
    }
    public void setHarga(float harga) {
        this.harga = harga;
    }
    public void setJumlahPembelian(int jumlahPembelian) {
        this.jumlahPembelian = jumlahPembelian;
    }
    public float getbayar() {
        return harga * jumlahPembelian;
    }
    public String getKode() {
        return kode;
    }
    public String getBarang() {
        return Barang;
    }
    public float getHarga() {
        return harga;
    }
    public int getJumlahPembelian() {
        return jumlahPembelian;
    }
}
