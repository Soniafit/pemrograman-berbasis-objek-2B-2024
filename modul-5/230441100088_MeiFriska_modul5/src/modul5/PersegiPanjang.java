
package modul5;

public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getPanjang() {
        return panjang;
    }
     
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }
    
    @Override
    public void hitungLuas() {
        luas = panjang * lebar;
    }
    
    public void info() {
        System.out.println("Persegi Panjang");
        System.out.println("Panjang: " + getPanjang());
        System.out.println("Lebar: " + getLebar());
        System.out.println("Luas: " + getLuas());
    }
}