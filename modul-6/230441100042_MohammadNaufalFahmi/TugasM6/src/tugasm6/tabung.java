/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasm6;

/**
 *
 * @author THINKPAD
 */
class tabung extends BangunRuang {
    private double jariJari, tinggi;

    public tabung(double jariJari, double tinggi) {
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
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    void info() {
        System.out.println("Tabung dengan jari-jari " + jariJari + " dan tinggi " + tinggi);
    }
}
