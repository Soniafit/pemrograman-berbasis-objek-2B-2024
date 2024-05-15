package modul.pkg5.pbo;

class PersegiPanjang extends BangunDatar {
    protected double panjang;
    protected double lebar;

    public PersegiPanjang(double Panjang, double Lebar) {
        this.panjang = Panjang;
        this.lebar = Lebar;
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    void hasil() {
        System.out.println("\nPersegi Panjang dengan panjang = " + panjang);
        System.out.println("\nPersegi Panjang dengan lebar = " + lebar);
    }
}
