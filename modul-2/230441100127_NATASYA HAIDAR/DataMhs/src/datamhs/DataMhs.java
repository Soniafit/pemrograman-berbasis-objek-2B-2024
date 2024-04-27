/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamhs;
public class DataMhs {
    static  String univ;
    static  String NIM;
    static  String Nama;
    static  String Alamat;
    static  String Jurusan;

    // Konstruktor
    public DataMhs(String univ, String NIM, String Nama, String Alamat, String Jurusan) {
        DataMhs.univ = univ;
        DataMhs.NIM = NIM;
        DataMhs.Nama = Nama;
        DataMhs.Alamat = Alamat;
        DataMhs.Jurusan = Jurusan;
    }

    public String getUniv() {
        return univ;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
       
    }
    public String getJurusan(){
        return Jurusan;
    }
}
