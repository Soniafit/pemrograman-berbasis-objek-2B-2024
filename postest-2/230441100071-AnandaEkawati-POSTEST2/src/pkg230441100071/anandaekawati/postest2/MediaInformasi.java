package pkg230441100071.anandaekawati.postest2;
abstract class MediaInformasi {
    protected String judul;
    protected String pengarang;
    protected int tahunTerbit;

    public MediaInformasi(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public abstract void displayInfo();
}
