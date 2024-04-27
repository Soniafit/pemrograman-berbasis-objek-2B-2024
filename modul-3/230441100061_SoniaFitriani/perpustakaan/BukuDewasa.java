 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author sonia
 */
class BukuDewasa extends Buku {
    public BukuDewasa(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }

    // Override metode tampilkanInfo untuk mencakup informasi khusus dewasa jika diperlukan
//    @Override
//    public void tampilkanInfo() {
//        super.tampilkanInfo();
//        // Informasi tambahan yang khusus untuk buku dewasa dapat ditampilkan di sini
//    }
}

// Kelas turunan Buku untuk menangani buku anak-anak
class BukuAnak extends Buku {
    public BukuAnak(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }

    // Override metode tampilkanInfo untuk mencakup informasi khusus anak-anak jika diperlukan
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        // Informasi tambahan yang khusus untuk buku anak-anak dapat ditampilkan di sini
    }
}
    

