package main;

public class Main {
    public static void main(String[] args) {
        double a = 9.25;
        double b = 1.25;
        
        Penjumlahan penjumlahan1 = new Penjumlahan();
        penjumlahan1.set_a(a);
        penjumlahan1.set_b(b);
        penjumlahan1.tampilkan();

        Pengurangan pengurangan1 = new Pengurangan();
        pengurangan1.set_a(a);
        pengurangan1.set_b(b);
        pengurangan1.tampilkan();

        Perkalian perkalian1 = new Perkalian();
        perkalian1.set_a(a);
        perkalian1.set_b(b);
        perkalian1.tampilkan();

        Pembagian pembagian1 = new Pembagian();
        pembagian1.set_a(a);
        pembagian1.set_b(b);
        pembagian1.tampilkan();
    }
}
