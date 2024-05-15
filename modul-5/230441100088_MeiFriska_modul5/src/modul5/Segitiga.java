
package modul5;

public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    @Override
    public void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }
    
    public void info() {
        System.out.println("Segitiga");
        System.out.println("Alas: " + getAlas());
        System.out.println("Tinggi: " + getTinggi());
        System.out.println("Luas: " + getLuas());
    }
}
