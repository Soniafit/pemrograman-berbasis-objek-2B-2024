package opbilanganabs;

public class OPBilanganabscetak {
    public static void main(String[]args) {
        OPPenjumlahan a;
        a = new OPPenjumlahan() {
            @Override
            protected void set_C(double c) {
            }
        };
        a.tampil();
        OPPengurangan b = new OPPengurangan() {
            @Override
            protected void set_C(double c) {
            }
        };
        b.tampil();
        OPPerkalian c = new OPPerkalian() {
            @Override
            protected void set_C(double c) {
            }
        };
        c.tampil();
        OPPembagian d = new OPPembagian() {
            @Override
            protected void set_C(double c) {
            }
        };
        d.tampil();
    }
}
