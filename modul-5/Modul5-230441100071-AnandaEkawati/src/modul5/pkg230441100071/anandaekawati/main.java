package modul5.pkg230441100071.anandaekawati;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//new objek baru
        
        BangunDatar bangun = null;
        double parameter1, parameter2;//menghtng luas
        int pilihan;//menyimpan input penguna
        
        do {
            System.out.println();
            System.out.println("Pilih jenis bangun datar yang ingin dihitung:");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1/2/3/4/5): ");
            System.out.println();
            pilihan = scanner.nextInt();//input, lalu objk ;
// swt - case, mnghtng luas dr input yg di piliih
            switch (pilihan) {
                case 1:
                    System.out.println();
                    System.out.print("Masukkan panjang persegi panjang: ");
                    parameter1 = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    parameter2 = scanner.nextDouble();
                    bangun = new PersegiPanjang(parameter1, parameter2);
                    if (bangun != null) {
                        bangun.info();
                        System.out.println("Luas: " + bangun.hitungLuas());
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Masukkan alas segitiga: ");
                    parameter1 = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    parameter2 = scanner.nextDouble();
                    bangun = new Segitiga(parameter1, parameter2);
                    if (bangun != null) {
                        bangun.info();
                        System.out.println("Luas: " + bangun.hitungLuas());
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Masukkan sisi persegi: ");
                    parameter1 = scanner.nextDouble();
                    bangun = new Persegi(parameter1);
                    if (bangun != null) {
                        bangun.info();
                        System.out.println("Luas: " + bangun.hitungLuas());
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    parameter1 = scanner.nextDouble();
                    bangun = new Lingkaran(parameter1);
                    if (bangun != null) {
                        bangun.info();
                        System.out.println("Luas: " + bangun.hitungLuas());
                    }
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Keluar dari program.");
                    System.exit(0); // Keluar dari program
                    break;
                default:
                    System.out.println();
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);
        
        scanner.close();
    }
}