/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg6;

/**
 *
 * @author AMANDA AULIA
 */
public class Balok extends BangunRuang implements Lebar, Tinggi {
    private double lebar;
    private double tinggi;
    private double panjang;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double getLebar() {
        return lebar;
    }

    @Override
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }

    @Override
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi: " + tinggi);
    }
}

