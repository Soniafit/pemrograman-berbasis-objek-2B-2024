
package modul6;
import java.util.Scanner;

public class Balok extends BangunRuang implements info{
    private final double panjang;
    private final double lebar;
    private final double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungvolume() {
        return panjang * lebar * tinggi;
    }
    
    public static Balok balokInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan panjang balok:");
        double panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar balok:");
        double lebar = scanner.nextDouble();
        System.out.println("Masukkan tinggi balok:");
        double tinggi = scanner.nextDouble();
        return new Balok(panjang,lebar,tinggi);
    }
    
    @Override
    public void info() {
        System.out.println("Balok dengan panjang = " + panjang );
        System.out.println("lebar" + lebar);
        System.out.println("tinggi" + tinggi);
        System.out.println("Volume : " + hitungvolume());
    }
}
