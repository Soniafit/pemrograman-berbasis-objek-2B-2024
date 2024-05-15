package modul.pkg6.pbo;

class Kerucut extends BangunRuang implements Jari, Tinggi {
    protected double jari;
    protected double tinggi;

    public Kerucut(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    @Override
    public double jarijari() {
        return jari;
    }

    @Override
    public double tinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        return 1.0 / 3.0 * Math.PI * jari * jari * tinggi;
    }

    @Override
    public void info() {
        System.out.println("Kerucut dengan jari-jari = " + jari + " dan tinggi = " + tinggi);
    }
}
