/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasm6;
import java.util.Scanner;

/**
 *
 * @author THINKPAD
 */
public class TugasM6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        BangunRuang[] br = new BangunRuang[4];
        
        int pilihan;
        
        for(int i = 0; i < br.length; i++){
            do{
                System.out.println("Pilih bangun ruang:");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Tabung");
                System.out.println("4. Kerucut");
                System.out.println("5. Keluar");
                System.out.print("Masukkan pilihan Anda (1-5): ");
                pilihan = input.nextInt();
                if (pilihan < 1 || pilihan > 5) {
                    System.out.println("\nSilakan masukkan nomor antara 1 dan 5.");
                }
            }while (pilihan < 1 || pilihan > 5);
//            BangunRuang bangunRuang = null;
                switch (pilihan) {
                    case 1:
                        System.out.println("Masukkan sisi kubus:");
                        double sisiKubus = input.nextDouble();
                        br[i] = new kubus(sisiKubus);
    //                    bangunRuang = br[0];
                        break;
                    case 2:
                        System.out.println("Masukkan panjang balok:");
                        double panjangBalok = input.nextDouble();
                        System.out.println("Masukkan lebar balok:");
                        double lebarBalok = input.nextDouble();
                        System.out.println("Masukkan tinggi balok:");
                        double tinggiBalok = input.nextDouble();
                        br[i] = new balok(panjangBalok, lebarBalok, tinggiBalok);
    //                    bangunRuang = br[1];
                        break;
                    case 3:
                        System.out.println("Masukkan jari-jari tabung:");
                        double jariJariTabung = input.nextDouble();
                        System.out.println("Masukkan tinggi tabung:");
                        double tinggiTabung = input.nextDouble();
                        br[i] = new tabung(jariJariTabung, tinggiTabung);
    //                    bangunRuang = br[2];
                        break;
                    case 4:
                        System.out.println("Masukkan jari-jari kerucut:");
                        double jariJariKerucut = input.nextDouble();
                        System.out.println("Masukkan tinggi kerucut:");
                        double tinggiKerucut = input.nextDouble();
                        br[i] = new kerucut(jariJariKerucut, tinggiKerucut);
    //                    bangunRuang = br[3];
                        break;
                    case 5:
                        System.out.println("TERIMAKASIH BYEEE!!!!!");
                        return;
                }
                // Memanggil method info() dan hitungVolume() untuk bangun ruang yang dipilih
                if (br[i] != null){
                    br[i].info();
                    System.out.println("Volume: " + br[i].hitungVolume());
                }
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
