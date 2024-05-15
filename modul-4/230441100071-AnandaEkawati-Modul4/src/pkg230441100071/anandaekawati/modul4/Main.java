package pkg230441100071.anandaekawati.modul4;
public class Main {

    public static void main(String[] args) {
        double a = 9.25;
        double b = 1.25;

        OperasiMatematika[] operasi = {
            new Penjumlahan(a, b),
            new Pengurangan(a, b),
            new Perkalian(a, b),
            new Pembagian(a, b)
        };

        for (OperasiMatematika op : operasi) {
            System.out.println(op.operasi() + ": " + op.hasil());
        }
    }
}

