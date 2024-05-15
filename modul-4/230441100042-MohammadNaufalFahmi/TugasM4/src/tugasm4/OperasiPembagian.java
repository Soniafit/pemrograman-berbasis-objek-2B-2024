/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasm4;

/**
 *
 * @author THINKPAD
 */
class OperasiPembagian extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }
    @Override
    protected void set_C() {
        if (a!= 0 && b!= 0) {
            this.c = a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidakk bisaaa!");
        }
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
        return c;
    }
    @Override
    protected void tampil() {
        if(a!=0 && b!=0){
            System.out.println("\n====== P E M B A G I A N ======");
            System.out.println("* -  - " + get_A()+ " / " + get_B() + " = " + get_C()+" -  - *");
            System.out.println("===============================");
        }else {
            System.out.println("warninggggg !!!!!!!!!!!");
        }
    }
}
