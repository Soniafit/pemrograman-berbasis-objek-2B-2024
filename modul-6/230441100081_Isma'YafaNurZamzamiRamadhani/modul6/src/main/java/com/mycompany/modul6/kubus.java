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
public class kubus extends BangunRuang implements info{
    private double sisi;

    public kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungvolume() {
        return Math.pow(sisi, 3);
    }

    public static kubus kubusInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan sisi kubus:");
        double sisi = scanner.nextDouble();
        return new kubus(sisi);
    }
    
    public void info() {
        System.out.println("===== KUBUS =====");
        System.out.println("Sisi = " + sisi );
        System.out.println("Volume = "+hitungvolume());
    }
}
