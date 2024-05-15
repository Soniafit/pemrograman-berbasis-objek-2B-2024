/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg6;

/**
 *
 * @author AMANDA AULIA
 */
public class Tabung extends BangunRuang implements JariJari, Tinggi {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    

    @Override
    public double getJariJari() {
        return jariJari;
    }

    @Override
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }

    @Override
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Tinggi: " + tinggi);
    }
}

