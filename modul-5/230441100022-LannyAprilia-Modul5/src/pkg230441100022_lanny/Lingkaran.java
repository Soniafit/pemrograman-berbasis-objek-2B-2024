/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100022_lanny;

/**
 *
 * @author lanny aprilia
 */

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }
    
    public void hitungLuas() {
        luas = Math.PI * jariJari * jariJari;
    }
    
    public void info() {
        System.out.println("Lingkaran");
        System.out.println("Jari-jari: " + getJariJari());
        System.out.println("Luas: " + getLuas());
    }
}
