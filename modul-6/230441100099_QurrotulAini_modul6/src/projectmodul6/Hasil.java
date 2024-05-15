package projectmodul6;
import java.util.Scanner;

public class Hasil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunRuang[] BangunRuang = new BangunRuang[4]; // Array untuk menyimpan objek bangun datar
        
        System.out.println("============================");
        System.out.println("Silakan pilih bangun Ruang:");
        System.out.println("============================");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Tabung");
        System.out.println("4. kerucut");
        System.out.println("============================");
        System.out.println();
        System.out.print("Masukkan Pilihan anda (1-4) : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                BangunRuang[0] = Balok.balokInput();
                BangunRuang[0].info();
                BangunRuang[0].hitungvolume();
                break;
            case 2:
                BangunRuang[1] = Kubus.kubusInput(); 
                BangunRuang[1].info();
                BangunRuang[1].hitungvolume();
                break;
            case 3:
                BangunRuang[2] = Tabung.tabungInput();
                BangunRuang[2].info();
                BangunRuang[2].hitungvolume();
                break;
            case 4:
                BangunRuang[3] = Kerucut.kerucutInput(); 
                BangunRuang[3].info();
                BangunRuang[3].hitungvolume();
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                break;
        }
    }
}