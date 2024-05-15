/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6main;

/**
 *
 * @author asus
 */
public class Tabung extends BangunRuang implements JariJari,Tinggi{
    double JariJari;
    double Tinggi;
    
    public Tabung(double JariJari,double Tinggi){
        this.JariJari=JariJari;
        this.Tinggi=Tinggi;
    }
    
    @Override
    public double get_jarijari(){
        return JariJari;
    }
    
    @Override
    public double get_tinggi(){
        return Tinggi;
    }
    
    @Override
    double hitungVolume(){
        return Math.PI*JariJari*JariJari*Tinggi;
    }
    
    @Override
    void info(){
        System.out.println("Volume Tabung : "+ hitungVolume());
    }
}