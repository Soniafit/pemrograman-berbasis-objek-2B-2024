
package universitas;
import java.util.ArrayList;
import java.util.Scanner;

public class Hal3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Universitas : "); 
        String namaUniversitas = scanner.next();
        Hal2.setNamaUniversitas(namaUniversitas);
        
        ArrayList<Hal1> daftarMahasiswa = new ArrayList<>();
        char lagi;
        do {
            System.out.println("Masukkan Data Mahasiswa :");
            System.out.print("Nama : ");
            String nama = scanner.next();
            scanner.nextLine(); 
            System.out.print("NIM : ");
            String nim = scanner.nextLine();
            System.out.print("Alamat : ");
            String alamat = scanner.nextLine();
            
            int jurusan = 0;
            do {
                System.out.println("Pilih Jurusan : ");
                System.out.println("41 = TEKNIK INFORMATIKA");
                System.out.println("42 = TEKNIK INDUSTRI");
                System.out.println("43 = TEKNIK ELEKTRO");
                System.out.println("44 = SISTEM INFORMASI");
                System.out.println("45 = TEKNIK MESIN");
                System.out.println("46 = TEKNIK MEKATRONIKA");
                while (!scanner.hasNextInt()) {
                    System.out.println("Input bukan anda salah tolng masukan dengan benar .");
                    scanner.next();
                }
                jurusan = scanner.nextInt();
                if (jurusan < 41 || jurusan > 46) {
                    System.out.println("Pilihan tidak valid. Silakan pilih nomor jurusan teknik yang benar dari angka 41-46");
                }
            } while (jurusan < 41 || jurusan > 46);

            Hal1 mahasiswa = new Hal1(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Kamu mau Memasukkan Data lagi? (Y/T): ");
            lagi = scanner.next().charAt(0);
        } while (lagi == 'Y' || lagi == 'y');

        System.out.println("\nDaftar Mahasiswa di " + Hal2.getNamaUniversitas() + ":");
        for (Hal1 m : daftarMahasiswa) {
            System.out.println("Nama : " + m.getNama());
            System.out.println("NIM : " + m.getNim());
            System.out.println("Alamat : " + m.getAlamat());
            System.out.println("Jurusan : " + getJurusanString(m.getJurusan()));
            System.out.println();
        }
    }

    private static String getJurusanString(int jurusan) {
        switch (jurusan) {
            case 41:
                return "TEKNIK INFORMATIKA";
            case 42:
                return "TEKNIK INDUSTRI";
            case 43:
                return "TEKNIK ELEKTRO";
            case 44:
                return "SISTEM INFORMASI";
            case 45:
                return "TEKNIK MESIN";
            case 46:
                return "TEKNIK MEKATRONIKA";
            default:
                return "JURUSAN TIDAK VALID";
        }
    }
}