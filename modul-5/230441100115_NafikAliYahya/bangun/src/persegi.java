class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuas() {
        return sisi * sisi;
    }

    void info() {
        System.out.println("Persegi dengan sisi: " + sisi);
    }
}

