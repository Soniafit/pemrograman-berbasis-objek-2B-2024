/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumm1.tm1;

/**
 *
 * @author THINKPAD
 */
// Membuat class manusia
public class Manusia {
    String nama;
    int umur;
    char jenis_kelamin1 = 'L';
    char jenis_kelamin2 ='P';
    String alamat;
    
    // Membuat method berjalan dan berlari    
    public void berjalan(Integer berjalan){
        System.out.println(nama+" sedang berjalan selama " + berjalan+" menit");
    }
    public void berlari(Integer berlari){
        System.out.println(nama +" lalu berlari sejauh "+berlari+" KM");
    }
    // Membuat main class    
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat beberapa objek baru       
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        Manusia orang3 = new Manusia();
        
        // Mengisi data objek melalui atribut dan mengeprintnya        
        orang1.nama = "Isma";
        orang1.umur = 20;
        orang1.jenis_kelamin1='L';
        orang1.alamat = "Situbondo";
        System.out.println("Nama Orang 1 adalah :"+ orang1.nama);
        System.out.println("Umur  :"+ orang1.umur);
        System.out.println("Jenis kelamin :"+ orang1.jenis_kelamin1);
        System.out.println("Alamat :"+ orang1.alamat);
        orang1.berjalan(10);
        orang1.berlari(4);
        
        
        orang2.nama = "Kei";
        orang2.umur = 23;
        orang2.jenis_kelamin2 = 'P';
        orang2.alamat = "Jakarta";
        System.out.println("\nNama orang 2 adalah :"+ orang2.nama);
        System.out.println("Umur :"+ orang2.umur);
        System.out.println("Jenis kelamin :"+orang2.jenis_kelamin2);
        System.out.println("Alamat :"+orang2.alamat);
        // Memanggil method        
        orang2.berjalan(20);
        orang2.berlari(6);
        
        orang3.nama = "Rusdi";
        orang3.umur = 30;
        orang3.jenis_kelamin1 = 'L';
        orang3.alamat = "Jombang";
        System.out.println("\nNama orang 3 adalah "+ orang3.nama);
        System.out.println("Umur :"+orang3.umur);
        System.out.println("Jenis kelamin :"+orang3.jenis_kelamin1);
        System.out.println("Alamat :"+orang3.alamat);
        // Memanggil method        
        orang3.berjalan(5);
        orang3.berlari(3);
    }
}

