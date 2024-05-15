/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author M S I
 */
abstract class Kendaraan {
    protected String platNomor;
    protected String merek;
    protected int tahun;
    protected double harga;
    protected String warna;

    public Kendaraan(String platNomor, String merek, int tahun, double harga, String warna) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.tahun = tahun;
        this.harga = harga;
        this.warna = warna;
    }

    public abstract void tampilkanSpesifikasi();
}

