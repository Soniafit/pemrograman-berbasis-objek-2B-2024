
import java.util.Scanner;

public class Mahasiswa2 {

    private static void add(Mahasiswa2 mhs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Mahasiswa2(String nama, int nim, double ipk) {
    }

    private static int jumlahMahasiswa = 0;

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.print("Masukkan nama mahasiswa: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM mahasiswa :" );
            int nim = scanner.nextInt();

            System.out.print("Masukkan IPK mahasiswa : ");
            double ipk = scanner.nextDouble();

            Orang orang; // Can hold Mahasiswa or other subclasses of Orang
            if (nim != 0 && ipk != 0.0) {
                orang = new Mahasiswa(nama, nim, ipk);
            } else {
                // Create another subclass of Orang for non-Mahasiswa students (implement hitungNilaiRataRata)
                orang = new NonMahasiswa(nama) {
                    @Override
                    public double hitungNilaiRataRata() {
                        throw new UnsupportedOperationException("Not supported yet."); 
                    }
                };
                
            Mahasiswa2 mhs = new Mahasiswa2(nama, nim, ipk);
            Mahasiswa2.add(mhs);// Example (replace with your implementation)
            }
            jumlahMahasiswa++;
            System.out.println(orang);
        
        System.out.println("==================================");
        System.out.println("\nJumlah Orang: " + jumlahMahasiswa);
    }
}
