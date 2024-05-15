class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    void info() {
        System.out.println("Lingkaran dengan jari-jari: " + jariJari);
    }
}

