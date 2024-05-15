/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg6;

/**
 *
 * @author AMANDA AULIA
 */
public class Kubus extends BangunRuang implements JariJari {
    private double jariJari;

    public Kubus(double jariJari) {
        this.jariJari = jariJari;
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
    public double hitungVolume() {
        return Math.pow(jariJari, 3);// pangkat
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Sisi: " + jariJari);
    }
}

