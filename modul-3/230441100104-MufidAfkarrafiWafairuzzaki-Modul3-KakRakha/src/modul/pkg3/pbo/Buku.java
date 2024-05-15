package modul.pkg3.pbo;

public class Buku {
    protected String judul;
    protected String penulis;
    protected String publisher;
    protected String kategori;
    protected int stok;
    protected int tahunTerbit;

    public Buku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;}
    
    public String getPenulis() {
        return penulis;}
    
    public String getPublisher() {
        return publisher;}
    
    public String getKategori() {
        return kategori;}
    
    public int getStok() {
        return stok;}
    
    public int getTahunterbit() {
        return tahunTerbit;}
}


