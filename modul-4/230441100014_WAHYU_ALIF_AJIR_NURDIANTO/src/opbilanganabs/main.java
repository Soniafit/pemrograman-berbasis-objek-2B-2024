/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opbilanganabs;

public class main {
    public static void main(String[] args) {
        Operasi[] operasi = new Operasi[] {new Penjumlahan(), new Pengurangan(), new Perkalian(), new Pembagian()};
        
        for (Operasi op : operasi) {
            op.tampilHasil();
        }
    }
}
