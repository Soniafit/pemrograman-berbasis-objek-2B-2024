/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasm5run;
import java.util.Scanner;

/**
 *
 * @author THINKPAD
 */
public class TugasM5Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        BangunDatar[] bd = new BangunDatar[4];
        
        int pilihan;
        
        for(int i = 0; i < bd.length; i++) {
            do{
                System.out.println("\nPilih Bangun Datar:");
                System.out.println("1. Persegi Panjang");
                System.out.println("2. Segitiga");
                System.out.println("3. Persegi");
                System.out.println("4. Lingkaran");
                System.out.println("5. Keluar");
                System.out.print("Masukkan pilihan Anda (1-5): ");
                pilihan = input.nextInt();
                if (pilihan < 1 || pilihan > 5) {
                    System.out.println("\nPilihan tidak valid. Silakan masukkan nomor antara 1 dan 5.");
                }
            } while (pilihan < 1 || pilihan > 5);
//                BangunDatar bangunDatar = null;
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan panjang persegi panjang: ");
                        double panjang = input.nextDouble();
                        System.out.print("Masukkan lebar persegi panjang: ");
                        double lebar = input.nextDouble();
                        bd[i] = new PersegiPanjang(panjang, lebar);
                        break;
                    case 2:
                        System.out.print("Masukkan alas segitiga: ");
                        double alas = input.nextDouble();
                        System.out.print("Masukkan tinggi segitiga: ");
                        double tinggi = input.nextDouble();
                        bd[i] = new Segitiga(alas, tinggi);
                        break;
                    case 3:
                        System.out.print("Masukkan sisi persegi: ");
                        double sisi = input.nextDouble();
                        bd[i] = new Persegi(sisi);
                        break;
                    case 4:
                        System.out.print("Masukkan jari - jari lingkaran: ");
                        double jarijari = input.nextDouble();
                        bd[i] = new Lingkaran(jarijari);
                        break;
                }
                if (bd[i] != null) {
                bd[i].infoBD();
            }

//                if (bangunDatar != null) {
//                    bangunDatar.infoBD();
//                }
                // Opsi pengguna apakah ingin melakukan perhitungan lagi
                char jawaban;
                do {
                    System.out.print("\nApakah Anda ingin melakukan perhitungan lagi? (Y/N): ");
                    jawaban = input.next().toUpperCase().charAt(0); // Ambil huruf pertama dari jawaban
                    if (jawaban != 'Y' && jawaban != 'N') {
                        System.out.println("Pilihan tidak valid. Silakan masukkan 'Y' untuk Ya atau 'N' untuk Tidak.");
                    }
                } while (jawaban != 'Y' && jawaban != 'N');

                if (jawaban == 'N') {
                    System.out.println("Terima kasih telah menggunakan program.");
                    break; // mengakhiri program jika jawaban adalah 'N'
                }
           }
        input.close();
    }
}