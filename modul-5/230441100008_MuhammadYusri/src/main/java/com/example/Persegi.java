package com.example;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) { // ini adalah constructor yang berfungsi untuk memberikan nilai awal pada atribut sisi
        this.sisi = sisi;
    }

    @Override //ini adalah anotasi yang berfungsi untuk memberitahu bahwa method dibawah ini merupakan method yang diwarisi dari class parent
    public double hitungLuas() { // ini adalah method yang berfungsi untuk menghitung luas dari Persegi
        return sisi * sisi;
    }
 
    public void info() { 
        System.out.println("Persegi dengan sisi " + sisi);
    }
}
