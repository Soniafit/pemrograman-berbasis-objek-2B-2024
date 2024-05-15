package pkg230441100071.anandaekawati.modul4;

class Penjumlahan extends OperasiMatematika {

    public Penjumlahan(double a, double b) {
        super(a, b);
    }

    @Override
    public double hasil() {
        return a + b;
    }

    @Override
    public String operasi() {
        return "Penjumlahan";
    }
}
