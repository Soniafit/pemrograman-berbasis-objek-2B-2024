package pkg230441100071.anandaekawati.modul4;

class Perkalian extends OperasiMatematika {

    public Perkalian(double a, double b) {
        super(a, b);
    }

    @Override
    public double hasil() {
        return a * b;
    }

    @Override
    public String operasi() {
        return "Perkalian";
    }
}
