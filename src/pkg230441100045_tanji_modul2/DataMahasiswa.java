/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100045_tanji_modul2;

/**
 *
 * @author Tanji
 */
class DataMahasiswa extends Mahasiswa {
    private static String namaUniversitas;
   
    public static void setNamaUniv(String nama){
        namaUniversitas = nama;
    }
    public static String getNamaUniv(){
        return namaUniversitas;
    }
    public DataMahasiswa (String nim, String nama, String alamat,String jurusan){
        super (nim, nama, alamat, jurusan);
    }
}
