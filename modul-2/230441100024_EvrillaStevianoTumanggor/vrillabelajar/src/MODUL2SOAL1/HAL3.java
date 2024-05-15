package MODUL2SOAL1;
import java.util.ArrayList;
import java.util.Scanner;

public class HAL3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Universitas : "); 
        String namaUniversitas = scanner.next();
        HAL2.setNamaUniversitas(namaUniversitas);
        ArrayList<HAL1> daftarMahasiswa = new ArrayList<>();
        char lagi;
        do {
            System.out.println("Masukkan Data Mahasiswa :");
            System.out.print("Nama : ");
            String nama = scanner.next();
            scanner.nextLine(); // Mengatasi bug scanner
            System.out.print("NIM : ");
            String nim = scanner.nextLine();
            System.out.print("Alamat : ");
            String alamat = scanner.nextLine();

            int jurusan = 0;
            do {
                System.out.println("Pilih Jurusan : ");
                System.out.println("1 = TEKNIK INFORMATIKA");
                System.out.println("2 = TEKNIK INDUSTRI,");
                System.out.println("3 = TEKNIK ELEKTRO");
                System.out.println("4 = SISTEM INFORMASI");
                System.out.println("5 = TEKNIK MESIN");
                System.out.println("6 = TEKNIK MEKATRONIKA");
                while (!scanner.hasNextInt()) {
                    System.out.println("Input bukan angka! Mohon masukkan nomor jurusan yang benar.");
                    scanner.next(); // clear input
                }
                jurusan = scanner.nextInt();
                if (jurusan < 1 || jurusan > 6) {
                    System.out.println("Pilihan tidak valid. Silakan pilih nomor jurusan antara 1 dan 6.");
                }
            } while (jurusan < 1 || jurusan > 6);

            HAL1 mahasiswa = new HAL1(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Kamu mau Memasukkan Data lagi? (Y/T): ");
            lagi = scanner.next().charAt(0);
        } while (lagi == 'Y' || lagi == 'y');

        System.out.println("\nDaftar Mahasiswa di " + HAL2.getNamaUniversitas() + ":");
        for (HAL1 m : daftarMahasiswa) {
            System.out.println("Nama : " + m.getNama());
            System.out.println("NIM : " + m.getNim());
            System.out.println("Alamat : " + m.getAlamat());
            System.out.println("Jurusan : " + getJurusanString(m.getJurusan()));
            System.out.println();
        }
    }

    private static String getJurusanString(int jurusan) {
        switch (jurusan) {
            case 1:
                return "TEKNIK INFORMATIKA";
            case 2:
                return "TEKNIK INDUSTRI";
            case 3:
                return "TEKNIK ELEKTRO";
            case 4:
                return "SISTEM INFORMASI";
            case 5:
                return "TEKNIK MESIN";
            case 6:
                return "TEKNIK MEKATRONIKA";
            default:
                return "JURUSAN TIDAK VALID";
        }
    }
}
