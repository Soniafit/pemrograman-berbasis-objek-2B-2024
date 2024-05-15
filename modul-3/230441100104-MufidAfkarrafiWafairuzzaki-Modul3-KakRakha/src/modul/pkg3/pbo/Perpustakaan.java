package modul.pkg3.pbo;

public class Perpustakaan extends Buku {
    
    public Perpustakaan(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, kategori, stok, tahunTerbit);
    }
    
    public String getKategoriString() {
        return switch (kategori) {
            case "SU", "su", "Su", "sU" -> "Semua Umur";
            case "D", "d" -> "Dewasa";
            case "R", "r" -> "Remaja";
            case "A", "a" -> "Anak-anak";
            default -> "Kategori tidak valid";
        };
    }
    
    public void displayInfo() {
        System.out.println("Judul : " + getJudul());
        System.out.println("Penulis : " + getPenulis());
        System.out.println("Publisher : " + getPublisher());
        System.out.println("Kategori : " + getKategoriString());
        System.out.println("Stok : " + getStok());
        System.out.println("Tahun Terbit : " + getTahunterbit());
        System.out.println();
    }
}
