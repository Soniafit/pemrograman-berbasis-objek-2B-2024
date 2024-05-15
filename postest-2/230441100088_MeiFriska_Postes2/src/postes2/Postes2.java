
package postes2;

import java.util.Scanner;

public class Postes2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mengulang = "ya";

        while (mengulang.equalsIgnoreCase("ya")) {
            System.out.println("=============================");
            System.out.println("       SETRUK PEMBELIAN      ");
            System.out.println("=============================");
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Meja : ");
            int meja = Integer.parseInt(input.nextLine());

            System.out.println("=====DAFTAR MENU=====");
            System.out.println("1. Ayam Geprek + Esteh - Rp. 20.000");
            System.out.println("2. Ayam Geprek + Es Jeruk - Rp. 22.000");
            System.out.println("3. Ayam Penyet + Esteh - Rp. 18.000");
            System.out.println("4. Ayam Penyet + Es Jeruk - Rp. 20.000");
            System.out.print("Pilih menu makanan (1/2/3/4): ");
            int menuMakananIndex = Integer.parseInt(input.nextLine());

            ItemMenu[] daftarMenu = {
                new Pesanan("Ayam Geprek + Esteh", 20000),
                new Pesanan("Ayam Geprek + Es Jeruk", 22000),
                new Pesanan("Ayam Penyet + Esteh", 18000),
                new Pesanan("Ayam Penyet + Es Jeruk", 20000)
            };

            int hargaTotal = 0;
            switch (menuMakananIndex) {
                case 1 -> hargaTotal += daftarMenu[0].getHarga();
                case 2 -> hargaTotal += daftarMenu[1].getHarga();
                case 3 -> hargaTotal += daftarMenu[2].getHarga();
                case 4 -> hargaTotal += daftarMenu[3].getHarga();
                default -> System.out.println("Menu tidak valid");
            }

            Pelanggan pelanggan = new Pelanggan(nama, meja, daftarMenu[menuMakananIndex - 1].getMenuMakanan());

            System.out.println(" ");
            System.out.println("==========Data Pelanggan==========");
            System.out.println("Nama : " + pelanggan.getNama());
            System.out.println("Meja : " + pelanggan.getMeja());
            System.out.println("Menu Makanan : " + pelanggan.getMenuMakanan());
            System.out.println("Total Harga: Rp. " + hargaTotal);
            System.out.println("==================================");

            System.out.println("Apakah ingin memesan lagi? (ya/tidak)");
            System.out.print("Masukkan pilihan : ");
            mengulang = input.nextLine();
        }
    } 
}

