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
public class balok extends BangunRuang implements info{
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double hitungvolume() {
        return panjang * lebar * tinggi;
    }
    
    public static balok balokInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan panjang balok:");
        double panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar balok:");
        double lebar = scanner.nextDouble();
        System.out.println("Masukkan tinggi balok:");
        double tinggi = scanner.nextDouble();
        return new balok(panjang,lebar,tinggi);
    }
    
    public void info() {
        System.out.println("===== BALOK =====");
        System.out.println("panjang = " + panjang );
        System.out.println("lebar = " + lebar );
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Volume = "+hitungvolume());
    }
}
