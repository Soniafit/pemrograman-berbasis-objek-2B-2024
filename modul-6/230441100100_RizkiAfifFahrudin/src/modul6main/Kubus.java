/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6main;

/**
 *
 * @author asus
 */
public class Kubus extends BangunRuang{
    double sisi;
    
    public Kubus (double sisi){
        this.sisi=sisi;
    }
    
    double get_sisi(){
        return sisi;
    }
    
    @Override
    double hitungVolume(){
        return sisi*sisi*sisi;
    }
    
    @Override
    void info(){
    System.out.println("Volume Kubus : " +hitungVolume());
    }
}
