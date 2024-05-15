class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas() {
        return panjang * lebar;
    }

    void info() {
        System.out.println("Persegi Panjang dengan panjang: " + panjang + " dan lebar: " + lebar);
    }
}
