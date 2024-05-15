/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5;
import java.util.Scanner;
/**
 *
 * @author HP VICTUS
 */
public class PersegiPanjang extends BangunDatar {
    private final double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang,double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double hitungluas(){
        return panjang * lebar ;
    }
    public void info() {
        System.out.println("Persegi Panjang:");
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Luas = " + hitungluas());
    }
    
    public static PersegiPanjang PersegiPanjangInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan panjang persegi panjang:");
        double panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar persegi panjang:");
        double lebar = scanner.nextDouble();
        return new PersegiPanjang(panjang, lebar);
    }
}

