
package modul6;
import java.util.Scanner;

public class Kerucut extends BangunRuang implements info {
    private final double jariJari;
    private final double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungvolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    public void info() {
        System.out.println("Kerucut dengan jari-jari = " + jariJari);
         System.out.println("tinggi" + tinggi);
        System.out.println("Volume : " + hitungvolume());
    }
    
    public static Kerucut kerucutInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari jari tabung:");
        double jarijari = scanner.nextDouble();
        System.out.println("Masukkan tinggi tabung:");
        double tinggi = scanner.nextDouble();
        return new Kerucut(jarijari,tinggi);
    }
}