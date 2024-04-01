/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100061_sonia;

/**
 *
 * @author sonia
 */
public class Main {
int panjang;
    int lebar;
    int mencariluas(){ 
        int hasi1=panjang*lebar;
        return hasi1;
       }
    int mencarikeliling(){ 
        int hasil=2*panjang+lebar;
        return hasil;
       }
    int mencaripanjang(){ 
        int hasil=panjang*lebar/lebar;
        return hasil;
       }
    int mencarilebar(){ 
        int hasil=panjang*lebar/panjang;
        return hasil;
       }
    public static void main(String[] args){
    Main persegi =new Main();
    persegi.lebar=3;
    persegi.panjang=10;
    
    int hasil_mencariluas = persegi.mencariluas();
    int hasil_mencarikeliling = persegi.mencarikeliling();
    int hasil_mencaripanjang = persegi.mencaripanjang();
    int hasil_mencarilebar = persegi.mencarilebar();
            
    System.out.println("hasil mencari luas adalah:"+hasil_mencariluas);
    System.out.println("hasil mencari lkeliling adalah:"+hasil_mencarikeliling);
    System.out.println("hasil mencari panjang adalah:"+hasil_mencaripanjang);
    System.out.println("hasil mencari lebar adalah:"+hasil_mencarilebar);
}
   
    
}
