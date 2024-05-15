
package modul6;
import java.util.Scanner;

public class Kubus extends BangunRuang implements info{
    private final double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungvolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public void info() {
        System.out.println("Kubus dengan sisi = " + sisi);
        System.out.println("Volume : " + hitungvolume());
    }
    public static Kubus kubusInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan sisi kubus:");
        double sisi = scanner.nextDouble();
        return new Kubus(sisi);
    }
}
