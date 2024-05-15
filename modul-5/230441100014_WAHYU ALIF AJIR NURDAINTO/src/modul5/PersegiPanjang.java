/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;
/**
 *
 * @author I MASTER ZEN
 */

class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    
    @Override
    double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    void info() {
        System.out.println("===================------------------======================================");
        System.out.println("Ini adalah persegi panjang dengan panjang " + panjang + " dan lebar " + lebar);
    }
}