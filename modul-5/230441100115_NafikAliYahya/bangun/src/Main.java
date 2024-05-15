import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar (persegi panjang, segitiga, persegi, lingkaran): ");
        String pilihan = scanner.nextLine().toLowerCase();

        BangunDatar bangunDatar;

        switch (pilihan) {
            case "persegi panjang":
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                bangunDatar = new PersegiPanjang(panjang, lebar);
                break;
            case "segitiga":
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                bangunDatar = new Segitiga(alas, tinggi);
                break;
            case "persegi":
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                bangunDatar = new Persegi(sisi);
                break;
            case "lingkaran":
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                bangunDatar = new Lingkaran(jariJari);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Luas: " + bangunDatar.hitungLuas());
        bangunDatar.info();
    }
}
