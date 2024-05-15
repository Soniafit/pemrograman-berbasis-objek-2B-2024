/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasm5run;

/**
 *
 * @author THINKPAD
 */
class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;
    
    protected PersegiPanjang(double panjang, double lebar) {
       this.panjang = panjang;
       this.lebar = lebar;
    }
    @Override
    protected double hitungLuasBD() {
        return panjang * lebar;
    }
    @Override
    protected void infoBD() {
       System.out.println("Persegi panjang dengan panjang: " + panjang + "cm" + " & lebar: " + lebar + "cm" +  "\nsehingga memiliki luas: " + hitungLuasBD()+"cm2");
    }
}
