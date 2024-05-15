package pkg230441100071.anandaekawati.modul4;
abstract class OperasiMatematika {

    protected double a;
    protected double b;

    public OperasiMatematika(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double hasil();

    public abstract String operasi();
}
