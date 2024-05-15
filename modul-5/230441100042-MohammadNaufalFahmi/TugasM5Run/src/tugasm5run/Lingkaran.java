/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasm5run;

/**
 *
 * @author THINKPAD
 */
class Lingkaran extends BangunDatar {
    private double jarijari;
    
    protected Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    @Override
    protected double hitungLuasBD() {
       return Math.PI * jarijari * jarijari;
    }
    @Override
    protected void infoBD() {
        System.out.println("Lingkaran dengan radius: " + jarijari + "cm" + "\nsehingga memiliki luas: " + hitungLuasBD()+"cm2");
    }
}
