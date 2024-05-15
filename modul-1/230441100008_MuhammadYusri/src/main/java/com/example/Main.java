
// Object

package com.example;

public class Main {
    public static void main(String[] args) {
        

        Manusia orang1 = new Manusia();
        orang1.nama = "Muhammad Yusri";
        orang1.umur = 90;
        orang1.alamat ="Sampang";


        System.out.println("Nama saya adalah = "+orang1.nama);
        System.out.println("Umur saya adalah = "+orang1.umur);
        System.out.println("Alamat saya di = "+orang1.alamat);
        System.out.println();
        
        // Manusia manusia1 = new Manusia();
        Manusia.berjalan(90);
        Manusia.berlari(90);

    }

}                                                                       



