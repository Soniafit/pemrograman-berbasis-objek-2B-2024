package pkg230441100071.anandaekawati.modul4;

class Pengurangan extends OperasiMatematika {

    public Pengurangan(double a, double b) {
        super(a, b);
    }

    @Override
    public double hasil() {
        return a - b;
    }

    @Override
    public String operasi() {
        return "Pengurangan";
    }
}
