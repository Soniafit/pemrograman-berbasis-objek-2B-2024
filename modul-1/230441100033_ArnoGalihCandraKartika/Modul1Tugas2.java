/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1.tugas2;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    long nim;
    String jurusan;
    String alamat;
    
    public void tampilkanData(){
       System.out.println("Nama :"+ nama);
       System.out.println("Nim :"+ nim);
       System.out.println("Jurusan :"+ jurusan);
       System.out.println("Alamat :"+ alamat);
    }
}

public class Modul1Tugas2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukkan nama :");
        mahasiswa.nama = input.nextLine();
        
        System.out.print("Masukkan nim :");
        mahasiswa.nim = input.nextLong();
        input.nextLine();
       
        System.out.print("Masukkan jurusan :");
        mahasiswa.jurusan = input.nextLine();
        
        System.out.print("Masukkan alamat :");
        mahasiswa.alamat = input.nextLine();
        
        System.out.println("\nMahasiswa");
        mahasiswa.tampilkanData();
    }
}