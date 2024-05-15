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
public class Lingkaran extends BangunDatar{
    private double jarijari;
    
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungluas(){
        return Math.PI * jarijari * jarijari;
    }
    public void info (){
        System.out.println("Lingkaran :");
        System.out.println("Jari-Jari : " + jarijari);
        System.out.println("Luas : " + hitungluas());
    }
    public static Lingkaran LingkaranInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran:");
        double jariJari = scanner.nextDouble();
        return new Lingkaran(jariJari);
    }
}
