/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;

public class PersegiPanjang extends bangunDatar {
    private double panjang;
    private double tinggi;
    private double hasil;
    
    public PersegiPanjang(double panjang,double tinggi){
    this.panjang=panjang;
    this.tinggi=tinggi;
    this.hasil=hitungLuas();
    }
    double hitungLuas(){
    return panjang*tinggi;
    }
    void tampilkan(){
    System.out.println("Luas Persegi Panjang = " + hasil);
    }
}
