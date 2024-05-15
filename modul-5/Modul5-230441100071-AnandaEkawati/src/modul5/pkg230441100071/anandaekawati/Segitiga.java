package modul5.pkg230441100071.anandaekawati;
class Segitiga extends BangunDatar {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    protected double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
//0.5'setngh
    @Override
    protected void info() {
        System.out.println("Ini adalah segitiga dengan alas " + alas + " dan tinggi " + tinggi);
    }
}
