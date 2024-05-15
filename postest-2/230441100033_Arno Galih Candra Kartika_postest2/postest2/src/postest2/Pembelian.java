package postest1;

abstract class Transaksi {
    protected int idTransaksi;
    protected String namaPelanggan;
    protected double totalTransaksi;
    protected boolean sudahDibayar;

    public Transaksi(int id, String nama, double total, boolean sudahDibayar) {
        this.idTransaksi = id;
        this.namaPelanggan = nama;
        this.totalTransaksi = total;
        this.sudahDibayar = sudahDibayar;
    }

    public abstract void tampilkanDetail();

    public abstract void perbaruiStatusPembayaran(boolean sudahDibayar);

    public abstract double hitungDiskon(double persenDiskon);

    public abstract double hitungKembalian(double jumlahPembayaran);
}

public class Pembelian extends Transaksi {
    private static int jumlahPembelian = 0;

    public Pembelian(int id, String nama, double total, boolean sudahDibayar) {
        super(id, nama, total, sudahDibayar);
        jumlahPembelian++;
    }

    public static int JumlahPembelian() {
        return jumlahPembelian;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("ID Pembelian: " + idTransaksi);
        System.out.println("Nama Pembeli: " + namaPelanggan);
        System.out.println("Total Pembelian: Rp" + totalTransaksi);
        System.out.println("Status Pembayaran: " + (sudahDibayar ? "Sudah Dibayar" : "Belum Dibayar"));
    }

    @Override
    public void perbaruiStatusPembayaran(boolean sudahDibayar) {
        this.sudahDibayar = sudahDibayar;
        System.out.println("Status pembayaran pembelian " + idTransaksi + " diperbarui menjadi " + (sudahDibayar ? "Sudah Dibayar" : "Belum Dibayar"));
    }

    @Override
    public double hitungDiskon(double persenDiskon) {
        if (totalTransaksi > 1000) {
            return totalTransaksi * (persenDiskon / 100);
        } else {
            return 0;
        }
    }

    @Override
    public double hitungKembalian(double jumlahPembayaran) {
        if (jumlahPembayaran >= totalTransaksi) {
            return jumlahPembayaran - totalTransaksi;
        } else {
            System.out.println("Jumlah pembayaran kurang!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Pembelian pembelian1 = new Pembelian(1, "Arno", 1500, true);
        Pembelian pembelian2 = new Pembelian(2, "galih", 800, false);

        pembelian1.tampilkanDetail();
        System.out.println("Diskon yang didapat: Rp" + pembelian1.hitungDiskon(10));
        System.out.println("Kembalian: Rp" + pembelian1.hitungKembalian(2000));
        System.out.println();

        pembelian2.tampilkanDetail();
        System.out.println("Diskon yang didapat: Rp" + pembelian2.hitungDiskon(10));
        System.out.println("Kembalian: Rp" + pembelian2.hitungKembalian(1000));
        System.out.println();

        pembelian1.perbaruiStatusPembayaran(false);
        System.out.println();

        pembelian1.tampilkanDetail();

        System.out.println("Total jumlah pembelian: " + Pembelian.JumlahPembelian());
    }
}
