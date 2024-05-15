/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest2;

/**
 *
 * @author THINKPAD
 */
public abstract class produk {
    public abstract void setKode(String kode);
    public abstract void setNama(String nama);
    public abstract void setHarga(float harga);
    public abstract void setJumlahPembelian(int jumlahPembelian);
    
    public abstract String getKode();
    public abstract String getNama();
    public abstract float getHarga();
    public abstract int getJumlahPembelian();
    public abstract float getBayar();
    
}
