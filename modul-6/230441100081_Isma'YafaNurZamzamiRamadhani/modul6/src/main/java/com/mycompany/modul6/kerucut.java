/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul6;
import java.util.Scanner;
/**
 *
 * @author HP VICTUS
 */
public class kerucut extends BangunRuang implements info {
    private double jariJari;
    private double tinggi;

    public kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungvolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }
    
    public static kerucut kerucutInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari jari tabung:");
        double jarijari = scanner.nextDouble();
        System.out.println("Masukkan tinggi tabung:");
        double tinggi = scanner.nextDouble();
        return new kerucut(jarijari,tinggi);
    }
    
    public void info() {
        System.out.println("===== KERUCUT =====");
        System.out.println("Jari-jari = " + jariJari );
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Volume = "+hitungvolume());
    }
}
