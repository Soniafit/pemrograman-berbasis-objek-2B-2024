/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AbstarctBilangan;

/**
 *
 * @author lanny aprilia
 */
public abstract class AbstarctBilangan{
    double a, b, c;

    abstract void set_A(double a);
    abstract void set_B(double b);
    abstract void set_C(double c);
    
    abstract double get_A();
    abstract double get_B();
    abstract double get_C();
    
    abstract void tampil(); 
}
