/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opbilanganabs;

public class Pembagian extends OPBilanganAbs implements Operasi {
    public Pembagian() {
        this.a = 9.25;
        this.b = 1.25;
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
        if(a==0&&b==0){
            System.out.println("erorr");
        } else{
        this.c = a/b;
        }   
        return c;
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
        this.c=c;
                
    }

    @Override
    public void tampilHasil() {
        if (a!=0 && b!=0){
            System.out.println("=================");
            System.out.println("Operasi Pembagian");
            System.out.println("bilangan A = " + get_A());
            System.out.println("bilangan B = " + get_B());
            System.out.println("Hasil Pembagian A/B = " + get_C());
            System.out.println("=================");
        }else {
            System.out.println(" erorrrr !!!!! gaak bisaaa kocakkk");
        }
    }
}