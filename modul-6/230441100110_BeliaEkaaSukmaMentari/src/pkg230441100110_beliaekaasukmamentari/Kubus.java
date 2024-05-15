/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100110_beliaekaasukmamentari;

/**
 *
 * @author asus
 */
public class Kubus extends BangunRuang implements Dimensi {
    private double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    protected double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    protected void info() {
        System.out.println("Kubus dengan sisi " + sisi);
    }

    @Override
    public double getJariJari() {
        return 0; // Tidak diperlukan untuk kubus
    }

    @Override
    public double getLebar() {
        return 0; // Tidak diperlukan untuk kubus
    }

    @Override
    public double getTinggi() {
        return 0; // Tidak diperlukan untuk kubus
    }
}
