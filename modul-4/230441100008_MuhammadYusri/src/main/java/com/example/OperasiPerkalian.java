package com.example;

public class OperasiPerkalian extends OperasiBilanganAbs {
    protected double a, b, c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        c = a * b;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() { // inii niiih tadi return a
        return c;
    }

    protected void tampil() {
        System.out.println("Perkalian: " + c);
    }
}
