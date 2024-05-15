package projectmodul5;
import java.util.Scanner;

public class Hasil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunDatar bangunDatar;
        
        System.out.println("=======================");
        System.out.println("Pilih bangun datar:");
        System.out.println("=======================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("=======================");
        System.out.println();
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                bangunDatar = new Persegi();
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                ((Persegi)bangunDatar).setSisi(sisi);
                bangunDatar.hitungLuas();
                ((Persegi) bangunDatar).info();
                break;
            case 2:
                bangunDatar = new PersegiPanjang();
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                ((PersegiPanjang) bangunDatar).setPanjang(panjang);
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                ((PersegiPanjang) bangunDatar).setLebar(lebar);
                bangunDatar.hitungLuas();
                ((PersegiPanjang) bangunDatar).info();
                break;
            case 3:
                bangunDatar = new Lingkaran();
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                ((Lingkaran) bangunDatar).setJariJari(jariJari);
                bangunDatar.hitungLuas();
                ((Lingkaran) bangunDatar).info();
                break;
            case 4:
                bangunDatar = new Segitiga();
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                ((Segitiga) bangunDatar).setAlas(alas);
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                ((Segitiga) bangunDatar).setTinggi(tinggi);
                bangunDatar.hitungLuas();
                ((Segitiga) bangunDatar).info();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}