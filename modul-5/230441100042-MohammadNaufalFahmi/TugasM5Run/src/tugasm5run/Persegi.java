/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasm5run;

/**
 *
 * @author THINKPAD
 */
class Persegi extends BangunDatar {
    private double sisi;
    
    protected Persegi(double sisi) {
        this.sisi = sisi;
    }
    @Override
    protected double hitungLuasBD() {
        return sisi * sisi;
    }
    @Override
    protected void infoBD() {
       System.out.println("Persegi dengan sisi: " + sisi + "cm" + "\nsehingga memiliki luas: " + hitungLuasBD()+"cm2");
    }
}
