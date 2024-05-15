package projectmodul5;

public class Lingkaran extends BangunDatar {
    protected double jariJari;

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }
    
    public void hitungLuas() {
        luas = Math.PI * jariJari * jariJari;
    }
    
    public void info() {
        System.out.println("Lingkaran");
        System.out.println("Jari-jari: " + getJariJari());
        System.out.println("Luas: " + getLuas());
    }
}