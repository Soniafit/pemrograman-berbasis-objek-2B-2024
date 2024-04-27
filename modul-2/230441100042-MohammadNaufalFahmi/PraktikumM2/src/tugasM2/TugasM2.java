/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasM2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THINKPAD
 */
public class TugasM2 {
    public static class Universitas{
        private String namaUniversitas;
        
        public Universitas(String namaUniversitas) {
            this.namaUniversitas = namaUniversitas;
        }
        public String getNamaUniversitas(){
            return namaUniversitas;
        }
        public void setNamaUniversitas(String namaUniversitas) {
            this.namaUniversitas = namaUniversitas;
        }
    }
    public static class Mahasiswa extends Universitas{
        private String nama;
        private String nim;
        private String alamat;
        private int jurusan;
        // constructor
        public Mahasiswa(String nama, String nim, String alamat, int jurusan, String namaUniversitas){
            super(namaUniversitas);
            this.nama = nama;
            this.nim = nim;
            this.alamat = alamat;
            this.jurusan = jurusan;
        }
        // setter        
        public void setNama(String nama){
            this.nama = nama;
        }
        public void setNim(String nim){
            this.nim = nim;
        }
        public void setAlamat(String alamat){
            this.alamat = alamat;
        }
        public void setJurusan(int jurusan){
            this.jurusan = jurusan;
        }
        // getter        
        public String getNama(){
            return nama;
        }
        public String getNim(){
            return nim;
        }
        public String getAlamat(){
            return alamat;
        }
        public int getJurusan(){
            return jurusan;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        //Objek universitas
        Universitas univ = new Universitas(namaUniversitas);
        
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();//Menyimpan objek-objek yang sudah dibuat 
        char lagi;// tipe data variabel lagi adalah char
        do{
            System.out.println("\nMasukkan Data Mahasiswa:");
            System.out.print("Nama : ");
            String nama = scanner.nextLine();
            System.out.print("NIM : ");
            String nim = scanner.nextLine();
            System.out.print("Alamat : ");
            String alamat = scanner.nextLine();
            int jurusan;
            boolean jurusanValid;
            do {
                System.out.println("\nPilih Jurusan : ");
                System.out.println("41 = Teknik Informatika");
                System.out.println("42 = Teknik Industri");
                System.out.println("43 = Teknik Elektro");
                System.out.println("44 = Sistem Informasi");
                System.out.println("48 = Teknik Mesin");
                System.out.println("49 = Teknik Mekatronika");
                System.out.print("Kode jurusan(41-49): ");
                jurusan = scanner.nextInt();
                scanner.nextLine();//menghilangkan buffer
                
                if (jurusan >=41 && jurusan <=44 || jurusan >=48 && jurusan <=49){
                    jurusanValid = true;// jika jurusan antara 41 - 44 dan 48 - 49
                }else{
                    System.out.println("\nKode jurusan yang anda masukkan tidak valid. Masukkan kode lain.");
                    jurusanValid = false;// jika jurusan selain yang tertera
                }
            }while(!jurusanValid);// loop untuk cek kode jurusan yang sesuai
            
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim, alamat, jurusan, univ.getNamaUniversitas());
            daftarMahasiswa.add(mahasiswa);// objek baru yang dibuat akan dimasukkan ke array 
            System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            lagi = scanner.nextLine().charAt(0);// charAt(0) untuk memastikan hanya huruf awal yang terbaca
        } while (lagi == 'Y' || lagi =='y');//loop untuk menanyakan mau input data lagi atau tidak
      
        scanner.close();
        // Pemanggilan method untuk mencetak hasil        
        System.out.println("Program selelsai dan data akan tertampil");
        System.out.println("\nDaftar Mahasiswa di " + univ.getNamaUniversitas() + ":");
        int a = 0;
        while (a < daftarMahasiswa.size()) {
            Mahasiswa m = daftarMahasiswa.get(a);
            System.out.println("Nama: " + m.getNama());
            System.out.println("NIM: " + m.getNim());
            System.out.println("Alamat: " + m.getAlamat());
            System.out.println("Jurusan: " + getJurusan(m.getJurusan()));
            System.out.println();
            a++;
        }
    }
    // Metode untuk mendapatkan nama jurusan berdasarkan kode jurusan
    private static String getJurusan(int jurusan) {
        switch (jurusan) {//konversi kode jurusan ke nama jurusan
            case 41:
                return "Teknik Informatika";
            case 42:
                return "Teknik Industri";
            case 43:
                return "Teknik Elektro";
            case 44:
                return "Sistem Informasi";
            case 48:
                return "Teknik Mesin";
            case 49:
                return "Teknik Mekatronika";
            default:
                return "Jurusan tidak valid";
        }
    }
} 

