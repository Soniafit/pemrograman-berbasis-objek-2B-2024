/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg5;

/**
 *
 * @author AMANDA AULIA
 */
class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    protected double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah persegi panjang dengan panjang " + panjang + " dan lebar " + lebar);
    }
}
    

