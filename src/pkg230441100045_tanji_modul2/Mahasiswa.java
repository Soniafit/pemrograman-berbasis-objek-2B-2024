/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100045_tanji_modul2;

/**
 *
 * @author Tanji
 */
class Mahasiswa {
    protected String nim;
    protected String nama;
    protected String alamat;
    protected String jurusan;
    
    public Mahasiswa(String nim, String nama, String alamat,String jurusan){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }
    public void TampilkanData(){
        System.out.println("NIm: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
    }
}
