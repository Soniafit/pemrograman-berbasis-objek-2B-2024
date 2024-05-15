/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasm5run;

/**
 *
 * @author THINKPAD
 */
class Segitiga extends BangunDatar {
    private double alas, tinggi;
    
    protected Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override
    protected double hitungLuasBD() {
        return 0.5 * alas * tinggi;
    }
    @Override
    protected void infoBD() {
       System.out.println("Segitiga dengan alas: " + alas + "cm" + " & tinggi: " + tinggi + "cm" + "\nsehingga memiliki luas: " + hitungLuasBD()+"cm2");
    }
}
