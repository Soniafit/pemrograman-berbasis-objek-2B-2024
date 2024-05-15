/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg6;

/**
 *
 * @author AMANDA AULIA
 */

    
interface JariJari {
    double getJariJari();
    void setJariJari(double jariJari);
}

interface Lebar {
    double getLebar();
    void setLebar(double lebar);
}

interface Tinggi {
    double getTinggi();
    void setTinggi(double tinggi);
}

public abstract class BangunRuang {
    protected abstract double hitungVolume();

    public void info() {
        System.out.println("Informasi Bangun Ruang:");
        System.out.println("Volume: " + hitungVolume());
    }
}

