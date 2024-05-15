abstract class  Orang {
    String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract double hitungNilaiRataRata(); // Abstract method
}
