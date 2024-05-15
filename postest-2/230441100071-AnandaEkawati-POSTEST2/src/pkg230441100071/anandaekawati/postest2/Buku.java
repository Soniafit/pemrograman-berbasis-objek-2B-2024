package pkg230441100071.anandaekawati.postest2;
class Buku extends MediaInformasi {
    private static int jumlahBuku = 0;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        super(judul, pengarang, tahunTerbit);
        jumlahBuku++;
    }

    public static int getJumlahBuku() {
        return jumlahBuku;
    }

   @Override
    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("");
    }
    public static void main(String[] args) {
       
        Buku buku1 = new Buku("Matahari Minor", "Tere Liye", 2022);
        
        Buku buku2 = new Buku("Nebula", "Tere Liye", 2020);
        
        Buku buku3 = new Buku("Sagaras", "Tere Liye", 2020);
        
        Buku buku4 = new Buku("Komet", "Tere Liye", 2018);

        Buku buku5 = new Buku("Selena", "Tere Liye", 2020);


        buku1.displayInfo();
        buku2.displayInfo();
        buku3.displayInfo();
        buku4.displayInfo();
        buku5.displayInfo();

        System.out.println("Jumlah buku: " + Buku.getJumlahBuku());
    }
}
