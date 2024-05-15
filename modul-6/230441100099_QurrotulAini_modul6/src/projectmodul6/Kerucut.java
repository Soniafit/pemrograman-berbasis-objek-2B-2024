package projectmodul6;
import java.util.Scanner;

public class Kerucut extends BangunRuang implements info {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungvolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public void info() {
        System.out.println("Kerucut dengan jari-jari = " + jariJari + " dan tinggi = " + tinggi);
        System.out.println("Volume : " + hitungvolume());
    }
    
    public static Kerucut kerucutInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari jari tabung : ");
        double jarijari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung : ");
        double tinggi = scanner.nextDouble();
        return new Kerucut(jarijari,tinggi);
    }
}