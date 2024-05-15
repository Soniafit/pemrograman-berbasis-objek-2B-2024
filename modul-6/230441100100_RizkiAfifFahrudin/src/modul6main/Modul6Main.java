/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6main;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Modul6Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunRuang[] bangun =new BangunRuang[4];
        
        System.out.println("Masukan Sisi Kubus = ");
        double sisi = input.nextDouble();
        bangun[0] = new Kubus(sisi);
        
        System.out.print("Masukkan Panjang Balok = ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan Lebar Balok = ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan Tinggi Balok = ");
        double tinggi = input.nextDouble();
        bangun[1] = new Balok(panjang, lebar, tinggi);
        
        System.out.print("Masukkan jari jari tabung = ");
        double jarijari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung = ");
        double tinggiTabung= input.nextDouble();
        bangun[2] = new Tabung(jarijari, tinggiTabung);
        
        System.out.print("Masukkan jari jari Kerucut = ");
        double jarijariKerucut = input.nextDouble();
        System.out.print("Masukkan tinggi Kerucut = ");
        double tinggiKerucut = input.nextDouble();
        bangun[3] = new Kerucut(jarijariKerucut, tinggiKerucut);
        
        for (BangunRuang bangun1: bangun){
            bangun1.info();
            System.out.println("");
        }
    }   
}
