package modul5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BangunDatar[] bangundatar1 = new BangunDatar[999];
            
            String ulang;
            
            for (int i = 0; i < bangundatar1.length; i++) {
                System.out.println("============ Pilih bangun datar :==========");
                System.out.println("1. Persegi Panjang");
                System.out.println("2. Segitiga");
                System.out.println("3. Persegi");
                System.out.println("4. Lingkaran");
                System.out.println("============================================");
                int pilihan = scanner.nextInt();
                
                switch (pilihan) {
                    case 1 -> {
                        double panjang, lebar;
                        System.out.println("Masukkan panjang dan lebar persegi panjang:");
                        panjang = scanner.nextDouble();
                        lebar = scanner.nextDouble();
                        bangundatar1[i] = new PersegiPanjang(panjang, lebar);
                        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                        System.out.println("Luas: " + persegiPanjang.hitungLuas());
                    }
                    case 2 -> {
                        double alas, tinggi;
                        System.out.println("Masukkan alas dan tinggi segitiga:");
                        alas = scanner.nextDouble();
                        tinggi = scanner.nextDouble();
                        bangundatar1[i] = new Segitiga(alas, tinggi);
                        Segitiga segitiga = new Segitiga(alas, tinggi);
                        segitiga.info();
                        System.out.println("Luas: " + segitiga.hitungLuas());
                    }
                    case 3 -> {
                        double sisi;
                        System.out.println("Masukkan panjang sisi persegi:");
                        sisi = scanner.nextDouble();
                        bangundatar1[i] = new Persegi(sisi);
                        Persegi persegi = new Persegi(sisi);
                        persegi.info();
                        System.out.println("Luas: " + persegi.hitungLuas());
                    }
                    case 4 -> {
                        double jari;
                        System.out.println("Masukkan jari-jari lingkaran:");
                        jari = scanner.nextDouble();
                        Lingkaran lingkaran = new Lingkaran(jari);
                        bangundatar1[i] = new Lingkaran(jari);
                        lingkaran.info();
                        System.out.println("Luas: " + lingkaran.hitungLuas());
                    }
                    default -> System.out.println("Pilihan tidak valid.");
                }
                
                do {   
                    System.out.println("Apakah Anda ingin mengulangi? (iya/tidak): ");
                    ulang = scanner.next();
                    if (!ulang.equalsIgnoreCase("iya") && !ulang.equalsIgnoreCase("tidak")){
                        System.out.println("Input tidak valid. Mohon masukan 'iya' atau 'tidak'.");
                    }
                } while (!ulang.equalsIgnoreCase("iya") && !ulang.equalsIgnoreCase("tidak"));
                
                if (ulang.equalsIgnoreCase("tidak")) {
                    break; 
                }
            }
            
            System.out.println("Program selesai.");
        }
    }
}
