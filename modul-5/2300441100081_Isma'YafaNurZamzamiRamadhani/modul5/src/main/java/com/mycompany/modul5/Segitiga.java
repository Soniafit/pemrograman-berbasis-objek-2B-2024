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
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    
    public Segitiga (double alas,double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double hitungluas(){
        return 0.5 * alas *tinggi;
    }
    public void info() {
        System.out.println("Segitiga:");
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Luas = " + hitungluas());
    }
    public static Segitiga SegitigaInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan alas segitiga:");
        double alas = scanner.nextDouble();
        System.out.println("Masukkan tinggi segitiga:");
        double tinggi = scanner.nextDouble();
        return new Segitiga(alas, tinggi);
    }
}
