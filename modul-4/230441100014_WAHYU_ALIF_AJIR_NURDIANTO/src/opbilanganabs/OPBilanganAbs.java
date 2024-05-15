/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opbilanganabs;

abstract class OPBilanganAbs {
    protected double a;
    protected double b;
    protected double c;
//    method
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();

    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C(double c);
}
//Deklarasi Metode Tanpa Implementas
interface Operasi {
    void tampilHasil();
}