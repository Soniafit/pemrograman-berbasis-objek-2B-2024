package KTP.ktp;

public abstract class KTP {
    protected double Nik, Nama, TTL, JenisKelamin, Alamat, Agama, Status, Pekerjaan, Kewarganegaraan, MasaBerlaku;

    protected abstract void set_Nik(double nik);

    protected abstract void set_Nama(double nama);

    protected abstract void set_TTl(double ttl);

    protected abstract void set_JenisKelamin(double jeniskelamin);

    protected abstract void set_Alamat(double alamat);

    protected abstract void set_Agama(double agama);

    protected abstract void set_Status(double status);

    protected abstract void set_Pekerjaan(double pekerjaan);

    protected abstract void set_Kewarganegaraan(double kewarganegaraaan);

    protected abstract void set_MasaBerlaku(double masaberlaku);

    protected abstract double get_Nik();

    protected abstract double get_Nama();

    protected abstract double get_TTL();

    protected abstract double get_JenisKelamin();

    protected abstract double get_Alamat();

    protected abstract double get_Agama();

    protected abstract double get_Status();

    protected abstract double get_Pekerjaan();

    protected abstract double get_Kewarganegaraan();

    protected abstract double get_MasaBerlaku();

    protected abstract void tampil();
}
