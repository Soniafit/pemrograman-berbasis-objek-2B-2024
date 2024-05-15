package projectmodul6;
import java.util.Scanner;

public class Balok extends BangunRuang implements info{
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double hitungvolume() {
        return panjang * lebar * tinggi;
    }
    
    public static Balok balokInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang balok : ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar balok : ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok : ");
        double tinggi = scanner.nextDouble();
        return new Balok(panjang,lebar,tinggi);
    }
    
    public void info() {
        System.out.println("Balok dengan panjang = " + panjang + ", lebar = " + lebar + ", tinggi = " + tinggi);
        System.out.println("Volume : " + hitungvolume());
    }
}