/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

public class DataMahasiswa extends Mahasiswa {
    private static final int MAX_MAHASISWA = 100;
    private static Mahasiswa[] daftarMahasiswa = new Mahasiswa[MAX_MAHASISWA];
    private static int jumlahMahasiswa = 0;

    public DataMahasiswa(String nim, String nama, String alamat, int jurusan) {
        super(nim, nama, alamat, jurusan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        
        boolean tambahData = true;
        while (tambahData) {
            System.out.println("Masukkan data mahasiswa:");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            
            System.out.println("Pilihan Jurusan:");
            System.out.println("41. Teknik Informatika");
            System.out.println("42. Teknik Industri");
            System.out.println("43. Teknik Elektro");
            System.out.println("44. Sistem Informasi");
            System.out.println("48. Teknik Mesin");
            System.out.println("49. Teknik Mekatronika");
            
            System.out.print("Masukkan Kode Jurusan: ");
            int kodeJurusan = Integer.parseInt(scanner.nextLine());
            if (isValidJurusan(kodeJurusan)) {
            
                Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, kodeJurusan);
                daftarMahasiswa[jumlahMahasiswa] = mahasiswa;
                jumlahMahasiswa++;
            } else {
                System.out.println("Kode jurusan tidak valid!");
            }

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("Y")) {
                tambahData = false;
            }
        }
        
        System.out.println("Nama Universitas: " + namaUniversitas);
        System.out.println("Data Mahasiswa yang Telah Dimasukkan:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("NIM: " + daftarMahasiswa[i].getNim());
            System.out.println("Nama: " + daftarMahasiswa[i].getNama());
            System.out.println("Alamat: " + daftarMahasiswa[i].getAlamat());
            System.out.println("Jurusan: " + Mahasiswa.getNamaJurusan(daftarMahasiswa[i].getJurusan()));
            System.out.println();
        }

        scanner.close();
    }

    private static boolean isValidJurusan(int kodeJurusan) {
        return kodeJurusan == 41 || kodeJurusan == 42 || kodeJurusan == 43 ||
               kodeJurusan == 44 || kodeJurusan == 48 || kodeJurusan == 49;
    }
}
