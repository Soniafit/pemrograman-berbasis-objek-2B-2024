/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamhs;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            String lanjut = "Y";
            while(lanjut.equals("Y")){
             Scanner input = new Scanner(System.in);
             
                System.out.println("======= INPUT DATA =======");
                System.out.print("UNIVERSITAS : ");
                String univ = input.nextLine();
                
                System.out.print("NIM         : ");
                String NIM = input.nextLine();
                
                System.out.print("NAMA        : ");
                String Nama = input.nextLine();
                
                System.out.print("ALAMAT      : ");
                String Alamat = input.nextLine();
                
                System.out.println("DAFTAR KODE JURUSAN :");
                System.out.println(" TEKNIK INFORMATIKA     [41]");
                System.out.println(" TEKNIK INDUSTRI        [42]");
                System.out.println(" TEKNIK ELEKTRO         [43]");
                System.out.println(" SISTEM INFORMASI       [44]");
                System.out.println(" TEKNIK MESIN           [48]");
                System.out.println(" TEKNIK MEKATRONIKA     [49]");
                System.out.print("KODE JURUSAN : ");
                String Jurusan = input.nextLine();
                
                // Membuat objek DataMhs
                DataMhs mahasiswa = new DataMhs(univ, NIM, Nama, Alamat, Jurusan);
                
                System.out.println("\n=======DATA MAHASISWA=======");
                System.out.println("UNIVERSITAS : " + mahasiswa.getUniv());
                System.out.println("NIM         : " + mahasiswa.getNIM());
                System.out.println("NAMA        : " + mahasiswa.getNama());
                System.out.println("ALAMAT      : " + mahasiswa.getAlamat());
                switch (mahasiswa.getJurusan()){
                case "41" -> System.out.println("JURUSAN     : TEKNIK INFORMATIKA");
                case "42" -> System.out.println("JURUSAN     : TEKNIK INDUSTRI");
                case "43" -> System.out.println("JURUSAN     : TEKNIK ELEKTRO");
                case "44" -> System.out.println("JURUSAN     : SISTEM INFORMASI");
                case "48" -> System.out.println("JURUSAN     : TEKNIK MESIN");
                case "49" -> System.out.println("JURUSAN     : TEKNIK MEKATRONIKASUT");
                default -> System.out.println("KODE JURUSAN TIDAK VALID");    
            }
                System.out.println("==========================================\n");
                
                System.out.println("APAKAH ANDA INGIN MEMASUKKAN DATA LAGI ?");
                System.out.println("1. YA [Y] \n2. TIDAK [T]");
                System.out.print("PILIHAN : ");
                lanjut = input.nextLine();
            }
            
            System.out.println("===============TERIMA KASIH===============");
        }
    }
