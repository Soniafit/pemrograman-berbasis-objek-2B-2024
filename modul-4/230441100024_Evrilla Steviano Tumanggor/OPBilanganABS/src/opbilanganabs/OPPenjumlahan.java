/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opbilanganabs;

public class OPPenjumlahan extends OPBilanganAbs implements Operasi {
    public OPPenjumlahan() {
        this.a = 9.25;
        this.b = 1.25;
    }
    
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C(double c) {
        this.c = c;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        c = get_A() + get_B();
        return c;
    }
    
    @Override
    public void tampil() {
        System.out.println("=====");
        System.out.println("Operasi Penjumlahan");
        System.out.println("bilangan A = " + get_A());
        System.out.println("bilangan B = " + get_B());
        System.out.println("hasil penjumlahan A+B = " + get_C());
    }
}
