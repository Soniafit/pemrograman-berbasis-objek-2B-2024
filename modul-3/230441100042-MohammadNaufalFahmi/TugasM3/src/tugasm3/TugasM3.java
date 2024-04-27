/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasm3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author THINKPAD
 */
class TugasM3 {
    private List<Perpustakaan> daftarBuku;
    
    public TugasM3() {
        daftarBuku = new ArrayList<>();
    }
    
    public void tambahBuku(Scanner scanner) {
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
         System.out.println("\n----------------------------------");
        System.out.println("    Pilih Kategori");
        System.out.println("----------------------------------");
        System.out.println(" SU - Semua Umur");
        System.out.println(" D  - Dewasa");
        System.out.println(" R  - Remaja");
        System.out.println(" A  - Anak-anak");
        System.out.println("----------------------------------");
        System.out.print("Kategori (SU/D/R/A): ");
        String kategori = scanner.nextLine();
        
        boolean kategoriValid = false; // Mengatur kategoriValid awalnya sebagai false
        while (!kategoriValid) { // Loop akan terus berjalan hingga kategoriValid menjadi true
            switch (kategori.toUpperCase()) {
                case "SU":
                    kategori = "Semua Umur";
                    kategoriValid = true; // Mengubah kategoriValid menjadi true karena kategori yang dimasukkan valid
                    break;
                case "D":
                    kategori = "Dewasa";
                    kategoriValid = true;
                    break;
                case "R":
                    kategori = "Remaja";
                    kategoriValid = true;
                    break;
                case "A":
                    kategori = "Anak-anak";
                    kategoriValid = true;
                    break;
                default:
                    System.out.println("\nKategori tidak valid. Masukkan kategori lagi (SU/D/R/A): ");
                    kategori = scanner.nextLine();
                    break;
            }
        }
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        System.out.print("Tahun Terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine();
    
        Perpustakaan buku = new Buku(judul, penulis, publisher, kategori, stok, tahunTerbit);
        daftarBuku.add(buku);
    }
    
    public void tampilkanDaftarBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam daftar !");
            System.out.println("==================================");
        } else {
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println("Buku ke-" + (i + 1) + ":");
                daftarBuku.get(i).displayInfo();
                System.out.println("==================================");
                System.out.println("----------------------------------");
                System.out.println("==================================");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        TugasM3 aplikasiPerpustakaan = new TugasM3();
        
        System.out.println("==================================");
        System.out.println("  Selamat Datang di Perpustakaan");
        System.out.println("==================================\n"); 

        System.out.print("Masukkan jumlah buku yang ingin dimasukkan: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline (\n) setelah input jumlah buku
        
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\n----------------------------------");
            System.out.println("Masukkan data buku ke-" + (i + 1) + ":");
            System.out.println("----------------------------------");
            aplikasiPerpustakaan.tambahBuku(scanner);
        }
        System.out.println("\n==================================");
        System.out.println("Daftar Buku:");
        System.out.println("==================================");
        aplikasiPerpustakaan.tampilkanDaftarBuku();

        scanner.close();
    }
}
