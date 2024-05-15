package KTP.ktp;

public class Main {
    public static void main(String[] args) {
        IsiKtp ktp = new IsiKtp();
        ktp.set_Nik(3);
        ktp.set_Nama(123456789); 
        ktp.set_TTl(19900101); 
        ktp.set_JenisKelamin(1); 
        ktp.set_Alamat(123456789); 
        ktp.set_Agama(1); 
        ktp.set_Status(1); 
        ktp.set_Pekerjaan(1); 
        ktp.set_Kewarganegaraan(1); 
        ktp.set_MasaBerlaku(20250101); 

        ktp.tampil();
    }
}
