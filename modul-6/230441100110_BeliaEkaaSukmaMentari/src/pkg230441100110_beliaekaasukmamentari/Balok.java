/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100110_beliaekaasukmamentari;

/**
 *
 * @author asus
 */
public class Balok extends BangunRuang implements Dimensi {
    private double panjang;
    private double lebar;
    private double tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    protected double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    protected void info() {
        System.out.println("Balok dengan panjang " + panjang + ", lebar " + lebar + ", dan tinggi " + tinggi);
    }

    @Override
    public double getJariJari() {
        return 0; // Tidak diperlukan untuk balok
    }

    @Override
    public double getLebar() {
        return lebar;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }
}
