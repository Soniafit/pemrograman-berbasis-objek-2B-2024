package post.test;

class Kursi extends Furniture implements Panjang, Lebar{
    protected double panjang;
    protected double lebar;
    
    public Kursi(double lebar, double panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }

    @Override
    public double panjang() {
        return panjang;
    }

    @Override
    public double lebar() {
        return lebar;
    }
    
    @Override
    public double hitungLuas() {
        return 1.0/2.0 * panjang * lebar;
    }

    @Override
    public void kelas() {
        System.out.println("");
    }
    
    @Override
    public void info() {
        System.out.println("");
        System.out.println("Kursi dengan panjang = " + panjang);
        System.out.println("Kursi dengan lebar = " + lebar);
    }
}
