/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumm2;

/**
 *
 * @author THINKPAD
 */
class Mahasiswa{
        String Nama, NIM,Jurusan;
        
        Mahasiswa( String inputNama, String inputNIM, String inputJurusan){
            Nama = inputNama;
            NIM = inputNIM;
            Jurusan = inputJurusan;
            
            System.out.println(Nama);
            System.out.println(NIM);
            System.out.println(Jurusan);
            
            System.out.println("Bisa berhasil kah Maniiiieeezzzz ?");
        }
    }
public class CobaConstructor {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa orang1 = new Mahasiswa("Bagas Dribble","23000765423","Dribble Basket");
    }
}
