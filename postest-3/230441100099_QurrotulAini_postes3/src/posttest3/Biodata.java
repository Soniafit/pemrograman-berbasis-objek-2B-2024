package posttest3;

public class Biodata implements Dietable, BioData_1 {
    // Atribut
    String Nama, Tanggal;
    int Umur;
    double BeratBadan;

    // Constructor
    public Biodata(String Nama, int Umur, String Tanggal, double BeratBadan) {
        this.Nama = Nama;
        this.Umur = Umur;
        this.Tanggal = Tanggal;
        this.BeratBadan = BeratBadan;
    }

    // Implementasi method dari interface Dietable
    @Override
    public void diet() {
        System.out.println(Nama + " memulai diet");
    }

    // Implementasi method dari interface BioData
    @Override
    public String getNama() {
        return Nama;
    }

    @Override
    public int getUmur() {
        return Umur;
    }

    @Override
    public String getTanggal() {
        return Tanggal;
    }

    @Override
    public double getBeratBadan() {
        return BeratBadan;
    }

    // Method Tambahan
    public void diet2() {
        System.out.println("Dia mulai menjaga pola makannya");
    }

    public void diet3() {
        System.out.println("Dia juga rutin berolahraga");
    }

    public void diet4() {
        System.out.println("Akhirnya " + this.Nama + " berhasil, berat badan nya turun drastis");
    }

    public static void main(String[] args) {
        Biodata Kania = new Biodata("Kania", 19, "14 Desember 2023", 67.5);
        Biodata Kania2 = new Biodata("Kania", 19, "15 Desember 2023", 67.5);
        Biodata Kania3 = new Biodata("Kania", 19, "20 Januari 2024", 62.0);
        Biodata Kania4 = new Biodata("Kania", 19, "24 Juni 2024", 49.5);

        System.out.println("Nama : " + Kania.getNama());
        System.out.println("Umur : " + Kania.getUmur());
        System.out.println("Tanggal : " + Kania.getTanggal());
        System.out.println("Berat Badan : " + Kania.getBeratBadan());
        Kania.diet();
        System.out.println();
        System.out.println("Tanggal : " + Kania2.getTanggal());
        Kania2.diet2();
        System.out.println("Berat Badan : " + Kania2.getBeratBadan());
        System.out.println();
        System.out.println("Tanggal : " + Kania3.getTanggal());
        Kania3.diet3();
        System.out.println("Berat Badan : " + Kania3.getBeratBadan());
        System.out.println();
        System.out.println("Tanggal : " + Kania4.getTanggal());
        Kania4.diet4();
        System.out.println("Berat Badan : " + Kania4.getBeratBadan());
    }
}