package com.example;

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override //ini adalah anotasi yang berfungsi untuk memberitahu bahwa method dibawah ini merupakan method yang diwarisi dari parent class
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public void info() {
        System.out.println("Lingkaran dengan jari-jari " + jariJari);
    }
}