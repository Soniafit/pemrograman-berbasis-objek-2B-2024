package modul.pkg5.pbo;

class Lingkaran extends BangunDatar {
    protected double jari;

    public Lingkaran(double Jari) {
        this.jari = Jari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    void hasil() {
        System.out.println("\nLingkaran dengan jari = " + jari);
    }
}
