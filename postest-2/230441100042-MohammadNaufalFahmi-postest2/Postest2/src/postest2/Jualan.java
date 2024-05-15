/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postest2;

import java.util.Scanner;
/**
 *
 * @author THINKPAD
 */
public class Jualan {
    static Scanner input = new Scanner(System.in);
    static String namaKasir;
    static barangnya[] barangnya;
    static float jumlahBayar = 0;
    static double diskon = 0, PPN = 0, hargaDiskon = 0, biayaKartu = 0, totalBayar;
    static int Pembayaran = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukan Nama Kasir : ");
        namaKasir = input.nextLine();

        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Masukan pilihan : ");
            pilihan = input.nextInt();
            prosesMenu(pilihan);
        } while (pilihan != 3);
    }
    static void tampilkanMenu() {
        System.out.println("\nSilahkan pilih Menu transaksi :");
        System.out.println("1. Input data penjualan");
        System.out.println("2. Pembayaran");
        System.out.println("3. Keluar Program");
    }
    static void prosesMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                inputDataPenjualan();
                break;
            case 2:
                prosesPembayaran();
                break;
            case 3:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
    static void inputDataPenjualan() {
        System.out.print("Masukan jumlah barang yang dibeli : ");
        int jumlahBarang = input.nextInt();
        barangnya = new barangnya[jumlahBarang];
        for (int i = 0; i < barangnya.length; i++) {
            System.out.println("Barang ke : " + (i + 1));
            barangnya[i] = new barangnya();
            System.out.print("Masukan kode barang : ");
            barangnya[i].setKode(input.next());
            System.out.print("Masukan nama barang : ");
            barangnya[i].setNama(input.next());
            System.out.print("Masukan harga barang : ");
            barangnya[i].setHarga(input.nextFloat());
            System.out.print("Masukan jumlah beli : ");
            barangnya[i].setJumlahPembelian(input.nextInt());
            jumlahBayar += barangnya[i].getBayar();
        }
    }
    static void prosesPembayaran() {
        System.out.println("\nDATA PENJUALAN BARANG");
        System.out.println("PT. PEMULANG TAMA");
        System.out.println("Nama Kasir : " + namaKasir);
        System.out.println("================================================================================");
        System.out.println("No. \tKode Barang \tNama Barang \tHarga Barang \tJumlah Beli \tBayar");
        System.out.println("================================================================================");
        for (int i = 0; i < barangnya.length; i++) {
            System.out.println((i + 1) + "\t" + barangnya[i].getKode() + "\t" + "\t" + barangnya[i].getNama() + "\t" + "\t" + barangnya[i].getHarga() + "\t" + "\t" + barangnya[i].getJumlahPembelian() + "\t" + "\t" + barangnya[i].getBayar());
        }
        System.out.println("================================================================================");
        System.out.println("Jumlah Bayar \t\t: Rp." + jumlahBayar);
        
        // Perhitungan diskon
        if (jumlahBayar >= 500000) {
            hargaDiskon = jumlahBayar * 0.05;
        }
        System.out.println("Diskon \t\t\t: Rp. " + hargaDiskon);

        // Perhitungan PPN
        PPN = jumlahBayar * 0.1;
        System.out.println("PPN \t\t\t: Rp. " + PPN);

        // Metode pembayaran
        System.out.println("\nMetode pembayaran yang tersedia :");
        System.out.println("1. Visa/Master");
        System.out.println("2. Debit");
        System.out.println("3. Cash");
        System.out.print("Masukan pilihan pembayaran: ");
        Pembayaran = input.nextInt();
        
        // Biaya kartu
        switch (Pembayaran) {
            case 1:
                biayaKartu = 0.03 * jumlahBayar;
                System.out.println("Visa-Master \tBiaya Kartu : Rp." + biayaKartu);
                break;
            case 2:
                biayaKartu = 0;
                System.out.println("Debit \tBiaya Kartu : Rp.-");
                break;
            case 3:
                biayaKartu = 0;
                System.out.println("Cash \tBiaya Kartu : Rp.-");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        totalBayar = jumlahBayar - diskon + PPN + biayaKartu;
        System.out.println("Total Bayar \t\t: Rp." + totalBayar);
    }
}

