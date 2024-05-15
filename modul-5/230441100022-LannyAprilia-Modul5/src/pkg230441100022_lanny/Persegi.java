/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100022_lanny;

/**
 *
 * @author lanny aprilia
 */

public class Persegi extends BangunDatar{
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void hitungLuas() {
         luas = sisi * sisi;
    }
    
    public void info() {
    System.out.println("Persegi");
    System.out.println("Sisi: " + getSisi());
    System.out.println("Luas: " + getLuas());
    }

}

