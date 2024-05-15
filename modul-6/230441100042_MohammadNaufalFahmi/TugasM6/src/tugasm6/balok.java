/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasm6;

/**
 *
 * @author THINKPAD
 */
class balok extends BangunRuang{
    private double panjang, lebar, tinggi;

    public balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double getJariJari() {
        return 0; 
    }

    @Override
    public double getLebar() {
        return lebar;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    void info() {
        System.out.println("Balok dengan panjang " + panjang + ", lebar " + lebar + ", dan tinggi " + tinggi);
    }
}
