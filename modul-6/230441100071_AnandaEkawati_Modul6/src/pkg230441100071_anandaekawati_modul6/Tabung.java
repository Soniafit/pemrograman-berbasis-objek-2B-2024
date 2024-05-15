package pkg230441100071_anandaekawati_modul6;
class Tabung extends BangunRuang implements JariJari, Tinggi {
    double jariJarii, tinggii;

    Tabung(double jariJari, double tinggi) {
        jariJarii = jariJari;
        tinggii = tinggi;
    }

    @Override
    double hitungVolume() {
        return Math.PI * jariJarii * jariJarii * tinggii;
    }

    @Override
    public double getJariJari() {
        return jariJarii;
    }

    @Override
    public double getTinggi() {
        return tinggii;
    }

    public void setJariJari(double jariJari) {
        this.jariJarii = jariJari;
    }

    public void setTinggi(double tinggi) {
        this.tinggii = tinggi;
    }

    void info() {
        System.out.println("Tabung dengan jari-jari " + jariJarii + " dan tinggi " + tinggii);
    }
}