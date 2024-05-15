/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest;

/**
 *
 * @author asus
 */
public abstract class Media {
    protected String judul;
    protected int tahunTerbit;

    public Media(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public abstract String getInfo();
}
