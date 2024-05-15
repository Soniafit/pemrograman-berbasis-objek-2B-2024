package modul.pkg4.pbo;

final class OperasiBilanganAbsCetak {
    private void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
        for (OperasiBilanganAbs operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C();
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
        OperasiBilanganAbs[] operasi = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        double bilanganA = 9.25;
        double bilanganB = 1.25;

        new OperasiBilanganAbsCetak().cetakSemua(operasi, bilanganA, bilanganB);
    }
}
