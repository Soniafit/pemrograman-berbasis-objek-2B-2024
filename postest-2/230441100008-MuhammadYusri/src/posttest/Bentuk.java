package posttest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Yusri
 */
abstract class Bentuk {
    protected String nama;
    protected static int jumlahBentuk = 0;  // keyword static di sini

    public Bentuk(String nama) {
        this.nama = nama;
        jumlahBentuk++;
    }

    public String getNama() {
        return nama;
    }

    public static int getJumlahBentuk() {
        return jumlahBentuk;
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}
