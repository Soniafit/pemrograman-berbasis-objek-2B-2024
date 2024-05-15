package post.test;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Penghitungan kursi dan meja");

        System.out.println("\nMasukkan panjang dan lebar kursi: ");
        System.out.println("Masukkan panjang kursi: ");
        double panjangKursi = scanner.nextDouble();
        System.out.println("Masukkan lebar kursi: ");
        double lebarKursi = scanner.nextDouble();
        Furniture kursi = new Kursi(panjangKursi, lebarKursi);

        System.out.println("\nMasukkan panjang dan lebar kursi: ");
        System.out.println("Masukkan panjang meja: ");
        double panjangMeja = scanner.nextDouble();
        System.out.println("Masukkan lebar meja: ");
        double lebarMeja = scanner.nextDouble();
        Furniture meja = new Meja(panjangMeja, lebarMeja);
        
        double luasKursi = kursi.hitungLuas();
        kursi.info();
        System.out.println("Luas Kursi = " + luasKursi);

        double luasMeja = meja.hitungLuas();
        kursi.info();
        System.out.println("Luas Meja = " + luasMeja);


    }
}
