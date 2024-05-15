/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;

public class Segitiga extends bangunDatar{
    private double alas;
    private double tinggi;
    private double hasil;
    
    public Segitiga(double alas,double tinggi){
    this.alas=alas;
    this.tinggi=tinggi;
    this.hasil=hitungLuas();
    }
    
    double hitungLuas(){
    return 0.5*alas*tinggi;
    }
    
    void tampilkan(){
    System.out.println("Luas Segitiga : " + hasil);
    }
}
