/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasm6;

/**
 *
 * @author THINKPAD
 */
class kubus extends BangunRuang {
    private double sisi;

    public kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getJariJari() {
        return 0; 
    }

    @Override
    public double getLebar() {
        return 0; 
    }

    @Override
    public double getTinggi() {
        return 0; 
    }

    @Override
    double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    void info() {
        System.out.println("Kubus dengan sisi " + sisi);
    }
}
