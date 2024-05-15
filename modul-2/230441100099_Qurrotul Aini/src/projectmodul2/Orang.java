package projectmodul2;

public class Orang {
     static String universitas, nim, nama, alamat, jurusan;
    
    public static void setuniversitas(String universitas){
        Orang.universitas = universitas;
    }
    public static void setnim(String nim){
        Orang.nim = nim;
    } 
     public static void setnama(String nama){
        Orang.nama = nama;
    }
    public static void Setalamat(String alamat){
        Orang.alamat = alamat;
    }
    public static void Setjurusan(String jurusan){
        Orang.jurusan = jurusan;
    }
    
    public static String getuniversitas() {
        return universitas;
    }
    public static String getnim(){
        return nim;
    }
    public static String getnama(){
        return nama;
    }
    public static String getalamat(){
        return alamat;
    }
    public static String getjurusan(){
        return jurusan;
    }
}