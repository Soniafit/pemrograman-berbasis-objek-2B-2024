/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1.tugas1;

class Manusia {
    String nama;
    int umur;
    
    public void berjalan(){
        System.out.println("Object " + this.nama + " berjalan");
    }
    
    void berlari () {
        System.out.println("Object " + this.nama + "sedang berlari" );
    }
    

}
public class Modul1Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Arno";
        orang1.umur = 18;
        System.out.println("nama object 1 adalah : " + orang1.nama);
        System.out.println("umur object 1 adalah : " + orang1.umur + "tahun");
        orang1.berjalan();
        orang1.berlari();
        
        orang2.nama = "GALIH";
        orang2.umur = 21;
        System.out.println("nama adalah : " + orang2.nama);
        System.out.println("umur adalah : " + orang2.umur + "Tahun");
        orang2.berjalan();
        orang2.berlari();
        
    }
    
}