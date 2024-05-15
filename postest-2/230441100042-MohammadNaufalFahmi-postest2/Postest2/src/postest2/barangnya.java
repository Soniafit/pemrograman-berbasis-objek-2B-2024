/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest2;

/**
 *
 * @author THINKPAD
 */
public class barangnya extends produk {
    private String kode;
    private String nama;
    private float harga;
    private int jumlahPembelian;
    
    @Override
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    @Override
    public void setJumlahPembelian(int jumlahPembelian) {
        this.jumlahPembelian = jumlahPembelian;
    }
    
    @Override
    public String getKode() {
        return kode;
    }
    
    @Override
    public String getNama() {
        return nama;
    }
    
    @Override
    public float getHarga() {
        return harga;
    }
    @Override
    public int getJumlahPembelian() {
        return jumlahPembelian;
    }
  
    @Override
    public float getBayar() {
        return harga * jumlahPembelian;
    }
}
