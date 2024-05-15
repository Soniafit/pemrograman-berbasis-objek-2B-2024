package com.example;


final class OperasiBilanganAbsCetak {
    private void CetakAjaBang (OperasiBilanganAbs[] OB, double a, double b) { 
// ini adalah method yang menerima array dari object dari class-class yang meng-extend class OperasiBilanganAbs,
// cetaksSemua adalah method yang menerima array dari object dari class-class yang meng-extend class OperasiBilanganAbs
        for (OperasiBilanganAbs operasi : OB) {  /// ini adalah foreach loop yang mengiterasi array dari object dari class-class yang meng-extend class OperasiBilanganAbs
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C();
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
        double a = 9.25;
        double b = 1.25;

        OperasiBilanganAbs[] operasi = { // ini adalah array of object yang diperoleh dari class-class yang meng-extend class OperasiBilanganAbs
            new OperasiPenjumlahan(),    // ini adalah object
            new OperasiPengurangan(),    // ini adalah object
            new OperasiPerkalian(),     // ini adalah object
            new OperasiPembagian()      // ini adalah object
        };

        OperasiBilanganAbsCetak Cetak = new OperasiBilanganAbsCetak(); // OperasiBilanganAbsCetak adalah class yang berisi method cetakSemua, cetak adalah object dari class OperasiBilanganAbsCetak
        System.out.println();
        Cetak.CetakAjaBang(operasi, a, b);
        System.out.println();

    }
}