package modul5.pkg230441100071.anandaekawati;
class PersegiPanjang extends BangunDatar {
    private final double panjang;
    private final double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    protected double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah persegi panjang dengan panjang " + panjang + " dan lebar " + lebar);
    }
}