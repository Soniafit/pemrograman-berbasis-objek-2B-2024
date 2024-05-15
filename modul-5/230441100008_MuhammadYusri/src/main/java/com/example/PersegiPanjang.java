package com.example;

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar; //tadinya panjang
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}