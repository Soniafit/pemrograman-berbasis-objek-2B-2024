/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttes2;

/**
 *
 * @author sonia
 */
abstract class Bentuk {
    protected String warna;

    public Bentuk(String warna) {
        this.warna = warna;
    }

    public abstract double hitungLuas();

    public abstract double hitungKeliling();

    public void cetakDetail() {
        System.out.println("Bentuk: " + this.getClass().getSimpleName());
        System.out.println("Warna: " + warna);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}

class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}

class Persegi extends Bentuk {
    private int sisi;

    public Persegi(int sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
public class PostTes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Lingkaran lingkaran = new Lingkaran(5, "Merah");
        lingkaran.cetakDetail();

        System.out.println();

        Persegi persegi = new Persegi(4, "Biru");
        persegi.cetakDetail();
    }
}
