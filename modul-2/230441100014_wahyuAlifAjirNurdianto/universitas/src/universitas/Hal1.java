//hal
package universitas;

public class Hal1 {
    private String nim;
    private String nama;
    private String alamat;
    private int jurusan;

    public Hal1(String nim, String nama, String alamat, int jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    } 
    // Getter dan setter
    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }


    public void setJurusan(int jurusan) {
        this.jurusan = jurusan;
    }

    public int getJurusan() {
        return jurusan;
    }
}
