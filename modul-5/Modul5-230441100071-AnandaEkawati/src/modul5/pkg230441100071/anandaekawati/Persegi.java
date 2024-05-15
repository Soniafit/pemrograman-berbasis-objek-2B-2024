package modul5.pkg230441100071.anandaekawati;
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    protected double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah persegi dengan sisi " + sisi);
    }
}