package post.test;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pemasokan kursi dan meja baru");
        System.out.println("\nMasukkan nama kelas: ");
        String kelas = scanner.nextLine();

        System.out.println("Masukkan jumlah kursi saat ini: ");
        int kursi = scanner.nextInt();

        System.out.println("Masukkan jumlah meja saat ini: ");
        int meja = scanner.nextInt();

        System.out.println("Masukkan jumlah kursi yang akan ditambahkan: ");
        int tambahKursi = scanner.nextInt();
        kursi += tambahKursi;

        System.out.println("Masukkan jumlah meja yang akan ditambahkan: ");
        int tambahMeja = scanner.nextInt();
        meja += tambahMeja;

        System.out.println("Masukkan ukuran (S/M/L): ");
        char ukuran = scanner.next().charAt(0);

        Kursi kursiObj = new Kursi(kelas, kursi);
        Meja mejaObj = new Meja(kelas, meja);

        System.out.println("\nInformasi Masukan total Meja dan Kursi Baru:");
        System.out.println("Kelas: " + kelas);
        System.out.println("Jumlah kursi: " + kursiObj.getJumlah());
        System.out.println("Jumlah meja: " + mejaObj.getJumlah());
        System.out.println("Ukuran: " + ukuran);
    }
}