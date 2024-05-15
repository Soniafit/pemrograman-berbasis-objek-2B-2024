package pkg230441100071_anandaekawati_modul6;
class Kubus extends BangunRuang implements JariJari {
    double sisii;
//interfase jrjr
    Kubus(double sisi) {
        sisii = sisi;
    }
//atrbt sisi
    
    @Override
    double hitungVolume() {
        return sisii * sisii * sisii;
    }

    @Override
    public double getJariJari() {
        return sisii / 2;
    }

    // Getter dan Setter untuk sisi
    public double getSisi() {
        return sisii;
    }

    public void setSisi(double sisi) {
        this.sisii = sisi;
    }

    void info() {
        System.out.println("Kubus dengan sisi " + sisii);
    }
}