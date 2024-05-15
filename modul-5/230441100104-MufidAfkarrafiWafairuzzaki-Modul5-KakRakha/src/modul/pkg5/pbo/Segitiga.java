package modul.pkg5.pbo;

class Segitiga extends BangunDatar {
    protected double alas;
    protected double tinggi;

    public Segitiga(double Alas, double Tinggi) {
        this.alas = Alas;
        this.tinggi = Tinggi;
    }

    @Override
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    void hasil() {
        System.out.println("\nSegitiga dengan alas = " + alas);
        System.out.println("\nSegitiga dengan tinggi = " + tinggi);
    }
}
