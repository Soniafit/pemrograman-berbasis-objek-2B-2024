class Kerucut extends BangunRuang implements JariJari, Tinggi {
    private double jariJari;
    private double tinggi;

    Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    double hitungVolume() {
        return (1.0/3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    void info() {
        System.out.println("Kerucut dengan jari-jari " + jariJari + " dan tinggi " + tinggi);
    }
}
