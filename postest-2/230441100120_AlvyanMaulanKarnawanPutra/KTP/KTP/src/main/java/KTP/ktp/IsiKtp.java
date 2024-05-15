package KTP.ktp;

public class IsiKtp extends KTP {
    private double nik, nama, ttl, jenisKelamin, alamat, agama, status, pekerjaan, kewarganegaraan, masaBerlaku;

    @Override
    protected void set_Nik(double nik) {
        this.nik = nik;
    }

    @Override
    protected void set_Nama(double nama) {
        this.nama = nama;
    }

    @Override
    protected void set_TTl(double ttl) {
        this.ttl = ttl;
    }

    @Override
    protected void set_JenisKelamin(double jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    protected void set_Alamat(double alamat) {
        this.alamat = alamat;
    }

    @Override
    protected void set_Agama(double agama) {
        this.agama = agama;
    }

    @Override
    protected void set_Status(double status) {
        this.status = status;
    }

    @Override
    protected void set_Pekerjaan(double pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    @Override
    protected void set_Kewarganegaraan(double kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    @Override
    protected void set_MasaBerlaku(double masaBerlaku) {
        this.masaBerlaku = masaBerlaku;
    }

    @Override
    protected double get_Nik() {
        return nik;
    }

    @Override
    protected double get_Nama() {
        return nama;
    }

    @Override
    protected double get_TTL() {
        return ttl;
    }

    @Override
    protected double get_JenisKelamin() {
        return jenisKelamin;
    }

    @Override
    protected double get_Alamat() {
        return alamat;
    }

    @Override
    protected double get_Agama() {
        return agama;
    }

    @Override
    protected double get_Status() {
        return status;
    }

    @Override
    protected double get_Pekerjaan() {
        return pekerjaan;
    }

    @Override
    protected double get_Kewarganegaraan() {
        return kewarganegaraan;
    }

    @Override
    protected double get_MasaBerlaku() {
        return masaBerlaku;
    }
    

    @Override
    protected void tampil() {
        System.out.println("=== Informasi KTP ===");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("TTL: " + ttl);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Agama: " + agama);
        System.out.println("Status: " + status);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Kewarganegaraan: " + kewarganegaraan);
        System.out.println("Masa Berlaku: " + masaBerlaku);
        
    }

    
}
