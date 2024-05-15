package pkg230441100071_anandaekawati_modul6;
class Balok extends BangunRuang implements Lebar, Tinggi {
    double panjangg, lebarr, tinggii;

    Balok(double panjang, double lebar, double tinggi) {
        panjangg = panjang;
        lebarr = lebar;
        tinggii = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjangg * lebarr * tinggii;
    }

    @Override
    public double getLebar() {
        return lebarr;
    }

    @Override
    public double getTinggi() {
        return tinggii;
    }

    public double getPanjang() {
        return panjangg;
    }

    public void setPanjang(double panjang) {
        this.panjangg = panjang;
    }

    public void setLebar(double lebar) {
        this.lebarr = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggii = tinggi;
    }

    void info() {
        System.out.println("Balok dengan panjang " + panjangg + ", lebar " + lebarr + ", dan tinggi " + tinggii);
    }
}