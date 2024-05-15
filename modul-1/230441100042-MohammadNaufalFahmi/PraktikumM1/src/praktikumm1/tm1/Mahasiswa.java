/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumm1.tm1;
import java.util.Scanner;
/**
 *
 * @author THINKPAD a
 */
public class Mahasiswa {
    String nama,prodi,alamat,nim;
    
    public void datanya_mahasiswa(){
        System.out.println("\n============''===========");
        System.out.println("Nama :"+ nama);
        System.out.println("Nim :"+ nim);
        System.out.println("Prodi :"+ prodi);
        System.out.println("Alamat :"+ alamat);
        System.out.println("============''===========");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // untuk membuat program yang dinamis menggunakan library Scanner untuk memasukkan inputan
        // membuat objek input yang diambil dari class Scanner
        Scanner input = new Scanner(System.in);
        
        // Membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        // Menambahkan inputan
        System.out.println("Masukkan nama mahasiswa : ");
        mahasiswa1.nama = input.nextLine();
        System.out.println("Masukkan nim : ");
        mahasiswa1.nim = input.nextLine();
        System.out.println("Masukkan prodi : ");
        mahasiswa1.prodi = input.nextLine();
        System.out.println("Masukkan alamat : ");
        mahasiswa1.alamat = input.nextLine();
        
        // manggil method
        mahasiswa1.datanya_mahasiswa();
    }    
}
