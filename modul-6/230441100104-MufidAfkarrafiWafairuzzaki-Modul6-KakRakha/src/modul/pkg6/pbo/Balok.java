package modul.pkg6.pbo;

class Balok extends BangunRuang implements Panjang, Lebar, Tinggi {
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
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
    public double tinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public void info() {
        System.out.println("Balok dengan panjang = " + panjang + ", lebar = " + lebar + ", dan tinggi = " + tinggi);
    }
}