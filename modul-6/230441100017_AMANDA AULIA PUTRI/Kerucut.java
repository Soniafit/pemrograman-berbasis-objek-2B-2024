/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg6;

/**
 *
 * @author AMANDA AULIA
 */
public class Kerucut extends BangunRuang implements JariJari, Tinggi {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double getJariJari() {
        return jariJari;
    }

    @Override
    public void setJariJari(double jariJari) {
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari kerucut tidak boleh <= 0");
        }
        this.jariJari = jariJari;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }

    @Override
    public void setTinggi(double tinggi) {
        if (tinggi <= 0) {
            throw new IllegalArgumentException("Tinggi kerucut tidak boleh <= 0");
        }
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (1.0/3) * Math.PI * jariJari * jariJari * tinggi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Tinggi: " + tinggi);
    }
}

