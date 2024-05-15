package postes2;

public class Pelanggan extends ItemMenu{
    private String nama;
    private int meja;
    private String menuMakanan;

    public Pelanggan(String nama, int meja, String menuMakanan) {
        this.nama = nama;
        this.meja = meja;
        this.menuMakanan = menuMakanan;
    }

    @Override
    public String getMenuMakanan() {
        return menuMakanan;
    }

    public String getNama() {
        return nama;
    }

    public int getMeja() {
        return meja;
    }

    @Override
    public int getHarga() {
        return 0; // Tidak digunakan dalam kelas Pelanggan
    }
}

