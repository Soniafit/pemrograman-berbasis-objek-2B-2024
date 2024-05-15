//Object
package javaapplication3;

/**
 *
 * @author Muhammad Yusri
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Perpustakaan perpustakaan = new Perpustakaan("Judul Buku", "Penulis Buku", "Penerbit Buku", "SU", 10, 2023);
        perpustakaan.entryBuku();
        perpustakaan.viewDaftarBuku();
    }
}