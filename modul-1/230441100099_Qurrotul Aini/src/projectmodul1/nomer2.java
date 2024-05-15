/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmodul1;

import java.util.Scanner;
/**
 *
 * @author M S I
 */
public class nomer2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk =new Scanner(System.in);
        System.out.println("Masukkan Nama Mahasiswa : ");
        String namamasuk = masuk.nextLine();
        
        System.out.println("Masukkan NIM Mahasiswa :");
        String nimmasuk =masuk.nextLine();
        System.out.println("Masukkan Prodi Atau Jurusan Anda :");
        String prodimasuk = masuk.nextLine();
        System.out.println("Masukkan Alamat Mahasiswa :");
        String alamatmasuk = masuk.nextLine();
        
        System.out.println("Nama : " + namamasuk );
        System.out.println("NIM : " + nimmasuk );
        System.out.println("prodi : " + prodimasuk );
        System.out.println("Alamat :" +alamatmasuk );
    }
}

git add .
git status
git commit -m "judul"
