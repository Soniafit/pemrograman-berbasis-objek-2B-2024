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
public class tabung extends BangunRuang implements info {
    private double jariJari;
    private double tinggi;

    public tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungvolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public static tabung tabungInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari jari tabung:");
        double jarijari = scanner.nextDouble();
        System.out.println("Masukkan tinggi tabung:");
        double tinggi = scanner.nextDouble();
        return new tabung(jarijari,tinggi);
    }
    
    public void info() {
        System.out.println("===== TABUNG =====");
        System.out.println("Jari-Jari = " + jariJari );
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Volume = "+hitungvolume());
    }
}
