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
public class Persegi extends BangunDatar{
    private double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    public double hitungluas(){
        return sisi * sisi ;
    }
    public void info() {
        System.out.println("Persegi :");
        System.out.println("sisi = " + sisi);
        System.out.println("Luas = " + hitungluas());
    }
    public static Persegi PersegiInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan sisi persegi :");
        double sisi = scanner.nextDouble();
        return new Persegi(sisi);
    }
}
