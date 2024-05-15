/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package post.tes3;

/**
 *
 * @author SONIA
 */
interface BentukInterface {
    double hitungLuas();
    double hitungKeliling();
    public void cetakDetail();
}

abstract class Bentuk {
    protected String warna;

    public Bentuk(String warna) {
        this.warna = warna;
    }

    public abstract void cetakDetail();
}

class Lingkaran extends Bentuk implements BentukInterface {
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

    @Override
    public void cetakDetail() {
        System.out.println("Bentuk: Lingkaran");
        System.out.println("Warna: " + warna);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}

class Persegi extends Bentuk implements BentukInterface {
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

    @Override
    public void cetakDetail() {
        System.out.println("Bentuk: Persegi");
        System.out.println("Warna: " + warna);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}    
public class PostTes3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BentukInterface bentuk1 = new Lingkaran(5, "Merah");
        BentukInterface bentuk2 = new Persegi(4, "Biru");

        cetakDetail(bentuk1);
        cetakDetail(bentuk2);
    }
    public static void cetakDetail(BentukInterface bentuk) {
             bentuk.cetakDetail();//menggagilmetode
    }
}