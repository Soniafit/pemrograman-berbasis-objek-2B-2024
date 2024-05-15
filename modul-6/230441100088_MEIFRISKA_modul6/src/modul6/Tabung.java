
package modul6;
import java.util.Scanner;

public class Tabung extends BangunRuang implements info {
    private final double jariJari;
    private final double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

   @Override // celass yang menimpa superclassnya
    public double hitungvolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    public void info() {
        System.out.println("Tabung dengan jari-jari = " + jariJari );
        System.out.println("tinggi" + tinggi);
        System.out.println("Volume : " + hitungvolume());
    }
    
    public static Tabung tabungInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari jari tabung:");
        double jarijari = scanner.nextDouble();
        System.out.println("Masukkan tinggi tabung:");
        double tinggi = scanner.nextDouble();
        return new Tabung(jarijari,tinggi);
    }
}