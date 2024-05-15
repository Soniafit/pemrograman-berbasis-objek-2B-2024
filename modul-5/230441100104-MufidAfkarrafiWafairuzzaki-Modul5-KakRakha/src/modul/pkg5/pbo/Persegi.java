package modul.pkg5.pbo;

class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi(double Sisi) {
        this.sisi = Sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    void hasil() {
        System.out.println("\nPersegi dengan sisi = " + sisi);
    }
}
