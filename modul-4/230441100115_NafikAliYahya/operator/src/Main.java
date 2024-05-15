public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        OperasiPenjumlahan operasiPenjumlahan = new OperasiPenjumlahan();
        operasiPenjumlahan.setA(9.25);
        operasiPenjumlahan.setB(1.25);
        operasiPenjumlahan.setC();
        operasiPenjumlahan.tampil();

        OperasiPengurangan operasiPengurangan = new OperasiPengurangan();
        operasiPengurangan.setA(9.25);
        operasiPengurangan.setB(1.25);
        operasiPengurangan.setC();
        operasiPengurangan.tampil();

        OperasiPerkalian operasiPerkalian = new OperasiPerkalian();
        operasiPerkalian.setA(9.25);
        operasiPerkalian.setB(1.25);
        operasiPerkalian.setC();
        operasiPerkalian.tampil();

        OperasiPembagian operasiPembagian = new OperasiPembagian();
        operasiPembagian.setA(9.25);
        operasiPembagian.setB(1.25);
        operasiPembagian.setC();
        operasiPembagian.tampil();
    }
}