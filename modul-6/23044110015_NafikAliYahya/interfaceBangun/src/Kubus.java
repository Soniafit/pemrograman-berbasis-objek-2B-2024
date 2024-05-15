class Kubus extends BangunRuang implements Lebar, Tinggi {
    private double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    public double getLebar() {
        return sisi;
    }

    public double getTinggi() {
        return sisi;
    }

    void info() {
        System.out.println("Kubus dengan sisi " + sisi);
    }
}
