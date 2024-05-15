
package com.example;

import java.util.Scanner;

/**
 *
 * @author Muhammad Yusri
 */
public class Praktikum1_no2 {

    public static void main(String[] args) {

        // Deklarasi variabesdfgl
        String nama;
        String NIM;
        String prodi;
        String alamat;

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner pemasok = new Scanner(System.in);

        // Contoh membaca input string dari pengguna
        System.out.print("Masukkan nama anda: ");
        nama = pemasok.nextLine();
        
        System.out.print("Masukkan NIM anda: ");
        NIM = pemasok.nextLine();
        
        // pemasok.nextLine();
        
        System.out.print("Masukkan prodi anda: ");
        prodi = pemasok.nextLine();
        
        System.out.print("Masukkan alamat anda: ");
        alamat = pemasok.nextLine();
        System.out.println();
        
        // Output input yang diterima dari pengguna
        
        System.out.println("Nama Anda adalah: " + nama);
        System.out.println("NIM anda adalah: "+ NIM);
        System.out.println("Prodi anda adalah: "+ prodi);
        System.out.println("Alamat anda adalah: "+ alamat);
        System.out.println();
    }
}


//     public static void main(String[] args): Ini adalah metode utama (main method) yang merupakan titik awal eksekusi setiap aplikasi Java.
// Scanner pemasok = new Scanner(System.in);: Membuat objek Scanner baru dengan nama pemasok. Objek ini digunakan untuk membaca input dari pengguna melalui command line.
// System.out.print("Masukkan nama anda: ");: Menampilkan teks "Masukkan nama anda: " ke pengguna tanpa membuat baris baru.
// String nama = pemasok.nextLine();: Membaca input baris berikutnya yang diberikan oleh pengguna dan menyimpannya dalam variabel nama.
// Proses yang sama diulangi untuk membaca NIM, prodi, dan alamat dari pengguna.
// System.out.println();: Mencetak baris kosong sebagai pemisah.
// System.out.println("Nama Anda adalah: " + nama);: Menampilkan nama yang dimasukkan oleh pengguna.
// Proses yang sama diulangi untuk menampilkan NIM, prodi, dan alamat yang telah dimasukkan oleh pengguna.


// mencoba update