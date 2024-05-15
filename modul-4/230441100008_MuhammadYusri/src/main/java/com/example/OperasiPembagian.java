package com.example;

class OperasiPembagian extends OperasiBilanganAbs {
    protected double a, b, c;

    protected void set_A(double a) { //ini juga tadinya b juga sangaddd mengecoh sekaliiiiiiii aaaaaaaaa
        this.a = a; // ini juga niih  tadinya b
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            c = Double.NaN; // NaN adalah 
        } else {
            c = a / b;
        }
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected void tampil() {
        System.out.println("Pembagian: " + c);
    }
}