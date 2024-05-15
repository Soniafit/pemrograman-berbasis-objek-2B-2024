package perpustakaan;

public class Buku {
     String judul;
    String penulis;
    String publisher;
    String kategori;
    int stok;
    int tahun;

    public Buku(String judul, String penulis, String publisher, String kategori, int stok, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahun = tahun;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + publisher);
        System.out.println("Kategori: "+kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
}
