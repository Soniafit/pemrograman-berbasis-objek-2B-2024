package perpustakaan;

public class Kategori {
     static class SemuaUmur extends Buku {
        public SemuaUmur(String judul, String penulis, String publisher, int stok, int tahun) {
            super(judul, penulis, publisher,"SU", stok, tahun);
        }
        public void tampilkanInfo(){
        System.out.println("Kategori: SEMUA UMUR");
        super.tampilkanInfo();
        }
    }

    static class Dewasa extends Buku {
        public Dewasa(String judul, String penulis, String publisher, int stok, int tahun) {
            super(judul, penulis, publisher, "D", stok, tahun);
        }
        public void tampilkanInfo(){
        System.out.println("Kategori: DEWASA");
        super.tampilkanInfo();
        }
    }

    static class Remaja extends Buku {
        public Remaja(String judul, String penulis, String publisher, int stok, int tahun) {
            super(judul, penulis, publisher, "R", stok, tahun);
        }
        public void tampilkanInfo(){
        System.out.println("Kategori: REMAJA");
        super.tampilkanInfo();
        }
    }

    static class AnakAnak extends Buku {
        public AnakAnak(String judul, String penulis, String publisher, int stok, int tahun) {
            super(judul, penulis, publisher, "A", stok, tahun);
        }
        public void tampilkanInfo(){
        System.out.println("Kategori: ANAK-ANAK" );
        super.tampilkanInfo();
        }
    }
}
