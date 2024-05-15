/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectmodul1;

/**
 *
 * @author M S I
 */
public class Projectmodul1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia pertama = new manusia("rizky", 19,"sumenep");
        manusia kedua = new manusia("alfin", 18, "Bangkalan");
        
        System.out.println( pertama.nama + " adalah Seseorang berumur " + pertama.umur + " yang berasal dari " +pertama.alamat);
        System.out.println(kedua.nama + " adalah seseorang yang berumur " + kedua.umur + " yang berasal dari " +kedua.alamat);
        
        pertama.berjalan();
        kedua.berlari();
        
    }
}

class manusia {
    public String nama;
    public int umur;
    public String alamat;
    
    public manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    public void berjalan() {
        System.out.println(nama + " sedang berjalan");
    }
    
    public void berlari() {
        System.out.println(nama + " sedang berlari");
    }
}