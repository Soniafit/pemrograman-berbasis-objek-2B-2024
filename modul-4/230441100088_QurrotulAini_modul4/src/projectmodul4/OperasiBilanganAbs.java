package projectmodul4;

public abstract class OperasiBilanganAbs {
    double a, b, c;

    abstract void set_A(double a);
    abstract void set_B(double b);
    abstract void set_C();
    
    abstract double get_A();
    abstract double get_B();
    abstract double get_C();
    
    abstract void tampil();
}