class Balok extends BangunRuang implements Lebar, Tinggi {
    private double panjang;
    private double lebar;
    private double tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    void info() {
        System.out.println("Balok dengan panjang " + panjang + ", lebar " + lebar + ", dan tinggi " + tinggi);
    }
}
