package posttes1;
import java.util.Scanner;

class KeretaApi {
    static double KECEPATAN = 60; // Kecepatan rata-rata kereta api dalam km/jam

    private final String namaKereta;
    private final double jarak;
    private final String tujuan;
    private final int kapasitasPenumpang;

    // Constructor
    public KeretaApi(String namaKereta, double jarak, String tujuan, int kapasitasPenumpang) {
        this.namaKereta = namaKereta;
        this.jarak = jarak;
        this.tujuan = tujuan;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // Method untuk menghitung waktu tempuh
    public double hitungWaktuTempuh() {
        return jarak / KECEPATAN;
    }

    // Method untuk menghitung biaya perjalanan
    public double hitungBiaya(double hargaPerKm) {
        return jarak * hargaPerKm;
    }

    // Method untuk menampilkan informasi perjalanan
    public void tampilkanInformasiPerjalanan() {
        System.out.println("Nama Kereta: " + namaKereta);
        System.out.println("Jarak Tempuh: " + jarak + " km");
        System.out.println("Waktu Tempuh: " + hitungWaktuTempuh() + " jam");
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    }

    // Method untuk mengubah kecepatan kereta api
    public static void ubahKecepatan(double kecepatanBaru) {
        KECEPATAN = kecepatanBaru;
    }

    // Method untuk input kecepatan kereta
    public static double inputKecepatan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kecepatan kereta (km/jam): ");
        double kecepatan = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan newline dari buffer
        return kecepatan;
    }

    // Method untuk mengecek apakah kereta penuh
    public boolean isKeretaPenuh(int jumlahPenumpang) {
        return jumlahPenumpang >= kapasitasPenumpang;
    }

    // Method untuk menghitung waktu tiba berdasarkan waktu berangkat dan waktu tempuh
    public double hitungWaktuTiba(double waktuBerangkat) {
        return waktuBerangkat + hitungWaktuTempuh();
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama kereta: ");
            String namaKereta = scanner.nextLine();
            System.out.print("Masukkan jarak tempuh (km): ");
            double jarak = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline dari buffer
            System.out.print("Masukkan tujuan: ");
            String tujuan = scanner.nextLine();
            System.out.print("Masukkan kapasitas penumpang: ");
            int kapasitasPenumpang = scanner.nextInt();

            // Membuat objek KeretaApi
            KeretaApi kereta = new KeretaApi(namaKereta, jarak, tujuan, kapasitasPenumpang);

            // Menampilkan informasi perjalanan
            kereta.tampilkanInformasiPerjalanan();

            // Menghitung dan menampilkan biaya perjalanan
            System.out.print("Masukkan harga per kilometer: ");
            double hargaPerKm = scanner.nextDouble();
            double biaya = kereta.hitungBiaya(hargaPerKm);
            System.out.println("Biaya perjalanan: Rp " + biaya);

            // Mengubah kecepatan kereta
            double kecepatanBaru = KeretaApi.inputKecepatan();
            KeretaApi.ubahKecepatan(kecepatanBaru);
            System.out.println("Kecepatan kereta telah diubah menjadi " + kecepatanBaru + " km/jam.");

            // Contoh penggunaan metode isKeretaPenuh
            System.out.print("Masukkan jumlah penumpang: ");
            int jumlahPenumpang = scanner.nextInt();
            if (kereta.isKeretaPenuh(jumlahPenumpang)) {
                System.out.println("Kereta penuh.");
            } else {
                System.out.println("Masih tersedia tempat duduk di kereta.");
            }

            // Contoh penggunaan metode hitungWaktuTiba
            System.out.print("Masukkan waktu keberangkatan (jam): ");
            double waktuBerangkat = scanner.nextDouble();
            double waktuTiba = kereta.hitungWaktuTiba(waktuBerangkat);
            System.out.println("Waktu tiba: " + waktuTiba + " jam.");
        }
    }
}
