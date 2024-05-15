/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postes2;


public class Pesanan extends ItemMenu {
     String menuMakanan;
    int harga;

    public Pesanan(String menuMakanan, int harga) {
        this.menuMakanan = menuMakanan;
        this.harga = harga;
    }

    public String getMenuMakanan() {
        return menuMakanan;
    }

    public int getHarga() {
        return harga;
    }
}


