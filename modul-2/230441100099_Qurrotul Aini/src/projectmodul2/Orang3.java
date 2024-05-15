package projectmodul2;
import java.util.Scanner;

public class Orang3 {

    public static void main(String[] args) {
        String Mengulang = "Y";
        
        while (Mengulang.equals("Y")) {
            Scanner input = new Scanner(System.in); 
            System.out.println("=============================");
            System.out.println("    Masukkan Data Mahasiswa  ");
            System.out.println("=============================");
            System.out.print("Universitas : "); 
            String universitas = input.nextLine();
            System.out.print("NIM : "); 
            String nim = input.nextLine();
            System.out.print("Nama : "); 
            String nama = input.nextLine();
            System.out.print("Alamat : "); 
            String alamat = input.nextLine();
            
            System.out.println("=====DAFTAR JURUSAN=====");
            System.out.println("41. TEKNIK INFORMATIKA");
            System.out.println("42. TEKNIK INDUSTRI");
            System.out.println("43. TEKNIK ELEKTRO");
            System.out.println("44. SISTEM INFORMASI");
            System.out.println("48. TEKNIK MESIN");
            System.out.println("49. TEKNIK MEKATRONIKA");
            System.out.print("Isi sesuai kode jurusan : ");
            String jurusan = input.nextLine();
            System.out.println(" ");  
            
            Orang2 mhs = new Orang2(universitas, nim, nama, alamat, jurusan);
            mhs.printData();
            
            System.out.println("Mengulang lagi? (Y untuk ya dan T untuk tidak)");
            System.out.print("Masukkan pilihan : ");
            Mengulang = input.nextLine();
        }
        System.out.println("===========================");
        System.out.println(" Terimakasih ");
        System.out.println("===========================");
 
    }
}