package modul.pkg5.pbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMasukkan panjang dan lebar persegi panjang: ");
        System.out.println("Masukkan panjang : ");
        double panjangPersegiPanjang = scanner.nextDouble();
        System.out.println("Masukkan lebar : ");
        double lebarPersegiPanjang = scanner.nextDouble();
        BangunDatar persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);

        System.out.println("\nMasukkan alas dan tinggi segitiga: ");
        System.out.println("Masukkan alas : ");
        double alasSegitiga = scanner.nextDouble();
        System.out.println("Masukkan tinggi : ");
        double tinggiSegitiga = scanner.nextDouble();
        BangunDatar segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);

        System.out.println("\nMasukkan sisi persegi: ");
        double sisiPersegi = scanner.nextDouble();
        BangunDatar persegi = new Persegi(sisiPersegi);

        System.out.println("\nMasukkan jari-jari lingkaran: ");
        double radiusLingkaran = scanner.nextDouble();
        BangunDatar lingkaran = new Lingkaran(radiusLingkaran);

        double luasPersegiPanjang = persegiPanjang.hitungLuas();
        persegiPanjang.hasil();
        System.out.println("Luas = " + luasPersegiPanjang);

        double luasSegitiga = segitiga.hitungLuas();
        segitiga.hasil();
        System.out.println("Luas = " + luasSegitiga);

        double luasPersegi = persegi.hitungLuas();
        persegi.hasil();
        System.out.println("Luas = " + luasPersegi);

        double luasLingkaran = lingkaran.hitungLuas();
        lingkaran.hasil();
        System.out.println("Luas = " + luasLingkaran);

    }
}
