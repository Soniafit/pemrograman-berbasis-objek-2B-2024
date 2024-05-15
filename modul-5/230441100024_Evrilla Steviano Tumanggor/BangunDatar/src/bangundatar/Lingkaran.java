/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;


class Lingkaran extends BangunDatar {
    double jari;

    Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * jari * jari;
    }

//    overloading ini kak
    public double hitungLuas(double jari){
        return 2 * jari;
    }
    
    @Override
    void info() {
        System.out.println("Ini adalah lingkaran dengan jari-jari " + jari);
        System.out.println("luas : " + hitungLuas());
        System.out.println("Diamater : " + hitungLuas(jari));
    }
}