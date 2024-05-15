package pbo5;
import java.util.Scanner;

public class Pbo5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        bangunDatar[] bangunDatar1 = new bangunDatar[4];

        System.out.println("Masukkan lebar dan tinggi Persegi Panjang");
        System.out.println("Masukkan lebar : "); 
        double lebar = input.nextDouble();
        System.out.println("Masukkan Tinggi : ");
        double tinggi = input.nextDouble();
        bangunDatar1[0] = new PersegiPanjang(lebar, tinggi);

        System.out.println("Masukkan alas dan tinggi Segitiga");
        System.out.println("Masukkan alas : ");
        double alas = input.nextDouble();
        System.out.println("Masukkan tinggi : ");
        double tinggiSegitiga= input.nextDouble();
        bangunDatar1[1] = new Segitiga(alas, tinggiSegitiga);

        System.out.print("Masukkan sisi Persegi : ");
        double sisi = input.nextDouble();
        bangunDatar1[2] = new Persegi(sisi);

        System.out.print("Masukkan jari-jari Lingkaran : ");
        double jariJari = input.nextDouble();
        bangunDatar1[3] = new Lingkaran(jariJari);

        for (bangunDatar BangunDatar : bangunDatar1) {
            BangunDatar.tampilkan();
            System.out.println();
        }
        input.close();
    }
}
