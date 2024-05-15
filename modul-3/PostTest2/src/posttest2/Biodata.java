package posttest2;

public class Biodata extends Person{
    //Constructor
    public Biodata(String Nama, int Umur, String Tanggal, double BeratBadan){
        super(Nama, Umur, Tanggal, BeratBadan);
    }

    // Implementasi Abstract Method
    public void diet() {
        System.out.println(Nama + " memulai diet");
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

        System.out.println("Nama : " + Kania.Nama);
        System.out.println("Umur : " + Kania.Umur);
        System.out.println("Tanggal : " + Kania.Tanggal);
        System.out.println("Berat Badan : " + Kania.BeratBadan);
        Kania.diet();
        System.out.println();
        System.out.println("Tanggal : " + Kania2.Tanggal);
        Kania2.diet2();
        System.out.println("Berat Badan : " + Kania2.BeratBadan);
        System.out.println();
        System.out.println("Tanggal : " + Kania3.Tanggal);
        Kania3.diet3();
        System.out.println("Berat Badan : " + Kania3.BeratBadan);
        System.out.println();
        System.out.println("Tanggal : " + Kania4.Tanggal);
        Kania4.diet4();
        System.out.println("Berat Badan : " + Kania4.BeratBadan);
    }
}