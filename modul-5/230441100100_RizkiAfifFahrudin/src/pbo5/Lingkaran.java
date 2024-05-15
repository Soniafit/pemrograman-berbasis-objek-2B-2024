/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;

public class Lingkaran extends bangunDatar{
    private double jariJari;
    private double hasil;
    
    public Lingkaran(double jariJari){
    this.jariJari=jariJari;
    this.hasil=hitungLuas();
    }
    
    double hitungLuas(){
    return Math.PI*jariJari*jariJari;
    }
    
    void tampilkan(){
    System.out.println("Hasil Luas Lingkaran : " +hasil);
    }
}
