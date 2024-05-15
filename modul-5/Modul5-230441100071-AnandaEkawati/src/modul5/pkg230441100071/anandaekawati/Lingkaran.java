package modul5.pkg230441100071.anandaekawati;
class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
//construktor
    @Override
    protected double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    protected void info() {
        System.out.println("Ini adalah lingkaran dengan jari-jari " + jariJari);
    }
}