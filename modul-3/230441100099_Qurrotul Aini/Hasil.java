package projectmodul3;
import java.util.ArrayList;
import java.util.Scanner;

public class Hasil {
    public static void main(String[] args) {
        ArrayList<Buku> listBuku = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku : ");
        int jumlahBuku = sc.nextInt();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("==========");
            System.out.println("Buku ke-" + (i + 1) + ": ");
            System.out.println("==========");
            System.out.print("Pilih kategori (A/R/D/SU): ");
            String kategori = sc.next();

            Buku buku = null;
            switch (kategori) {
                case "A" -> buku = new BukuAnak();
                case "R" -> buku = new BukuRemaja();
                case "D" -> buku = new BukuDewasa();
                case "SU" -> buku = new BukuSemuaUmur();
                default -> System.out.println("Kategori buku tidak valid!");
            }
            if (buku != null) {
                listBuku.add(buku);
            }
            
            System.out.println();
        }
        System.out.println("=====================");
        System.out.println("Bagian Daftar Buku");
        System.out.println("=====================");
        for (Buku buku : listBuku) {
            buku.tampilan();
            System.out.println();
        }
    }
}