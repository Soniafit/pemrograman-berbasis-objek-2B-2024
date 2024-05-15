package modul.pkg6.pbo;

class Tabung extends BangunRuang implements Jari, Tinggi {
    protected double jari;
    protected double tinggi;

    public Tabung(double jari, double tinggi) {
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
        return Math.PI * jari * jari * tinggi;
    }

    @Override
    public void info() {
        System.out.println("Tabung dengan jari-jari = " + jari + " dan tinggi = " + tinggi);
    }
}
