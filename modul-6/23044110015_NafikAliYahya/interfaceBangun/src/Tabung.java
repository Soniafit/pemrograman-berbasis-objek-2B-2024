class Tabung extends BangunRuang implements JariJari, Tinggi {
    private double jariJari;
    private double tinggi;

    Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    void info() {
        System.out.println("Tabung dengan jari-jari " + jariJari + " dan tinggi " + tinggi);
    }
}
