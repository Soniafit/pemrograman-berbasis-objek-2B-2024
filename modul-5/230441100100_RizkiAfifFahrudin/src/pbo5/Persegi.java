/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;

public class Persegi extends bangunDatar {
    private double sisi;
    private double hasil;
    
    public Persegi(double sisi){
    this.sisi = sisi;
    this.hasil=hitungLuas();
    }
    
    double hitungLuas(){
    return sisi*sisi;
    }
    
    void tampilkan(){
    System.out.println("Luas Persegi : " + hasil);
    }
}
