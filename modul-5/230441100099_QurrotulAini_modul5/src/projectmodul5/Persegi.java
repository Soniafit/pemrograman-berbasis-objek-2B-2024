package projectmodul5;

public class Persegi extends BangunDatar{
    protected double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
  }
    
    public double getSisi() {
        return sisi;
    }

    public void hitungLuas() {
         luas = sisi * sisi;
    }
    
    public void info() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + getSisi());
        System.out.println("Luas: " + getLuas());
    }
}