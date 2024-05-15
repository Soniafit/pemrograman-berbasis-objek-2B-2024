package post.test;

class Meja extends Furniture implements Panjang, Lebar{
    protected double panjang;
    protected double lebar;
    
    public Meja(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
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
        return panjang * lebar;
    }
    
    @Override
    public void kelas() {
        System.out.println("");
    }

    @Override
    public void info() {
        System.out.println("");
        System.out.println("Meja dengan panjang = " + panjang);
        System.out.println("Meja dengan lebar = " + lebar);
    }
}
