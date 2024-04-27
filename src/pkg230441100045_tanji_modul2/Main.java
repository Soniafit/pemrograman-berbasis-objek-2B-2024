/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100045_tanji_modul2;

/**
 *
 * @author Tanji
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Universitas: ");
        String namaUniv = scanner.nextLine();
        DataMahasiswa.setNamaUniv(namaUniv);
        
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        
        char pilihan;
        do {
            System.out.println("Masukkan data mahasiswa:");
            System.out.print("NIM: ");
            String nim = scanner.next();
            scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.println("Pilihan Jurusan:");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Jurusan (Kode): ");
            

            
            int pilihjurusan = scanner.nextInt();
            scanner.nextLine();
            
            String jurusan;
            switch (pilihjurusan) {
                case 41:
                    jurusan = "Teknik Informatika";
                    break;
                case 42:
                    jurusan = "Teknik Industri";
                    break;
                case 43:
                    jurusan = "Teknik Elektro";
                    break;
                case 44:
                    jurusan = "Sistem Informasi";
                    break;
                case 48:
                    jurusan = "Teknik Mesin";
                    break;
                case 49:
                    jurusan = "Teknik Mekatronika";
                    break;
                default:
                    jurusan = "masukkan code yang benar";
                    break;
                    
            }

            DataMahasiswa mahasiswa = new DataMahasiswa(nim, nama, alamat, jurusan);
            
            daftarMahasiswa.add(mahasiswa);
            
            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            pilihan = scanner.next().charAt(0);
            
        
            
            if (pilihan != 'Y' && pilihan != 'y' && pilihan != 'T' && pilihan != 't') {
                System.out.println("Input tidak valid. Silakan masukkan Y untuk lanjut atau T untuk berhenti.");
            
            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            pilihan = scanner.next().charAt(0);
            }
        } while (pilihan == 'Y' || pilihan == 'y');
         
        System.out.println("\nDaftar Mahasiswa di " + DataMahasiswa.getNamaUniv() + ":");
        for (Mahasiswa mhs : daftarMahasiswa) {
            mhs.TampilkanData();
            System.out.println();
        }
        
        scanner.close();
    }
}
