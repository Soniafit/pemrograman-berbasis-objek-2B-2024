import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {

    String universitas;
    String nama;
    String nim;
    String jurusan;
    String kodejurursan;


    // constructor dengan argumen guys
    public Mahasiswa(String universitas, String nama, String nim, String jurusan,String kodejurusan){
        this.universitas = universitas;
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.kodejurursan = kodejurusan;
        
    }

    public void setUniversitas(String universitas){
        this.universitas = universitas;
    }

    public String getUniversitas(){
        return this.universitas;
    }
    public static void main(String[] args) {  //ini adalah main method (kata rehan)
              
        Scanner input = new Scanner(System.in); 
       ArrayList <Mahasiswa> tambah = new ArrayList<>(); //ini adalah array list untuk menampung data mahasiswa
       String masukan; // ini adalah variabel untuk menampung inputan ya atau tidak


       while (true) {
        
        System.out.print("Masukkan Universitas : ");
        String universitas = input.nextLine();
        
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();


        System.out.println("Masukkan kode jurusan : ");
        System.out.println("41 = Teknik Informatika");
        System.out.println("42 = Teknik Industri");
        System.out.println("43 = Teknik Elektro");
        System.out.println("44 = Sistem  Informasi");
        System.out.println("48 = Teknik Mesin");
        System.out.println("49 = Teknik Mekatronika");
        String kodejurusan = input.nextLine();

        String jurusan;

        switch (kodejurusan) {
            case "41":
            jurusan = "Teknik Informatika";
            break;
            case "42":
             jurusan = "Teknik Industri";
            break;
            case "43":
            jurusan = "Teknik Elektro";
            break;
            case "44":
            jurusan = "Sistem Informasi";
            break;
            case "48":
            jurusan = "Teknik Mesin";
            break;
            case "49":
            jurusan = "Teknik Mekatronika";
            break;
            default:
            jurusan = "Jurusan tidak ditemukan";
            break;
        }      

        if (kodejurusan.equalsIgnoreCase("41") || kodejurusan.equalsIgnoreCase("42") || kodejurusan.equalsIgnoreCase("43") || kodejurusan.equalsIgnoreCase("44") || kodejurusan.equalsIgnoreCase("48") || kodejurusan.equalsIgnoreCase("49")){
        }else {
            System.out.println("Kodejurusan" + " "+ kodejurusan+" " + "Tidak ditemukan");
        }
            
            System.out.println("Mau ngulang? (Y) :");
            masukan = input.nextLine();
            Mahasiswa mhs = new Mahasiswa(universitas,nama, nim, jurusan, kodejurusan); // ini adalah object mahasiswa
            tambah.add(mhs); // ini adalah menambahkan object mahasiswa ke array list
            if (masukan.equalsIgnoreCase("T")){ // ini adalah kondisi jika inputan tidak maka akan berhenti
                break;
            }
            }

        // Mahasiswa mhs = new Mahasiswa(universitas,nama, nim, jurusan, kodejurusan);
        for (Mahasiswa mhsw : tambah){
        System.out.println();
        System.out.println("Data Mahasiswa");
        System.out.println("Universitas :"+ mhsw.universitas);
        System.out.println("Nama : " + mhsw.nama);
        System.out.println("NIM : " + mhsw.nim);
        System.out.println("Jurusan : " + mhsw.jurusan);
        System.out.println();
        input.close();
        }
    }
}