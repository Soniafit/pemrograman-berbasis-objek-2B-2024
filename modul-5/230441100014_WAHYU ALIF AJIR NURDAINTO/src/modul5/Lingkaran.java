/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author I MASTER ZEN
 */

class Lingkaran extends BangunDatar {
    private final double jariJari;

    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
//    overloading
    public double hitungLuas(double jariJari){
        return 2 * jariJari;
    }
    @Override
    public void info() {
        System.out.println("Lingkaran");
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Diameter : "+hitungLuas(jariJari));
    }
}