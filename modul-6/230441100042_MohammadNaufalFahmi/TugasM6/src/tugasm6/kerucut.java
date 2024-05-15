/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasm6;

/**
 *
 * @author THINKPAD
 */
class kerucut extends BangunRuang {
    private double jariJari, tinggi;

    public kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double getJariJari() {
        return jariJari;
    }

    @Override
    public double getLebar() {
        return 0; 
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }

    @Override
    double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    void info() {
        System.out.println("Kerucut dengan jari-jari " + jariJari + " dan tinggi " + tinggi);
    }
}
