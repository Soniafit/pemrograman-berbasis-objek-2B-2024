package post.test;

abstract class Furniture {
    protected String kelas;
    protected int jumlah;

    public Furniture(String kelas, int jumlah) {
        this.kelas = kelas;
        this.jumlah = jumlah;
    }

    public abstract String getType();

    public String getKelas() {
        return kelas;
    }
    
    public int getJumlah() {
        return jumlah;
    }

}
