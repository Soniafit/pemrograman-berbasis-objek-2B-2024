
//Parent Class
package javaapplication3;

/**
 *
 * @author Muhammad Yusri
 */
public class Buku {
    String judul;
    String penulis;
    String penerbit;
    String kategori;
    int stok;
    int tahunTerbit;

    public Buku(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }
    public String getJudul() {
    return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}