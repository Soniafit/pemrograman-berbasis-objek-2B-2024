package main;

abstract class kalkulator {
    protected double a,b ;
    
    protected abstract void set_a (double a);
    protected abstract void set_b(double b);
    
    protected abstract double get_a();
    protected abstract double get_b();
    
    protected abstract void tampilkan();
}
