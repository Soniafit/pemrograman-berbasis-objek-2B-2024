package main;

public class Perkalian extends kalkulator {
    @Override
    protected void set_a(double a) {
        this.a = a;
    }

    @Override
    protected void set_b(double b) {
        this.b = b;
    }

    @Override
    protected double get_a() {
        return a;
    }

    @Override
    protected double get_b() {
        return b;
    }

    @Override
    protected void tampilkan() {
        double c = a * b;
        System.out.println("Hasil perkalian: " + c);
    }
}
