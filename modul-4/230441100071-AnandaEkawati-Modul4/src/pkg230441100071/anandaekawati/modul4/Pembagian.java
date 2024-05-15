package pkg230441100071.anandaekawati.modul4;

class Pembagian extends OperasiMatematika {

    public Pembagian(double a, double b) {
        super(a, b);
    }

    @Override
    public double hasil() {
        return a / b;
    }

    @Override
    public String operasi() {
        return "Pembagian";
    }
}

