/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul2_230441100022;

/**
 *
 * @author lanny aprilia
 */

import java.util.ArrayList;
import java.util.Scanner;

// Parent class
class Person {
    private String universitas;
    private String nama;
    private String alamat;

    // Constructor
    public Person(String universitas, String nama, String alamat) {
        this.universitas = universitas;
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter dan setter untuk universitas
    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }
    
    // Getter dan setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

// Child class
class Mahasiswa extends Person {
    private String nim;
    private int jurusanKode;

    // Constructor
    public Mahasiswa(String universitas, String nama, String alamat, String nim, int jurusanKode) {
        super(universitas, nama, alamat);
        this.nim = nim;
        this.jurusanKode = jurusanKode;
    }

    // Getter dan setter untuk NIM
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Method untuk mendapatkan nama jurusan berdasarkan kode jurusan
    public String getNamaJurusan() {
        return switch (jurusanKode) {
            case 41 -> "Teknik Informatika";
            case 42 -> "Teknik Industri";
            case 43 -> "Teknik Elektro";
            case 44 -> "Sistem Informasi";
            case 48 -> "Teknik Mesin";
            case 49 -> "Teknik Mekatronika";
            default -> "Jurusan tidak valid";
        };
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("===================UNIVERSITAS===================");
        System.out.print("Masukkan nama Universitas : ");
        String universitas = scanner.nextLine();
        System.out.println("------------------------------=-------------------");

        do {
            System.out.println("============DATA MAHASISWA============");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            int jurusanKode;
            do {
                System.out.println("----DAFTAR JURUSAN----");
                System.out.println("41. TEKNIK INFORMATIKA");
                System.out.println("42. TEKNIK INDUSTRI");
                System.out.println("43. TEKNIK ELEKTRO");
                System.out.println("44. SISTEM INFORMASI");
                System.out.println("48. TEKNIK MESIN");
                System.out.println("49. TEKNIK MEKATRONIKA");
                System.out.println("-----------------------");
                System.out.print("Kode Jurusan: ");
                jurusanKode = scanner.nextInt();
            } while (jurusanKode < 41 || jurusanKode > 49);
            scanner.nextLine();         

            // Membuat objek mahasiswa
            Mahasiswa mahasiswa = new Mahasiswa(universitas, nama, alamat, nim, jurusanKode);
            daftarMahasiswa.add(mahasiswa);

            System.out.println("Data mahasiswa berhasil dimasukkan.");
            System.out.println("--------------------------------------");

            System.out.print("Masukkan data mahasiswa lagi? (Y/T): ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("Y"));
        
        
        System.out.println("");
        System.out.println("Terima Kasih");

        // Menampilkan daftar mahasiswa
        System.out.println("\n------------Daftar Mahasiswa------------");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Universitas : " + mahasiswa.getUniversitas());
            System.out.println("--------------------------------------");
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Jurusan: " + mahasiswa.getNamaJurusan());
            System.out.println("-------------------------------------");
        }
    }
}

