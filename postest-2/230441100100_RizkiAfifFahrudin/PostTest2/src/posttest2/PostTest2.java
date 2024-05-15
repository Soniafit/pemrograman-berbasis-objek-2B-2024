package posttest2;

import java.util.Scanner;

public class PostTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan a: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan bilangan b: ");
        double b = scanner.nextDouble();

        Tambah tambah = new Tambah();
        Kurang kurang = new Kurang();
        Kali kali = new Kali();
        Bagi bagi = new Bagi();

        tambah.set_a(a);
        tambah.set_b(b);
        kurang.set_a(a);
        kurang.set_b(b);
        kali.set_a(a);
        kali.set_b(b);
        bagi.set_a(a);
        bagi.set_b(b);

        System.out.println("Hasil Operasi:");
        tambah.tampilkan();
        kurang.tampilkan();
        kali.tampilkan();
        bagi.tampilkan();
    }
}
