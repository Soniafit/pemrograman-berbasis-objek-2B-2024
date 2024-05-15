/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6main;

/**
 *
 * @author asus
 */
public class Balok extends BangunRuang implements Lebar,Tinggi{
    double panjang;
    double lebar;
    double tinggi;
    
    public Balok(double panjang,double lebar,double tinggi){
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }
    
    double get_panjang(){
        return panjang;
    }
    
    @Override
    public double get_lebar(){
        return lebar;
    }
    
    public double get_tinggi(){
        return tinggi;
    }
    
    @Override
    double hitungVolume(){
        return panjang*lebar*tinggi;
    }
    @Override
    void info(){
    System.out.println("Valume Balok : " + hitungVolume());
    }
}
