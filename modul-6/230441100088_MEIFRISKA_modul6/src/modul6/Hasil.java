
package modul6;

import java.util.Scanner;

public class Hasil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunRuang[] BangunRuang = new BangunRuang[4];
        
        System.out.println("Silakan pilih bangun Ruang:");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Tabung");
        System.out.println("4. kerucut");
        System.out.print("Masukkan Pilihan anda : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1 -> {
                BangunRuang[0] = Balok.balokInput();
                BangunRuang[0].info();
               BangunRuang[0].hitungvolume();
            }
            case 2 -> {
                BangunRuang[1] = Kubus.kubusInput(); 
                BangunRuang[1].info();
                BangunRuang[1].hitungvolume();
            }
            case 3 -> {
                BangunRuang[2] = Tabung.tabungInput();
                BangunRuang[2].info();
                BangunRuang[2].hitungvolume();
            }
            case 4 -> {
                BangunRuang[3] = Kerucut.kerucutInput(); 
                BangunRuang[3].info();
                BangunRuang[3].hitungvolume();
            }
            default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }
}