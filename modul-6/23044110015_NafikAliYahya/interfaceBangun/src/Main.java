public class Main {
    public static void main(String[] args) {
        BangunRuang[] bangunRuangs = new BangunRuang[4];
        bangunRuangs[0] = new Kubus(5);
        bangunRuangs[1] = new Balok(3, 4, 5);
        bangunRuangs[2] = new Tabung(2, 7);
        bangunRuangs[3] = new Kerucut(3, 6);

        for (BangunRuang bangunRuang : bangunRuangs) {
            if (bangunRuang instanceof Kubus) {
                Kubus kubus = (Kubus) bangunRuang;
                kubus.info();
            } else if (bangunRuang instanceof Balok) {
                Balok balok = (Balok) bangunRuang;
                balok.info();
            } else if (bangunRuang instanceof Tabung) {
                Tabung tabung = (Tabung) bangunRuang;
                tabung.info();
            } else if (bangunRuang instanceof Kerucut) {
                Kerucut kerucut = (Kerucut) bangunRuang;
                kerucut.info();
            }

            System.out.println("Volume: " + bangunRuang.hitungVolume());
        }
    }
}
