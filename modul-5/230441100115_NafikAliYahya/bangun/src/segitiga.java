class Segitiga extends BangunDatar {
    double alas;
    double tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    void info() {
        System.out.println("Segitiga dengan alas: " + alas + " dan tinggi: " + tinggi);
    }
}
