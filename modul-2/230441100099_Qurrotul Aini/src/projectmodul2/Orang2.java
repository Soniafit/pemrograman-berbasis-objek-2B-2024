package projectmodul2;

public class Orang2 {

    private final String universitas;
    private final String nim;
    private final String nama;
    private final String alamat;
    private final String jurusan;
    
    public Orang2(String universitas, String nim, String nama, String alamat, String jurusan) {
        this.universitas = universitas;
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }
    
    public void printData() {
        System.out.println("==========Data Mahasiswa==========");
        System.out.println("Universitas : " + universitas);
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        switch(jurusan) {
            case "41" -> System.out.println("Jurusan : TEKNIK INFORMATIKA");
            case "42" -> System.out.println("Jurusan : TEKNIK INDUSTRI");
            case "43" -> System.out.println("Jurusan : TEKNIK ELEKTRO");
            case "44" -> System.out.println("Jurusan : SISTEM INFORMASI");
            case "48" -> System.out.println("Jurusan : TEKNIK MESIN");
            case "49" -> System.out.println("Jurusan : TEKNIK MEKATRONIKA");
            default -> System.out.println("Jurusan : Tidak ada");
        }
        System.out.println("==================================");
    }
}